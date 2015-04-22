package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaSuggestService;
import drizzt.model.CiaSuggest;
import drizzt.model.CiaSuggestExample;

@Controller
public class CiaSuggestController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/CiaSuggest/list.do";
	
	@Resource
	private CiaSuggestService ciaSuggestService;
	
	@RequestMapping("/ciaSuggest/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaSuggestExample ciaSuggestExample = new CiaSuggestExample();
		int totalCount = ciaSuggestService.countCiaSuggest(ciaSuggestExample);
		if(totalCount%pageSize == 0){
			maxPageNum = totalCount/pageSize;
		}else{
			maxPageNum = totalCount/pageSize+1;
		}
		if (pageNum == null || pageNum < 1) {
			pageNum = 1;
		}else if(pageNum > maxPageNum){
			pageNum = maxPageNum;
		}
		ciaSuggestExample.setPageIndex((pageNum - 1) * pageSize);
		ciaSuggestExample.setPageSize(pageSize);
		List<CiaSuggest> ciaSuggests = ciaSuggestService.getPageCiaSuggest(ciaSuggestExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("ciaSuggests", ciaSuggests);
		return "/CiaSuggest/list";
	}
	
	@RequestMapping("/ciaSuggest/toAdd")
	public String toAdd(Model model) {
		return "/CiaSuggest/add";
	}

	@RequestMapping("/ciaSuggest/add")
	public String add(Model model, @ModelAttribute("ciaSuggest") CiaSuggest ciaSuggest) {
		ciaSuggestService.addCiaSuggest(ciaSuggest);
		return redirect;
	}

	@RequestMapping("/ciaSuggest/del")
	public String del(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		ciaSuggestService.delCiaSuggestById(id);
		return redirect;
	}

	@RequestMapping("/ciaSuggest/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaSuggest ciaSuggest = ciaSuggestService.getCiaSuggestById(id);
		model.addAttribute("ciaSuggest", ciaSuggest);
		return "/CiaSuggest/edit";
	}

	@RequestMapping("/ciaSuggest/edit")
	public String edit(Model model, @ModelAttribute("ciaSuggest") CiaSuggest ciaSuggest) {
		ciaSuggestService.updateCiaSuggest(ciaSuggest);
		return redirect;
	}

	@RequestMapping("/ciaSuggest/view")
	public String toView(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaSuggest ciaSuggest = ciaSuggestService.getCiaSuggestById(id);
		model.addAttribute("ciaSuggest", ciaSuggest);
		return "/CiaSuggest/view";
	}
}
