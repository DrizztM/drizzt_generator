package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaPaySnService;
import drizzt.model.CiaPaySn;
import drizzt.model.CiaPaySnExample;

@Controller
public class CiaPaySnController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/ciaPaySn/list.do";
	
	@Resource
	private CiaPaySnService ciaPaySnService;
	
	@RequestMapping("/ciaPaySn/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaPaySnExample ciaPaySnExample = new CiaPaySnExample();
		int totalCount = ciaPaySnService.countCiaPaySn(ciaPaySnExample);
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
		ciaPaySnExample.setPageIndex((pageNum - 1) * pageSize);
		ciaPaySnExample.setPageSize(pageSize);
		List<CiaPaySn> ciaPaySns = ciaPaySnService.getPageCiaPaySn(ciaPaySnExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("ciaPaySns", ciaPaySns);
		return "/CiaPaySn/list";
	}
	
	@RequestMapping("/ciaPaySn/toAdd")
	public String toAdd(Model model) {
		return "/CiaPaySn/add";
	}

	@RequestMapping("/ciaPaySn/add")
	public String add(Model model, @ModelAttribute("ciaPaySn") CiaPaySn ciaPaySn) {
		ciaPaySnService.addCiaPaySn(ciaPaySn);
		return redirect;
	}

	@RequestMapping("/ciaPaySn/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ciaPaySnService.delCiaPaySnById(id);
		return redirect;
	}

	@RequestMapping("/ciaPaySn/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		CiaPaySn ciaPaySn = ciaPaySnService.getCiaPaySnById(id);
		model.addAttribute("ciaPaySn", ciaPaySn);
		return "/CiaPaySn/edit";
	}

	@RequestMapping("/ciaPaySn/edit")
	public String edit(Model model, @ModelAttribute("ciaPaySn") CiaPaySn ciaPaySn) {
		ciaPaySnService.updateCiaPaySn(ciaPaySn);
		return redirect;
	}

	@RequestMapping("/ciaPaySn/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		CiaPaySn ciaPaySn = ciaPaySnService.getCiaPaySnById(id);
		model.addAttribute("ciaPaySn", ciaPaySn);
		return "/CiaPaySn/view";
	}
}
