<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--bootstrap 框架-->
    <link href="${pageContext.request.contextPath}/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
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
<body ng-app="myApp">

<jsp:include page="toptoolbar.jsp"></jsp:include>

<jsp:include page="header.jsp"></jsp:include>

<jsp:include page="nav.jsp"></jsp:include>

<script src="${pageContext.request.contextPath}/assets/jquery/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath}/assets/bootstrap/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/app/js/ag-index.js"></script>

<script>
    $(function ($) {
        $(".quick-menu").hover(
                function () {
                    $(this).addClass("hover");
                },
                function () {
                    $(this).removeClass("hover");
                }
        );
        $(".user-menu").hover(
                function () {
                    $(this).addClass("hover");
                },
                function () {
                    $(this).removeClass("hover");
                }
        );
        $(".category").hover(
                function () {
                    $(this).addClass("hover");
                }

        );
        $(".dd-list ul li").hover(
                function () {

                    var index = $(this).data("index");
                    var pHeight = $(this).parent().height();
                    var sub =  $("#sub-"+$(this).attr('id'));

                    sub.css('top' , -((index -1) * 31));
                    sub.height(pHeight);
                    sub.show();

                },
                function () {

                    $("#sub-"+$(this).attr('id')).hide();

                }

        );


    });

</script>
</body>
</html>