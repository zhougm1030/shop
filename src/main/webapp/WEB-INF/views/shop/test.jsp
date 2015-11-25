<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--bootstrap 框架-->
    <link href="${pageContext.request.contextPath}/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" >
    <link rel="stylesheet" href="${pageContext.request.contextPath}/app/css/shop.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script src="${pageContext.request.contextPath}/assets/AngularJS/angular.min.js"></script>
    <title>B2C</title>
</head>
<body>

<div id="top-tool-bar" class="top-tool-bar" ng-app="myApp" >
    <div class="container">
        <div  class="user-bar">

            <div class="dd-main-layer">
                    测试
            </div>
            <div class="dd-content-layer">
                <div class="dd-spacer"></div>
                <div class="dd-list">
                    测试
                </div>
            </div>

        </div>

    </div>
</div>




<script src="${pageContext.request.contextPath}/assets/jquery/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath}/assets/bootstrap/js/bootstrap.js"></script>


<script>
    angular.module('myApp', []).controller('namesCtrl', function($scope) {
        $scope.names = [
            {name:'我的订单',child:[
                {name:'待付款订单'},
                {name:'待确认收货'},
                {name:'待评价交易'}
            ]},
            {name:'我的收藏',child:[
                {name:'收藏的商品'}

            ]},
            {name:'客户服务',child:[
                {name:'售后服务'},
                {name:'客户中心'}
            ]},
            {name:'站点导航',child:[
                {name:'商城首页'}

            ]}
        ];
    });

    $(function($) {
        $(".user-bar").hover(
                function () {
                    $(this).addClass("hover");
                },
                function () {
                    $(this).removeClass("hover");
                }
        );

    });

</script>
</body>
</html>