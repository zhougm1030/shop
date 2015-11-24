<!-- Zhou Guomin create on 2015年6月18日-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户查看页面</title>
<jsp:include page="../common/common.jsp"></jsp:include>
</head>
<body>
<form class="form-inline definewidth m20" action="${pageContext.request.contextPath}/rest/role/get" method="get">  
   名称：
    <input type="text" name="realname" id="rolename"class="abc input-default" placeholder="名称" value="">&nbsp;&nbsp;  
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp; <a href="${pageContext.request.contextPath}/rest/manager/roleadd"><button type="button" class="btn btn-success" id="addnew">新增角色</button></a>
</form>

	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th>名称</th>
				<th>标示</th>
				<th>描述</th>
				<th>操作</th>
			</tr>
		</thead>
		<c:forEach items="${list}" var="role">
			<tr>
				<td>${role.roleName}</td>
				<td>${role.roleSign}</td>
				<td>${role.roleDesc}</td>
				<td>
				<a
					href="${pageContext.request.contextPath}/rest/authority/auth?id=${role.id}">授权</a>
				<a
					href="${pageContext.request.contextPath}/rest/role/edit?id=${role.id}">编辑</a>
					<a
					href="${pageContext.request.contextPath}/rest/role/delete?id=${role.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<ul class="pager">
		<li><a href="${pageContext.request.contextPath}/rest/role/get?pageNum=${page.pageNum-1}&pageSize=10">上一页</a></li>
		共${page.total}条 ， ${page.pageNum}/${page.pages }
		<li><a href="${pageContext.request.contextPath}/rest/role/get?pageNum=${page.pageNum+1}&pageSize=10">下一页</a></li>
	</ul>
</body>
</html>