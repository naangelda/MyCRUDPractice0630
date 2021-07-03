<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.jp.ht.vo.Tmenu"%>
<%
	String path = request.getContextPath();//动态获取工程名,与${pathContext.request.contextPath}作用一样
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Left Menu</title>
	
	<!-- CSS -->
	<link rel="stylesheet" href="<%=path%>/css/style.css"/>
	
	<style>
		body{background-color:#2c333d;margin:opx;}
	</style>
	
	<!-- JavaScript -->
	<script src="<%=path %>/js/jquery.min.js"></script>
	<script src="<%=path %>/js/lhgdialog/lhgdialog.min.js?skin=jtop"></script>
	
	<script type="text/javascript">
	//$(document).ready(function(){
	//
	//});上下两个用法等价
		$(function(){
			$('.subNav').click(function(){
				$(this).toggleClass("currentDd").siblings(".subNav").removeClass("currentDd");
				$(this).toggleClass("currentDt").siblings(".subNav").removeClass("currentDt");
				//修改數字控制速度，slideUp(500)控制捲起速度
				$(this).next(".navContent").slideToggle(500).siblings(".navContent").slideUp(500);
			});
			
			$('.subNavBox h1').click(function(){
				$(this).next(".NavBox").slideToggle(500).siblings(".NavBox").slideUp(500);
			});
		});
	</script>
</head>
<body>
	<div class="subNavBox" id="subNavBox">
		<h1><div class="line"><span>功能菜单</span></div> </h1>
		<div class="NavBox">
			<c:forEach items="${menuList}" var="menu">
				<div class="subNav">
					<img src="<%=path %>/images/nav_icon_3.png"/>
					${menu.menuName}
				</div>
				<ul class="navContent">
					<c:forEach items="${menu.sonList}" var = "sonMenu">
						<li>
							<a href="<%=path%>${sonMenu.menuUrl}" target = "mainFrame">
								${sonMenu.menuName}
							</a>
						</li>
					</c:forEach>
				</ul>
			</c:forEach>
<%-- 			<%List<Tmenu> menuList = (List<Tmenu>)request.getAttribute("menuList");for(int i =0;i<menuList.size();i++){ --%>
<%-- 			%> --%>
<!-- 				<div class="subNav"> -->
<%-- 					<img src="<%=path %>/images/nav_icon_3.png"/> --%>
<%-- 					<%=menuList.get(i).getMenuName() %> --%>
<!-- 				</div> -->
<!-- 				<ul class="navContent"> -->
<%-- 					<%List<Tmenu> sonList = menuList.get(i).getSonList();for(int j =0;j<sonList.size();j++){ --%>
<%-- 					%> --%>
<!-- 						<li> -->
<%-- 							<a href="<%=path%><%=sonList.get(j).getMenuUrl()%>" target = "mainFrame"> --%>
<%-- 								<%=sonList.get(j).getMenuName() %> --%>
<!-- 							</a> -->
<!-- 						</li> -->
<%-- 					<%} %> --%>
<!-- 				</ul> -->
<%-- 			<%} %> --%>
		</div>
	</div>
</body>
</html>