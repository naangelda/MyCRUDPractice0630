<%@ page language="java" 
  pageEncoding="UTF-8"%> 
 <%@ include file="/commons/taglibs.jsp" %>
 <%@ include file="/commons/meta.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Saved successful</title>
	
	<script type="text/javascript">
		$(function(){
			my_alert("保存成功");
			var api=frameElement.api, W=api.opener;
			api.close();
			W.reloadCurrentList();
		});
	</script>
</head>
<body>
	
</body>
</html>