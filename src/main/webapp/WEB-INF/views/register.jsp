<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>注册页面</title>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/style.css" type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath}/css/boot-crm.css" type=text/css rel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/chur.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<meta content="MSHTML 6.00.2600.0" name=GENERATOR>
<script>
// 判断是登录账号和密码是否为空
function register(){
    var usercode = $("#username").val();
    var password = $("#password").val();
    var username = $("#names").val();
    if(usercode =="" || password=="" || username==""){
    	$("#message").text("注册信息不能为空！");	
        return false;
    }  
    
    return true;
}
</script>
</head>
<body lleftMargin=0 topMargin=0 marginwidth="0" marginheight="0"
	 style="background-image: url(${pageContext.request.contextPath }/images/rightbg.jpg); background-repeat:no-repeat; background-attachment: fixed;
	 	background-size: 100%;width: 100%; height: 100%;">
<div ALIGN="center">
<table border="0" width="1140px" cellspacing="0" cellpadding="0" id="table1">
	<tr>
		<td height="93"></td>
		<td></td>
	</tr>
	<tr>
   <td
		width="740" height="412">
   </td>
   <td class="register_msg" width="400" align="center">
	 <!-- margin:0px auto; 控制当前标签居中 -->
	 <fieldset style="width: auto; margin: 0px auto;">
		  <legend>
		     <font style="font-size:15px" face="宋体">
		          欢迎使用BOOT客户管理系统
		     </font>
		  </legend> 
		<font color="red">
			 <%-- 提示信息--%>
			 <span id="message">${msg}</span>
		</font>
		<%-- 提交后的位置：/WEB-INF/jsp/customer.jsp--%>
		<form action="${pageContext.request.contextPath }/register.action" 
			                       method="post" onsubmit="return register()">
                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br /><br />
          账&nbsp;&nbsp;&nbsp;号：<input id="username" type="text" name="username" />
          <br /><br />
          账户名：<input id="names" type="text" name="names" />
          <br /><br />
           密&nbsp;&nbsp;&nbsp;码：<input id="password" type="password" name="password" />
          <br /><br />
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <center><input type="submit" value="注册" /></center>
		 </form>
		 
		 <form action="${pageContext.request.contextPath }/tologin" 
				                       method="get" onsubmit="return true">
			
	        <input style="float: right;" type="submit" value="登录" />
	       
		</form>
		 
	 </fieldset>
	</td>
	</tr>
</table>
</div>
</body>
</html>
