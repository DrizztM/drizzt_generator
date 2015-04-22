<#include "/macro.include"/>
<#assign className = table.className>  
<#assign classNameLower = className?uncap_first>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>Tables - Ace Admin</title>

<meta name="description" content="Static &amp; Dynamic Tables" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/font-awesome.min.css" />

<!-- page specific plugin styles -->

<!-- text fonts -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace-fonts.css" />

<!-- ace styles -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace.min.css"
	id="main-ace-style" />

<!--[if lte IE 9]>
			<link rel="stylesheet" href="<%=request.getContextPath()%>/ace/assets/css/ace-part2.min.css" />
		<![endif]-->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace-skins.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace-rtl.min.css" />

<!--[if lte IE 9]>
		  <link rel="stylesheet" href="<%=request.getContextPath()%>/ace/assets/css/ace-ie.min.css" />
		<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->
<script
	src="<%=request.getContextPath()%>/ace/assets/js/ace-extra.min.js"></script>

<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

<!--[if lte IE 8]>
		<script src="<%=request.getContextPath()%>/ace/assets/js/html5shiv.min.js"></script>
		<script src="<%=request.getContextPath()%>/ace/assets/js/respond.min.js"></script>
		<![endif]-->
</head>

<body class="no-skin">

	<div class="breadcrumbs" id="breadcrumbs">

		<ul class="breadcrumb">
			<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Home</a>
			</li>

			<li><a href="#">Tables</a></li>
			<li class="active">Simple &amp; Dynamic</li>
		</ul>
		<!-- /.breadcrumb -->

	</div>

	<div class="page-content">
		<!-- /section:settings.box -->
		<div class="page-content-area">
			<div class="row">
				<div class="col-xs-12">
					<!-- PAGE CONTENT BEGINS -->
					<div class="row">
						<div class="col-xs-12">
							<div class="table-header">Results for "Latest Registered
								Domains"</div>

							<!-- <div class="table-responsive"> -->

							<!-- <div class="dataTables_borderWrap"> -->
							<div>
								<div id="sample-table-2_wrapper"
									class="dataTables_wrapper form-inline no-footer">
									<form action="<%=request.getContextPath()%>/ciaAuth/list.do"
										method="post" id="drizzt-table">
										<div class="row">
											<div class="col-xs-6">
												<table cellspacing="0" cellpadding="0" border="0"
													style="float: left; table-layout: auto;"
													class="ui-pg-table navtable">
													<tbody>
														<tr>
															<td class="ui-pg-button ui-corner-all" title=""
																id="add_grid-table" data-original-title="Add new row"><div
																	class="ui-pg-div">
																	<button class="btn btn-sm btn-primary">新增</button>
																</div></td>
															<td>&nbsp;&nbsp;</td>
															<td class="ui-pg-button ui-corner-all" title=""
																id="edit_grid-table"
																data-original-title="Edit selected row"><div
																	class="ui-pg-div">
																	<button class="btn btn-sm btn-primary">编辑</button>
																</div></td>
															<td>&nbsp;&nbsp;</td>
															<td class="ui-pg-button ui-corner-all" title=""
																id="view_grid-table"
																data-original-title="View selected row"><div
																	class="ui-pg-div">
																	<button class="btn btn-sm btn-primary">删除</button>
																</div></td>
															<td>&nbsp;&nbsp;</td>
															<td class="ui-pg-button ui-corner-all" title=""
																id="del_grid-table"
																data-original-title="Delete selected row"><div
																	class="ui-pg-div">
																	<button class="btn btn-sm btn-primary">查看</button>
																</div></td>
														</tr>
													</tbody>
												</table>
											</div>
											<div class="col-xs-6">
												<div id="sample-table-2_filter" class="dataTables_filter">
													<label>Search:<input type="search"
														class="form-control input-sm"
														aria-controls="sample-table-2"></label>
												</div>
											</div>
										</div>
										<table
											class="table table-striped table-bordered table-hover dataTable no-footer"
											id="sample-table-2" role="grid"
											aria-describedby="sample-table-2_info">
											<thead>
												<tr role="row">
													<#list table.columns as column>
														<th class="sorting_disabled">${column.constantName}</th>
													</#list>
												</tr>
											</thead>

											<tbody>
												<c:forEach items="<@jspEl classNameLower+"s" />" var="${classNameLower}">
													<tr role="row" class="odd">
														<#list table.columns as column>
															<td><@jspEl classNameLower+'.'+column.columnNameLower /></td>
														</#list>
													</tr>
												</c:forEach>
											</tbody>
										</table>
										<div class="row">
											<div class="col-xs-6">
												<div class="dataTables_info" id="sample-table-2_info"
													role="status" aria-live="polite">
													共 <@jspEl "totalCount" /> 条数据，当前第<input type="text" id="pageNum"
														name="pageNum" style="width: 40px;" value="<@jspEl "pageNum" />" />页&nbsp;&nbsp;
													<button class="btn btn-sm btn-primary" onclick="goPage(0)">跳转</button>
												</div>
											</div>
											<div class="col-xs-6">
												<div class="dataTables_paginate paging_simple_numbers"
													id="sample-table-2_paginate">
													<ul class="pagination">
														<li class="paginate_button disabled"
															aria-controls="sample-table-2" tabindex="0"
															id="sample-table-2_previous"><a href="#"
															onclick="goPage(1)">首页</a></li>
														<li class="paginate_button disabled"
															aria-controls="sample-table-2" tabindex="0"
															id="sample-table-2_previous"><a href="#"
															onclick="goPage(<@jspEl "pageNum" />-1)">上一页</a></li>
														<li class="paginate_button" aria-controls="sample-table-2"
															tabindex="0" id="sample-table-2_previous"><a
															href="#" onclick="goPage(<@jspEl "pageNum" />+1)">下一页</a></li>
														<li class="paginate_button" aria-controls="sample-table-2"
															tabindex="0" id="sample-table-2_previous"><a
															href="#">尾页</a></li>
													</ul>
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
					<!-- PAGE CONTENT ENDS -->
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.page-content-area -->
	</div>

</body>

<!-- basic scripts -->

<!--[if !IE]> -->
<script type="text/javascript">
	window.jQuery
			|| document
					.write("<script src='<%=request.getContextPath()%>/ace/assets/js/jquery.min.js'>"
							+ "<"+"/script>");
</script>

<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='<%=request.getContextPath()%>/ace/assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
<script type="text/javascript">
	if ('ontouchstart' in document.documentElement)
		document
				.write("<script src='<%=request.getContextPath()%>/ace/assets/js/jquery.mobile.custom.min.js'>"
						+ "<"+"/script>");
</script>

<script type="text/javascript">
	function goPage(pageNum){
		if(pageNum!=0){
			$("#pageNum").val(pageNum);
		}
		$("#drizzt-table").submit();
	}
</script>
<script
	src="<%=request.getContextPath()%>/ace/assets/js/bootstrap.min.js"></script>

<!-- page specific plugin scripts -->
<script
	src="<%=request.getContextPath()%>/ace/assets/js/jquery.dataTables.min.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/assets/js/jquery.dataTables.bootstrap.js"></script>

<!-- ace scripts -->
<script
	src="<%=request.getContextPath()%>/ace/assets/js/ace-elements.min.js"></script>
<script src="<%=request.getContextPath()%>/ace/assets/js/ace.min.js"></script>


<!-- the following scripts are used in demo only for onpage help and you don't need them -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace.onpage-help.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/docs/assets/js/themes/sunburst.css" />

<script type="text/javascript">
	ace.vars['base'] = '..';
</script>
<script
	src="<%=request.getContextPath()%>/ace/assets/js/ace/elements.onpage-help.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/assets/js/ace/ace.onpage-help.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/rainbow.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/language/generic.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/language/html.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/language/css.js"></script>
<script
	src="<%=request.getContextPath()%>/ace/docs/assets/js/language/javascript.js"></script>

</html>
