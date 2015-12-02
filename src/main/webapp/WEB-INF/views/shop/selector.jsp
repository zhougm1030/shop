<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/12/2
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class=" container crumbs-bar">
    <div class="crumbs-nav">
        <div><b>家电电器</b> <i class="crumbs-arrow">&gt;</i></div>
        <div><b>电视机</b></div>
    </div>
</div>
<div class="container selector" ng-controller="selectors">
        <div class="s-title">
            <b>电视机 </b>
            <em>商品筛选</em>
            <span>共 5673个商品</span>
        </div>
        <div class="s-line" ng-repeat="se in selectors">
            <div class="s-content">
                <div class="s-key">
                    {{se.key}}
                </div>
                <div class="s-value">
                    <ul>
                        <li ng-repeat="v in se.value"><a href="#">{{v.v}}</a></li>

                    </ul>
                </div>
                <div>

                </div>
            </div>
        </div>
</div>
<jsp:include page="list-main.jsp"></jsp:include>