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
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/CiaDeviceApp/list.do";
	
	@Resource
	private CiaDeviceAppService ciaDeviceAppService;
	
	@RequestMapping("/ciaDeviceApp/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaDeviceAppExample ciaDeviceAppExample = new CiaDeviceAppExample();
		int totalCount = ciaDeviceAppService.countCiaDeviceApp(ciaDeviceAppExample);
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
		ciaDeviceAppExample.setPageIndex((pageNum - 1) * pageSize);
		ciaDeviceAppExample.setPageSize(pageSize);
		List<CiaDeviceApp> ciaDeviceApps = ciaDeviceAppService.getPageCiaDeviceApp(ciaDeviceAppExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("ciaDeviceApps", ciaDeviceApps);
		return "/CiaDeviceApp/list";
	}
	
	@RequestMapping("/ciaDeviceApp/toAdd")
	public String toAdd(Model model) {
		return "/CiaDeviceApp/add";
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
		return "/CiaDeviceApp/edit";
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
		return "/CiaDeviceApp/view";
	}
}
