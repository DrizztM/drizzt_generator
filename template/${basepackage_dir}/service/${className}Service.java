<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign pkSimpleJavaType = table.idColumn.simpleJavaType>
<#assign pkColumnName = table.idColumn.columnName>
<#assign pkColumnNameLower = table.idColumn.columnName?uncap_first>
package ${basepackage}.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ${basepackage}.mapper.${className}Mapper;
import ${basepackage}.model.${className};
import ${basepackage}.model.${className}Example;

@Service
public class ${className}Service{
	
	@Resource
	private ${className}Mapper ${className}Mapper;
	
	public void add${className}(${className} ${classNameLower}) {
		${className}Mapper.insertSelective(${classNameLower});
	}
	
	public void del${className}By${pkColumnName}(${pkSimpleJavaType} ${pkColumnNameLower}) {
		${className}Mapper.deleteByPrimaryKey(${pkColumnNameLower});
	}
	
	public void update${className}(${className} ${classNameLower}) {
		${className}Mapper.updateByPrimaryKeySelective(${classNameLower});
	}
	
	public ${className} get${className}By${pkColumnName}(${pkSimpleJavaType} ${pkColumnNameLower}) {
		return ${className}Mapper.selectByPrimaryKey(${pkColumnNameLower});
	}
	
	public List<${className}> getPage${className}(${className}Example ${classNameLower}Example) {
		return ${className}Mapper.selectPage(${classNameLower}Example);
	}
	
	public int count${className}(${className}Example ${classNameLower}Example) {
		return ${className}Mapper.countByExample(${classNameLower}Example);
	}
}
