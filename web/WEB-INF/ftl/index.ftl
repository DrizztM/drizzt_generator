<#import "/spring.ftl" as spring />
<#escape x as x?html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<script type="text/javascript">
	function refresh(obj) {
		obj.src = "${base}/randCode.do?" + Math.random();
	}
</script>

<title>自动生成平台</title>
</head>

<body>
	${base}<br>
	<label>验证码：</label>
	<input id="randCode" name="randCode" class="code" type="text" size="5" />
	<span><img id="randCodeImg" style="cursor: pointer;"
		src="${base}/randCode.do?"+Math.random()" width="75"
		height="24" onclick="javascript:refresh(this);"/></span>
	</p>
</body>
</html>
</#escape>
