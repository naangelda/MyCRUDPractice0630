<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
	String path = request.getContextPath();//动态获取工程名，与${pathContext.request.contextPath}作用一样
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Index</title>
	
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="styles.css"/>
	
	<!-- JavaScript -->
	<script type="text/javascript">
		window.location.href="<%=path%>/security/access";
		//启动便跳转页面
	</script>
</head>
<body>
	
</body>
</html>