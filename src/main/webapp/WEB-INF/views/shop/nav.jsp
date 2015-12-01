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
                    <ul class="dd-ul">
                        <li class="dd-li" ng-repeat="nav in navs" id="nav-{{nav.index}}" data-index="{{nav.index}}">
                            <a href="#">{{nav.name}}</a>
                            <i>></i>
                            <div class="dd-list-sub" id="sub-nav-{{nav.index}}">
                                <dl class="sub-dl" ng-repeat="c in nav.child">
                                    <dt class="sub-dt">
                                        <a href="#">{{c.name}}</a>
                                        <i>&gt;</i>
                                    </dt>
                                    <dd class="sub-dd" ><a href="#" ng-repeat="c1 in c.child">{{c1.name}}</a></dd>
                                </dl>
                            </div>


                        </li>
                    </ul>
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

