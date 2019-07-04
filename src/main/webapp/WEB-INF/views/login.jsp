<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/css/style.css"
	type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath}/css/boot-crm.css"
	type=text/css rel=stylesheet>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
	
</script>

<script type="text/javascript">
	function check() {
		var username = $("#username").val();
		var password = $("#password").val();
		if (username == "" || password == "") {
			$("#message").text("账号或密码不能为空！ ");
			return false;
		}
		return true;
	}
</script>
</head>
<body leftMargin=0 topMargin=0 marginwidth="0" marginheight="0"
	 style="background-image: url(${pageContext.request.contextPath }/images/rightbg.jpg); background-repeat:no-repeat; background-attachment: fixed;
	 	background-size: 100%;width: 100%; height: 100%;">
	<div ALIGN="center">
		<table border="0" width="1140px" cellspacing="0" cellpadding="0"
			id="table1">
			<tr>
				<td height="93"></td>
				<td></td>
			</tr>
			<tr>
				<td
					
					width="740" height="412"></td>
				<td class="login_msg" width="400" align="center">
					<!-- margin:0px auto; 控制当前标签居中 -->
					<fieldset style="width: auto; margin: 0px auto;">
						<legend>
							<font style="font-size: 15px" face="宋体"> 欢迎使用health小屋后台管理系统 </font>
						</legend>
						<font color="red"> <%-- 提示信息--%> <span id="message">${msg}</span>
						</font>
						<%-- 提交后的位置：/WEB-INF/jsp/customer.jsp--%>
						<form action="${pageContext.request.contextPath }/tologin"
							method="POST" onsubmit="return check()">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
							<br /> 账&nbsp;号：<input type="text" name="username" id="username"><br>
							<br> 密&nbsp;码：<input type="password" name="password"
								id="password"> <br>
							<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<center>
								<input type="submit" value="登录" >
							</center>
						</form>
					</fieldset>
				</td>
			</tr>
		</table>
	</div>

</body>
</html>