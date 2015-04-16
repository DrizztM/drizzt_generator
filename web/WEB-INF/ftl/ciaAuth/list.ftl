<#import "/spring.ftl" as spring />
<#escape x as x?html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<title>自动生成平台</title>
</head>

<body>
	<#list ciaAuths as ciaAuth>
		${ciaAuth.id}
	</#list>
</body>
</html>
</#escape>
