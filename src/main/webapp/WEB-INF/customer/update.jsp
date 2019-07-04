<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/customer/Update" method="post">
		id:<input type="test" name="id" value="${customer.id }" readonly="readonly"><br><br>
		username:<input type="test" name="username" value="${customer.username }"  required="required"><br><br>
		password:<input type="test" name="password" value="${customer.password }" required="required"><br><br>
		name:<input type="test" name="names" value="${customer.names }" ><br><br>
		email:<input type="test" name="email" value="${customer.email }" ><br><br>
		phone:<input type="test" name="phone" value="${customer.phone }" ><br><br>
		<input type="submit" value="修改或返回" onclick="updataAll()">
	</form>
</body>
<script type="text/javascript">
	function updataAll(){
		alert("修改成功！");
		return false;
	}
</script>
</html>