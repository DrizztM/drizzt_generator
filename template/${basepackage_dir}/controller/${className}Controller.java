<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign pkSimpleJavaType = table.idColumn.simpleJavaType>
<#assign pkColumnName = table.idColumn.columnName>
<#assign pkColumnNameLower = table.idColumn.columnName?uncap_first>
package ${basepackage}.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ${basepackage}.service.${className}Service;
import ${basepackage}.model.${className};
import ${basepackage}.model.${className}Example;

@Controller
public class ${className}Controller{
	
	private int defaultPageSize=10;
	
	private String redirect = "redirect:/${className}/list.do";
	
	@Resource
	private ${className}Service ${classNameLower}Service;
	
	@RequestMapping("/${classNameLower}/list")
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
		${className}Example ${classNameLower}Example = new ${className}Example((pageNum - 1) * pageSize,pageSize);
		List<${className}> ${classNameLower}s = ${classNameLower}Service.getPage${className}(${classNameLower}Example);
		int totalCount = ${classNameLower}Service.count${className}(${classNameLower}Example);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("${classNameLower}s", ${classNameLower}s);
		return "/${className}/list";
	}
	
	@RequestMapping("/${classNameLower}/toAdd")
	public String toAdd(Model model) {
		return "/${className}/add";
	}

	@RequestMapping("/${classNameLower}/add")
	public String add(Model model, @ModelAttribute("${classNameLower}") ${className} ${classNameLower}) {
		${classNameLower}Service.add${className}(${classNameLower});
		return redirect;
	}

	@RequestMapping("/${classNameLower}/del")
	public String del(Model model,
			@RequestParam(value = "${pkColumnNameLower}", required = false) ${pkSimpleJavaType} ${pkColumnNameLower}) {
		${classNameLower}Service.del${className}By${pkColumnName}(${pkColumnNameLower});
		return redirect;
	}

	@RequestMapping("/${classNameLower}/toEdit")
	public String toEdit(Model model,
			@RequestParam(value = "${pkColumnNameLower}", required = false) ${pkSimpleJavaType} ${pkColumnNameLower}) {
		${className} ${classNameLower} = ${classNameLower}Service.get${className}By${pkColumnName}(${pkColumnNameLower});
		model.addAttribute("${classNameLower}", ${classNameLower});
		return "/${className}/edit";
	}

	@RequestMapping("/${classNameLower}/edit")
	public String edit(Model model, @ModelAttribute("${classNameLower}") ${className} ${classNameLower}) {
		${classNameLower}Service.update${className}(${classNameLower});
		return redirect;
	}

	@RequestMapping("/${classNameLower}/view")
	public String toView(Model model,
			@RequestParam(value = "${pkColumnNameLower}", required = false) ${pkSimpleJavaType} ${pkColumnNameLower}) {
		${className} ${classNameLower} = ${classNameLower}Service.get${className}By${pkColumnName}(${pkColumnNameLower});
		model.addAttribute("${classNameLower}", ${classNameLower});
		return "/${className}/view";
	}
}
