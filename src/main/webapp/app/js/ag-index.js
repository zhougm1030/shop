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

