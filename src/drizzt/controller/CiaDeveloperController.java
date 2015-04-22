package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaDeveloperService;
import drizzt.model.CiaDeveloper;
import drizzt.model.CiaDeveloperExample;

@Controller
public class CiaDeveloperController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/CiaDeveloper/list.do";
	
	@Resource
	private CiaDeveloperService ciaDeveloperService;
	
	@RequestMapping("/ciaDeveloper/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaDeveloperExample ciaDeveloperExample = new CiaDeveloperExample();
		int totalCount = ciaDeveloperService.countCiaDeveloper(ciaDeveloperExample);
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
		ciaDeveloperExample.setPageIndex((pageNum - 1) * pageSize);
		ciaDeveloperExample.setPageSize(pageSize);
		List<CiaDeveloper> ciaDevelopers = ciaDeveloperService.getPageCiaDeveloper(ciaDeveloperExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("ciaDevelopers", ciaDevelopers);
		return "/CiaDeveloper/list";
	}
	
	@RequestMapping("/ciaDeveloper/toAdd")
	public String toAdd(Model model) {
		return "/CiaDeveloper/add";
	}

	@RequestMapping("/ciaDeveloper/add")
	public String add(Model model, @ModelAttribute("ciaDeveloper") CiaDeveloper ciaDeveloper) {
		ciaDeveloperService.addCiaDeveloper(ciaDeveloper);
		return redirect;
	}

	@RequestMapping("/ciaDeveloper/del")
	public String del(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		ciaDeveloperService.delCiaDeveloperById(id);
		return redirect;
	}

	@RequestMapping("/ciaDeveloper/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaDeveloper ciaDeveloper = ciaDeveloperService.getCiaDeveloperById(id);
		model.addAttribute("ciaDeveloper", ciaDeveloper);
		return "/CiaDeveloper/edit";
	}

	@RequestMapping("/ciaDeveloper/edit")
	public String edit(Model model, @ModelAttribute("ciaDeveloper") CiaDeveloper ciaDeveloper) {
		ciaDeveloperService.updateCiaDeveloper(ciaDeveloper);
		return redirect;
	}

	@RequestMapping("/ciaDeveloper/view")
	public String toView(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaDeveloper ciaDeveloper = ciaDeveloperService.getCiaDeveloperById(id);
		model.addAttribute("ciaDeveloper", ciaDeveloper);
		return "/CiaDeveloper/view";
	}
}
