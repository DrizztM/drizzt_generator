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
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/CiaApp/list.do";
	
	@Resource
	private CiaAppService ciaAppService;
	
	@RequestMapping("/ciaApp/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaAppExample ciaAppExample = new CiaAppExample();
		int totalCount = ciaAppService.countCiaApp(ciaAppExample);
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
		ciaAppExample.setPageIndex((pageNum - 1) * pageSize);
		ciaAppExample.setPageSize(pageSize);
		List<CiaApp> ciaApps = ciaAppService.getPageCiaApp(ciaAppExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("ciaApps", ciaApps);
		return "/CiaApp/list";
	}
	
	@RequestMapping("/ciaApp/toAdd")
	public String toAdd(Model model) {
		return "/CiaApp/add";
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
		return "/CiaApp/edit";
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
		return "/CiaApp/view";
	}
}
