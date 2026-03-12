import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import qiyeList from '../pages/qiye/list'
import qiyeDetail from '../pages/qiye/detail'
import qiyeAdd from '../pages/qiye/add'
import xueshengList from '../pages/xuesheng/list'
import xueshengDetail from '../pages/xuesheng/detail'
import xueshengAdd from '../pages/xuesheng/add'
import jianzhileixingList from '../pages/jianzhileixing/list'
import jianzhileixingDetail from '../pages/jianzhileixing/detail'
import jianzhileixingAdd from '../pages/jianzhileixing/add'
import jianzhixinxiList from '../pages/jianzhixinxi/list'
import jianzhixinxiDetail from '../pages/jianzhixinxi/detail'
import jianzhixinxiAdd from '../pages/jianzhixinxi/add'
import shenqingxinxiList from '../pages/shenqingxinxi/list'
import shenqingxinxiDetail from '../pages/shenqingxinxi/detail'
import shenqingxinxiAdd from '../pages/shenqingxinxi/add'
import jianzhipingjiaList from '../pages/jianzhipingjia/list'
import jianzhipingjiaDetail from '../pages/jianzhipingjia/detail'
import jianzhipingjiaAdd from '../pages/jianzhipingjia/add'
import chatmessageList from '../pages/chatmessage/list'
import chatmessageDetail from '../pages/chatmessage/detail'
import chatmessageAdd from '../pages/chatmessage/add'
import friendList from '../pages/friend/list'
import friendDetail from '../pages/friend/detail'
import friendAdd from '../pages/friend/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'qiye',
					component: qiyeList
				},
				{
					path: 'qiyeDetail',
					component: qiyeDetail
				},
				{
					path: 'qiyeAdd',
					component: qiyeAdd
				},
				{
					path: 'xuesheng',
					component: xueshengList
				},
				{
					path: 'xueshengDetail',
					component: xueshengDetail
				},
				{
					path: 'xueshengAdd',
					component: xueshengAdd
				},
				{
					path: 'jianzhileixing',
					component: jianzhileixingList
				},
				{
					path: 'jianzhileixingDetail',
					component: jianzhileixingDetail
				},
				{
					path: 'jianzhileixingAdd',
					component: jianzhileixingAdd
				},
				{
					path: 'jianzhixinxi',
					component: jianzhixinxiList
				},
				{
					path: 'jianzhixinxiDetail',
					component: jianzhixinxiDetail
				},
				{
					path: 'jianzhixinxiAdd',
					component: jianzhixinxiAdd
				},
				{
					path: 'shenqingxinxi',
					component: shenqingxinxiList
				},
				{
					path: 'shenqingxinxiDetail',
					component: shenqingxinxiDetail
				},
				{
					path: 'shenqingxinxiAdd',
					component: shenqingxinxiAdd
				},
				{
					path: 'jianzhipingjia',
					component: jianzhipingjiaList
				},
				{
					path: 'jianzhipingjiaDetail',
					component: jianzhipingjiaDetail
				},
				{
					path: 'jianzhipingjiaAdd',
					component: jianzhipingjiaAdd
				},
				{
					path: 'chatmessage',
					component: chatmessageList
				},
				{
					path: 'chatmessageDetail',
					component: chatmessageDetail
				},
				{
					path: 'chatmessageAdd',
					component: chatmessageAdd
				},
				{
					path: 'friend',
					component: friendList
				},
				{
					path: 'friendDetail',
					component: friendDetail
				},
				{
					path: 'friendAdd',
					component: friendAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
