<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/11/26
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="nav-bar" ng-controller="nav">
    <div class="container ">
        <div class="category">
            <div class="dd-main-layer">
                <a href="#">全部商品分类</a>
            </div>
            <div class="dd-content-layer">
                <div class="dd-spacer"></div>
                <div class="dd-list">
                    <ul>
                        <li ng-repeat="nav in navs" id="nav-{{nav.index}}">
                            <a href="#">{{nav.name}}</a>
                            <i>></i>
                        </li>
                    </ul>
                </div>
                <div class="dd-list-sub" >
                    <div class="list-sub" ng-repeat="nav in navs" id="sub-nav-{{nav.index}}">
                        <div ng-repeat="c in nav.child">
                            {{c.name}}
                        </div>

                    </div>
                </div>
            </div>
        </div>

        <div class="nav-menu">
            <ul>
                <li><a href="#">首页</a></li>
                <li><a href="#">商城</a></li>
            </ul>
        </div>

    </div>
</div>

