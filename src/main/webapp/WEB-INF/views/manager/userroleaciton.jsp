<!-- Zhou Guomin create on 2015年6月18日-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色授权页面</title>
<jsp:include page="../common/common.jsp"></jsp:include>
</head>
<body>
	<ul class="breadcrumb " style="margin:10px 10px 0 10px" >
        <li><a href="#">角色管理</a> <span class="divider">/</span></li>  
		<li><a href="#">角色授权</a> <span class="divider">/</span></li>     
    </ul>
    
    角色：
     ${user.realname} 
    <form action="${pageContext.request.contextPath}/rest/user/userAuth" method="post">
	<table class="table table-bordered table-hover definewidth m10">
		<thead>
			<tr>
				<th style="text-align:center"><input type="checkbox" disabled="disabled"/></th>
				<th>名称</th>
				<th>标示</th>
				<th>描述</th>
			</tr>
		</thead>
		<c:forEach items="${list}" var="role" varStatus="status">
			   <tr>
				<c:if test="${ role.users[0].id !=null}">
					<td style="text-align:center"><input name="relUserAndRoles[${status.index}].role.id" type="checkbox" value="${role.id }" checked="checked"/>
					</td>
				</c:if>
				<c:if test="${ role.users[0].id ==null}">
					<td style="text-align:center"><input  name="relUserAndRoles[${status.index}].role.id" type="checkbox" value="${role.id }"/></td>
				</c:if>
				<td>${role.roleName}</td>
				<td>${role.roleSign}</td>
				<td>${role.roleDesc}</td>
			</tr>
		</c:forEach>
	</table>
	<ul class="pager">
		<li><a href="${pageContext.request.contextPath}/rest/role/userRole?pageNum=${page.pageNum-1}&pageSize=10">上一页</a></li>
		共${page.total}条 ， ${page.pageNum}/${page.pages }
		<li><a href="${pageContext.request.contextPath}/rest/role/userRole?pageNum=${page.pageNum+1}&pageSize=10">下一页</a></li>
	</ul>
	<input name="id" type="hidden" value="${user.id }"/>
	 <button type="submit" class="btn btn-primary" type="button">保存</button>
	 </form>
</body>
</html>