<template>
<div>
	<div :style='{"border":"5px solid #FFC174","width":"80%","padding":"25px 30px","margin":"10px auto","borderRadius":"30px","background":"linear-gradient(180deg, #10615F 0%, #0A4742 100%)"}' class="breadcrumb-preview">
		<el-breadcrumb :separator="'Ξ'" :style='{"fontSize":"14px","lineHeight":"1"}'>
			<el-breadcrumb-item class="item1" to="/"><a>首页</a></el-breadcrumb-item>
			<el-breadcrumb-item class="item2" v-for="(item, index) in breadcrumbItem" :key="index" to="/index/jianzhixinxi"><a>{{item.name}}</a></el-breadcrumb-item>
			<el-breadcrumb-item class="item3"><a href="javascript:void(0);">详情</a></el-breadcrumb-item>
		</el-breadcrumb>
	</div>
	<div :style='{"border":"5px solid #FFC174","width":"80%","padding":"25px 30px","margin":"10px auto","borderRadius":"30px","background":"linear-gradient(180deg, #10615F 0%, #0A4742 100%)"}'>
		<el-button size="mini" @click="backClick">返回</el-button>
	</div>
	<div class="detail-preview" :style='{"padding":"0 10%","margin":"10px auto","alignItems":"flex-start","flexWrap":"wrap","display":"flex","width":"100%","position":"relative"}'>
		<div class="attr" :style='{"border":"5px solid #FFC174","padding":"10px","borderRadius":"30px","background":"#fff","display":"flex","width":"45%","position":"relative","order":"2"}'>

			<div class="info" :style='{"padding":"0","margin":"0","background":"#fff","flex":"1"}'>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","alignItems":"flex-start","background":"#fff","justifyContent":"space-between","display":"flex"}'>
					<div :style='{"color":"#000","fontSize":"16px","fontWeight":"bold"}'>
                    {{detail.gangweimingcheng}}
                    </div>
					<div @click="storeup(1)" v-show="!isStoreup" :style='{"padding":"0 10px","margin":"-20px 0 0","lineHeight":"60px","borderRadius":"0 0 20px 20px","background":"#0C4E49","height":"60px"}'><i v-if="true" :style='{"color":"#fff","fontSize":"14px"}' class="el-icon-star-off"></i><span :style='{"color":"#fff","fontSize":"14px"}'>点我收藏({{detail.storeupnum}})</span></div>
					<div @click="storeup(-1)" v-show="isStoreup" :style='{"padding":"0 10px","margin":"-20px 0 0","lineHeight":"60px","borderRadius":"0 0 20px 20px","background":"#0C4E49","height":"60px"}'><i v-if="true" :style='{"color":"#fff","fontSize":"14px"}' class="el-icon-star-on"></i><span :style='{"color":"#fff","fontSize":"14px"}'>取消收藏({{detail.storeupnum}})</span></div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>兼职类型</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.jianzhileixing}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>岗位要求</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.gangweiyaoqiu}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>岗位性质</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.gangweixingzhi}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>薪资待遇</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.xinzidaiyu}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>工作时间</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.gongzuoshijian}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>上班地点</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.shangbandidian}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>企业名称</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.qiyemingcheng}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>联系人</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.lianxiren}}</div>
				</div>
				<div class="item" :style='{"padding":"10px","margin":"0 0 10px 0","background":"#fff","justifyContent":"spaceBetween","display":"flex"}'>
					<div class="lable" :style='{"width":"102px","padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","textAlign":"right"}'>联系方式</div>
					<div  :style='{"padding":"0 10px","fontSize":"14px","lineHeight":"24px","color":"#818181","flex":"1","height":"auto"}'>{{detail.lianxifangshi}}</div>
				</div>
				<div class="btn" :style='{"padding":"10px 0","flexWrap":"wrap","display":"flex"}'>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#000","borderRadius":"4px","background":"#FFC174","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="btnAuth('jianzhixinxi','修改')" @click="editClick">修改</el-button>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#000","borderRadius":"4px","background":"#FFC174","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="btnAuth('jianzhixinxi','删除')" @click="delClick">删除</el-button>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#000","borderRadius":"4px","background":"#FFC174","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="btnAuth('jianzhixinxi','私聊')&&detail.id!=mid" @click="chatClick">联系TA</el-button>
					<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#000","borderRadius":"4px","background":"#FFC174","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' v-if="btnAuth('jianzhixinxi','兼职申请')" @click="onAcross('shenqingxinxi','','','[1]','您已提交申请！')" type="warning">兼职申请</el-button>
				</div>
			</div>
		</div>
		
			<div class="swiper3" v-if="detailBanner.length" :style='{"width":"calc(55% - 20px)","padding":"0 0 60px","margin":"0 20px 0 0","background":"#fff","height":"auto","order":"1"}'>
			  <div class="big" :style='{"border":"5px solid #FFC174","margin":"0 0 10px","overflow":"hidden","borderRadius":"30px","background":"#fff","width":"100%","position":"relative","height":"400px"}'>
				<img id="big" :style='{"width":"100%","boxShadow":"none","objectFit":"cover","display":"block","height":"100%","zIndex":"1"}' :src="swiperBigUrl" class="image">
			  </div>
			  <div class="samll" :style='{"width":"100%","padding":"0 5px","background":"#fff","display":"flex","height":"100px"}'>
			    <div :style='{"border":"5px solid #FFC174","margin":"0 5px","overflow":"hidden","borderRadius":"30px","background":"#fff","width":"25%","position":"relative","height":"100%"}' v-for="item in detailBanner" :key="item.id">
				  <img :style='{"width":"100%","boxShadow":"0 1px 8px rgba(0,0,0,.2)","objectFit":"cover","display":"block","height":"100%","zIndex":"1"}' v-if="item.substr(0,4)=='http'" :src="item" @click="swiperClick3(item)" class="image">
				  <img :style='{"width":"100%","boxShadow":"0 1px 8px rgba(0,0,0,.2)","objectFit":"cover","display":"block","height":"100%","zIndex":"1"}' v-else :src="baseUrl + item" @click="swiperClick3(baseUrl + item)" class="image">
			    </div>
			  </div>
			</div>


		

		
		<el-tabs class="detail" :style='{"border":"0px solid #DCDFE6","width":"100%","boxShadow":"none","background":"#FFF","order":"4"}' v-model="activeName" type="border-card">
			<el-tab-pane label="岗位介绍" name="first">
				<div v-html="detail.gangweijieshao"></div>
			</el-tab-pane>
		</el-tabs>
	</div>
	<div class="share_view" :style='{"boxShadow":"0 1px 6px rgba(0,0,0,.3)","position":"fixed","right":"0","bottom":"20%","background":"#fff","zIndex":"11"}'>
	</div>
	<el-dialog :visible.sync="chatVisible" @close="clearChat" :title="fname">
		<div class="chat-content" id="chat-content">
			<div v-bind:key="item.id" v-for="item in chatList">
				<div v-if="item.uid==mid" class="right-content">
					<el-alert v-if="item.format==1" class="text-content" :title="item.content" :closable="false"
						type="warning"></el-alert>
					<el-image v-else fit="cover" :src="item.content?baseUrl + item.content:''" style="width: 100px;height: 100px;" :preview-src-list="[item.content?baseUrl + item.content:'']"></el-image>
					<img :src="mpic?baseUrl + mpic:require('@/assets/avator.png')" alt="" style="width: 30px;border-radius: 50%;height: 30px;margin: 0 0 0 10px;" />
				</div>
				<div v-else class="left-content">
					<img :src="fpic?baseUrl + fpic:require('@/assets/avator.png')" alt="" style="width: 30px;border-radius: 50%;height: 30px;margin: 0 10px 0 0;" />
					<el-alert v-if="item.format==1" class="text-content" :title="item.content" :closable="false"
						type="success"></el-alert>
					<el-image v-else fit="cover" :src="item.content?baseUrl + item.content:''" style="width: 100px;height: 100px;" :preview-src-list="[item.content?baseUrl + item.content:'']"></el-image>
					
				</div>
				<div class="clear-float"></div>
			</div>
		</div>
		<div slot="footer" class="dialog-footer">
			<el-input size="small" @keydown.enter.native="addChat" v-model="chatForm.content" placeholder="请输入内容" style="width: calc(100% - 240px);float: left;">
			</el-input>
			<el-button size="small" :disabled="chatForm.content?false:true" type="primary" @click="addChat">发送</el-button>
			<el-upload style="display: inline-block;margin: 0 6px;" class="upload-demo" :action="uploadUrl" :on-success="uploadSuccess"
			    :show-file-list="false">
			    <el-button size="small" type="success">上传图片</el-button>
			</el-upload>
			<el-button v-if="showSaveType" size="small" type="primary" @click="saveGood">详情图发送</el-button>
		</div>
	</el-dialog>
</div>
</template>

<script>
  import CountDown from '@/components/CountDown';
  import axios from 'axios'
  import Swiper from "swiper";
  
  export default {
    //数据集合
    data() {
      return {
        tablename: 'jianzhixinxi',
        baseUrl: '',
        breadcrumbItem: [
          {
            name: '兼职信息'
          }
        ],
        title: '',
        detailBanner: [],
		userid: localStorage.getItem('frontUserid'),
		id: 0,
        detail: {},
        activeName: 'first',
        total: 1,
        pageSize: 5,
        totalPage: 1,
        storeupParams: {
          name: '',
          picture: '',
          refid: 0,
          tablename: 'jianzhixinxi',
          userid: localStorage.getItem('frontUserid')
        },
        isStoreup: false,
        storeupInfo: {},
        buynumber: 1,
		centerType: false,
		shareUrl: location.href,
		swiperBigUrl: null,
		mid: localStorage.getItem('frontUserid'),
		chatVisible: false,
		chatList: [],
		chatForm: {
			content: ''
		},
		chatTimer: null,
		uploadUrl: this.$config.baseUrl + 'file/upload',
		fpic: '',
		fname: '',
		fid: '',
		mpic: localStorage.getItem('frontHeadportrait'),
		showSaveType: true,
      }
    },
    created() {
		if(this.$route.query.centerType) {
			this.centerType = true
		}
		
        this.init();
    },
	mounted() {
	},
    //方法集合
    methods: {
		swiperClick3(src) {
			this.swiperBigUrl = src
		},
        init() {
		  this.id = this.$route.query.id
          this.baseUrl = this.$config.baseUrl;
          this.$http.get(this.tablename + '/detail/'  + this.id, {}).then(res => {
            if (res.data.code == 0) {
              this.detail = res.data.data;
				this.title = this.detail.gangweimingcheng;
				this.detailBanner = this.detail.bangonghuanjing ? this.detail.bangonghuanjing.split(",") : [];
				if(res.data.data.touxiang){
					this.fpic = res.data.data.touxiang.split(',')[0]
				}else if(res.data.data.headportrait){
					this.fpic = res.data.data.headportrait.split(',')[0]
				}
				this.$forceUpdate();

				if(localStorage.getItem('frontToken')){
					this.getStoreupStatus();
				}

            }
			if (this.detailBanner.length) {
				if (this.detailBanner[0].substr(0,4)=='http') {
					this.swiperBigUrl = this.detailBanner[0]
				} else {
					this.swiperBigUrl = this.baseUrl + this.detailBanner[0]
				}
			}
          });
        },
      async onAcross(acrossTable,crossOptAudit,crossOptPay,statusColumnName,tips,statusColumnValue,type=1){
        localStorage.setItem('crossTable',`jianzhixinxi`);
        localStorage.setItem('crossObj', JSON.stringify(this.detail));
        localStorage.setItem('statusColumnName',statusColumnName);
        localStorage.setItem('statusColumnValue',statusColumnValue);
        localStorage.setItem('tips',tips);
        if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
            var obj = JSON.parse(localStorage.getItem('crossObj'));
            for (var o in obj){
                if(o==statusColumnName && obj[o]==statusColumnValue){
                    this.$message({
                        type: 'error',
                        message: tips,
                        duration: 1500
                    });
                    return
                }
            }
        }
        this.$router.push({path: '/index/' + acrossTable + 'Add', query: {type: 'cross'}});
      },
      storeup(type) {
        if (type == 1 && !this.isStoreup) {
          this.storeupParams.name = this.title;
          this.storeupParams.picture = this.detailBanner[0];
          this.storeupParams.inteltype = this.detail.jianzhileixing;
          this.storeupParams.refid = this.detail.id;
          this.storeupParams.type = type;
          this.$http.post('storeup/add', this.storeupParams).then(res => {
            if (res.data.code == 0) {
              this.isStoreup = true;
			  this.detail.storeupnum++
			  this.$http.post('jianzhixinxi/update', this.detail).then(res => {});
              this.$message({
                type: 'success',
                message: '收藏成功!',
                duration: 1500,
              });
            }
          });
        }
        if (type == -1 && this.isStoreup) {
          this.$http.get('storeup/list', {params: {page: 1, limit: 1, type: 1, refid: this.detail.id, tablename: 'jianzhixinxi', userid: localStorage.getItem('frontUserid')}}).then(res => {
            if (res.data.code == 0 && res.data.data.list.length > 0) {
              this.isStoreup = true;
              this.storeupInfo = res.data.data.list[0];
              let delIds = new Array();
              delIds.push(this.storeupInfo.id);
              this.$http.post('storeup/delete', delIds).then(res => {
                if (res.data.code == 0) {
                  this.isStoreup = false;
				  this.detail.storeupnum--
				  this.$http.post('jianzhixinxi/update', this.detail).then(res => {});
                  this.$message({
                    type: 'success',
                    message: '取消成功!',
                    duration: 1500,
                  });
                }
              });
            }
          });
        }
      },
      getStoreupStatus(){
        if(localStorage.getItem("frontToken")) {
            this.$http.get('storeup/list', {params: {page: 1, limit: 1, type: 1, refid: this.detail.id, tablename: 'jianzhixinxi', userid: localStorage.getItem('frontUserid')}}).then(res => {
              if (res.data.code == 0 && res.data.data.list.length > 0) {
                this.isStoreup = true;
                this.storeupInfo = res.data.data.list[0];
              }
            });
        }
      },
      curChange(page) {
        this.getDiscussList(page);
      },
      prevClick(page) {
        this.getDiscussList(page);
      },
      nextClick(page) {
        this.getDiscussList(page);
      },
		// 返回按钮
		backClick(){
			let params = {}
			if(this.centerType){
				params.centerType = 1
			}
			this.$router.push({path: '/index/jianzhixinxi', query: params});
		},
		// 下载
		download(file){
			if(!file) {
				this.$message({
				  type: 'error',
				  message: '文件不存在',
				  duration: 1500,
				});
				return;
			}
		  let arr = file.replace(new RegExp('upload/', "g"), "")
		  axios.get(this.baseUrl + '/file/download?fileName=' + arr, {
		  	headers: {
		  		token: localStorage.getItem("frontToken")
		  	},
		  	responseType: "blob"
		  }).then(({
		  	data
		  }) => {
		  	const binaryData = [];
		  	binaryData.push(data);
		  	const objectUrl = window.URL.createObjectURL(new Blob(binaryData, {
		  		type: 'application/pdf;chartset=UTF-8'
		  	}))
		  	const a = document.createElement('a')
		  	a.href = objectUrl
		  	a.download = arr
		  	// a.click()
		  	// 下面这个写法兼容火狐
		  	a.dispatchEvent(new MouseEvent('click', {
		  		bubbles: true,
		  		cancelable: true,
		  		view: window
		  	}))
		  	window.URL.revokeObjectURL(data)
		  },err=>{
			  axios.get((location.href.split(this.$config.name).length>1 ? location.href.split(this.$config.name)[0] :'') + this.$config.name + '/file/download?fileName=' + arr, {
			  	headers: {
			  		token: localStorage.getItem("frontToken")
			  	},
			  	responseType: "blob"
			  }).then(({
			  	data
			  }) => {
			  	const binaryData = [];
			  	binaryData.push(data);
			  	const objectUrl = window.URL.createObjectURL(new Blob(binaryData, {
			  		type: 'application/pdf;chartset=UTF-8'
			  	}))
			  	const a = document.createElement('a')
			  	a.href = objectUrl
			  	a.download = arr
			  	// a.click()
			  	// 下面这个写法兼容火狐
			  	a.dispatchEvent(new MouseEvent('click', {
			  		bubbles: true,
			  		cancelable: true,
			  		view: window
			  	}))
			  	window.URL.revokeObjectURL(data)
			  })
		  })
      },


		// 权限判断
		btnAuth(tableName,key){
			if(this.centerType){
				return this.isBackAuth(tableName,key)
			}else{
				return this.isAuth(tableName,key)
			}
		},
		// 修改
		editClick(){
			this.$router.push(`/index/jianzhixinxiAdd?type=edit&&id=${this.detail.id}`);
		},
		// 删除
		async delClick(){
			await this.$confirm('是否删除此兼职信息？')
			  .then(_ => {
			    this.$http.post('jianzhixinxi/delete', [this.detail.id]).then(async res => {
					if (res.data.code == 0) {
						this.$http.get('storeup/list',{params:{
							page: 1,
							limit: 100,
							refid: this.detail.id,
							tablename: 'jianzhixinxi',
						}}).then(async obj=>{
							if(obj.data&&obj.data.code==0){
								let arr = []
								for(let x in obj.data.data.list){
									arr.push(obj.data.data.list[x].id)
								}
								if(arr.length){
									await this.$http.post('storeup/delete',arr).then(()=>{})
								}
								this.$message({
									type: 'success',
									message: '删除成功!',
									duration: 1500,
									onClose: () => {
										history.back()
									}
								});
							}
						})
					}
			    });
			  }).catch(_ => {});
		},
		
		chatClick() {
			let user = JSON.parse(localStorage.getItem('sessionForm'))
			if(this.detail.qiyemingcheng == user.qiyemingcheng){
				this.$message.error('不能给自己发信息')
				return false
			}
			this.$http.get('qiye/query', {
				params: {
					qiyemingcheng: this.detail.qiyemingcheng
				}
			}).then(res => {
				if (res.data && res.data.code == 0) {
					this.fid = res.data.data.id
					this.fname = res.data.data.qiyemingcheng
					if (res.data.data.touxiang) {
						this.fpic = res.data.data.touxiang.split(',')[0]
					} else if (res.data.data.headportrait) {
						this.fpic = res.data.data.headportrait.split(',')[0]
					}
					this.getChatList()
					this.chatVisible = true
				}
			})
		},
		saveGood(){
			this.showSaveType = false
			clearTimeout(this.chatTimer)
			this.$http.get('friend/page', {
				params: {
					uid: Number(localStorage.getItem('frontUserid')),
					fid: this.fid,
				}
			}).then(obj => {
				if (obj.data && obj.data.code == 0) {
					if (!obj.data.data.list.length) {
						this.$http.post('friend/add', {
							uid: Number(localStorage.getItem('frontUserid')),
							fid: this.fid,
							name: this.fname,
							picture: this.fpic,
							type: 2,
							tablename:  'qiye' ,
						}).then(res => {
							this.$http.post('friend/add', {
								uid: this.fid,
								fid: Number(localStorage.getItem('frontUserid')),
								type: 2,
								tablename: localStorage.getItem('frontSessionTable'),
								name: localStorage.getItem('username'),
								picture: this.mpic,
							}).then(res1 => {
			
							})
						})
					}
					this.$http.post('chatmessage/add', {
						uid: Number(localStorage.getItem('frontUserid')),
						fid: this.fid,
						content: this.detailBanner[0],
						format: 2
					}).then(res2 => {
						this.chatForm = {
							content: ''
						}
						this.getChatList()
					})
				}
			})
		},
		getChatList() {
			this.$http.get('chatmessage/mlist', {
				params: {
					page: 1,
					limit: 1000,
					uid: Number(localStorage.getItem('frontUserid')),
					fid: this.fid
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
		},
		uploadSuccess(res) {
		    if (res.code == 0) {
				clearTimeout(this.chatTimer)
				this.$http.get('friend/page', {
					params: {
						uid: Number(localStorage.getItem('frontUserid')),
						fid: this.fid,
					}
				}).then(obj => {
					if (obj.data && obj.data.code == 0) {
						if (!obj.data.data.list.length) {
							this.$http.post('friend/add', {
								uid: Number(localStorage.getItem('frontUserid')),
								fid: this.fid,
								name: this.fname,
								picture: this.fpic,
								type: 2,
								tablename:  'qiye' ,
							}).then(res => {
								this.$http.post('friend/add', {
									uid: this.fid,
									fid: Number(localStorage.getItem('frontUserid')),
									type: 2,
									tablename: localStorage.getItem('frontSessionTable'),
									name: localStorage.getItem('username'),
									picture: this.mpic,
								}).then(res1 => {
				
								})
							})
						}
						this.$http.post('chatmessage/add', {
							uid: Number(localStorage.getItem('frontUserid')),
							fid: this.fid,
							content: 'upload/' + res.file,
							format: 2
						}).then(res2 => {
							this.chatForm = {
								content: ''
							}
							this.getChatList()
						})
					}
				})
		    }
		},
		addChat() {
			clearTimeout(this.chatTimer)
			this.$http.get('friend/page', {
				params: {
					uid: Number(localStorage.getItem('frontUserid')),
					fid: this.fid,
				}
			}).then(obj => {
				if (obj.data && obj.data.code == 0) {
					if (!obj.data.data.list.length) {
						this.$http.post('friend/add', {
							uid: Number(localStorage.getItem('frontUserid')),
							fid: this.fid,
							name: this.fname,
							picture: this.fpic,
							type: 2,
							tablename:  'qiye' ,
						}).then(res => {
							this.$http.post('friend/add', {
								uid: this.fid,
								fid: Number(localStorage.getItem('frontUserid')),
								type: 2,
								tablename: localStorage.getItem('frontSessionTable'),
								name: localStorage.getItem('username'),
								picture: this.mpic,
							}).then(res1 => {
		
							})
						})
					}
					this.$http.post('chatmessage/add', {
						uid: Number(localStorage.getItem('frontUserid')),
						fid: this.fid,
						content: this.chatForm.content,
						format: 1
					}).then(res2 => {
						this.chatForm = {
							content: ''
						}
						this.getChatList()
					})
				}
			})
		},
    },
    components: {
      CountDown
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.editor /deep/ .avatar-uploader {
		height: 0;
		line-height: 0;
	}
	
	.detail-preview {
	
	  .attr {
	    .el-carousel /deep/ .el-carousel__indicator button {
	      width: 0;
	      height: 0;
	      display: none;
	    }
	
	    .el-input-number__decrease:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled), .el-input-number__increase:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled) {
	      border-color: none;
	    }
	  }
	
	  .detail {
	    & /deep/ .el-tabs__header .el-tabs__nav-wrap {
	      margin-bottom: 0;
	    }
	
	    & .add .el-textarea {
	      width: auto;
	    }
	  }
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left:hover {
		background: red;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right:hover {
		background: red;
	}

	.attr .el-carousel /deep/ .el-carousel__indicators {
		padding: 0;
		margin: 0;
		z-index: 2;
		position: absolute;
		list-style: none;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.4;
		transition: 0.3s;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li:hover {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 24px;
		opacity: 0.7;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li.is-active {
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 24px;
		opacity: 1;
		height: 12px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		border-radius: 4px 0 0 4px;
		top: 1px;
		left: 1px;
		background: #000;
		width: 40px;
		justify-content: center;
		border-width: 0 1px 0 0;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 38px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease i {
		color: #fff;
		font-size: 14px;
	}

	.attr .el-input-number /deep/ .el-input-number__increase {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		right: 1px;
		border-radius: 0 4px 4px 0;
		top: 1px;
		background: #000;
		width: 40px;
		justify-content: center;
		border-width: 0 0 0 1px;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 38px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__increase i {
		color: #fff;
		font-size: 14px;
	}
	
	.attr .el-input-number /deep/ .el-input .el-input__inner {
		border: 1px solid #000;
		border-radius: 4px;
		padding: 0 40px;
		outline: none;
		color: #666;
		background: #FFF;
		display: inline-block;
		width: 100%;
		font-size: 14px;
		line-height: 40px;
		text-align: center;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header {
		border-radius: 30px;
		margin: 0;
		overflow: hidden;
		background: #0C4E49;
		border-color: #FFC174;
		border-width: 5px;
		border-style: solid;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item {
		border: 0;
		padding: 0 5px;
		margin: 0 40px;
		color: #fff;
		background: transparent;
		font-weight: 500;
		display: inline-block;
		font-size: 14px;
		line-height: 40px;
		position: relative;
		list-style: none;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
		border: 0;
		padding: 0 5px;
		margin: 0 40px;
		color: #fff;
		background: #FFC174;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
		border: 0;
		padding: 0 5px;
		margin: 0 40px;
		color: #fff;
		background: #FFC174;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__content {
		padding: 15px;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-form-item__label {
		padding: 0 10px 0 0;
		color: #666;
		display: none;
		width: 80px;
		font-size: 14px;
		line-height: 40px;
		text-align: right;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-textarea__inner {
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__separator {
		margin: 0 15px;
		color: #FFC174;
		font-weight: 500;
	}
	
	.breadcrumb-preview .el-breadcrumb .item1 /deep/ .el-breadcrumb__inner a {
		color: #FFC174;
		display: inline-block;
	}
	
	.breadcrumb-preview .el-breadcrumb .item2 /deep/ .el-breadcrumb__inner a {
		color: #FFC174;
		display: inline-block;
	}
		
	.breadcrumb-preview .el-breadcrumb .item3 /deep/ .el-breadcrumb__inner a {
		color: #FFC174;
		display: inline-block;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__total {
		margin: 0 10px 0 0;
		color: #666;
		font-weight: 400;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-prev {
		border: none;
		border-radius: 2px;
		padding: 0 10px;
		margin: 0 5px;
		color: #fff;
		background: #0D5451;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-next {
		border: none;
		border-radius: 2px;
		padding: 0 10px;
		margin: 0 5px;
		color: #fff;
		background: #FFC174;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-prev:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0 10px;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .btn-next:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0 10px;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pager {
		padding: 0;
		margin: 0;
		display: inline-block;
		vertical-align: top;
	}
	
	#pagination.el-pagination /deep/ .el-pager .number {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #000;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #CBCBCB;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pager .number:hover {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #fff;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #FFC174;
		text-align: center;
		min-width: 30px;
		height: 28px;
}

#pagination.el-pagination /deep/ .el-pager .number.active {
		cursor: default;
		padding: 0 4px;
		margin: 0 5px;
		color: #FFF;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #FFC174;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes {
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input {
		margin: 0 5px;
		width: 100px;
		position: relative;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 25px 0 8px;
		color: #606266;
		display: inline-block;
		font-size: 13px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input span.el-input__suffix {
		top: 0;
		position: absolute;
		right: 0;
		height: 100%;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__suffix .el-select__caret {
		cursor: pointer;
		color: #C0C4CC;
		width: 25px;
		font-size: 14px;
		line-height: 28px;
		text-align: center;
	}

	#pagination.el-pagination /deep/ .el-pagination__jump {
		margin: 0 0 0 24px;
		color: #606266;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__jump .el-input {
		border-radius: 3px;
		padding: 0 2px;
		margin: 0 2px;
		display: inline-block;
		width: 50px;
		font-size: 14px;
		line-height: 18px;
		position: relative;
		text-align: center;
		height: 28px;
	}
	
	#pagination.el-pagination /deep/ .el-pagination__jump .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 3px;
		color: #606266;
		display: inline-block;
		font-size: 14px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	.share_view{
		position: fixed;
		right:0;
		bottom: 20%;
		background: #fff;
		box-shadow: 0 4px 6px rgba(0,0,0,.1);
		.share{
			width: 40px;
			height: 40px;
			display: flex;
			align-items: center;
			justify-content: center;
			border-bottom: 1px solid #eee;
			cursor: pointer;
		}
		.share:last-of-type{
			border:none;
		}
	}


	.detail-preview .el-rate /deep/ .el-rate__item {
				cursor: pointer;
				display: inline-block;
				vertical-align: middle;
				font-size: 0;
				position: relative;
			}
	
	.detail-preview .el-rate /deep/ .el-rate__item .el-rate__icon {
				margin: 0 3px;
				display: block;
				font-size: 18px;
				position: relative;
				transition: .3s;
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
</style>
