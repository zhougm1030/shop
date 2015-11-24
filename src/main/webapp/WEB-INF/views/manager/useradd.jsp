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
      <li><a href="#">用户管理</a> <span class="divider">/</span></li>       
<c:if test="${op eq 'update'}">
 	<li><a href="#">用户修改</a> <span class="divider">/</span></li>     
    </ul>
	<form action="${pageContext.request.contextPath}/rest/user/update" method="post">
</c:if>
<c:if test="${op ne 'update'}">
 	<li><a href="#">用户添加</a> <span class="divider">/</span></li>
    </ul>
	<form action="${pageContext.request.contextPath}/rest/user/add" method="post">
</c:if>
   
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">用户名</td>
        <td><input type="text" name="username" value="${r.username }"/></td>
    </tr>
     <tr>
        <td width="10%" class="tableleft">真实姓名</td>
        <td><input type="text" name="realname" value="${r.realname }"/></td>
    </tr>
     
    <tr>
        <td class="tableleft">性别</td>
          
        <c:choose>  
         <c:when test="${r.dicSex.subCode == 1}">     
             <td>
            <input type="radio" name="dicSex.subCode" value="1" /> 男
            <input type="radio" name="dicSex.subCode" value="2" checked/> 女
        	</td> 
         </c:when>  
         <c:otherwise>  
             <td>
           	 <input type="radio" name="dicSex.subCode" value="1" checked/> 男
           	 <input type="radio" name="dicSex.subCode" value="2"/> 女
        	</td>
         </c:otherwise>
         </c:choose>
    </tr>
    <tr>
        <td class="tableleft">电话</td>
        <td><input type="text" name="telephone" value="${r.telephone }"/></td>
    </tr> 
    <tr>
        <td class="tableleft">E-Mail</td>
        <td><input type="text" name="email" value="${r.email }"/></td>
    </tr>  
    <tr>
        <td class="tableleft">地址</td>
        <td><input type="text" name="address" value="${r.address }"/></td>
    </tr>  
    <tr>
        <td class="tableleft"></td>
        <td>
        <input type="hidden" name="id" value="${r.id }">
            <button type="submit" class="btn btn-primary" type="button">保存</button>&nbsp;&nbsp;
            <a href="${pageContext.request.contextPath }/rest/user/get"><button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button></a>
        </td>
    </tr>
</table>
</form>
</body>
</html>