<%@ page language="java" 
  pageEncoding="UTF-8"%> 
 <%@ include file="/commons/taglibs.jsp" %>
 <%@ include file="/commons/meta.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>
		Edit page
	</title>
</head>
<body>
	<div class="container">
		<div id="forms" class="mt10">
			<div class="box">
				<div class="box_border">
					<div class="box_center">
						<form action="${ctx}/hyuser/update" method="post" class="jqtransform">
							<c:if test="${hyUser.userId!=null}">
								<input type="hidden" id='userId' name="userId" value="${hyUser.userId }"/>
							</c:if>
							<table class="form_table pt15 pd15" width="100%">
									<tr>
										<td>工号：</td>
										<td>
											<input value="${hyUser.userNo}" name="userNo" type="text" 
											class="input-text lh30" size="40"/>
										</td>
									</tr>
									<tr>
										<td>姓名：</td>
										<td>
											<input value="${hyUser.realName}" name="realName" type="text" 
											class="input-text lh30" size="40"/>
										</td>
									</tr>
									<tr>
										<td>手机号码：</td>
										<td>
											<input value="${hyUser.phoneNum}" name="phoneNum" type="text" 
											class="input-text lh30" size="40"/>
										</td>
									</tr>
									<tr>
										<td>联系地址：</td>
										<td>
											<input value="${hyUser.address}" name="address" type="text" 
											class="input-text lh30" size="40"/>
										</td>
									</tr>
									<tr>
										<td>所属角色：</td>
										<td>
											<select name="roleId">
												<c:forEach items="${roleList}" var = "role" >
													<option value="${role.roleId}" 
														<c:if test="${role.roleId==hyUser.roleId}">selected="selected"</c:if> 
													>${role.roleName}</option>
												</c:forEach>
											</select>
										</td>
									</tr>
									<tr>
										<td>备注：</td>
										<td>
											<input value="${hyUser.userRemark }" name="userRemark" type="text" 
											class="input-text lh30" size="40"/>
										</td>
									</tr>
									<tr>
										<td class="td_right">&nbsp;</td>
										<td>
											<input type="submit" name="button" class="btn btn82 btn_save2" value="保存"/>
											<input type="reset" name="button" class="btn btn82 btn_res" value="重置"/> 
										</td>
									</tr>
								</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>