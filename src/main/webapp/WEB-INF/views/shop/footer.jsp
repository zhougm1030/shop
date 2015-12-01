<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/12/1
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="pd-t-20">
    <div class="container-fluid" style="height: 100px; line-height: 100px;  background-color:#F5F5F5">
        <div class="container">
            <div class="col-md-3">
                <span style="font-family: 'Microsoft YaHei';font-weight: 700;font-size: 20px;">

                    <b style="color:red;font-size: 30px;" class="pd-2">多</b>品类齐全，轻松购物
		        </span>
            </div>
            <div class="col-md-3">
                <span style="font-family: 'Microsoft YaHei';font-weight: 700;font-size: 20px;">

                    <b style="color:red;font-size: 30px;" class="pd-2">快</b>多仓直发，极速配送
		        </span>
            </div>
            <div class="col-md-3">
                <span style="font-family: 'Microsoft YaHei';font-weight: 700;font-size: 20px;">

                    <b style="color:red;font-size: 30px;" class="pd-2">好</b>正品行货，精致服务
		        </span>
            </div>
            <div class="col-md-3">
                <span style="font-family: 'Microsoft YaHei';font-weight: 700;font-size: 20px;">

                    <b style="color:red;font-size: 30px;" class="pd-2">省</b>天天低价，畅选无忧
		        </span>
            </div>
        </div>
    </div>
    <div class="container" ng-controller="help">
        <div class="col-md-2" ng-repeat="h in help">
            <dl class="footer-dl">
                <dt>{{h.name}}</dt>
                <dd ng-repeat="s in h.child"><a href="{{s.url}}">{{s.sub}}</a></dd>
            </dl>
        </div>
        <div class="col-md-2">
            <dl class="footer-dl">
                <dt>B2C App</dt>
                <dd ><a href="#"><img src="//img.alicdn.com/tps/i1/TB14VZKHXXXXXcAXXXX64VRZFXX-105-105.png" width="105" height="105" alt="App"></a></dd>
            </dl>
        </div>
    </div>
    <div class="container pd-t-10 border-top">
        <div class="links"><a rel="nofollow" target="_blank" href="http://www.jd.com/intro/about.aspx">关于我们</a>|<a rel="nofollow" target="_blank" href="http://www.jd.com/contact/">联系我们</a>|<a rel="nofollow" target="_blank" href="http://jzt.jd.com">营销中心</a>|<a target="_blank" href="http://club.jd.com/links.aspx">友情链接</a>|<a target="_blank" href="http://media.jd.com/">销售联盟</a></div>
        <div style="text-align: center" class="pd-5">
            Copyright © 2004-2015
        </div>
    </div>
</div>