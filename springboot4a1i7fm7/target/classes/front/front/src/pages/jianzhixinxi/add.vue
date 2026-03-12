<template>
<div :style='{"width":"100%","padding":"0 10%","margin":"10px auto","position":"relative","background":"none"}'>
    <el-form
	  :style='{"width":"100%","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.3)","padding":"20px","position":"relative","borderRadius":"30px","background":"#fff"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="岗位名称" prop="gangweimingcheng">
            <el-input v-model="ruleForm.gangweimingcheng" 
                placeholder="岗位名称" clearable :disabled=" false  ||ro.gangweimingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}'  label="兼职类型" prop="jianzhileixing">
            <el-select v-model="ruleForm.jianzhileixing" placeholder="请选择兼职类型" :disabled=" false  ||ro.jianzhileixing" >
              <el-option
                  v-for="(item,index) in jianzhileixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="岗位要求" prop="gangweiyaoqiu">
            <el-input v-model="ruleForm.gangweiyaoqiu" 
                placeholder="岗位要求" clearable :disabled=" false  ||ro.gangweiyaoqiu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="办公环境" v-if="type!='cross' || (type=='cross' && !ro.bangonghuanjing)" prop="bangonghuanjing">
            <file-upload
            tip="点击上传办公环境"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.bangonghuanjing?ruleForm.bangonghuanjing:''"
            @change="bangonghuanjingUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' class="upload" v-else label="办公环境" prop="bangonghuanjing">
                <img v-if="ruleForm.bangonghuanjing.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.bangonghuanjing.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.bangonghuanjing.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="岗位性质" prop="gangweixingzhi">
            <el-input v-model="ruleForm.gangweixingzhi" 
                placeholder="岗位性质" clearable :disabled=" false  ||ro.gangweixingzhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="薪资待遇" prop="xinzidaiyu">
            <el-input v-model="ruleForm.xinzidaiyu" 
                placeholder="薪资待遇" clearable :disabled=" false  ||ro.xinzidaiyu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="工作时间" prop="gongzuoshijian">
            <el-input v-model="ruleForm.gongzuoshijian" 
                placeholder="工作时间" clearable :disabled=" false  ||ro.gongzuoshijian"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="上班地点" prop="shangbandidian">
            <el-input v-model="ruleForm.shangbandidian" 
                placeholder="上班地点" clearable :disabled=" false  ||ro.shangbandidian"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="企业名称" prop="qiyemingcheng">
            <el-input v-model="ruleForm.qiyemingcheng" 
                placeholder="企业名称" clearable :disabled=" false  ||ro.qiyemingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="联系人" prop="lianxiren">
            <el-input v-model="ruleForm.lianxiren" 
                placeholder="联系人" clearable :disabled=" false  ||ro.lianxiren"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="联系方式" prop="lianxifangshi">
            <el-input v-model="ruleForm.lianxifangshi" 
                placeholder="联系方式" clearable :disabled=" false  ||ro.lianxifangshi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="岗位介绍" prop="gangweijieshao">
            <editor 
                :style='{"padding":"0","boxShadow":"none","margin":"0","borderColor":"#E2E3E5","backgroundColor":"#fff","borderRadius":"0","borderWidth":"1px","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.gangweijieshao" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#FFC174","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#0B4D49","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				gangweimingcheng : false,
				jianzhileixing : false,
				gangweiyaoqiu : false,
				bangonghuanjing : false,
				gangweixingzhi : false,
				xinzidaiyu : false,
				gongzuoshijian : false,
				shangbandidian : false,
				qiyemingcheng : false,
				lianxiren : false,
				lianxifangshi : false,
				gangweijieshao : false,
				clicktime : false,
				storeupnum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          gangweimingcheng: '',
          jianzhileixing: '',
          gangweiyaoqiu: '',
          bangonghuanjing: '',
          gangweixingzhi: '',
          xinzidaiyu: '',
          gongzuoshijian: '',
          shangbandidian: '',
          qiyemingcheng: '',
          lianxiren: '',
          lianxifangshi: '',
          gangweijieshao: '',
          clicktime: '',
          storeupnum: '',
        },
        jianzhileixingOptions: [],


        rules: {
          gangweimingcheng: [
            { required: true, message: '岗位名称不能为空', trigger: 'blur' },
          ],
          jianzhileixing: [
            { required: true, message: '兼职类型不能为空', trigger: 'blur' },
          ],
          gangweiyaoqiu: [
          ],
          bangonghuanjing: [
          ],
          gangweixingzhi: [
          ],
          xinzidaiyu: [
          ],
          gongzuoshijian: [
          ],
          shangbandidian: [
          ],
          qiyemingcheng: [
          ],
          lianxiren: [
          ],
          lianxifangshi: [
          ],
          gangweijieshao: [
          ],
          clicktime: [
          ],
          storeupnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='gangweimingcheng'){
              this.ruleForm.gangweimingcheng = obj[o];
              this.ro.gangweimingcheng = true;
              continue;
            }
            if(o=='jianzhileixing'){
              this.ruleForm.jianzhileixing = obj[o];
              this.ro.jianzhileixing = true;
              continue;
            }
            if(o=='gangweiyaoqiu'){
              this.ruleForm.gangweiyaoqiu = obj[o];
              this.ro.gangweiyaoqiu = true;
              continue;
            }
            if(o=='bangonghuanjing'){
              this.ruleForm.bangonghuanjing = obj[o].split(",")[0];
              this.ro.bangonghuanjing = true;
              continue;
            }
            if(o=='gangweixingzhi'){
              this.ruleForm.gangweixingzhi = obj[o];
              this.ro.gangweixingzhi = true;
              continue;
            }
            if(o=='xinzidaiyu'){
              this.ruleForm.xinzidaiyu = obj[o];
              this.ro.xinzidaiyu = true;
              continue;
            }
            if(o=='gongzuoshijian'){
              this.ruleForm.gongzuoshijian = obj[o];
              this.ro.gongzuoshijian = true;
              continue;
            }
            if(o=='shangbandidian'){
              this.ruleForm.shangbandidian = obj[o];
              this.ro.shangbandidian = true;
              continue;
            }
            if(o=='qiyemingcheng'){
              this.ruleForm.qiyemingcheng = obj[o];
              this.ro.qiyemingcheng = true;
              continue;
            }
            if(o=='lianxiren'){
              this.ruleForm.lianxiren = obj[o];
              this.ro.lianxiren = true;
              continue;
            }
            if(o=='lianxifangshi'){
              this.ruleForm.lianxifangshi = obj[o];
              this.ro.lianxifangshi = true;
              continue;
            }
            if(o=='gangweijieshao'){
              this.ruleForm.gangweijieshao = obj[o];
              this.ro.gangweijieshao = true;
              continue;
            }
            if(o=='clicktime'){
              this.ruleForm.clicktime = obj[o];
              this.ro.clicktime = true;
              continue;
            }
            if(o=='storeupnum'){
              this.ruleForm.storeupnum = obj[o];
              this.ro.storeupnum = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.qiyemingcheng!=''&&json.qiyemingcheng) || json.qiyemingcheng==0){
                this.ruleForm.qiyemingcheng = json.qiyemingcheng;
				this.ro.qiyemingcheng = true;
            }
            if((json.lianxiren!=''&&json.lianxiren) || json.lianxiren==0){
                this.ruleForm.lianxiren = json.lianxiren;
				this.ro.lianxiren = true;
            }
            if((json.lianxifangshi!=''&&json.lianxifangshi) || json.lianxifangshi==0){
                this.ruleForm.lianxifangshi = json.lianxifangshi;
				this.ro.lianxifangshi = true;
            }
          }
        });
        this.$http.get('option/jianzhileixing/jianzhileixing', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.jianzhileixingOptions = res.data.data;
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`jianzhixinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('jianzhixinxi/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`jianzhixinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`jianzhixinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
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
			this.$router.go(-1);
		},
      bangonghuanjingUploadChange(fileUrls) {
          this.ruleForm.bangonghuanjing = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
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
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
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
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #E2E3E5;
	  border-radius: 0;
	  padding: 0 10px;
	  box-shadow: none;
	  outline: none;
	  color: #000;
	  width: 500px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
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
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
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
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
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
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #E2E3E5;
	  border-radius: 4px;
	  padding: 12px;
	  box-shadow: none;
	  outline: none;
	  color: #000;
	  width: 500px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
