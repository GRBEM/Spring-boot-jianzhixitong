const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "首页总数", "私聊"],
                    "appFrontIcon": "cuIcon-vip",
                    "buttons": ["新增", "查看", "修改", "删除", "首页总数"],
                    "menu": "企业",
                    "menuJump": "列表",
                    "tableName": "qiye"
                }], "menu": "企业管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "首页总数", "私聊"],
                    "appFrontIcon": "cuIcon-link",
                    "buttons": ["新增", "查看", "修改", "删除", "首页总数"],
                    "menu": "学生",
                    "menuJump": "列表",
                    "tableName": "xuesheng"
                }], "menu": "学生管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-newshot",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "兼职类型",
                    "menuJump": "列表",
                    "tableName": "jianzhileixing"
                }], "menu": "兼职类型管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "兼职类型统计", "首页总数", "首页统计", "私聊", "兼职申请", "审核"],
                    "appFrontIcon": "cuIcon-similar",
                    "buttons": ["查看", "修改", "删除", "首页总数", "首页统计", "审核"],
                    "menu": "兼职信息",
                    "menuJump": "列表",
                    "tableName": "jianzhixinxi"
                }], "menu": "兼职信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "申请人数统计", "首页总数", "首页统计", "兼职评价"],
                    "appFrontIcon": "cuIcon-full",
                    "buttons": ["查看", "修改", "删除", "首页总数", "首页统计", "申请人数统计"],
                    "menu": "申请信息",
                    "menuJump": "列表",
                    "tableName": "shenqingxinxi"
                }], "menu": "申请信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "岗位评分统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-cardboard",
                    "buttons": ["查看", "修改", "删除", "首页总数", "首页统计", "审核"],
                    "menu": "兼职评价",
                    "menuJump": "列表",
                    "tableName": "jianzhipingjia"
                }], "menu": "兼职评价管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-phone",
                    "buttons": ["查看", "修改"],
                    "menu": "轮播图管理",
                    "tableName": "config"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "兼职资讯",
                    "tableName": "news"
                }, {
                    "allButtons": ["新增", "查看", "修改", "删除"],
                    "appFrontIcon": "cuIcon-news",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "兼职资讯分类",
                    "tableName": "newstype"
                }, {
                    "allButtons": ["查看", "修改"],
                    "appFrontIcon": "cuIcon-time",
                    "buttons": ["查看", "修改"],
                    "menu": "关于我们",
                    "tableName": "aboutus"
                }], "menu": "系统管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "首页总数", "私聊"],
                    "appFrontIcon": "cuIcon-camera",
                    "buttons": ["查看"],
                    "menu": "企业列表",
                    "menuJump": "列表",
                    "tableName": "qiye"
                }], "menu": "企业模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "兼职类型统计", "首页总数", "首页统计", "私聊", "兼职申请"],
                    "appFrontIcon": "cuIcon-addressbook",
                    "buttons": ["查看", "私聊", "兼职申请"],
                    "menu": "兼职信息列表",
                    "menuJump": "列表",
                    "tableName": "jianzhixinxi"
                }], "menu": "兼职信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "兼职类型统计", "首页总数", "首页统计", "私聊", "兼职申请"],
                    "appFrontIcon": "cuIcon-similar",
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "兼职信息",
                    "menuJump": "列表",
                    "tableName": "jianzhixinxi"
                }], "menu": "兼职信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "申请人数统计", "首页总数", "首页统计", "兼职评价"],
                    "appFrontIcon": "cuIcon-full",
                    "buttons": ["查看", "审核", "申请人数统计"],
                    "menu": "申请信息",
                    "menuJump": "列表",
                    "tableName": "shenqingxinxi"
                }], "menu": "申请信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "岗位评分统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-cardboard",
                    "buttons": ["查看", "审核"],
                    "menu": "兼职评价",
                    "menuJump": "列表",
                    "tableName": "jianzhipingjia"
                }], "menu": "兼职评价管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "首页总数", "私聊"],
                    "appFrontIcon": "cuIcon-camera",
                    "buttons": ["查看"],
                    "menu": "企业列表",
                    "menuJump": "列表",
                    "tableName": "qiye"
                }], "menu": "企业模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "兼职类型统计", "首页总数", "首页统计", "私聊", "兼职申请"],
                    "appFrontIcon": "cuIcon-addressbook",
                    "buttons": ["查看", "私聊", "兼职申请"],
                    "menu": "兼职信息列表",
                    "menuJump": "列表",
                    "tableName": "jianzhixinxi"
                }], "menu": "兼职信息模块"
            }],
            "hasBackLogin": "是",
            "hasBackRegister": "是",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "企业",
            "tableName": "qiye"
        }, {
            "backMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "申请人数统计", "首页总数", "首页统计", "兼职评价"],
                    "appFrontIcon": "cuIcon-full",
                    "buttons": ["查看", "兼职评价"],
                    "menu": "申请信息",
                    "menuJump": "列表",
                    "tableName": "shenqingxinxi"
                }], "menu": "申请信息管理"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "审核", "岗位评分统计", "首页总数", "首页统计"],
                    "appFrontIcon": "cuIcon-cardboard",
                    "buttons": ["查看"],
                    "menu": "兼职评价",
                    "menuJump": "列表",
                    "tableName": "jianzhipingjia"
                }], "menu": "兼职评价管理"
            }],
            "frontMenu": [{
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "首页总数", "私聊"],
                    "appFrontIcon": "cuIcon-camera",
                    "buttons": ["查看"],
                    "menu": "企业列表",
                    "menuJump": "列表",
                    "tableName": "qiye"
                }], "menu": "企业模块"
            }, {
                "child": [{
                    "allButtons": ["新增", "查看", "修改", "删除", "兼职类型统计", "首页总数", "首页统计", "私聊", "兼职申请"],
                    "appFrontIcon": "cuIcon-addressbook",
                    "buttons": ["查看", "私聊", "兼职申请"],
                    "menu": "兼职信息列表",
                    "menuJump": "列表",
                    "tableName": "jianzhixinxi"
                }], "menu": "兼职信息模块"
            }],
            "hasBackLogin": "否",
            "hasBackRegister": "否",
            "hasFrontLogin": "是",
            "hasFrontRegister": "是",
            "roleName": "学生",
            "tableName": "xuesheng"
        }]
    }
}
export default menu;
