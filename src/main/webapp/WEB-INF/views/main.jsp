<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="path"/>
<!DOCTYPE html>
<html>
<head>
	<title>六元素后台管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="${pageContext.request.contextPath}/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="header">

    <div class="dl-title">
        <!--<img src="/chinapost/Public/assets/img/top.png">-->
      六元素后台管理系统
    </div>
  
 
    <div class="dl-log">欢迎您，<span class="dl-log-user">${sessionScope.userInfo.username}</span><a href="${pageContext.request.contextPath}/rest/user/logout" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
   

</div>
<div class="content">
<!--     <div class="dl-main-nav"> -->
<!--         <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div> -->
<!--         <ul id="J_Nav"  class="nav-list ks-clear"> -->
<!--             <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">系统管理</div></li>		<li class="nav-item dl-selected"><div class="nav-item-inner nav-order">业务管理</div></li> -->

<!--         </ul> -->
<!--     </div> -->
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bui-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/common/main-min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/config-min.js"></script>


 
<script>


    BUI.use('common/main',function(){
    	
    	var config=[
    	           {
    	               id: '1',
    	               menu: [
    	                   {
    	                       text: '系统菜单',
    	                       items: [
    	                           {
    	                               id: '12',
    	                               text: '用户管理',
    	                               href: '${path}/rest/user/get?pageSize=10'
    	                           },
    	                           {
    	                               id: '3',
    	                               text: '角色管理',
    	                               href: '${path}/rest/role/get?pageSize=10'
    	                           },
    	                           {
    	                               id: '4',
    	                               text: '权限管理',
    	                               href: '${path}/rest/authority/get?pageSize=10'
    	                           }
    	                       ]
    	                   }
    	               ]
    	           }
    	       ];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script> 
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
</div>

</body>
</html>