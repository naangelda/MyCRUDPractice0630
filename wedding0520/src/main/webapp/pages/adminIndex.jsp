<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.lang.String"%>
<%@ page import="java.util.*"%>
<%
	String path = request.getContextPath();//动态获取工程名,与${pathContext.request.contextPath}作用一样
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	
	<!-- CSS -->
	<link rel="stylesheet" href="<%=path%>/css/common.css"/>
	<link rel="stylesheet" href="<%=path%>/css/adminIndex.css"/>
	
	<!-- JavaScript -->
	<script src="<%=path%>/js/jquery.min.js"></script>
	<script src="<%=path%>/js/jquery.SuperSlide.js"></script>
</head>
<body>
	<div class="top">
		<jsp:include page="head.jsp"></jsp:include>
	</div>
	<div class="side">
		<jsp:include page="left_menu.jsp"></jsp:include>
	</div>
	<div class = "main">
		<iframe name="mainFrame" id="rightMain"
			src="<%=path %>/pages/icon.jsp"
			scrolling="auto" width="100px" height="auto"
			allowtransparency="true">
		</iframe>
	</div>
</body>
</html>