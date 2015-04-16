package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaDeviceAppService;
import drizzt.model.CiaDeviceApp;
import drizzt.model.CiaDeviceAppExample;

@Controller
public class CiaDeviceAppController{
	
	private int defaultPageSize=20;
	
	private String redirect = "redirect:/ciaDeviceApp/list.do";
	
	@Resource
	private CiaDeviceAppService ciaDeviceAppService;
	
	@RequestMapping("/ciaDeviceApp/list")
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
		CiaDeviceAppExample ciaDeviceAppExample = new CiaDeviceAppExample((pageNum - 1) * pageSize,pageSize);
		List<CiaDeviceApp> ciaDeviceApps = ciaDeviceAppService.getPageCiaDeviceApp(ciaDeviceAppExample);
		int totalCount = ciaDeviceAppService.countCiaDeviceApp(ciaDeviceAppExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("ciaDeviceApps", ciaDeviceApps);
		return "/ciaDeviceApp/list";
	}
	
	@RequestMapping("/ciaDeviceApp/toAdd")
	public String toAdd(Model model) {
		return "/ciaDeviceApp/add";
	}

	@RequestMapping("/ciaDeviceApp/add")
	public String add(Model model, @ModelAttribute("ciaDeviceApp") CiaDeviceApp ciaDeviceApp) {
		ciaDeviceAppService.addCiaDeviceApp(ciaDeviceApp);
		return redirect;
	}

	@RequestMapping("/ciaDeviceApp/del")
	public String del(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		ciaDeviceAppService.delCiaDeviceAppById(id);
		return redirect;
	}

	@RequestMapping("/ciaDeviceApp/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaDeviceApp ciaDeviceApp = ciaDeviceAppService.getCiaDeviceAppById(id);
		model.addAttribute("ciaDeviceApp", ciaDeviceApp);
		return "/ciaDeviceApp/edit";
	}

	@RequestMapping("/ciaDeviceApp/edit")
	public String edit(Model model, @ModelAttribute("ciaDeviceApp") CiaDeviceApp ciaDeviceApp) {
		ciaDeviceAppService.updateCiaDeviceApp(ciaDeviceApp);
		return redirect;
	}

	@RequestMapping("/ciaDeviceApp/view")
	public String toView(Model model,
			@RequestParam(value = "id", required = false) Integer id) {
		CiaDeviceApp ciaDeviceApp = ciaDeviceAppService.getCiaDeviceAppById(id);
		model.addAttribute("ciaDeviceApp", ciaDeviceApp);
		return "/ciaDeviceApp/view";
	}
}
