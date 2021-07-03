<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>All Students</title>
	
	<script type="text/javascript" src="<%=path%>/assets/js/jquery-1.8.2.min.js"></script>
<%-- 	<script type="text/javascript" src="<%=path%>/js/jquery-1.7.min.js"></script> --%>
	
</head>
<body>
	<div id="showStudents">
		<input type="hidden" id="errorMsg" value="${errorMsg}"/>
		<table border="2px">
			<tr>
				<td>编号</td>
				<td>学号</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${studentList}" var="student">
				<tr>
					<td>${student.id}</td>
					<td>${student.stuId}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td><button onclick="deleteById(${student.id})">删除</button><button onclick="edit(${student.id})">修改</button></td>
				</tr>
			</c:forEach>
		</table>
		<button onclick="addPage()">添加</button>
	</div>
	
	<script type="text/javascript">
		if($('#errorMsg').val()!=null&&$('#errorMsg').val()!=''){
			alert($('#errorMsg').val());
			$('#errorMsg').val('');
		}
		
		function deleteById(id){
			if(!confirm('确定要删除吗？')){
				return;
			}
			if(!confirm('不后悔？')){
				return;
			}
			$.ajax({
				type:'get',
				url:'${pageContext.request.contextPath}/student/delete/'+id,
				data : {'id' : id},
				dataType:'json',
				success:function(data){
					if(data==1){
						alert('删除成功');
					}else{
						alert('删除失败');
					}
					location.reload();
				}
			});
		}
		function edit(id){
			window.location.href="${pageContext.request.contextPath}/student/edit/"+id;
		}
		function addPage(id){
			window.location.href="${pageContext.request.contextPath}/student/addPage";
		}
	</script>
</body>
</html>