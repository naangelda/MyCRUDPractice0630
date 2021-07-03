<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>

<script type="text/javascript"
	src="<%=path%>/assets/js/jquery-1.8.2.min.js"></script>
<%-- 	<script type="text/javascript" src="<%=path%>/js/jquery-1.7.min.js"></script> --%>

</head>
<body>
	<div id="showStudents">
		<form action="${pageContext.request.contextPath}/student/update" method="post" onsubmit="return sureSubmit()">
			<table border="2px">
				<tr>
					<td>编号</td>
					<td>学号</td>
					<td>姓名</td>
					<td>年龄</td>
				</tr>
				<tr>
					<td><input type="text" name="id" value="${student.id}" readonly="readonly"></td>
					<td><input type="text" name="stuId" value="${student.stuId}"></td>
					<td><input type="text" name="name" value="${student.name}"></td>
					<td><input type="text" name="age" value="${student.age}"></td>
				</tr>
			</table>
			<input type="submit" value="确定">
			<input type="reset" value="重置">
		</form>
		<button onclick="goback()">返回</button>
	</div>

	<script type="text/javascript">
		function goback() {
			window.location.href = "${pageContext.request.contextPath}/student/access";
		}
		function sureSubmit(){
			return confirm("确认提交修改吗？");
		}
	</script>
</body>
</html>