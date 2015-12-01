<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/12/1
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <div class="row">
        <div class="col-md-12 pd-b-5 pd-t-15">
            <span class="title">热门商品</span>
        </div>

    </div>
    <div class="row  pd-l-15 pd-r-15" ng-controller="hots">

        <ul class="images-list-6 ">
            <li class="pd-t-10" ng-repeat="hot in hots">
                <div>
                    <a href="#">
                        <img data-lazy-img="done" width="130" height="130" title="{{hot.title}}"
                             src="{{hot.src}}"
                             class="">
                    </a>
                </div>
                <div>
                    <div class="pd-10">
                        <a data-clk="//mercury.jd.com/log.gif?t=rec.610009&amp;v=src=rec$action=1$reqsig=39c0fd3217c5eab23d81e2f666278ca777d4d4f0$enb=1$sku=0$csku=1648552$index=0$st=0$adcli=$expid=112&amp;rid=6114426354211686187&amp;ver=1&amp;sig=b72f27ce615433c057d24fdd7eee9acef0ba0c04"
                           href="{{hot.href}}" target="_blank"
                           title="{{hot.title}}">{{hot.title}}</a>
                    </div>
                    <div class="pd-5" style="color:red;font-size: 14px;font-weight: 700">
                        <i>¥</i>
                        {{hot.price}}
                    </div>
                </div>

            </li>
        </ul>
    </div>

</div>

<div class="container">
    <div class="row">
        <div class="col-md-12 pd-b-5 pd-t-15">
            <span class="title">精品推荐</span>
        </div>

    </div>
    <div class="row  pd-l-15 pd-r-15" ng-controller="grooms">

        <ul class="images-list-6 ">
            <li class="pd-t-10" ng-repeat="groom in grooms">
                <div>
                    <a href="#">
                        <img data-lazy-img="done" width="130" height="130" title="{{groom.title}}"
                             src="{{groom.src}}"
                             class="">
                    </a>
                </div>
                <div>
                    <div class="pd-10">
                        <a data-clk="//mercury.jd.com/log.gif?t=rec.610009&amp;v=src=rec$action=1$reqsig=39c0fd3217c5eab23d81e2f666278ca777d4d4f0$enb=1$sku=0$csku=1648552$index=0$st=0$adcli=$expid=112&amp;rid=6114426354211686187&amp;ver=1&amp;sig=b72f27ce615433c057d24fdd7eee9acef0ba0c04"
                           href="{{groom.href}}" target="_blank"
                           title="{{groom.title}}">{{groom.title}}</a>
                    </div>
                    <div class="pd-5" style="color:red;font-size: 14px;font-weight: 700">
                        <i>¥</i>
                        {{groom.price}}
                    </div>
                </div>

            </li>
        </ul>
    </div>

</div>