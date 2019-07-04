<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<!-- 外部样式 -->
		<title>药品修改页面</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/register.css" />
</head>
<body>
	<div id="box">
			
		<h3>药品修改页面</h3>
		<hr width="80%" style="border:1px solid #4590BB;"/><br />
			
		<form action="${pageContext.request.contextPath }/xiaosheng/drugs/Update" method="post" id="table">
		编号：<input type="test" name="id" value="${drugs.id }" id="border" readonly="readonly"><br><br>
		名称：<input type="test" name="username" value="${drugs.username }" id="border" required="required"><br><br>
		价格：<input type="test" name="price" value="${drugs.price }" id="border" required="required"><br><br>
		库存：<input type="test" name="stock" value="${drugs.stock }" id="border" ><br><br>
		描述：<input type="test" name="describes" value="${drugs.describes }" id="border" ><br><br>
		有效期：<input type="test" name="term" value="${drugs.term }" id="border" ><br><br>
		<input type="submit" value="修改" onclick="updataAll()" class="type1">
		</form>
		</div>
</body>
<script type="text/javascript">
	function updataAll(){
		alert("修改成功！");
		return false;
	}
</script>
</html>