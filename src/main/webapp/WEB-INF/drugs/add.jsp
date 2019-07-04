<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<!-- 外部样式 -->
		<title>药品新增页面</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/register.css" />
</script>
</head>
<body>
	<div id="box">
			
		<h3>药品新增页面</h3>
		<hr width="80%" style="border:1px solid #4590BB;"/><br />
			
		<form action="${pageContext.request.contextPath }/xiaosheng/drugs/add" enctype="multipart/form-data"
			 method="post" onsubmit="return addAll()" autocomplete="on" id="table">
		名称：<input type="text" name="username"  id="border" required="required" placeholder="请输入名称"><br><br>
		价格：<input type="text" name="price" id="border" required="required" placeholder="请输入价格"><br><br>
		库存：<input type="text" name="stock" id="border" required="required" placeholder="请输入库存"><br><br>
		<label style="vertical-align:top" >描述：</label>
		<textarea name="describes" id="describes" required="required" placeholder="请输入药品描述"></textarea><br><br>
		有效期：<input type="text" name="term" id="border" required="required" placeholder="请输入有效期"><br><br>
		<label id="left1">请选择图片:</label><input type="file" name="uploadfile" id="file" multiple="multiple"><br><br />
		 <input type="submit" value="提交"  class="type1" onsubmit="addAll()"/>
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