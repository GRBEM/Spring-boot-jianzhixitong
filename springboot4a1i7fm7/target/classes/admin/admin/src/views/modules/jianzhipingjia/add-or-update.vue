<template>
	<div class="addEdit-block" :style='{"padding":"20px 30px 30px","margin":"0 auto","color":"#666","borderRadius":"0 0 10px 10px","background":"#fff","width":"calc(100% - 60px)","fontSize":"16px"}'>
		<el-form
			:style='{"border":"0px solid rgba(254,169,35,.2)","padding":"30px","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","fontSize":"inherit","borderRadius":"4px","background":"none"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="150px"
		>
			<template >
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="评价名称" prop="pingjiamingcheng">
					<el-input v-model="ruleForm.pingjiamingcheng" placeholder="评价名称" clearable  :readonly="ro.pingjiamingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="评价名称" prop="pingjiamingcheng">
					<el-input v-model="ruleForm.pingjiamingcheng" placeholder="评价名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="岗位名称" prop="gangweimingcheng">
					<el-input v-model="ruleForm.gangweimingcheng" placeholder="岗位名称" clearable  :readonly="ro.gangweimingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="岗位名称" prop="gangweimingcheng">
					<el-input v-model="ruleForm.gangweimingcheng" placeholder="岗位名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-if="type!='info' && !ro.pingjiatupian" label="评价图片" prop="pingjiatupian">
					<file-upload
						tip="点击上传评价图片"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.pingjiatupian?ruleForm.pingjiatupian:''"
						@change="pingjiatupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-else-if="ruleForm.pingjiatupian" label="评价图片" prop="pingjiatupian">
					<img v-if="ruleForm.pingjiatupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.pingjiatupian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.pingjiatupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="select" v-if="type!='info'"  label="评分信息" prop="pingfenxinxi">
					<el-select :disabled="ro.pingfenxinxi" v-model="ruleForm.pingfenxinxi" placeholder="请选择评分信息" >
						<el-option
							v-for="(item,index) in pingfenxinxiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="评分信息" prop="pingfenxinxi">
					<el-input v-model="ruleForm.pingfenxinxi"
						placeholder="评分信息" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="企业名称" prop="qiyemingcheng">
					<el-input v-model="ruleForm.qiyemingcheng" placeholder="企业名称" clearable  :readonly="ro.qiyemingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="企业名称" prop="qiyemingcheng">
					<el-input v-model="ruleForm.qiyemingcheng" placeholder="企业名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="date" v-if="type!='info'" label="评价日期" prop="pingjiariqi">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.pingjiariqi" 
						type="date"
						:readonly="ro.pingjiariqi"
						placeholder="评价日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-else-if="ruleForm.pingjiariqi" label="评价日期" prop="pingjiariqi">
					<el-input v-model="ruleForm.pingjiariqi" placeholder="评价日期" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="账号" prop="zhanghao">
					<el-input v-model="ruleForm.zhanghao" placeholder="账号" clearable  :readonly="ro.zhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="账号" prop="zhanghao">
					<el-input v-model="ruleForm.zhanghao" placeholder="账号" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="textarea" v-if="type!='info'" label="评价信息" prop="pingjiaxinxi">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="评价信息"
					  v-model="ruleForm.pingjiaxinxi" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else-if="ruleForm.pingjiaxinxi" label="评价信息" prop="pingjiaxinxi">
					<span :style='{"fontSize":"16px","lineHeight":"40px","color":"inherit","fontWeight":"500","display":"inline-block"}'>{{ruleForm.pingjiaxinxi}}</span>
				</el-form-item>
			<el-form-item :style='{"padding":"0","margin":"30px 0 0","alignItems":"center","textAlign":"center","display":"flex","width":"100%","fontSize":"48px","justifyContent":"center"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-tijiao16" :style='{"color":"inherit","margin":"0 2px","fontSize":"18px"}'></span>
					保存
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-quxiao09" :style='{"color":"inherit","margin":"0 2px","fontSize":"18px"}'></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui01" :style='{"color":"inherit","margin":"0 2px","fontSize":"18px"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
export default {
	data() {
		return {
			id: '',
			type: '',
			
			
			ro:{
				pingjiamingcheng : false,
				gangweimingcheng : false,
				pingjiatupian : false,
				pingfenxinxi : false,
				pingjiaxinxi : false,
				qiyemingcheng : false,
				pingjiariqi : false,
				zhanghao : false,
				crossuserid : false,
				crossrefid : false,
				shhf : false,
			},
			
			
			ruleForm: {
				pingjiamingcheng: '',
				gangweimingcheng: '',
				pingjiatupian: '',
				pingfenxinxi: '',
				pingjiaxinxi: '',
				qiyemingcheng: '',
				pingjiariqi: '',
				zhanghao: '',
				crossuserid: '',
				crossrefid: '',
				shhf: '',
			},
		
			pingfenxinxiOptions: [],

			
			rules: {
				pingjiamingcheng: [
				],
				gangweimingcheng: [
				],
				pingjiatupian: [
				],
				pingfenxinxi: [
					{ required: true, message: '评分信息不能为空', trigger: 'blur' },
				],
				pingjiaxinxi: [
				],
				qiyemingcheng: [
				],
				pingjiariqi: [
				],
				zhanghao: [
				],
				crossuserid: [
				],
				crossrefid: [
				],
				shhf: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
		this.ruleForm.pingjiariqi = this.getCurDate()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='pingjiamingcheng'){
							this.ruleForm.pingjiamingcheng = obj[o];
							this.ro.pingjiamingcheng = true;
							continue;
						}
						if(o=='gangweimingcheng'){
							this.ruleForm.gangweimingcheng = obj[o];
							this.ro.gangweimingcheng = true;
							continue;
						}
						if(o=='pingjiatupian'){
							this.ruleForm.pingjiatupian = obj[o];
							this.ro.pingjiatupian = true;
							continue;
						}
						if(o=='pingfenxinxi'){
							this.ruleForm.pingfenxinxi = obj[o];
							this.ro.pingfenxinxi = true;
							continue;
						}
						if(o=='pingjiaxinxi'){
							this.ruleForm.pingjiaxinxi = obj[o];
							this.ro.pingjiaxinxi = true;
							continue;
						}
						if(o=='qiyemingcheng'){
							this.ruleForm.qiyemingcheng = obj[o];
							this.ro.qiyemingcheng = true;
							continue;
						}
						if(o=='pingjiariqi'){
							this.ruleForm.pingjiariqi = obj[o];
							this.ro.pingjiariqi = true;
							continue;
						}
						if(o=='zhanghao'){
							this.ruleForm.zhanghao = obj[o];
							this.ro.zhanghao = true;
							continue;
						}
						if(o=='crossuserid'){
							this.ruleForm.crossuserid = obj[o];
							this.ro.crossuserid = true;
							continue;
						}
						if(o=='crossrefid'){
							this.ruleForm.crossrefid = obj[o];
							this.ro.crossrefid = true;
							continue;
						}
				}
			}
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					var json = data.data;
					if(this.$storage.get("role")!="管理员") {
						this.ro.pingjiariqi = true;
					}
					if(((json.zhanghao!=''&&json.zhanghao) || json.zhanghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.zhanghao = json.zhanghao
						this.ro.zhanghao = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
            this.pingfenxinxiOptions = "一星,二星,三星,四星,五星".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `jianzhipingjia/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
	if(this.ruleForm.pingjiatupian!=null) {
		this.ruleForm.pingjiatupian = this.ruleForm.pingjiatupian.replace(new RegExp(this.$base.url,"g"),"");
	}
var objcross = this.$storage.getObj('crossObj');
      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
		this.$refs["ruleForm"].validate(valid => {
			if (valid) {
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid = crossuserid;
					this.ruleForm.crossrefid = crossrefid;
					let params = { 
						page: 1, 
						limit: 10, 
						crossuserid:this.ruleForm.crossuserid,
						crossrefid:this.ruleForm.crossrefid,
					} 
				this.$http({ 
					url: "jianzhipingjia/page", 
					method: "get", 
					params: params 
				}).then(({ 
					data 
				}) => { 
					if (data && data.code === 0) { 
						if(data.data.total>=crossoptnum) {
							this.$message.error(this.$storage.get('tips'));
							return false;
						} else {
							this.$http({
								url: `jianzhipingjia/${!this.ruleForm.id ? "save" : "update"}`,
								method: "post",
								data: this.ruleForm
							}).then(({ data }) => {
								if (data && data.code === 0) {
									this.$message({
										message: "操作成功",
										type: "success",
										duration: 1500,
										onClose: () => {
											this.parent.showFlag = true;
											this.parent.addOrUpdateFlag = false;
											this.parent.jianzhipingjiaCrossAddOrUpdateFlag = false;
											this.parent.search();
											this.parent.contentStyleChange();
										}
									});
								} else {
									this.$message.error(data.msg);
								}
							});

						}
					} else { 
				} 
			});
		} else {
			this.$http({
				url: `jianzhipingjia/${!this.ruleForm.id ? "save" : "update"}`,
				method: "post",
			   data: this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "操作成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.parent.showFlag = true;
							this.parent.addOrUpdateFlag = false;
							this.parent.jianzhipingjiaCrossAddOrUpdateFlag = false;
							this.parent.search();
							this.parent.contentStyleChange();
						}
					});
				} else {
					this.$message.error(data.msg);
			   }
			});
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.jianzhipingjiaCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    pingjiatupianUploadChange(fileUrls) {
	    this.ruleForm.pingjiatupian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: inherit;
	  	  font-weight: 500;
	  	  display: inline-block;
	  	  width: 150px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 400px;
	  	  font-size: 16px;
	  	  height: 44px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 400px;
	  	  font-size: 16px;
	  	  height: 44px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 200px;
	  	  font-size: 16px;
	  	  height: 44px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 200px;
	  	  font-size: 16px;
	  	  height: 44px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: inherit;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: inherit;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: inherit;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 500px;
	  	  font-size: 16px;
	  	  height: 140px;
	  	}
	
	.add-update-preview .btn .btn1 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				padding: 0 20px;
				margin: 0px 4px;
				color: rgba(19,161,230,.8);
				display: inline-block;
				font-size: 16px;
				line-height: 24px;
				border-radius: 4px;
				outline: none;
				background: rgba(255,255,255,1);
				width: auto;
				height: 40px;
			}
	
	.add-update-preview .btn .btn1:hover {
				border: 1px solid #999;
				color: #333;
				background: rgba(255,255,255,1);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: rgba(19,161,230,.8);
				background: #fff;
				width: auto;
				font-size: 16px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn2:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: rgba(19,161,230,.8);
				background: rgba(255,255,255,1);
				width: auto;
				font-size: 16px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn3:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: rgba(19,161,230,.8);
				background: rgba(255,255,255,1);
				width: auto;
				font-size: 16px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn4:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn5 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 4px;
				outline: none;
				color: rgba(19,161,230,.8);
				background: rgba(255,255,255,1);
				width: auto;
				font-size: 16px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn5:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
</style>
