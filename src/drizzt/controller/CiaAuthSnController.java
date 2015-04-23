package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaAuthSnService;
import drizzt.model.CiaAuthSn;
import drizzt.model.CiaAuthSnExample;

@Controller
public class CiaAuthSnController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/ciaAuthSn/list.do";
	
	@Resource
	private CiaAuthSnService ciaAuthSnService;
	
	@RequestMapping("/ciaAuthSn/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaAuthSnExample ciaAuthSnExample = new CiaAuthSnExample();
		int totalCount = ciaAuthSnService.countCiaAuthSn(ciaAuthSnExample);
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
		ciaAuthSnExample.setPageIndex((pageNum - 1) * pageSize);
		ciaAuthSnExample.setPageSize(pageSize);
		List<CiaAuthSn> ciaAuthSns = ciaAuthSnService.getPageCiaAuthSn(ciaAuthSnExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("ciaAuthSns", ciaAuthSns);
		return "/CiaAuthSn/list";
	}
	
	@RequestMapping("/ciaAuthSn/toAdd")
	public String toAdd(Model model) {
		return "/CiaAuthSn/add";
	}

	@RequestMapping("/ciaAuthSn/add")
	public String add(Model model, @ModelAttribute("ciaAuthSn") CiaAuthSn ciaAuthSn) {
		ciaAuthSnService.addCiaAuthSn(ciaAuthSn);
		return redirect;
	}

	@RequestMapping("/ciaAuthSn/del")
	public String del(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		ciaAuthSnService.delCiaAuthSnById(id);
		return redirect;
	}

	@RequestMapping("/ciaAuthSn/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		CiaAuthSn ciaAuthSn = ciaAuthSnService.getCiaAuthSnById(id);
		model.addAttribute("ciaAuthSn", ciaAuthSn);
		return "/CiaAuthSn/edit";
	}

	@RequestMapping("/ciaAuthSn/edit")
	public String edit(Model model, @ModelAttribute("ciaAuthSn") CiaAuthSn ciaAuthSn) {
		ciaAuthSnService.updateCiaAuthSn(ciaAuthSn);
		return redirect;
	}

	@RequestMapping("/ciaAuthSn/view")
	public String view(Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		CiaAuthSn ciaAuthSn = ciaAuthSnService.getCiaAuthSnById(id);
		model.addAttribute("ciaAuthSn", ciaAuthSn);
		return "/CiaAuthSn/view";
	}
}
