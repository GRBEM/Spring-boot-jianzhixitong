<template>
	<div>
		<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://localhost:8080/springboot4a1i7fm7/upload/bg.jpg)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
			<el-form v-if="pageFlag=='register'" :style='{"border":"0px solid #eee","padding":"50px 20px 150px 0px","boxShadow":"0 1px 9px rgba(64, 158, 255, .6)","margin":"0","borderRadius":"0px","textAlign":"center","background":"rgba(255,255,255,1)","clipPath":"polygon(0% 0%, 100% 0%, 100% 90%, 75% 90%, 75% 100%, 50% 90%, 0 90%)","width":"750px","height":"auto"}' ref="rgsForm" class="rgs-form" :model="rgsForm" :rules="rules">
				<div v-if="true" :style='{"padding":"10px","margin":"-50px auto 30px","color":"rgba(55,55,55,1)","textAlign":"center","background":"linear-gradient(90deg, rgba(22,136,199,1) 0%, rgba(54,221,227,1) 50%, rgba(140,179,122,1) 100%)","-webkitTextFillColor":"transparent","display":"inline-block","width":"auto","lineHeight":"40px","fontSize":"28px","fontWeight":"600","-webkitBackgroundClip":"text"}' class="title">大学生兼职平台注册</div>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='qiye'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('qiyemingcheng')?'required':''">企业名称：</div>
					<el-input  v-model="ruleForm.qiyemingcheng"  autocomplete="off" placeholder="企业名称"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='qiye'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='qiye'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='qiye'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('lianxiren')?'required':''">联系人：</div>
					<el-input  v-model="ruleForm.lianxiren"  autocomplete="off" placeholder="联系人"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='qiye'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="qiyetouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='qiye'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('qiyedizhi')?'required':''">企业地址：</div>
					<el-input  v-model="ruleForm.qiyedizhi"  autocomplete="off" placeholder="企业地址"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='qiye'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('lianxifangshi')?'required':''">联系方式：</div>
					<el-input  v-model="ruleForm.lianxifangshi"  autocomplete="off" placeholder="联系方式"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('zhanghao')?'required':''">账号：</div>
					<el-input  v-model="ruleForm.zhanghao"  autocomplete="off" placeholder="账号"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('mima')?'required':''">密码：</div>
					<el-input  v-model="ruleForm.mima"  autocomplete="off" placeholder="密码"  type="password"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
					<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('xingming')?'required':''">姓名：</div>
					<el-input  v-model="ruleForm.xingming"  autocomplete="off" placeholder="姓名"  type="text"  />
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
                    <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
                        <el-option
                            v-for="(item,index) in xueshengxingbieOptions"
                            v-bind:key="index"
                            :label="item"
                            :value="item">
                        </el-option>
                    </el-select>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
                    <file-upload
                        tip="点击上传头像"
                        action="file/upload"
                        :limit="3"
                        :multiple="true"
                        :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
                        @change="xueshengtouxiangUploadChange"
                    ></file-upload>
				</el-form-item>
				<el-form-item :style='{"padding":"0 0px","margin":"0 auto 15px","textAlign":"left","width":"50%","fontSize":"inherit","position":"relative","height":"auto"}' class="list-item" v-if="tableName=='xuesheng'">
					<div v-if="true" :style='{"padding":"0 6px","color":"#666","textAlign":"right","left":"-120px","width":"120px","lineHeight":"40px","fontSize":"16px","position":"absolute"}' class="lable" :class="changeRules('shouji')?'required':''">手机：</div>
					<el-input  v-model="ruleForm.shouji"  autocomplete="off" placeholder="手机"  type="text"  />
				</el-form-item>
				<button :style='{"border":"1px solid rgba(19,161,230,.2)","cursor":"pointer","padding":"0 24px","boxShadow":"inset 0px 0px 24px 0px rgba(19,161,230,.1)","margin":"30px auto 5px","color":"rgba(19,161,230,1)","display":"block","outline":"none","borderRadius":"0px","background":"rgba(3, 152, 15, 0)","width":"120px","fontSize":"20px","fontWeight":"600","height":"40px"}' type="button" class="r-btn" @click="login()">注册</button>
				<div :style='{"cursor":"pointer","padding":"0","color":"rgba(159, 159, 159, 1)","textAlign":"right","display":"inline-block","width":"80%","lineHeight":"1","fontSize":"14px"}' class="r-login" @click="close()">已有账号，直接登录</div>
			</el-form>
			
		</div>
	</div>
</template>

<script>
export default {
	data() {
		return {
			ruleForm: {
			},
			forgetForm: {},
            pageFlag : '',
			tableName:"",
			rules: {},
            xueshengxingbieOptions: [],
		};
	},
	mounted(){
		this.pageFlag = this.$route.query.pageFlag
		if(this.$route.query.pageFlag=='register'){
			
			let table = this.$storage.get("loginTable");
			this.tableName = table;
			if(this.tableName=='qiye'){
				this.ruleForm = {
					qiyemingcheng: '',
					mima: '',
					lianxiren: '',
					touxiang: '',
					qiyedizhi: '',
					lianxifangshi: '',
					storeupnum: '',
				}
			}
			if(this.tableName=='xuesheng'){
				this.ruleForm = {
					zhanghao: '',
					mima: '',
					xingming: '',
					xingbie: '',
					touxiang: '',
					shouji: '',
				}
			}
			if ('qiye' == this.tableName) {
				this.rules.qiyemingcheng = [{ required: true, message: '请输入企业名称', trigger: 'blur' }]
			}
			if ('qiye' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.rules.zhanghao = [{ required: true, message: '请输入账号', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.rules.xingming = [{ required: true, message: '请输入姓名', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.rules.shouji = [{ required: true, message: '请输入手机', trigger: 'blur' }]
			}
			this.xueshengxingbieOptions = "男,女".split(',')
		}
	},
	created() {
	},
	destroyed() {
		  	},
	methods: {
		changeRules(name){
			if(this.rules[name]){
				return true
			}
			return false
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        qiyetouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        xueshengtouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
					if((!this.ruleForm.qiyemingcheng) && `qiye` == this.tableName){
						this.$message.error(`企业名称不能为空`);
						return
					}
					if((!this.ruleForm.mima) && `qiye` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `qiye` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					if(`qiye` == this.tableName && this.ruleForm.lianxifangshi &&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
						this.$message.error(`联系方式应输入手机格式`);
						return
					}
					if((!this.ruleForm.zhanghao) && `xuesheng` == this.tableName){
						this.$message.error(`账号不能为空`);
						return
					}
					if((!this.ruleForm.mima) && `xuesheng` == this.tableName){
						this.$message.error(`密码不能为空`);
						return
					}
					if((this.ruleForm.mima!=this.ruleForm.mima2) && `xuesheng` == this.tableName){
						this.$message.error(`两次密码输入不一致`);
						return
					}
					if((!this.ruleForm.xingming) && `xuesheng` == this.tableName){
						this.$message.error(`姓名不能为空`);
						return
					}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
					if((!this.ruleForm.shouji) && `xuesheng` == this.tableName){
						this.$message.error(`手机不能为空`);
						return
					}
					if(`xuesheng` == this.tableName && this.ruleForm.shouji &&(!this.$validate.isMobile(this.ruleForm.shouji))){
						this.$message.error(`手机应输入手机格式`);
						return
					}
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
						}
					});
				} else {
					this.$message.error(data.msg);
				}
			});
		}
	}
};
</script>

<style lang="scss" scoped>
	.container {
	  position: relative;
	  background: url(http://localhost:8080/springboot4a1i7fm7/upload/bg.jpg);

		.el-date-editor.el-input {
		  width: 100%;
		}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 1px solid rgba(19,161,230,.2);
						border-radius: 0px;
						padding: 0 10px;
						box-shadow: inset 0px 0px 24px 0px rgba(19,161,230,.1);
						outline: none;
						color: #666;
						background: #fff;
						width: calc(100% - 0px);
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 1px solid rgba(19,161,230,.2);
						border-radius: 0px;
						padding: 0 10px;
						box-shadow: inset 0px 0px 24px 0px rgba(19,161,230,.1);
						outline: none;
						color: #666;
						background: #fff;
						width: 100%;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid rgba(19,161,230,.2);
						border-radius: 0px;
						padding: 0 10px 0 30px;
						box-shadow: inset 0px 0px 24px 0px rgba(19,161,230,.1);
						outline: none;
						color: #666;
						background: #fff;
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid rgba(19,161,230,.2);
						border-radius: 0px;
						padding: 0 10px 0 30px;
						box-shadow: inset 0px 0px 24px 0px rgba(19,161,230,.1);
						outline: none;
						color: #666;
						background: #fff;
						width: 288px;
						font-size: 14px;
						height: 40px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px solid rgba(19,161,230,.2);
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  box-shadow: inset 0px 0px 24px 0px rgba(19,161,230,.1);
		  		  color: #666;
		  		  background: #fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px solid rgba(19,161,230,.2);
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  box-shadow: inset 0px 0px 24px 0px rgba(19,161,230,.1);
		  		  color: #666;
		  		  background: #fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px solid rgba(19,161,230,.2);
		  		  cursor: pointer;
		  		  border-radius: 0px;
		  		  box-shadow: inset 0px 0px 24px 0px rgba(19,161,230,.1);
		  		  color: #666;
		  		  background: #fff;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				position: absolute;
				right: 5px;
				content: "*";
			}
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>
