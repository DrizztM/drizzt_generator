package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaAuthBindingService;
import drizzt.model.CiaAuthBinding;
import drizzt.model.CiaAuthBindingExample;

@Controller
public class CiaAuthBindingController{
	
	private int defaultPageSize=20;
	
	private String redirect = "redirect:/ciaAuthBinding/list.do";
	
	@Resource
	private CiaAuthBindingService ciaAuthBindingService;
	
	@RequestMapping("/ciaAuthBinding/list")
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
		CiaAuthBindingExample ciaAuthBindingExample = new CiaAuthBindingExample((pageNum - 1) * pageSize,pageSize);
		List<CiaAuthBinding> ciaAuthBindings = ciaAuthBindingService.getPageCiaAuthBinding(ciaAuthBindingExample);
		int totalCount = ciaAuthBindingService.countCiaAuthBinding(ciaAuthBindingExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("ciaAuthBindings", ciaAuthBindings);
		return "/ciaAuthBinding/list";
	}
	
	@RequestMapping("/ciaAuthBinding/toAdd")
	public String toAdd(Model model) {
		return "/ciaAuthBinding/add";
	}

	@RequestMapping("/ciaAuthBinding/add")
	public String add(Model model, @ModelAttribute("ciaAuthBinding") CiaAuthBinding ciaAuthBinding) {
		ciaAuthBindingService.addCiaAuthBinding(ciaAuthBinding);
		return redirect;
	}

	@RequestMapping("/ciaAuthBinding/del")
	public String del(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		ciaAuthBindingService.delCiaAuthBindingById(id);
		return redirect;
	}

	@RequestMapping("/ciaAuthBinding/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaAuthBinding ciaAuthBinding = ciaAuthBindingService.getCiaAuthBindingById(id);
		model.addAttribute("ciaAuthBinding", ciaAuthBinding);
		return "/ciaAuthBinding/edit";
	}

	@RequestMapping("/ciaAuthBinding/edit")
	public String edit(Model model, @ModelAttribute("ciaAuthBinding") CiaAuthBinding ciaAuthBinding) {
		ciaAuthBindingService.updateCiaAuthBinding(ciaAuthBinding);
		return redirect;
	}

	@RequestMapping("/ciaAuthBinding/view")
	public String toView(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaAuthBinding ciaAuthBinding = ciaAuthBindingService.getCiaAuthBindingById(id);
		model.addAttribute("ciaAuthBinding", ciaAuthBinding);
		return "/ciaAuthBinding/view";
	}
}
