<!-- Zhou Guomin create on 2015年6月18日-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户查看页面</title>
<jsp:include page="../common/common.jsp"></jsp:include>
</head>
<body>
	<form class="form-inline definewidth m20"
		action="${pageContext.request.contextPath}/rest/user/get" method="get">
		用户名称： <input type="text" name="realname" id="rolename"
			class="abc input-default" placeholder="姓名" value="">&nbsp;&nbsp;
		<button type="submit" class="btn btn-primary">查询</button>
		&nbsp;&nbsp; <a
			href="${pageContext.request.contextPath}/rest/manager/useradd"><button
				type="button" class="btn btn-success" id="addnew">新增教师</button></a>
	</form>

	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th>姓名</th>
				<th>用户名</th>
				<th>性别</th>
				<th>电话</th>
				<th>电子邮箱</th>
				<th>操作</th>
			</tr>
		</thead>
		<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.realname}</td>
				<td>${user.username}</td>
				<td>${user.dicSex.subName}</td>
				<td>${user.telephone }</td>
				<td>${user.email }</td>
				<td><a
					href="${pageContext.request.contextPath}/rest/role/userRole?id=${user.id}">授权</a>
					<a
					href="${pageContext.request.contextPath}/rest/user/edit?id=${user.id}">编辑</a>
					<shiro:hasPermission name="user:delete">
						<a
							href="${pageContext.request.contextPath}/rest/user/delete?id=${user.id}">删除</a>
					</shiro:hasPermission></td>
			</tr>
		</c:forEach>
	</table>
	<ul class="pager">
		<li><a href="${pageContext.request.contextPath}/rest/user/get?pageNum=${page.pageNum-1}&pageSize=10">上一页</a></li>
		共${page.total}条 ， ${page.pageNum}/${page.pages }
		<li><a href="${pageContext.request.contextPath}/rest/user/get?pageNum=${page.pageNum+1}&pageSize=10">下一页</a></li>
	</ul>
</body>
</html>