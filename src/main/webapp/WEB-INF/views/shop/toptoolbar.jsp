<div id="top-tool-bar" class="top-tool-bar" >
    <div class="container">
        <div class="user-entry">
            欢迎来到B2C商城
            [<a href="#">登录</a>]
            [<a href="#">注册</a>]
        </div>

        <div>

        </div>
        <div class="quick-bar" ng-controller="namesCtrl">
            <div class="quick-menu" ng-repeat="name in names">
                <div class="dd-main-layer">
                    {{name.name}}
                    <i></i>
                </div>
                <div class="dd-content-layer">
                    <div class="dd-spacer"></div>
                    <div class="dd-list">
                        <ul>
                            <li ng-repeat="c in name.child">
                                <a href="#">{{c.name}}</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>