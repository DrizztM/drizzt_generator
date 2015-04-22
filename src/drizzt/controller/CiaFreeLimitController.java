package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaFreeLimitService;
import drizzt.model.CiaFreeLimit;
import drizzt.model.CiaFreeLimitExample;

@Controller
public class CiaFreeLimitController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/CiaFreeLimit/list.do";
	
	@Resource
	private CiaFreeLimitService ciaFreeLimitService;
	
	@RequestMapping("/ciaFreeLimit/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaFreeLimitExample ciaFreeLimitExample = new CiaFreeLimitExample();
		int totalCount = ciaFreeLimitService.countCiaFreeLimit(ciaFreeLimitExample);
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
		ciaFreeLimitExample.setPageIndex((pageNum - 1) * pageSize);
		ciaFreeLimitExample.setPageSize(pageSize);
		List<CiaFreeLimit> ciaFreeLimits = ciaFreeLimitService.getPageCiaFreeLimit(ciaFreeLimitExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("ciaFreeLimits", ciaFreeLimits);
		return "/CiaFreeLimit/list";
	}
	
	@RequestMapping("/ciaFreeLimit/toAdd")
	public String toAdd(Model model) {
		return "/CiaFreeLimit/add";
	}

	@RequestMapping("/ciaFreeLimit/add")
	public String add(Model model, @ModelAttribute("ciaFreeLimit") CiaFreeLimit ciaFreeLimit) {
		ciaFreeLimitService.addCiaFreeLimit(ciaFreeLimit);
		return redirect;
	}

	@RequestMapping("/ciaFreeLimit/del")
	public String del(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		ciaFreeLimitService.delCiaFreeLimitById(id);
		return redirect;
	}

	@RequestMapping("/ciaFreeLimit/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaFreeLimit ciaFreeLimit = ciaFreeLimitService.getCiaFreeLimitById(id);
		model.addAttribute("ciaFreeLimit", ciaFreeLimit);
		return "/CiaFreeLimit/edit";
	}

	@RequestMapping("/ciaFreeLimit/edit")
	public String edit(Model model, @ModelAttribute("ciaFreeLimit") CiaFreeLimit ciaFreeLimit) {
		ciaFreeLimitService.updateCiaFreeLimit(ciaFreeLimit);
		return redirect;
	}

	@RequestMapping("/ciaFreeLimit/view")
	public String toView(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaFreeLimit ciaFreeLimit = ciaFreeLimitService.getCiaFreeLimitById(id);
		model.addAttribute("ciaFreeLimit", ciaFreeLimit);
		return "/CiaFreeLimit/view";
	}
}
