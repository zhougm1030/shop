/**
 * Created by Administrator on 2015/11/26.
 */
var myApp = angular.module('myApp', []);
//页面导航
myApp.controller('namesCtrl', function ($scope) {
    $scope.names = [
        {
            name: '我的订单', child: [
            {name: '待付款订单'},
            {name: '待确认收货'},
            {name: '待评价交易'}
        ]
        },
        {
            name: '我的收藏', child: [
            {name: '收藏的商品'}

        ]
        },
        {
            name: '客户服务', child: [
            {name: '售后服务'},
            {name: '客户中心'}
        ]
        },
        {
            name: '站点导航', child: [
            {name: '商城首页'}

        ]
        }
    ];
});
//购物车
myApp.controller('shoppingList', function ($scope) {
    $scope.shopping = {
        total_number: '1',
        total_price: '￥5043.00',
        shops: [
            {
                url: 'http://item.jd.com/1856583.html',
                image: '//img13.360buyimg.com/n5/jfs/t1987/254/132428285/96565/3564669b/55f0e7f0N778cce62.jpg',
                name: 'Apple iPhone 6s (A1700) 16G 深空灰色 移动联通电信4G手机',
                price: '￥4988.00',
                number: '×1'
            },
            {
                url: 'http://item.jd.com/727841.html',
                image: '//img11.360buyimg.com/n5/g9/M03/05/1B/rBEHalBP-cUIAAAAAAD62gqWd54AABJKgK-0Y4AAPry326.jpg',
                name: 'TP-LINK TL-WN823N300M 迷你型无线USB网卡',
                price: '￥55.00',
                number: '×1'
            }

        ]
    }
});
//购物车
myApp.controller('nav', function ($scope) {
    $scope.navs = [
        {
            index: 1,
            name: '家用电器',
            child: [
                {
                    name: '大家电',
                    child: [
                        {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'},
                        {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}
                    ]
                },
                {
                    name: '大家电',
                    child: [
                        {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'},
                        {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}, {name: '电视'}, {name: '空调'}
                    ]
                }
            ]
        },
        {
            index: 2,
            name: '手机、数码',
            child: [
                {
                    name: '手机',
                    child: [
                        {name: '智能手机'}, {name: '老人机'}
                    ]
                }
            ]
        },
        {
            index: 3,
            name: '电脑、办公',
            child: [
                {
                    name: '电脑',
                    child: [
                        {name: '笔记本'}, {name: '品牌台式机'}
                    ]
                }
            ]
        },
        {
            index: 4,
            name: '服装、鞋帽',
            child: [
                {
                    name: '服装',
                    child: [
                        {name: '男装'}, {name: '女装'}
                    ]
                }
            ]
        },
        {
            index: 5,
            name: '图书、音像',
            child: [
                {
                    name: '图书',
                    child: [
                        {name: '计算机技术'}, {name: '励志书籍'}
                    ]
                }
            ]
        },
        {
            index: 6,
            name: '图书、音像',
            child: [
                {
                    name: '图书',
                    child: [
                        {name: '计算机技术'}, {name: '励志书籍'}
                    ]
                }
            ]
        },
        {
            index: 7,
            name: '图书、音像',
            child: [
                {
                    name: '图书',
                    child: [
                        {name: '计算机技术'}, {name: '励志书籍'}
                    ]
                }
            ]
        }, {
            index: 8,
            name: '图书、音像',
            child: [
                {
                    name: '图书',
                    child: [
                        {name: '计算机技术'}, {name: '励志书籍'}
                    ]
                }
            ]
        }, {
            index: 9,
            name: '图书、音像',
            child: [
                {
                    name: '图书',
                    child: [
                        {name: '计算机技术'}, {name: '励志书籍'}
                    ]
                }
            ]
        }, {
            index: 10,
            name: '图书、音像',
            child: [
                {
                    name: '图书',
                    child: [
                        {name: '计算机技术'}, {name: '励志书籍'}
                    ]
                }
            ]
        }, {
            index: 11,
            name: '图书、音像',
            child: [
                {
                    name: '图书',
                    child: [
                        {name: '计算机技术'}, {name: '励志书籍'}
                    ]
                }
            ]
        }

    ]

});

myApp.controller('news', function ($scope) {
    $scope.news = [
        {
            title: '[特价]手机低至99元',
            content: '',
        },
        {
            title: '[公告]京东“赣州馆”正式开启',
            content: '',
        },
        {
            title:'[特惠]澳洲大牌澳佳宝299-100',
            content:'',
        }
    ]
});

myApp.controller('hots', function ($scope) {
    $scope.hots = [
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        }        ,
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        }

    ]
});

myApp.controller('grooms', function ($scope) {
    $scope.grooms = [
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        }        ,
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        },
        {
            title: '魅族 魅蓝note2 16GB 灰色 移动联通双4G手机 双卡双待',
            src: '//img12.360buyimg.com/n1/s130x130_jfs/t1237/316/1092345838/120397/92777f5/557658d0Nbf23ec1e.jpg',
            href:'http://item.jd.com/1648552.html',
            price:'799.00'
        }
    ]
});

myApp.controller('help' , function($scope){
    $scope.help=[
        {
            name:'购物指南',
            child:[
                {
                    sub:'购物流程',
                    url:''
                }, {
                    sub:'会员介绍',
                    url:''
                }, {
                    sub:'生活旅行/团购',
                    url:''
                }, {
                    sub:'常见问题',
                    url:''
                }, {
                    sub:'大家电',
                    url:''
                }, {
                    sub:'联系客服',
                    url:''
                }
            ]
        },{
            name:'配送方式',
            child:[
                {
                    sub:'上门自提',
                    url:''
                }, {
                    sub:'211限时达',
                    url:''
                }, {
                    sub:'配送服务查询',
                    url:''
                }, {
                    sub:'配送费收取标准',
                    url:''
                }, {
                    sub:'海外配送',
                    url:''
                }
            ]
        },{
            name:'支付方式',
            child:[
                {
                    sub:'货到付款',
                    url:''
                }, {
                    sub:'在线支付',
                    url:''
                }, {
                    sub:'分期付款',
                    url:''
                }, {
                    sub:'邮局汇款',
                    url:''
                }, {
                    sub:'公司转账',
                    url:''
                }
            ]
        },{
            name:'售后服务',
            child:[
                {
                    sub:'售后政策',
                    url:''
                }, {
                    sub:'价格保护',
                    url:''
                }, {
                    sub:'退款说明',
                    url:''
                }, {
                    sub:'返修/退换货',
                    url:''
                }, {
                    sub:'取消订单',
                    url:''
                }
            ]
        },{
            name:'特色服务',
            child:[
                {
                    sub:'夺宝岛',
                    url:''
                }, {
                    sub:' DIY装机',
                    url:''
                }, {
                    sub:'延保服务',
                    url:''
                }, {
                    sub:'京东E卡',
                    url:''
                }, {
                    sub:'京东通信',
                    url:''
                }
            ]
        }
    ]
})
