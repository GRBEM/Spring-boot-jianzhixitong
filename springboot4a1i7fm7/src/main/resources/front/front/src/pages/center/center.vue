<template>
<div class="center-preview" :style='{"width":"100%","padding":"0","margin":"10px auto","position":"relative","background":"none"}'>
	<div class="title" :style='{"margin":"10px auto 0","color":"#FFC174","borderRadius":"60px","textAlign":"center","background":"#8E4033","width":"80%","fontSize":"24px","lineHeight":"54px","fontWeight":"bold"}'>{{ title }}</div>
	
	<div class="info" :style='{"padding":"30px 70px","boxShadow":"none","margin":"0 auto 20px","alignItems":"center","display":"flex","justifyContent":"center","borderRadius":"10px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20240113/af5db0ea80244cc3a4cb58b8083aa02f.png)","width":"80%","backgroundSize":"100% 100%","backgroundPosition":"center center","backgroundRepeat":"no-repeat","height":"auto"}'>
		<div :style='{"borderColor":"#efefef","color":"#fff","borderWidth":"0","display":"none","width":"100%","lineHeight":"44px","fontSize":"15px","borderStyle":"solid","height":"44px"}'>个人信息</div>
		<div :style='{"width":"auto","borderColor":"#efefef","fontSize":0,"borderStyle":"solid","borderWidth":"0","height":"auto"}' v-if="userTableName=='qiye'">
			<el-image :style='{"margin":"10px auto","borderColor":"#efefef","objectFit":"cover","borderRadius":"100%","borderWidth":"0","display":"block","width":"110px","borderStyle":"solid","height":"110px"}' :src="sessionForm.touxiang?baseUrl + sessionForm.touxiang:require('@/assets/avator.png')" fit="cover"></el-image>
		</div>
		<div :style='{"width":"auto","borderColor":"#efefef","fontSize":0,"borderStyle":"solid","borderWidth":"0","height":"auto"}' v-if="userTableName=='xuesheng'">
			<el-image :style='{"margin":"10px auto","borderColor":"#efefef","objectFit":"cover","borderRadius":"100%","borderWidth":"0","display":"block","width":"110px","borderStyle":"solid","height":"110px"}' :src="sessionForm.touxiang?baseUrl + sessionForm.touxiang:require('@/assets/avator.png')" fit="cover"></el-image>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"20px 0 0","alignItems":"center","borderWidth":"0","flexDirection":"column","display":"flex","width":"auto","lineHeight":"30px","borderStyle":"solid","justifyContent":"center","height":"auto"}' v-if="userTableName=='xuesheng'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#FFC174","fontSize":"14px"}'>账号</div>
			<div :style='{"fontSize":"16px","color":"#FFC174","textAlign":"left","flex":1,"fontWeight":"bold"}'>{{sessionForm.zhanghao}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"20px 0 0","alignItems":"center","flexDirection":"column","display":"flex","justifyContent":"center","borderRadius":"5px","borderWidth":"0","background":"none","width":"auto","lineHeight":"30px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='xuesheng'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#FFC174","fontSize":"14px"}'>姓名</div>
			<div :style='{"fontSize":"14px","color":"#FFC174","textAlign":"center","flex":1}'>{{sessionForm.xingming}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"20px 0 0","alignItems":"center","borderWidth":"0","flexDirection":"column","display":"flex","width":"auto","lineHeight":"30px","borderStyle":"solid","justifyContent":"center","height":"auto"}' v-if="userTableName=='xuesheng'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#FFC174","fontSize":"14px"}'>性别</div>
			<div :style='{"fontSize":"14px","color":"#FFC174","textAlign":"center","flex":1}'>{{sessionForm.xingbie}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#efefef","margin":"20px 0 0","alignItems":"center","borderWidth":"0","flexDirection":"column","display":"flex","width":"auto","lineHeight":"30px","borderStyle":"solid","justifyContent":"center","height":"auto"}' v-if="userTableName=='xuesheng'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"color":"#FFC174","fontSize":"14px"}'>手机</div>
			<div :style='{"fontSize":"14px","color":"#FFC174","textAlign":"center","flex":1}'>{{sessionForm.shouji}}</div>
		</div>
		
	</div>
	
    <el-tabs tab-position="left" :style='{"background":"none","flexDirection":"column","display":"flex"}' @tab-click="handleClick">
      <el-tab-pane label="个人中心">
        <el-form class="center-preview-pv" ref="sessionForm" :model="sessionForm" :rules="rules" label-width="80px">
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' v-if="userTableName=='xuesheng'" label="账号" prop="zhanghao">
            <el-input v-model="sessionForm.zhanghao" placeholder="账号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' v-if="userTableName=='xuesheng'" label="姓名" prop="xingming">
            <el-input v-model="sessionForm.xingming" placeholder="姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' v-if="userTableName=='xuesheng'" label="性别" prop="xingbie">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' v-if="userTableName=='xuesheng'" label="头像" prop="touxiang">
			<file-upload
			tip="点击上传头像"
			action="file/upload"
			:limit="1"
			:multiple="true"
			:fileUrls="sessionForm.touxiang?sessionForm.touxiang:''"
			@change="xueshengtouxiangHandleAvatarSuccess"
			></file-upload>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' v-if="userTableName=='xuesheng'" label="手机" prop="shouji">
            <el-input v-model="sessionForm.shouji" placeholder="手机" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"0","margin":"0"}'>
            <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#FFC174","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="primary" @click="onSubmit('sessionForm')">更新信息</el-button>
            <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#0B4D49","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="danger" @click="logout">退出登录</el-button>
          </el-form-item>
        </el-form>
      </el-tab-pane>
	  <el-tab-pane label="修改密码">
		<el-form class="center-preview-pv" ref="passwordForm" :model="passwordForm" :rules="passwordRules" label-width="80px">
			<el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="原密码" prop="password">
			  <el-input type="password" v-model="passwordForm.password" placeholder="原密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="新密码" prop="newpassword">
			  <el-input type="password" v-model="passwordForm.newpassword" placeholder="新密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="确认密码" prop="repassword">
			  <el-input type="password" v-model="passwordForm.repassword" placeholder="确认密码"></el-input>
			</el-form-item>
			<el-form-item :style='{"padding":"0","margin":"0"}'>
			  <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#FFC174","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="primary" @click="updatePassword">修改密码</el-button>
			</el-form-item>
		</el-form>
	  </el-tab-pane>
	  <el-tab-pane label="聊天记录" style="width: 100%;" v-if="changeHasChat()">
	  	<div class="z-box" :style='{"width":"70%","padding":"20px","margin":"0 auto"}'>
	  		<div class="section-content" v-for="item in recordList" :key="item.id" @click="chatClick(item)">
	  			<img :src="item.picture?baseUrl + item.picture:require('@/assets/avator.png')" style="width: 60px;border-radius: 50%;"
	  				alt="">
	  			<div style="margin: 0 0 0 10px;display: flex;flex-direction: column;align-items: flex-start;">
	  				<div :style='{"fontSize":"14px","color":"#000","flex":"1","fontWeight":"bold"}'
	  					class="item-style">{{item.name}}</div>
	  				<div :style='{"color":"#666","flex":"1","fontSize":"14px","lineHeight":"1.5","display":"flex","alignItems":"center"}'
	  					class="item-style">
	  					<div v-if="item.notreadnum" style="padding: 0 5px;height: 16px;border-radius: 50%;text-align: center;line-height: 16px;font-size: 12px;background: #f00;color:#fff;width: auto;margin: 0 2px 0 0">{{item.notreadnum}}</div>
	  					{{item.content.split('/').length>1&&item.content.split('/')[0]=='upload'?'[图片]':item.content}}
	  				</div>
	  			</div>
	  		</div>
			<div class="noList" v-if="!recordList.length">
				暂无聊天记录
			</div>
	  	</div>
	  	
	  </el-tab-pane>
		<el-tab-pane v-for="(item,index) in menuList" :key="index" v-if="hasBack(item.menu)" :label="item.child[0].menu" :name="item.child[0].tableName"></el-tab-pane>
      <el-tab-pane label="我的收藏"></el-tab-pane>
    </el-tabs>

	<el-dialog :visible.sync="chatVisible" @close="clearChat" :title="nowname">
		<div class="chat-content" id="chat-content">
			<div v-bind:key="item.id" v-for="item in chatList">
				<div v-if="item.uid==sessionForm.id" class="right-content">
					<el-alert v-if="item.format==1" class="text-content" :title="item.content" :closable="false"
						type="warning"></el-alert>
					<el-image v-else fit="cover" :src="item.content?baseUrl + item.content:''" style="width: 100px;height: 100px;" :preview-src-list="[item.content?baseUrl + item.content:'']"></el-image>
					<img :src="mypic?baseUrl + mypic:require('@/assets/avator.png')" alt="" style="width: 30px;border-radius: 50%;height: 30px;margin: 0 0 0 10px;" />
				</div>
				<div v-else class="left-content">
					<img :src="nowfpic?baseUrl + nowfpic:require('@/assets/avator.png')" alt="" style="width: 30px;border-radius: 50%;height: 30px;margin: 0 10px 0 0;" />
					<el-alert v-if="item.format==1" class="text-content" :title="item.content" :closable="false"
						type="success"></el-alert>
					<el-image v-else fit="cover" :src="item.content?baseUrl + item.content:''" style="width: 100px;height: 100px;" :preview-src-list="[item.content?baseUrl + item.content:'']"></el-image>
				</div>
				<div class="clear-float"></div>
			</div>
		</div>
		<div slot="footer" class="dialog-footer">
			<el-input @keydown.enter.native="addChat" v-model="chatForm.content" placeholder="请输入内容" style="width: calc(100% - 180px);float: left;">
			</el-input>
			<el-button :disabled="chatForm.content?false:true" type="primary" @click="addChat">发送</el-button>
			<el-upload style="display: inline-block;margin: 0 0 0 6px;" class="upload-demo" :action="uploadUrl" :on-success="uploadSuccess"
			    :show-file-list="false">
			    <el-button type="success">上传图片</el-button>
			</el-upload>
		</div>
	</el-dialog>
</div>
</template>

<script>
  import config from '@/config/config'
  import menu from '@/config/menu'
  import Vue from 'vue'
  export default {
    //数据集合
    data() {
      return {
        title: '个人中心',
        baseUrl: config.baseUrl,
        sessionForm: {},
		passwordForm: {},
		passwordRules: {
			password: [
				{
					required: true,
					message: "密码不能为空",
					trigger: "blur"
				}
			],
			newpassword: [
				{
					required: true,
					message: "新密码不能为空",
					trigger: "blur"
				}
			],
			repassword: [
				{
					required: true,
					message: "确认密码不能为空",
					trigger: "blur"
				}
			]
		},
        rules: {},
		menuList: [],
        disabled: false,
        uploadUrl: config.baseUrl + 'file/upload',
        imageUrl: '',
        headers: {Token: localStorage.getItem('frontToken')},
        userTableName: localStorage.getItem('UserTableName'),
        dynamicProp: {},
		recordList: [],
		chatVisible: false,
		nowfid: 0,
		nowfpic:'',
		nowname: '',
		mypic: localStorage.getItem('frontHeadportrait'),
		chatList: [],
		chatForm: {
			content: ''
		},
		chatTimer: null,
		hasChatList: [
			'qiye',
			'xuesheng',
			'jianzhixinxi',
		],
      }
    },
    created() {
		let menus = menu.list()
		for(let x in menus){
			if(menus[x].tableName == this.userTableName){
				this.menuList = menus[x].backMenu
			}
		}
		if ('xuesheng' == this.userTableName) {
			this.$set(this.sessionForm, 'zhanghao', null);
		}
		if ('xuesheng' == this.userTableName) {
			this.$set(this.sessionForm, 'mima', null);
		}
		if ('xuesheng' == this.userTableName) {
			this.$set(this.sessionForm, 'xingming', null);
		}
		if ('xuesheng' == this.userTableName) {
			this.$set(this.sessionForm, 'xingbie', null);
		}
		if ('xuesheng' == this.userTableName) {
			this.$set(this.sessionForm, 'touxiang', null);
		}
		if ('xuesheng' == this.userTableName) {
			this.$set(this.sessionForm, 'shouji', null);
		}

		if ('xuesheng' == this.userTableName&&this.rules['zhanghao']){
			this.rules['zhanghao'].push({ required: true, message: '请输入账号', trigger: 'blur' })
		}else if('xuesheng' == this.userTableName&&!this.rules['zhanghao']) {
			this.$set(this.rules, 'zhanghao', [{ required: true, message: '请输入账号', trigger: 'blur' }]);
		}
		if ('xuesheng' == this.userTableName&&this.rules['mima']){
			this.rules['mima'].push({ required: true, message: '请输入密码', trigger: 'blur' })
		}else if('xuesheng' == this.userTableName&&!this.rules['mima']) {
			this.$set(this.rules, 'mima', [{ required: true, message: '请输入密码', trigger: 'blur' }]);
		}
		if ('xuesheng' == this.userTableName&&this.rules['xingming']){
			this.rules['xingming'].push({ required: true, message: '请输入姓名', trigger: 'blur' })
		}else if('xuesheng' == this.userTableName&&!this.rules['xingming']) {
			this.$set(this.rules, 'xingming', [{ required: true, message: '请输入姓名', trigger: 'blur' }]);
		}
		if ('xuesheng' == this.userTableName) {
			this.$set(this.rules, 'shouji', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
		}
		if ('xuesheng' == this.userTableName&&this.rules['shouji']){
			this.rules['shouji'].push({ required: true, message: '请输入手机', trigger: 'blur' })
		}else if('xuesheng' == this.userTableName&&!this.rules['shouji']) {
			this.$set(this.rules, 'shouji', [{ required: true, message: '请输入手机', trigger: 'blur' }]);
		}

      this.init();
      this.sessionForm = JSON.parse(localStorage.getItem('sessionForm'))
    },
    //方法集合
    methods: {
      init() {
        if ('xuesheng' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
      },
	  setSession(){
		  localStorage.setItem('sessionForm',JSON.stringify(this.sessionForm))
	  },
      onSubmit(formName) {
		if(`xuesheng` == this.userTableName && this.sessionForm.touxiang!=null){
			this.sessionForm.touxiang = this.sessionForm.touxiang.replace(new RegExp(this.$config.baseUrl,"g"),"");
		}
        this.$refs[formName].validate((valid) => {
			if (valid) {
				this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
					if (res.data.code == 0) {
						this.setSession()
						this.$message({
							message: '更新成功',
							type: 'success',
							duration: 1500
						});
					}
				});
			} else {
				return false;
			}
        });
      },
      xueshengtouxiangHandleAvatarSuccess(fileUrls) {
        this.sessionForm.touxiang = fileUrls;
      },
      handleClick(tab, event) {
        switch(event.target.outerText) {
          case '个人中心':
            tab.$router.push('/index/center');
            break;
          case '修改密码':
            this.passwordForm = {
				password: '',
				newpassword: '',
				repassword: '',
			}
			this.$forceUpdate()
            break;
		  case '聊天记录':
			this.getRecordList()
			break;
          case '我的收藏':
            localStorage.setItem('storeupType', 1);
            tab.$router.push('/index/storeup');
            break;
		  default:
		  	tab.$router.push(`/index/${tab.name}?centerType=1`);
        }

        this.title = event.target.outerText;
      },
		changeHasChat(){
			let table = localStorage.getItem('frontSessionTable')
			console.log(table)
			for(let x in this.hasChatList){
				if(this.hasChatList[x]==table){
					return true
				}
			}
			return false
		},
		getRecordList() {
			this.$http.get('friend/page2', {
				params: {
					uid: Number(localStorage.getItem('frontUserid')),
					type: 2
				}
			}).then(res => {
				if (res.data && res.data.code == 0) {
					this.recordList = res.data.data.list
				}
			})
		},
		chatClick(row) {
			this.nowfid = row.fid
			this.nowfpic = row.picture
			this.nowname = row.name
			this.getChatList()
			this.chatVisible = true
		},
		getChatList() {
			this.$http.get('chatmessage/mlist', {
				params: {
					page: 1,
					limit: 1000,
					uid: Number(localStorage.getItem('frontUserid')),
					fid: this.nowfid
				}
			}).then(res => {
				if (res.data && res.data.code == 0) {
					this.chatList = res.data.data.list
					let div = document.getElementsByClassName('chat-content')[0]
					setTimeout(() => {
						if (div)
							div.scrollTop = div.scrollHeight
					}, 0)
					this.chatTimer = setTimeout(() => {
						this.getChatList()
					}, 5000)
				}
			})
		},
		clearChat(){
			clearTimeout(this.chatTimer)
			this.chatList = []
			this.getRecordList()
		},
		uploadSuccess(res) {
			if (res.code == 0) {
				clearTimeout(this.chatTimer)
				this.$http.post('chatmessage/add', {
					uid: Number(localStorage.getItem('frontUserid')),
					fid: this.nowfid,
					content: 'upload/' + res.file,
					format: 2
				}).then(res2 => {
					this.chatForm = {
						content: ''
					}
					this.getChatList()
				})
			}
		},
		addChat() {
			clearTimeout(this.chatTimer)
			this.$http.post('chatmessage/add', {
				uid: Number(localStorage.getItem('frontUserid')),
				fid: this.nowfid,
				content: this.chatForm.content,
				format: 1
			}).then(res2 => {
				this.chatForm = {
					content: ''
				}
				this.getChatList()
			})
		},
	  async updatePassword(){
			this.$refs["passwordForm"].validate(async valid => {
				if (valid) {
					var password = "";
					if (this.sessionForm.mima) {
						password = this.sessionForm.mima;
					} else if (this.sessionForm.password) {
						password = this.sessionForm.password;
					}
					var nowpassword = ''
					await this.$http.get('encrypt/md5?text=' + this.passwordForm.password,).then(res=>{
						if(res.data&&res.data.code==0){
							nowpassword = res.data.data
						}
					})
					if(nowpassword!=password){
						this.$message.error("原密码错误");
						return;
					}
					if (this.passwordForm.newpassword != this.passwordForm.repassword) {
						this.$message.error("两次密码输入不一致");
						return;
					}
					if (this.passwordForm.newpassword == this.passwordForm.password) {
						this.$message.error("新密码与原密码相同！");
						return;
					}
					if (this.userTableName == 'xuesheng') {
					}
					this.sessionForm.password = this.passwordForm.newpassword;
					this.sessionForm.mima = this.passwordForm.newpassword;
					this.$http.post(`${this.userTableName}/update`,this.sessionForm).then(({data})=>{
						if (data && data.code === 0) {
							this.$message({
								message: "修改密码成功,下次登录系统生效",
								type: "success",
								duration: 1500,
								onClose: () => {
								}
							});
							this.setSession()
						} else {
							this.$message.error(data.msg);
						}
					});
				}
			})
	  },
      logout() {
        localStorage.clear();
        Vue.http.headers.common['Token'] = "";
        this.$router.push('/index/home');
        this.activeIndex = '0'
        localStorage.setItem('keyPath', this.activeIndex)
        this.$forceUpdate()
        this.$message({
            message: '登出成功',
            type: 'success',
            duration: 1500,
        });
      },
	  hasBack(name){
		  switch(name){
			case '我的收藏管理':
				return false
				break;
			default:
				return true
		  }
	  }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .center-preview {
  
    .el-tabs {
      & /deep/ .el-tabs__header {
		.el-tabs__nav{
			overflow: auto;
		}
		::-webkit-scrollbar {
		  -webkit-appearance: none;
		  width: 6px;
		  height: 6px;
		}
		::-webkit-scrollbar-track {
		  background: rgba(0, 0, 0, 0.1);
		  border-radius: 0;
		}
		::-webkit-scrollbar-thumb {
		  cursor: pointer;
		  border-radius: 5px;
		  background: rgba(0, 0, 0, 0.15);
		  transition: color 0.2s ease;
		}
		::-webkit-scrollbar-thumb:hover {
		  background: rgba(0, 0, 0, 0.3);
		}
        .el-tabs__nav-wrap {
          margin: 0;
  
          &::after {
            content: none;
          }
        }
  
        .el-tabs__active-bar {
          display: none !important;
        }
      }
  
      .center-preview-pv {
        .el-date-editor.el-input {
          width: auto;
        }
  
        .balance {
          .el-input {
            width: auto;
          }
        }
      }
    }
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header {
	padding: 0 0 60px;
	margin: 0;
	background: #8E4033;
	display: flex;
	width: 100%;
	border-color: #eee;
	border-width: 0;
	justify-content: center;
	position: relative;
	float: left;
	border-style: solid;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item {
  	padding: 0 30px;
  	margin: 0 10px;
  	color: #fff;
  	background: none;
  	font-weight: 500;
  	display: inline-block;
  	font-size: 15px;
  	line-height: 120px;
  	position: relative;
  	text-align: center;
  	height: 120px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
  	padding: 0 30px;
  	margin: 0 10px;
  	color: #fff;
  	background: #FFC174;
  	font-weight: 500;
  	display: inline-block;
  	font-size: 15px;
  	line-height: 120px;
  	position: relative;
  	text-align: center;
  	height: 120px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
  	padding: 0 30px;
  	margin: 0 10px;
  	color: #fff;
  	background: #FFC174;
  	font-weight: 500;
  	display: inline-block;
  	font-size: 15px;
  	line-height: 120px;
  	position: relative;
  	text-align: center;
  	height: 120px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__content {
  	border-radius: 30px;
  	padding: 20px;
  	box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.3);
  	margin: -60px auto 0;
  	background: #fff;
  	width: 80%;
  }
  .center-preview .el-tabs /deep/ .el-tabs__content .el-tab-pane {
  	width: 100%;
  }
  
  .center-preview-pv .el-form-item /deep/ .el-form-item__label {
  	padding: 0 10px 0 0;
  	color: #000;
  	font-weight: 500;
  	width: 80px;
  	font-size: 14px;
  	line-height: 40px;
  	text-align: right;
  }
  
  .center-preview-pv .el-form-item .el-form-item__content {
    margin-left: 80px;
  }
  
  .center-preview-pv .el-input /deep/ .el-input__inner {
  	border: 1px solid #E2E3E5;
  	border-radius: 0;
  	padding: 0 12px;
  	box-shadow: none;
  	outline: none;
  	color: #000;
  	width: 500px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-select /deep/ .el-input__inner {
  	border: 1px solid #E2E3E5;
  	border-radius: 0;
  	padding: 0 12px;
  	box-shadow: none;
  	outline: none;
  	color: #000;
  	width: 500px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv .el-date-editor /deep/ .el-input__inner {
  	border: 1px solid #E2E3E5;
  	border-radius: 0;
  	padding: 0 10px 0 30px;
  	box-shadow: none;
  	outline: none;
  	color: #000;
  	width: 500px;
  	font-size: 14px;
  	height: 40px;
  }
  
  .center-preview-pv /deep/ .avatar-uploader-icon {
  	border: 1px solid #E2E3E5;
  	cursor: pointer;
  	border-radius: 6px;
  	color: #000;
  	width: 100px;
  	font-size: 32px;
  	line-height: 100px;
  	text-align: center;
  	height: 100px;
  }
  
  .center-preview-pv .el-form-item.balance /deep/ .el-input__inner {
  	border: 1px solid #E2E3E5;
  	border-radius: 4px;
  	padding: 0 12px;
  	box-shadow: none;
  	outline: none;
  	color: #000;
  	display: inline-block;
  	width: 390px;
  	font-size: 14px;
  	height: 40px;
  }
	.section-content {
		cursor: pointer;
		padding: 20px;
		box-shadow: 0px 4px 10px 0px rgba(0, 0, 0, 0.3);
		margin: 0 0 20px;
		color: #333;
		background: #fff;
		display: flex;
		width: 100%;
		border-color: #efefef;
		border-width: 0;
		align-items: center;
		border-style: solid;
		position: relative;
	}

	.section-content:hover {
		color: #fff;
		background: #DF847F10;
	}
	.chat-content {
		padding-bottom: 20px;
		width: 100%;
		margin-bottom: 10px;
		max-height: 300px;
		height: 300px;
		overflow-y: scroll;
		border: 1px solid #eeeeee;
		background: #fff;
	
		.left-content {
			float: left;
			margin-bottom: 10px;
			padding: 10px;
			max-width: 80%;
			display: flex;
			align-items: center;
		}
	
		.right-content {
			float: right;
			margin-bottom: 10px;
			padding: 10px;
			max-width: 80%;
			display: flex;
			align-items: center;
		}
	}
	
	.clear-float {
		clear: both;
	}
	.noList {
		color: #9e9e9e;
		width: 100%;
		text-align: center;
		padding: 60px 0;
	}
</style>
