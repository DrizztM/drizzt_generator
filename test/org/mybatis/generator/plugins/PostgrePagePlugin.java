package org.mybatis.generator.plugins;

import static org.mybatis.generator.internal.util.messages.Messages.getString;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class PostgrePagePlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	private void addField(String fieldName, FullyQualifiedJavaType fieldType,
			TopLevelClass topLevelClass) {
		Field tmpField = new Field(fieldName, fieldType);
		tmpField.setVisibility(JavaVisibility.PRIVATE);
		topLevelClass.addField(tmpField);

		Method setMethod = new Method();
		setMethod.setName("set" + fieldName.toUpperCase().substring(0, 1)
				+ fieldName.substring(1));
		Parameter param = new Parameter(fieldType, fieldName);
		setMethod.addParameter(param);
		setMethod.setVisibility(JavaVisibility.PUBLIC);
		setMethod.addBodyLine("this." + fieldName + "=" + fieldName + ";");

		topLevelClass.addMethod(setMethod);

		Method getMethod = new Method();
		getMethod.setName("get" + fieldName.toUpperCase().substring(0, 1)
				+ fieldName.substring(1));

		getMethod.setReturnType(fieldType);
		getMethod.setVisibility(JavaVisibility.PUBLIC);
		getMethod.addBodyLine("return this." + fieldName + ";");

		topLevelClass.addMethod(getMethod);

	}

	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		FullyQualifiedJavaType intType = FullyQualifiedJavaType
				.getIntInstance();
		addField("pageIndex", intType, topLevelClass);
		addField("pageSize", intType, topLevelClass);

		Method newConstructorMethod = new Method();
		newConstructorMethod.setConstructor(true);
		newConstructorMethod.addParameter(new Parameter(intType, "pageIndex"));
		newConstructorMethod.addParameter(new Parameter(intType, "pageSize"));
		newConstructorMethod.addBodyLine("this();");
		newConstructorMethod.addBodyLine("this.pageIndex=pageIndex;");
		newConstructorMethod.addBodyLine("this.pageSize=pageSize;");
		newConstructorMethod.setVisibility(JavaVisibility.PUBLIC);
		newConstructorMethod.setName(topLevelClass.getType().getShortName());

		topLevelClass.addMethod(newConstructorMethod);
		return true;
	}

	public boolean clientGenerated(Interface interfaze,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

		Set<FullyQualifiedJavaType> importedTypes = new TreeSet<FullyQualifiedJavaType>();
		FullyQualifiedJavaType type = new FullyQualifiedJavaType(
				introspectedTable.getExampleType());
		importedTypes.add(type);
		importedTypes.add(FullyQualifiedJavaType.getNewListInstance());

		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);

		FullyQualifiedJavaType returnType = FullyQualifiedJavaType
				.getNewListInstance();
		FullyQualifiedJavaType listType;
		if (introspectedTable.getRules().generateBaseRecordClass()) {
			listType = new FullyQualifiedJavaType(introspectedTable
					.getBaseRecordType());
		} else if (introspectedTable.getRules().generatePrimaryKeyClass()) {
			listType = new FullyQualifiedJavaType(introspectedTable
					.getPrimaryKeyType());
		} else {
			throw new RuntimeException(getString("RuntimeError.12")); //$NON-NLS-1$  
		}

		importedTypes.add(listType);
		returnType.addTypeArgument(listType);
		method.setReturnType(returnType);

		method.setName("selectPage");
		method.addParameter(new Parameter(type, "example")); //$NON-NLS-1$  

		interfaze.addImportedTypes(importedTypes);
		interfaze.addMethod(method);

		return true;
	}

	public boolean sqlMapDocumentGenerated(Document document,
			IntrospectedTable introspectedTable) {

		XmlElement parentElement = document.getRootElement();
		XmlElement outter_where_sql = new XmlElement("sql");
		outter_where_sql.addAttribute(new Attribute("id",
				"select_by_page_outter_where_sql"));

		String fqjt = introspectedTable.getExampleType();

		XmlElement answer = new XmlElement("select");

		answer.addAttribute(new Attribute("id", "selectPage"));
		answer.addAttribute(new Attribute("resultMap", "BaseResultMap"));
		answer.addAttribute(new Attribute("parameterType", fqjt)); //$NON-NLS-1$  

		StringBuilder sb = new StringBuilder();

		sb.setLength(0);

		sb.append("select \r\n");

		sb.append("<if test=\"distinct\" > \r\n");

		sb.append("distinct \r\n");

		sb.append("</if> \r\n");

		sb.append("<include refid=\"Base_Column_List\" /> \r\n");

		sb.append("from ");
		
		sb.append(introspectedTable
				.getAliasedFullyQualifiedTableNameAtRuntime());
		
		sb.append("\r\n");

		sb.append("<if test=\"_parameter != null\" > \r\n");

		sb.append("<include refid=\"Example_Where_Clause\" /> \r\n");

		sb.append("</if> \r\n");

		sb.append("<if test=\"orderByClause != null\" > \r\n");

		sb.append("order by ${orderByClause} \r\n");

		sb.append("</if> \r\n");

		sb.append("limit #{pageSize} offset #{pageIndex} \r\n");

		answer.addElement(new TextElement(sb.toString()));

		parentElement.addElement(answer);

		return true;
	}

}