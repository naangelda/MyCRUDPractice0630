<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Regist</title>
</head>
<body>
	<fieldset>
		<legend>注册</legend>
		<form action="${pageContext.request.contextPath }/saveUser" method="post">
			<table>
				<tr>
					<td>用户no</td><td><input type="text" name="userNo"/></td>
				</tr>
				<tr>
					<td>真实姓名</td><td><input type="text" name="realName"/></td>
				</tr>
				<tr>
					<td>电话号码</td><td><input type="text" name="phoneNum"/></td>
				</tr>
				<tr>
					<td>地址</td><td><input type="text" name="address"/></td>
				</tr>
				<tr>
					<td>角色id</td><td><input type="number" name="roleId"/></td>
				</tr>
				<tr>
					<td>用户状体</td><td><input type="text" name="userStatus"/></td>
				</tr>
				<tr>
					<td>用户remark</td><td><input type="text" name="userRemark"/></td>
				</tr>
				<tr>
					<td>注册时间</td><td><input type="date" name="createTimeString"/></td>
				</tr>
				<tr>
					<td>备注1</td><td><input type="text" name="field1"/></td>
				</tr>
				<tr>
					<td>是否管理员</td><td><input type="text" name="isAdmin"/></td>
				</tr>
				<tr>
					<td>备注2</td><td><input type="text" name="field2"/></td>
				</tr>
				<tr>
					<td>备注3</td><td><input type="text" name="field3"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"/></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>