package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaAppService;
import drizzt.model.CiaApp;
import drizzt.model.CiaAppExample;

@Controller
public class CiaAppController{
	
	private int defaultPageSize=20;
	
	private String redirect = "redirect:/ciaApp/list.do";
	
	@Resource
	private CiaAppService ciaAppService;
	
	@RequestMapping("/ciaApp/list")
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
		CiaAppExample ciaAppExample = new CiaAppExample((pageNum - 1) * pageSize,pageSize);
		List<CiaApp> ciaApps = ciaAppService.getPageCiaApp(ciaAppExample);
		int totalCount = ciaAppService.countCiaApp(ciaAppExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("ciaApps", ciaApps);
		return "/ciaApp/list";
	}
	
	@RequestMapping("/ciaApp/toAdd")
	public String toAdd(Model model) {
		return "/ciaApp/add";
	}

	@RequestMapping("/ciaApp/add")
	public String add(Model model, @ModelAttribute("ciaApp") CiaApp ciaApp) {
		ciaAppService.addCiaApp(ciaApp);
		return redirect;
	}

	@RequestMapping("/ciaApp/del")
	public String del(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		ciaAppService.delCiaAppById(id);
		return redirect;
	}

	@RequestMapping("/ciaApp/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaApp ciaApp = ciaAppService.getCiaAppById(id);
		model.addAttribute("ciaApp", ciaApp);
		return "/ciaApp/edit";
	}

	@RequestMapping("/ciaApp/edit")
	public String edit(Model model, @ModelAttribute("ciaApp") CiaApp ciaApp) {
		ciaAppService.updateCiaApp(ciaApp);
		return redirect;
	}

	@RequestMapping("/ciaApp/view")
	public String toView(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaApp ciaApp = ciaAppService.getCiaAppById(id);
		model.addAttribute("ciaApp", ciaApp);
		return "/ciaApp/view";
	}
}
