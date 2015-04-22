package drizzt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import drizzt.service.CiaMobileService;
import drizzt.model.CiaMobile;
import drizzt.model.CiaMobileExample;

@Controller
public class CiaMobileController{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/CiaMobile/list.do";
	
	@Resource
	private CiaMobileService ciaMobileService;
	
	@RequestMapping("/ciaMobile/list")
	public String list(
			Model model,
			@RequestParam(value = "pageNum", required = false) Integer pageNum,
			@RequestParam(value = "pageSize", required = false) Integer pageSize) {
		int maxPageNum = 0;
		if (pageSize == null) {
			pageSize = defaultPageSize;
		}
		CiaMobileExample ciaMobileExample = new CiaMobileExample();
		int totalCount = ciaMobileService.countCiaMobile(ciaMobileExample);
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
		ciaMobileExample.setPageIndex((pageNum - 1) * pageSize);
		ciaMobileExample.setPageSize(pageSize);
		List<CiaMobile> ciaMobiles = ciaMobileService.getPageCiaMobile(ciaMobileExample);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		if(totalCount%pageSize == 0){
			model.addAttribute("maxPageNum", totalCount/pageSize);
		}else{
			model.addAttribute("maxPageNum", totalCount/pageSize+1);
		}
		model.addAttribute("ciaMobiles", ciaMobiles);
		return "/CiaMobile/list";
	}
	
	@RequestMapping("/ciaMobile/toAdd")
	public String toAdd(Model model) {
		return "/CiaMobile/add";
	}

	@RequestMapping("/ciaMobile/add")
	public String add(Model model, @ModelAttribute("ciaMobile") CiaMobile ciaMobile) {
		ciaMobileService.addCiaMobile(ciaMobile);
		return redirect;
	}

	@RequestMapping("/ciaMobile/del")
	public String del(Model model,
			@RequestParam(value = "mobileNumber", required = false) String mobileNumber) {
		ciaMobileService.delCiaMobileByMobileNumber(mobileNumber);
		return redirect;
	}

	@RequestMapping("/ciaMobile/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "mobileNumber", required = false) String mobileNumber) {
		CiaMobile ciaMobile = ciaMobileService.getCiaMobileByMobileNumber(mobileNumber);
		model.addAttribute("ciaMobile", ciaMobile);
		return "/CiaMobile/edit";
	}

	@RequestMapping("/ciaMobile/edit")
	public String edit(Model model, @ModelAttribute("ciaMobile") CiaMobile ciaMobile) {
		ciaMobileService.updateCiaMobile(ciaMobile);
		return redirect;
	}

	@RequestMapping("/ciaMobile/view")
	public String toView(Model model,
			@RequestParam(value = "mobileNumber", required = false) String mobileNumber) {
		CiaMobile ciaMobile = ciaMobileService.getCiaMobileByMobileNumber(mobileNumber);
		model.addAttribute("ciaMobile", ciaMobile);
		return "/CiaMobile/view";
	}
}
