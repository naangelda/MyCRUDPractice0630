
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.lang.String"%>
<%@ page import="java.util.*"%>
<%
	String path = request.getContextPath();//动态获取工程名，与${pathContext.request.contextPath}作用一样
%>
<!DOCTYPE html>
<html>
<head>
	<!-- 提示信息和用户信息处理 -->
	<%
		String errorType = (String)request.getAttribute("errorType")==null?"":(String)request.getAttribute("errorType");
		String msg = (String)request.getAttribute("msg")==null?"":(String)request.getAttribute("msg");
		String username = (String)request.getAttribute("username")==null?"":(String)request.getAttribute("username");
		String password = (String)request.getAttribute("password")==null?"":(String)request.getAttribute("password");
	%>
	
	<meta charset="UTF-8">
	<title>Login Page</title>
	
	<!-- CSS -->
	<link rel="stylesheet" href="<%=path%>/assets/css/reset.css"/>
	<link rel="stylesheet" href="<%=path%>/assets/css/style.css"/>
	<link rel="stylesheet" href="<%=path%>/assets/css/supersized.css"/>
	
	<!-- JavaScript -->
	<script src="<%=path %>/assets/js/jquery-1.8.2.min.js"></script>
	<script src="<%=path %>/assets/js/supersized.3.2.7.min.js"></script>
	<script src="<%=path %>/assets/js/supersized-init.js"></script>
	<script src="<%=path %>/assets/js/scripts.js"></script>
	<script type="text/javascript">
		<%if(!"".equals(msg)){%>
			alert('<%=msg%>');
		<%}%>
	</script>
	
	
</head>
<body>
	<div class="page-container">
		<h1>婚纱影楼管理系统</h1>
		<form action="<%=path%>/security/login" method="post">
			<input style="font-style: color" type="text" name="username" class="username"
			placeholder="请输入您的用户名!" title="请输入您的用户名!"/>
			
			<input  type="password" name="password" class="password"
			placeholder="请输入您的密码!" title="请输入您的密码!"/>
			
			<button type="submit" class="submit_button">登录</button>
		</form>
	</div>
</body>
</html>