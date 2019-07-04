<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</script>
</head>
<body>
	<form action="${pageContext.request.contextPath }/customer/add" method="post" onsubmit="return addAll()">
		用户名：<input type="text" name="username"  required="required"><br><br>
		密码：<input type="text" name="password"  required="required"><br><br>
		网名：<input type="text" name="names"  required="required" ><br><br>
		邮箱：<input type="text" name="email" required="required"><br><br>
		电话：<input type="text" name="phone" required="required" oninput="value=value.replace(/[^\d]/g,'')"><br><br>
		<input type="submit" value="创建用户" onsubmit="addAll()">
	</form>
	
	<script type="text/javascript">
		function addAll(){
			
			alert("创建用户成功！");
			return true;
		}
	</script>
</body>
</html>