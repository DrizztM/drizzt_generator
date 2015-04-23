<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<title>Form Elements - Ace Admin</title>

<meta name="description" content="Common form elements and layouts" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

<!-- bootstrap & fontawesome -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/font-awesome.min.css" />

<!-- page specific plugin styles -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/jquery-ui.custom.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/chosen.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/datepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/bootstrap-timepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/daterangepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/bootstrap-datetimepicker.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/colorpicker.css" />

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

	<!-- /section:basics/content.breadcrumbs -->
	<div class="page-content">
		<!-- /section:settings.box -->
		<div class="page-content-area">
			<div class="page-header">
				<h1>
					Form Elements 
				</h1>
			</div>
			<!-- /.page-header -->

			<div class="row">
				<div class="col-xs-12">
					<!-- PAGE CONTENT BEGINS -->
					<form class="form-horizontal">
						<!-- #section:elements.form -->
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> appId </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" value="${ciaFreeLimit.appId}"
											class="col-xs-10 col-sm-5" readonly="readonly"/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> pn </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" value="${ciaFreeLimit.pn}"
											class="col-xs-10 col-sm-5" readonly="readonly"/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"
										for="form-field-1"> num </label>
		
									<div class="col-sm-9">
										<input type="text" id="form-field-1" value="${ciaFreeLimit.num}"
											class="col-xs-10 col-sm-5" readonly="readonly"/>
									</div>
								</div>
						<div class="clearfix form-actions">
							<div class="col-md-offset-3 col-md-9">
								<button class="btn btn-info" type="button" onclick="location.href='<%=request.getContextPath()%>/ciaFreeLimit/list.do'">
									<i class="ace-icon fa fa-check bigger-110"></i> 返回
								</button>
							</div>
						</div>
					</form>

					<!-- PAGE CONTENT ENDS -->
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.page-content-area -->
	</div>
	<!-- /.page-content -->
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
		document.write("<script src='<%=request.getContextPath()%>/ace/assets/js/jquery.mobile.custom.min.js'>"+ "<"+"/script>");
</script>

<script
	src="<%=request.getContextPath()%>/ace/assets/js/bootstrap.min.js"></script>

<!-- the following scripts are used in demo only for onpage help and you don't need them -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/assets/css/ace.onpage-help.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/ace/docs/assets/js/themes/sunburst.css" />

</html>
