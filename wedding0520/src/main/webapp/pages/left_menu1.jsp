<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.jp.ht.vo.Tmenu"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=path%>/css/style.css" />
<script type="text/javascript" src="<%=path%>/js/jquery.min.js" ></script>
<script type="text/javascript" 
        src="<%=path%>/js/lhgdialog/lhgdialog.min.js?skin=jtop" ></script>
<script type="text/javascript">
	$(function(){
		$(".subNav").click(function(){
			$(this).toggleClass("currentDd").siblings(".subNav").removeClass("currentDd")
			$(this).toggleClass("currentDt").siblings(".subNav").removeClass("currentDt")
			
			// 修改数字控制速度， slideUp(500)控制卷起速度
			$(this).next(".navContent").slideToggle(500).siblings(".navContent").slideUp(500);
		})
		
		$(".subNavBox h1").click(function(){
			$(this).next(".NavBox").slideToggle(500).siblings(".NavBox").slideUp(500);
		})
	})
</script>
<style>
	  body{background-color:#2c333d;margin: 0px;}
</style>
</head>
<body>
	<div class="subNavBox" id="subNavBox">
	 <h1><div class="line"><span>功能菜单</span></div></h1>
	 <div class="NavBox">
	   <% List<Tmenu> menuList=(List<Tmenu>)request.getAttribute("menuList"); 
	       for(int i = 0;i<menuList.size();i++){
	   %>
	       	<div class="subNav"> 
	       	 <img src="<%=path%>/images/nav_icon_3.png" />
	       	 <%=menuList.get(i).getMenuName()%>
	       	</div>
       		<ul class="navContent">
       		  	<%
           		 List<Tmenu> sonList = menuList.get(i).getSonList();
           		 for(int j=0;j<sonList.size();j++){
           	   %>
           	    <li>
           	      <a href="<%=path%><%=sonList.get(j).getMenuUrl() %>"
           	         target="mainFrame">
           	         <%=sonList.get(j).getMenuName() %>
           	      </a>
           	    </li>
           	   <% } %>
       		</ul>
	   <% } %>
	 </div>
	</div>
</body>
</html>