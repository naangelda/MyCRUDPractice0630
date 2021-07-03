<%@ page language="java" 
  pageEncoding="UTF-8"%> 
 <%@ include file="/commons/taglibs.jsp" %>
 <%@ include file="/commons/meta.jsp" %>
 <%@ page import="com.jp.ht.vo.HyUser" %>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
	<title>HyUser Index</title>
	
	<!-- JavaScript -->
	<script src="${ctx}/js/lhgdialog/lhgdialog.min.js?skin=jtop"></script>
</head>	
<body style="margin:5px">
	<form id="pageForm" action="${ctx}/hyuser" method="post">
		<!-- 【必须】value=1可以写死 -->
		<input type="hidden" name="pageNum" value="${query.pageNum}" />
		<!-- [可选]每页显示多少条 -->
		<input type="hidden" name="numPerPage" value="${query.numPerPage}" />
		<!-- [可选]查询排序 -->
		<input type="hidden" name="orderField" value="${query.orderField}" />
		<!-- [可选]升序降序 -->
		<input type="hidden" name="orderDirection" value="${query.orderDirection}" />
	</form>
	<form action="${ctx }/hyuser" method="post" id="searchForm">
		<div id="search_bar" class="mt10">
			<div class="box">
				<div class="box_border">
					<div class="box_top" >
						<b class="pl15">搜索</b>
					</div>
					<div class='box_center pt10 pd10'>
						<table class="searchContent">
							<tr>
								<td class="td_right">姓名：</td>
								<td>
									<input type="text" id="realName" name="realName" class="input-text lh30" value="${query.realName }">
								</td>
								<td class="td_right">工号：</td>
								<td>
									<input type="text" id="userNo" name="userNo" class="input-text lh30" value="${query.userNo }">
									<input type="submit" class="ext_btn ext_btn_success" value="搜索" onclick="$('#searchForm').submit();">
									<!-- onclick="$('#searchForm').submit();" -->
								</td>
							</tr>
						</table>
					</div>
					
					<div class="box_bottom pd5 pt5 pr10" style="border-top:1px solid #dadada;">
						<div class="seach_bar_btn" style="text-align:right">
							<input type="button" class="ext_btn ext_btn_error" 
							value="批量删除" onclick="batchDelete('${ctx}/hyuser','items')"/>
							<input type="button" class="ext_btn ext_btn_success" 
							value="新增" onclick="openEditDialog('新增','${ctx}/hyuser/new','600px','350px')"/>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
	<div id="table" class="mt10">
		<div class="box span10 oh">
			<table width="100%" class="list_table">
				<thead>
					<tr>
						<th style="width:1px;">&nbsp;&nbsp;&nbsp;</th>
						<th style="width:1px;">
							<input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"/>
						</th>
						<th><%=HyUser.ALIAS_USER_NO %></th>
						<th><%=HyUser.ALIAS_REAL_NAME %></th>
						<th><%=HyUser.ALIAS_PHONE_NUM %></th>
						<th><%=HyUser.ALIAS_ADDRESS %></th>
						<th>角色名称</th>
						<th><%=HyUser.ALIAS_CREATE_TIME%></th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${page.result}" var="item" varStatus="status">
						<tr class="tr">
							<td>${1+status.index}</td>
							<td><input type="checkbox" name="items" value="${item.userId}"/></td>
							<td>${item.userNo}&nbsp;</td>
							<td>${item.realName}&nbsp;</td>
							<td>${item.phoneNum}&nbsp;</td>
							<td>${item.address}&nbsp;</td>
							<td>${item.field2}&nbsp;</td>
							<td>${item.createTimeString}&nbsp;</td>
							<td><a href="javascript:openEditDialog('修改','${ctx}/hyuser/${item.userId}/edit','600px','350px')">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="page mt10">
				<div class="pagination">
					<ul>
						${pageToolBar}
					</ul>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>