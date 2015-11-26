<div class="container header"  >
    <div class="row">
        <div class="col-md-3">
            <a href="#"><img src="http://image.leimingtech.net/upload/logo/1448273713855.png"
                             style="max-height:60px;max-width:300px" class="pngFix"></a>
        </div>
        <div class="col-md-7 search">
            <input type="text" class="text" placeholder="请输入你要搜索的关键字">
            <button class="btn input-submit"><i></i>搜索</button>
        </div>
        <div class="col-md-2 ">

            <div class="user-menu">
                <div class="dd-main-layer">
                    我的购物车
                    <i></i>
                </div>
                <div class="dd-content-layer" ng-controller="shoppingList">
                    <div class="dd-spacer"></div>
                    <div class="dd-list">
                        <div class="smt">
                            <span>最新加入的商品</span>
                        </div>
                        <div class="smc" >
                            <ul>
                                <li ng-repeat="shop in shopping.shops">
                                    <div class="p-img">
                                        <a href="{{shop.url}}" target="_blank"><img
                                                src="{{shop.image}}"
                                                width="50" height="50" alt=""></a>
                                    </div>
                                    <div class="p-name">
                                        <a href="{{shop.url}}"
                                           title="{{shop.name}}" target="_blank">{{shop.name}}</a>

                                    </div>
                                    <div class="p-detail">
                                        <span class="p-price"><strong>{{shop.price}}</strong>{{shop.number}}</span> <br>
                                        <a class="delete"
                                           href="#delete">删除</a>

                                    </div>
                                </li>
                            </ul>
                        </div>
                        <div class="smf">
                            共计{{shopping.total_number}}件商品，共计<strong>{{shopping.total_price}}</strong>
                            <button class="btn btn-danger">去购物车</button>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>

</div>