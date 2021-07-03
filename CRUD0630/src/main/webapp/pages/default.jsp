<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Default</title>
</head>
<body>
	<script type="text/javascript">
		var url="<%=path%>/student/access"
        window.location.href=url;
	</script>
</body>
</html>