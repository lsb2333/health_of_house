<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="itheima" uri="http://itheima.com/common/"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户管理-BootCRM</title>
<!-- 引入css样式文件 -->
<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" />
<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet" />
<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet" />
<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet" />
<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
	type="text/css" />
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
	type="text/css" />
<style type="text/css">
table .img {
	width: 70px;
	height: 70px;
}
</style>
</head>
<body>
	<div id="wrapper">
		<!-- 导航栏部分 -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<a class="navbar-brand"
					href="<%=basePath%>xiaosheng/customer/main.action">BOOT客户管理系统
					v2.0</a>
			</div>
			<!-- 导航栏右侧图标部分 -->
			<ul class="nav navbar-top-links navbar-right">
				<!-- 邮件通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i
						class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-messages">
						<li><a href="#">
								<div>
									<strong>张经理</strong> <span class="pull-right text-muted">
										<em>昨天</em>
									</span>
								</div>
								<div>今天晚上开会，讨论一下下个月工作的事...</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>查看全部消息</strong>
								<i class="fa fa-angle-right"></i>
						</a></li>
					</ul></li>
				<!-- 邮件通知 end -->
				<!-- 任务通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-tasks">
						<li><a href="#">
								<div>
									<p>
										<strong>任务 1</strong> <span class="pull-right text-muted">完成40%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="40" aria-valuemin="0"
											aria-valuemax="100" style="width: 40%">
											<span class="sr-only">完成40%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<p>
										<strong>任务 2</strong> <span class="pull-right text-muted">完成20%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
											style="width: 20%">
											<span class="sr-only">完成20%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>查看所有任务</strong>
								<i class="fa fa-angle-right"></i>
						</a></li>
					</ul></li>
				<!-- 任务通知 end -->
				<!-- 消息通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-alerts">
						<li><a href="#">
								<div>
									<i class="fa fa-comment fa-fw"></i> 新回复 <span
										class="pull-right text-muted small">4分钟之前</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-envelope fa-fw"></i> 新消息 <span
										class="pull-right text-muted small">4分钟之前</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-tasks fa-fw"></i> 新任务 <span
										class="pull-right text-muted small">4分钟之前</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-upload fa-fw"></i> 服务器重启 <span
										class="pull-right text-muted small">4分钟之前</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>查看所有提醒</strong>
								<i class="fa fa-angle-right"></i>
						</a></li>
					</ul></li>
				<!-- 消息通知 end -->
				<!-- 用户信息和系统设置 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i>
								用户：${USER_SESSION.username} </a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> 系统设置</a></li>
						<li class="divider"></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/outlogin">
								<i class="fa fa-sign-out fa-fw"></i>退出登录
						</a></li>
					</ul></li>
				<!-- 用户信息和系统设置结束 -->
			</ul>
			<!-- 左侧显示列表部分 start-->
			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="查询内容...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
									</button>
								</span>
							</div>
						</li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/customer/main.action"
							class="active"> <i class="fa fa-edit fa-fw"></i> 客户管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/drugs/main.action">
								<i class="fa fa-dashboard fa-fw"></i> 药品管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/doctor/main.action">
								<i class="fa fa-edit fa-fw"></i> 医生管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/management/main.action">
								<i class="fa fa-dashboard fa-fw"></i> 健康管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/disease/main.action">
								<i class="fa fa-edit fa-fw"></i> 疾病症状管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/physicians/main.action">
								<i class="fa fa-dashboard fa-fw"></i> 医师讲解管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/diseasecounseling/main.action">
								<i class="fa fa-edit fa-fw"></i> 疾病咨询管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/appointment/main.action">
								<i class="fa fa-dashboard fa-fw"></i> 预约挂号管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/emr/main.action">
								<i class="fa fa-edit fa-fw"></i> 电子病历管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/doctorvisits/main.action">
								<i class="fa fa-dashboard fa-fw"></i> 医生问诊管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/health_Insurance/main.action">
								<i class="fa fa-edit fa-fw"></i> 客户医保管理
						</a></li>
						<li><a
							href="${pageContext.request.contextPath }/xiaosheng/information/main.action">
								<i class="fa fa-dashboard fa-fw"></i> 通知信息管理
						</a></li>
					</ul>
				</div>
			</div>
			<!-- 左侧显示列表部分 end-->
		</nav>

		<!-- 客户列表查询部分  start-->
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">客户管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" method="get"
						action="${pageContext.request.contextPath }/xiaosheng/customer/main.action">
						<div class="form-group">
							<label for="customerName">客户名称</label> <input type="text"
								class="form-control" id="customerName"
								value="${param.username }" name="username" />
						</div>

						<button type="submit" class="btn btn-primary">查询</button>
					</form>
				</div>
			</div>

			<a href="#" class="btn btn-primary" data-toggle="modal"
				data-target="#newModel">新建</a>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">客户信息列表</div>
						<!-- /.panel-heading -->
						<table class="table table-bordered table-striped" id="table">
							<thead>
								<tr>
									<th>编号</th>
									<th>客户名称</th>
									<th>客户密码</th>
									<th>客户网名</th>
									<th>客户邮箱</th>
									<th>客户电话</th>
									<th>客户状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="row">

									<tr>
										<td>${row.id }</td>
										<td>${row.username }</td>
										<td>${row.password }</td>
										<td>${row.names }</td>
										<td>${row.email }</td>
										<td>${row.phone }</td>
										<td>${row.status }</td>
										<td><a href="#" class="btn btn-primary btn-xs"
											data-toggle="modal" data-target="#editCustomerdialog"
											onclick="editCustomer(${row.id})">修改</a> <a href="#"
											class="btn btn-danger btn-xs" onclick="deleteAll(${row.id})">删除</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<itheima:page
								url="${pageContext.request.contextPath }/xiaosheng/customer/main.action" />
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- 创建添加客户模板 -->
		<div class="modal fade" id="newModel" tabindex="-1" role="dialog"
			aria-labelledby="myModelLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="model-title" id="myModelLabel">新建客户信息</h4>
					</div>
					<div class="modal-body">
						<form class=form-horizontal id="new_customer_form">
							<div class="form-group">
								<label for="new_username" class="col-sm-2 control-label">登录账号</label>
								<div class="col-sm-10">
									<input type="text" name="username" id="new_username"
										class="form-control" placeholder="登录账号">
								</div>
							</div>
							<div class="form-group">
								<label for="new_password" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10">
									<input type="text" name="password" id="new_password"
										class="form-control" placeholder="密码">
								</div>
							</div>
							<div class="form-group">
								<label for="new_names" class="col-sm-2 control-label">用户名</label>
								<div class="col-sm-10">
									<input type="text" name="names" id="new_names"
										class="form-control" placeholder="用户名">
								</div>
							</div>
							<div class="form-group">
								<label for="new_email" class="col-sm-2 control-label">邮箱</label>
								<div class="col-sm-10">
									<input type="text" name="email" id="new_email"
										class="form-control" placeholder="邮箱">
								</div>
							</div>
							<div class="form-group">
								<label for="new_phone" class="col-sm-2 control-label">联系电话</label>
								<div class="col-sm-10">
									<input type="text" name="phone" id="new_phone"
										class="form-control" placeholder="联系电话">
								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="button" class="btn btn-primary"
							onclick="createCustomer()">创建用户</button>
					</div>
				</div>
			</div>
		</div>

		<!-- 修改用户模板 -->
		<div class="modal fade" id="editCustomerdialog" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hindden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title" id="myModalLabel">修改用户信息列表</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" id="edit_customer_form">
							<div class="form-group">
									<label for="edit_id" class="col-sm-2 control-label">ID</label>
								<div class="col-sm-10">	
									<input type="text" name="id" id="edit_id" class="form-control" readonly="readonly">
								</div>
							</div>
							<div class="form-group">
									<label for="edit_username" class="col-sm-2 control-label">登录账号</label>
								<div class="col-sm-10">	
									<input type="text" name="username" id="edit_username" class="form-control" required="required">
								</div>
							</div>		
							<div class="form-group">
									<label for="edit_password" class="col-sm-2 control-label">密码</label>
								<div class="col-sm-10">	
									<input type="text" name="password" id="edit_password" class="form-control" >
								</div>
							</div>		
							<div class="form-group">
									<label for="edit_names" class="col-sm-2 control-label">用户名</label>
								<div class="col-sm-10">	
									<input type="text" name="names" id="edit_names" class="form-control" >
								</div>
							</div>		
							<div class="form-group">
									<label for="edit_email" class="col-sm-2 control-label">邮箱</label>
								<div class="col-sm-10">	
									<input type="text" name="email" id="edit_email" class="form-control">
								</div>
							</div>		
							<div class="form-group">
									<label for="edit_phone" class="col-sm-2 control-label">联系电话</label>
								<div class="col-sm-10">	
									<input type="text" name="phone" id="edit_phone" class="form-control" >
								</div>
							</div>				
						</form>
					</div>
					<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-primary"
								onclick="editCustomerDialogAll()">创建用户</button>
					</div>					
				</div>
			</div>
		</div>	
	
	<!-- 客户列表查询部分  end-->
	<!-- 引入js文件 -->
	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>
	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	<script type="text/javascript">
	
	//创建用户
	function createCustomer(){
		$.post("<%=basePath%>xiaosheng/customer/add",
		$("#new_customer_form").serialize(),function(data){
			if(data=="OK"){
				alert("创建用户成功！");
				window.location.reload();
			}else{
				alert("创建用户失败！");
				window.location.reload();
			}
		})
	}
	
	//删除用户
	function deleteAll(id) {
	    if(confirm('确实要删除该客户吗?')) {
		$.post("<%=basePath%>xiaosheng/customer/deleteId",
		{"id":id},
		function(data){
	            if(data == "OK"){
	                alert("客户删除成功！");
	                window.location.reload();
	            }else{
	                alert("删除客户失败！");
	                window.location.reload();
	            }
	        });
	    }
	}
	
	//根据id查询数据返回对象显示给修改表单
	function editCustomer(id){
		$.ajax({
			type: "post",
			url : "<%=basePath%>xiaosheng/customer/byId",
			data: {"id":id},
			success:function(data){
				$("#edit_id").val(data.id);
				$("#edit_username").val(data.username);
				$("#edit_password").val(data.password);
				$("#edit_names").val(data.names);
				$("#edit_email").val(data.email);
				$("#edit_phone").val(data.phone);
			}
		});
	}
	
	//根据查询ID进行修改
	function editCustomerDialogAll(){
		$.post("<%=basePath%>xiaosheng/customer/Update",
		$("#edit_customer_form").serialize(),
		function(data){
			if(data == "OK"){
				alert("修改成功！");
				window.location.reload();
			}else{
				alert("修改失败！");
				window.location.reload();
			}
		});
	}
	</script>

</body>
</html>