<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/11/30
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class="container">
    <div class="row">
        <div class="col-md-9">
            <div class="box">
                <div class="pic">
                    <ul>
                        <li style="background:url(${pageContext.request.contextPath}/app/images/lb-images/bg1.jpg) center">
                            <img class="img1" src="${pageContext.request.contextPath}/app/images/lb-images/text1.png" />
                            <img class="img2" src="${pageContext.request.contextPath}/app/images/lb-images/con1.png" />
                        </li>
                        <li style="background:url(${pageContext.request.contextPath}/app/images/lb-images/bg2.jpg) center">
                            <img class="img1" src="${pageContext.request.contextPath}/app/images/lb-images/text2.png" />
                            <img class="img2" src="${pageContext.request.contextPath}/app/images/lb-images/con2.png" />
                        </li>
                        <li style="background:url(${pageContext.request.contextPath}/app/images/lb-images/bg3.jpg) center">
                            <img class="img1" src="${pageContext.request.contextPath}/app/images/lb-images/text3.png" />
                            <img class="img2" src="${pageContext.request.contextPath}/app/images/lb-images/con3.png" />
                        </li>
                        <li style="background:url(${pageContext.request.contextPath}/app/images/lb-images/bg4.jpg) center">
                            <img class="img1" src="${pageContext.request.contextPath}/app/images/lb-images/text4.png" />
                            <img class="img2" src="${pageContext.request.contextPath}/app/images/lb-images/con4.png" />
                        </li>
                        <li style="background:url(${pageContext.request.contextPath}/app/images/lb-images/bg5.jpg) center">
                            <img class="img1" src="${pageContext.request.contextPath}/app/images/lb-images/text5.png" />
                            <img class="img2" src="${pageContext.request.contextPath}/app/images/lb-images/con5.png" />
                        </li>
                    </ul>
                </div>
                <div class="nav ">
                    <ul>
                        <li class="bg"></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
            </div>
        </div>

        <div class="col-md-3">
           <div class="fd-panel mg-t-10">
                <div class="fd-panel-headr">
                    <div class="fl title">快报</div>
                    <div class="fr gd"><a href="#">更多<i>&gt;</i></a></div>
                </div>
               <div class="fd-panel-content" ng-controller="news">
                   <ul>
                       <li class="pd-t-5" ng-repeat="new in news">
                           <a href="#">{{new.title}}</a>
                       </li>
                   </ul>
               </div>
           </div>
        </div>
    </div>


</div>

