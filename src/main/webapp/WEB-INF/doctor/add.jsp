<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
		<!-- 外部样式 -->
		<title>医生新增页面</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/register.css" />
		


</head>
<body>
	<div id="box">
			
		<h3>医生新增页面</h3>
		<hr width="80%" style="border:1px solid #4590BB;"/><br />
		
		<form action="${pageContext.request.contextPath }/xiaosheng/doctor/add" method="post" 
		enctype="multipart/form-data" onsubmit="return addAll()" autocomplete="on" id="table">
		名称：<input type="text" name="username" id="border" required="required"><br><br>
		科类：<input type="text" name="section" id="border" required="required"><br><br>
		个人描述：<input type="text" name="describes" id="border" required="required" ><br><br>
		推荐指数：<input type="text" name="recommendation" id="border" required="required"><br><br>
		从医时间：<input type="text" name="years" required="required" id="border" oninput="value=value.replace(/[^\d]/g,'')"><br><br>
		<label id="left1">请选择图片:</label><input type="file" name="uploadfile" id="file" multiple="multiple"><br><br />
		<input type="submit" value="创建用户" onsubmit="addAll()" class="type1">
		</form>
		</div>
	
	<script type="text/javascript">
		function addAll(){
			
			alert("创建用户成功！");
			return true;
		}
	</script>
</body>
</html>