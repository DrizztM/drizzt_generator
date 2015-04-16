package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaAuthService;
import drizzt.model.CiaAuth;
import drizzt.model.CiaAuthExample;

@Controller
public class CiaAuthController{
	
	private int defaultPageSize=20;
	
	private String redirect = "redirect:/ciaAuth/list.do";
	
	@Resource
	private CiaAuthService ciaAuthService;
	
	@RequestMapping("/ciaAuth/list")
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
		CiaAuthExample ciaAuthExample = new CiaAuthExample((pageNum - 1) * pageSize,pageSize);
		List<CiaAuth> ciaAuths = ciaAuthService.getPageCiaAuth(ciaAuthExample);
		int totalCount = ciaAuthService.countCiaAuth(ciaAuthExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("ciaAuths", ciaAuths);
		return "/ciaAuth/list";
	}
	
	@RequestMapping("/ciaAuth/toAdd")
	public String toAdd(Model model) {
		return "/ciaAuth/add";
	}

	@RequestMapping("/ciaAuth/add")
	public String add(Model model, @ModelAttribute("ciaAuth") CiaAuth ciaAuth) {
		ciaAuthService.addCiaAuth(ciaAuth);
		return redirect;
	}

	@RequestMapping("/ciaAuth/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ciaAuthService.delCiaAuthById(id);
		return redirect;
	}

	@RequestMapping("/ciaAuth/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		CiaAuth ciaAuth = ciaAuthService.getCiaAuthById(id);
		model.addAttribute("ciaAuth", ciaAuth);
		return "/ciaAuth/edit";
	}

	@RequestMapping("/ciaAuth/edit")
	public String edit(Model model, @ModelAttribute("ciaAuth") CiaAuth ciaAuth) {
		ciaAuthService.updateCiaAuth(ciaAuth);
		return redirect;
	}

	@RequestMapping("/ciaAuth/view")
	public String toView(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		CiaAuth ciaAuth = ciaAuthService.getCiaAuthById(id);
		model.addAttribute("ciaAuth", ciaAuth);
		return "/ciaAuth/view";
	}
}
