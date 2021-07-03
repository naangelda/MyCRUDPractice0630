<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jp.ht.util.SystemContants"%>
<%@ page import="com.jp.ht.vo.HyUser"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Head</title>
</head>
<body>
	<div class="head">
		<a href = "javascript:systemLogout()">
			<span class="user_info" style="border:1px solid orange;text-align:center;">退出</span>
		</a>
		
		<span class="user_info">
			<%= session.getAttribute(SystemContants.LOGIN_USER_KEY) %>
		</span>
	</div>
</body>
</html>