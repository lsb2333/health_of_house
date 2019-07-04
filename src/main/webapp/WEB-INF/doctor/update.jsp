<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<!-- 外部样式 -->
		<title>医生修改页面</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/register.css" />
</head>
<body>
	<div id="box">
		<h3>医生修改信息</h3>
		<form action="${pageContext.request.contextPath }/doctor/Update" method="post" 
						autocomplete="on" id="table">
		编号:<input type="test" name="id" value="${doctor.id }" id="border" readonly="readonly"><br><br>
		名称:<input type="test" name="username" value="${doctor.username }" id="border"  required="required"><br><br>
		科类:<input type="test" name="section" value="${doctor.section }" id="border" required="required"><br><br>
		个人描述:<input type="test" name="describes" value="${doctor.describes }"  id="border" required="required"><br><br>
		推荐指数:<input type="test" name="recommendation" value="${doctor.recommendation }" id="border" required="required" ><br><br>
		从医时间:<input type="test" name="years" value="${doctor.years }" id="border" required="required"><br><br>
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