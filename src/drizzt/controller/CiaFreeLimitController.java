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
	
	private int defaultPageSize=20;
	
	private String redirect = "redirect:/ciaFreeLimit/list.do";
	
	@Resource
	private CiaFreeLimitService ciaFreeLimitService;
	
	@RequestMapping("/ciaFreeLimit/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		if (pageNum == null) {
			pageNum = 1;
		}
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaFreeLimitExample ciaFreeLimitExample = new CiaFreeLimitExample((pageNum - 1) * pageSize,pageSize);
		List<CiaFreeLimit> ciaFreeLimits = ciaFreeLimitService.getPageCiaFreeLimit(ciaFreeLimitExample);
		int totalCount = ciaFreeLimitService.countCiaFreeLimit(ciaFreeLimitExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("ciaFreeLimits", ciaFreeLimits);
		return "/ciaFreeLimit/list";
	}
	
	@RequestMapping("/ciaFreeLimit/toAdd")
	public String toAdd(Model model) {
		return "/ciaFreeLimit/add";
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
		return "/ciaFreeLimit/edit";
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
		return "/ciaFreeLimit/view";
	}
}
