<!-- Zhou Guomin create on 2015年6月18日-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="../common/common.jsp"></jsp:include>
</head>
<body>

 <ul class="breadcrumb " style="margin:10px 10px 0 10px" >
      <li><a href="#">角色管理</a> <span class="divider">/</span></li>       
<c:if test="${op eq 'update'}">
 	<li><a href="#">角色修改</a> <span class="divider">/</span></li>     
    </ul>
	<form action="${pageContext.request.contextPath}/rest/role/update" method="post">
</c:if>
<c:if test="${op ne 'update'}">
 	<li><a href="#">角色添加</a> <span class="divider">/</span></li>
    </ul>
	<form action="${pageContext.request.contextPath}/rest/role/add" method="post">
</c:if>
   
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">角色名</td>
        <td><input type="text" name="roleName" value="${r.roleName }"/></td>
    </tr>
     <tr>
        <td width="10%" class="tableleft">角色标示</td>
        <td><input type="text" name="roleSign" value="${r.roleSign }"/></td>
    </tr>
    <tr>
        <td class="tableleft">描述</td>
        <td><input type="text" name="roleDesc" value="${r.roleDesc}"/></td>
    </tr> 
    <tr>
        <td class="tableleft"></td>
        <td>
        <input type="hidden" name="id" value="${r.id }">
            <button type="submit" class="btn btn-primary" type="button">保存</button>&nbsp;&nbsp;
            <a href="${pageContext.request.contextPath }/rest/role/get"><button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button></a>
        </td>
    </tr>
</table>
</form>

</body>
</html>