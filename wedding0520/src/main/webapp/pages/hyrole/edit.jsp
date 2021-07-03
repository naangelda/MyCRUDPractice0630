<%@ page language="java" 
  pageEncoding="UTF-8"%> 
 <%@ include file="/commons/taglibs.jsp" %>
 <%@ include file="/commons/meta.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Edit page</title>
	
	<script type="text/javascript">
		var checkedCount = 0;
		$(function(){
			$("input[name='menuIds']").each(function (){
				if($(this).is(":checked")){
					checkedCount++;
				}
			});
		});
		function checkAll(checked){
			checked?checkedCount=9:checkedCount=0;
		}
		function updateCheckAll(checked){
			
			checked?checkedCount++:checkedCount--;
			
			if(checkedCount<9){
				$('.checkAll').attr("checked",false);
			}else{
				$('.checkAll').prop("checked",true);
			}
		}
		function checkForm(){
			var count=0;
			$("input[name='menuIds']").each(function (){
				if($(this).is(":checked")){
					count++;
				}
			});
			if(count==0){
				alert("设置权限必选");
				return false;
			}
			$(".signuupForm").submit();			
		}
	</script>
</head>
<body>
<div class="container">
		<div id="forms" class="mt10">
			<div class="box">
				<div class="box_border">
					<div class="box_center">
						<form action="${ctx}/hysw/hyrole/update" class="signuupForm" method="post">
							<c:if test="${hyRole.roleId!=null}">
<!-- 							新增和修改做在一起，所以这里：没有id的话就是新增，没有就是修改 -->
								<input type="hidden" id="roleId" name="roleId" value="${hyRole.roleId}"/>
							</c:if>
							<table width="100%" class="form_table pt15 pd15">
								<tr>
									<td>角色名称</td>
									<td>
										<input value="${hyRole.roleName}" name="roleName" type="text" class="input-text lh30" size="40">
									</td>
								</tr>
								<tr>
								<td valign="top" align="right">权限</td>
									<td>
										<div style="wideth:auto;height:auto;border:1px solid#fff;">
											<input type="checkbox"
												<c:if test="${requestScope.all=='Y'}">checked</c:if>
												onclick="setAllCheckboxState('menuIds',this.checked)"class="checkAll"
												onchange="checkAll(this.checked)"/> 所有权限<br>
												<c:forEach items="${requestScope.menuList}" var="menu" varStatus="status">
													<input type="checkbox" value ="${menu.menuId}" name="menuIds"
													<c:if test="${menu.field1=='Y'}">checked</c:if>
													onchange="updateCheckAll(this.checked)"/>${menu.menuName}&nbsp;&nbsp;&nbsp;
             										<c:if test="${(status.index+1)%3==0}"><br/></c:if>
												</c:forEach>
										</div>
									</td>
								</tr>
								
								<tr>
									<td>备注</td>
									<td>
										<textarea rows="5" cols="50" name="roleRemark">${hyRole.roleRemark}</textarea>
									</td>
										<%-- <input value="${hyUser.userRemark}" name="userRemark" type="text" class="input-text lh30" size="40"></td> --%>
								</tr>
								<tr>
									<td></td>
									<td>
										<input value="保存" name="button" type="submit"
										class="btn btn82 btn_save2"> <input value="重置"
										name="button" type="reset" class="btn btn82 btn_res">
									</td>
								</tr>
								<tr>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>