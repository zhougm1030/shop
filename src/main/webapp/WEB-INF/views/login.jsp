<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎登录Dorms</title>

<link href="${pageContext.request.contextPath}/app/css/global.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/app/css/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/app/lib/jQuery/jquery1.11.3.js"></script>
<script src="${pageContext.request.contextPath}/app/lib/jQuery/cloud.js" type="text/javascript"></script>
 <script type="text/javascript" >  
        /**有父窗口则在父窗口打开*/  
         if(self!=top){top.location=self.location;}  
   </script>  
<script type="text/javascript">
	$(function(){
	    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
		$(window).resize(function(){  
	    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
    
});  
</script> 

</head>
<body>

<body>

    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎登录后台管理界面平台</span>    
    <ul>
<!--     <li><a href="#">回首页</a></li> -->
    <li><a href="#">帮助</a></li>
    <li><a href="#">关于</a></li>
    </ul>    
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    <form action="${pageContext.request.contextPath}/rest/user/login" method="post">
	    <ul>
	    <li><input name="username" type="text" class="loginuser" placeholder="用户名" onclick="JavaScript:this.value=''"/></li>
	    <li><input name="password" type="password" class="loginpwd" placeholder="密码" onclick="JavaScript:this.value=''"/></li>
	    <li>${error}</li>
	    <li><input type="submit" class="loginbtn" value="登录" /><label><input name="" type="checkbox" value="" checked="checked" />记住密码</label><label><a href="#">忘记密码？</a></label></li>
	    	
	    </ul>
    </form>
    
    </div>
    </div>
    <div class="loginbm">版权所有  2012  &copy;  <!--  <a href="http://www.rgsis.com">rgsis.com</a> --> 长春六元素科技有限公司</div>
	
    
</body>

</body>
</html>