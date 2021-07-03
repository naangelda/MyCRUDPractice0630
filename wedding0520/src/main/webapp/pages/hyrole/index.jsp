<%@ page	 pageEncoding="UTF-8"%>
<%@ include file="/commons/taglibs.jsp" %>
<%@ include file="/commons/meta.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath() %>/js/lhgdialog/lhgdialog.min.js?skin=jtop" 
    type="text/javascript"></script>
</head>
<body style="margin: 5px;">
		<div id="search_bar" class="mt10">
		       <div class="box">
		          <div class="box_border">
		             <div class="box_bottom pb5 pt5 pr10" 
		                style="border-top:1px solid #dadada;">
		                <div class="search_bar_btn" 
		                   style="text-align:right;">
		                   <input type="button" class="ext_btn ext_btn_success" 
		                      value="新增" 
                              onclick="openEditDialog('新增','${ctx}/hysw/hyrole/new','600px','350px')">
		                </div>
		             </div>
		          </div>
		       </div>
		 </div>
		 
		  <div id="table" class="mt10">
	    <div class="box span10 oh">
	       <table width="100%" class="list_table">
	          <thead>
	             <tr>
	                <th style="width:1px;">
	                  <input type="checkbox" 
	                    onclick="setAllCheckboxState('items',this.checked)">
	                </th>
	                <th>角色名称</th>
	                <th>备注</th>
					<th>创建时间</th>
					<th>操作</th>
	             </tr>
	          </thead>
	          <tbody>
	              <c:forEach items="${page.result}" var="item" varStatus="status">
	                 <tr class="tr">
	                    <td><input type="checkbox" name="items" 
	                           value="${item.roleId}"></td>
	                    <td>${item.roleName}&nbsp;</td>
						<td>${item.roleRemark}&nbsp;</td>
						<td>${item.createTimeString}&nbsp;</td>
	                    <td>
	                      <a href="javascript:openEditDialog('修改','${ctx}/hysw/hyrole/${item.roleId}/edit','600px','400px')">
	                      修改</a>|
	                      <a href="javascript:deleteRow('${ctx}/hysw/hyrole',${item.roleId})">
	                      删除</a>
	                    </td>
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