<template>
  <div class="content"
       :style='{"padding":"0px 30px 30px","margin":"0 auto","alignItems":"flex-start","borderRadius":"0 0 10px 10px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230830/d58ecc944fb54dbfa18ecd2b64e92170.png) no-repeat center top / cover","display":"flex","width":"calc(100% - 60px)","fontSize":"16px"}'>
    <!-- notice -->
    <!-- title -->
    <div class="text"
         :style='{"width":"100%","margin":"50px auto 50px","fontSize":"28px","color":"#454545","textAlign":"center","fontWeight":"bold"}'>
      欢迎使用 {{ this.$project.projectName }}
    </div>
    <!-- statis -->
    <div
        :style='{"border":"0px solid #eee","padding":"0px 0","margin":"0 30px 30px 30px","alignItems":"center","color":"#666","flexWrap":"wrap","background":"none","display":"flex","width":"250px","fontSize":"14px","justifyContent":"center","order":"2"}'>
      <div
          :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","margin":"0 0 10px 0","borderColor":"#eee","borderRadius":"0px","textAlign":"center","background":"rgba(255, 255, 255,.96)","borderWidth":"1px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center"}'
          v-if="isAuth('qiye','首页总数')">
        <div
            :style='{"alignItems":"center","background":"none","display":"flex","width":"80px","justifyContent":"flex-end","height":"83px","order":"2"}'>
          <span class="icon iconfont icon-tongjitu13" :style='{"color":"inherit","fontSize":"32px"}'></span>
        </div>
        <div :style='{"width":"auto","flexDirection":"column","justifyContent":"center","display":"flex"}'>
          <div
              :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"24px","color":"inherit","fontWeight":"bold","height":"24px"}'>
            {{ qiyeCount }}
          </div>
          <div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"inherit","color":"inherit","height":"24px"}'>
            企业总数
          </div>
        </div>
      </div>
      <div
          :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","margin":"0 0 10px 0","borderColor":"rgba(126, 96, 16, .1)","borderRadius":"0px","textAlign":"center","background":"linear-gradient(90deg, rgba(203,237,255,1) 0%, rgba(132,251,255,1) 50%, rgba(184,223,166,1) 100%)","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center"}'
          v-if="isAuth('xuesheng','首页总数')">
        <div
            :style='{"alignItems":"center","background":"none","display":"flex","width":"80px","justifyContent":"flex-end","height":"83px","order":"2"}'>
          <span class="icon iconfont icon-tongjitu13" :style='{"color":"inherit","fontSize":"32px"}'></span>
        </div>
        <div :style='{"width":"auto","flexDirection":"column","justifyContent":"center","display":"flex"}'>
          <div
              :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"24px","color":"inherit","fontWeight":"bold","height":"24px"}'>
            {{ xueshengCount }}
          </div>
          <div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"inherit","color":"inherit","height":"24px"}'>
            学生总数
          </div>
        </div>
      </div>
      <div
          :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","margin":"0 0 10px 0","borderColor":"#eee","borderRadius":"0px","textAlign":"center","background":"rgba(255, 255, 255,.96)","borderWidth":"1px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center"}'
          v-if="isAuth('jianzhixinxi','首页总数')">
        <div
            :style='{"alignItems":"center","background":"none","display":"flex","width":"80px","justifyContent":"flex-end","height":"83px","order":"2"}'>
          <span class="icon iconfont icon-tongjitu13" :style='{"color":"inherit","fontSize":"32px"}'></span>
        </div>
        <div :style='{"width":"auto","flexDirection":"column","justifyContent":"center","display":"flex"}'>
          <div
              :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"24px","color":"inherit","fontWeight":"bold","height":"24px"}'>
            {{ jianzhixinxiCount }}
          </div>
          <div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"inherit","color":"inherit","height":"24px"}'>
            兼职信息总数
          </div>
        </div>
      </div>
      <div
          :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","margin":"0 0 10px 0","borderColor":"rgba(126, 96, 16, .1)","borderRadius":"0px","textAlign":"center","background":"linear-gradient(90deg, rgba(203,237,255,1) 0%, rgba(132,251,255,1) 50%, rgba(184,223,166,1) 100%)","borderWidth":"0 0 0px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center"}'
          v-if="isAuth('shenqingxinxi','首页总数')">
        <div
            :style='{"alignItems":"center","background":"none","display":"flex","width":"80px","justifyContent":"flex-end","height":"83px","order":"2"}'>
          <span class="icon iconfont icon-tongjitu13" :style='{"color":"inherit","fontSize":"32px"}'></span>
        </div>
        <div :style='{"width":"auto","flexDirection":"column","justifyContent":"center","display":"flex"}'>
          <div
              :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"24px","color":"inherit","fontWeight":"bold","height":"24px"}'>
            {{ shenqingxinxiCount }}
          </div>
          <div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"inherit","color":"inherit","height":"24px"}'>
            申请信息总数
          </div>
        </div>
      </div>
      <div
          :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","margin":"0 0 0px 0","borderColor":"#eee","borderRadius":"0px","textAlign":"center","background":"rgba(255, 255, 255,.96)","borderWidth":"1px","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"center"}'
          v-if="isAuth('jianzhipingjia','首页总数')">
        <div
            :style='{"alignItems":"center","background":"none","display":"flex","width":"80px","justifyContent":"flex-end","height":"83px","order":"2"}'>
          <span class="icon iconfont icon-tongjitu13" :style='{"color":"inherit","fontSize":"32px"}'></span>
        </div>
        <div :style='{"width":"auto","flexDirection":"column","justifyContent":"center","display":"flex"}'>
          <div
              :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"24px","color":"inherit","fontWeight":"bold","height":"24px"}'>
            {{ jianzhipingjiaCount }}
          </div>
          <div :style='{"margin":"5px 0","lineHeight":"24px","fontSize":"inherit","color":"inherit","height":"24px"}'>
            兼职评价总数
          </div>
        </div>
      </div>
    </div>
    <!-- statis -->


    <!-- echarts -->
    <!-- 3 -->
    <div class="type3"
         :style='{"alignContent":"flex-start","padding":"0","borderRadius":"8px","flexWrap":"wrap","background":"none","flex":"1","display":"flex","width":"100%","position":"relative","justifyContent":"space-between","height":"460px","order":"10"}'>
      <div id="jianzhixinxiChart1" class="echarts1" v-if="isAuth('jianzhixinxi','首页统计')"></div>
      <div id="shenqingxinxiChart1" class="echarts2" v-if="isAuth('shenqingxinxi','首页统计')"></div>
      <div id="jianzhipingjiaChart1" class="echarts3" v-if="isAuth('jianzhipingjia','首页统计')"></div>
    </div>
  </div>
</template>
<script>
//3
import router from '@/router/router-static'
import * as echarts from 'echarts'

export default {
  data() {
    return {
      qiyeCount: 0,
      xueshengCount: 0,
      jianzhixinxiCount: 0,
      shenqingxinxiCount: 0,
      jianzhipingjiaCount: 0,
      line: {
        "backgroundColor": "transparent",
        "yAxis": {
          "axisLabel": {
            "borderType": "solid",
            "rotate": 0,
            "padding": 0,
            "shadowOffsetX": 0,
            "margin": 15,
            "backgroundColor": "transparent",
            "borderColor": "#000",
            "shadowOffsetY": 0,
            "color": "#333",
            "shadowBlur": 0,
            "show": true,
            "inside": false,
            "ellipsis": "...",
            "overflow": "none",
            "borderRadius": 0,
            "borderWidth": 0,
            "width": "",
            "fontSize": 12,
            "lineHeight": 24,
            "shadowColor": "transparent",
            "fontWeight": "normal",
            "height": ""
          },
          "axisTick": {
            "show": true,
            "length": 5,
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#333",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            },
            "inside": false
          },
          "splitLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#666",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            }, "show": true
          },
          "axisLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#333",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            }, "show": true
          },
          "splitArea": {
            "show": false,
            "areaStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "color": "rgba(25,25,25,0.3)",
              "opacity": 1,
              "shadowBlur": 10,
              "shadowColor": "rgba(0,0,0,.5)"
            }
          }
        },
        "xAxis": {
          "axisLabel": {
            "borderType": "solid",
            "rotate": 0,
            "padding": 0,
            "shadowOffsetX": 0,
            "margin": 4,
            "backgroundColor": "transparent",
            "borderColor": "#000",
            "shadowOffsetY": 0,
            "color": "#333",
            "shadowBlur": 0,
            "show": true,
            "inside": false,
            "ellipsis": "...",
            "overflow": "none",
            "borderRadius": 0,
            "borderWidth": 0,
            "width": "",
            "fontSize": 12,
            "lineHeight": 24,
            "shadowColor": "transparent",
            "fontWeight": "normal",
            "height": ""
          },
          "axisTick": {
            "show": true,
            "length": 5,
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#333",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            },
            "inside": false
          },
          "splitLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#333",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            }, "show": false
          },
          "axisLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#333",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            }, "show": true
          },
          "splitArea": {
            "show": false,
            "areaStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "color": "rgba(25,25,25,.3)",
              "opacity": 1,
              "shadowBlur": 10,
              "shadowColor": "rgba(0,0,0,.5)"
            }
          }
        },
        "color": ["#5470c6", "#91cc75", "#fac858", "#ee6666", "#73c0de", "#3ba272", "#fc8452", "#9a60b4", "#ea7ccc"],
        "legend": {
          "padding": 0,
          "itemGap": 10,
          "shadowOffsetX": 0,
          "backgroundColor": "transparent",
          "borderColor": "#666",
          "shadowOffsetY": 0,
          "orient": "horizontal",
          "shadowBlur": 0,
          "bottom": "auto",
          "itemHeight": 14,
          "show": true,
          "icon": "roundRect",
          "right": "auto",
          "top": "auto",
          "borderRadius": 0,
          "left": "right",
          "borderWidth": 0,
          "width": "80%",
          "itemWidth": 20,
          "shadowColor": "rgba(0,0,0,.3)",
          "height": "auto"
        },
        "series": {"showSymbol": true, "symbol": "emptyCircle", "symbolSize": 4},
        "tooltip": {"backgroundColor": "#fff", "textStyle": {"color": "#333"}},
        "title": {
          "borderType": "solid",
          "padding": 0,
          "shadowOffsetX": 0,
          "backgroundColor": "transparent",
          "borderColor": "#666",
          "shadowOffsetY": 0,
          "shadowBlur": 0,
          "bottom": "auto",
          "show": true,
          "right": "auto",
          "top": "auto",
          "borderRadius": 0,
          "left": "left",
          "borderWidth": 0,
          "textStyle": {
            "textBorderWidth": 0,
            "color": "#666",
            "textShadowColor": "transparent",
            "fontSize": 14,
            "lineHeight": 24,
            "textShadowOffsetX": 0,
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "fontWeight": 600,
            "textBorderColor": "#666",
            "textShadowBlur": 0
          },
          "shadowColor": "transparent"
        }
      },
      bar: {
        "backgroundColor": "transparent",
        "yAxis": {
          "axisLabel": {
            "borderType": "solid",
            "rotate": 0,
            "padding": 0,
            "shadowOffsetX": 0,
            "margin": 12,
            "backgroundColor": "transparent",
            "borderColor": "#666",
            "shadowOffsetY": 0,
            "color": "#666",
            "shadowBlur": 0,
            "show": true,
            "inside": false,
            "ellipsis": "...",
            "overflow": "none",
            "borderRadius": 0,
            "borderWidth": 0,
            "width": "",
            "fontSize": 12,
            "lineHeight": 24,
            "shadowColor": "transparent",
            "fontWeight": "normal",
            "height": ""
          },
          "axisTick": {
            "show": true,
            "length": 5,
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#666",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            },
            "inside": false
          },
          "splitLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#666",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            }, "show": true
          },
          "axisLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#666",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            }, "show": true
          },
          "splitArea": {
            "show": false,
            "areaStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "color": "rgba(25,25,25,0.3)",
              "opacity": 1,
              "shadowBlur": 10,
              "shadowColor": "rgba(0,0,0,.5)"
            }
          }
        },
        "xAxis": {
          "axisLabel": {
            "borderType": "solid",
            "rotate": 0,
            "padding": 0,
            "shadowOffsetX": 0,
            "margin": 4,
            "backgroundColor": "transparent",
            "borderColor": "#000",
            "shadowOffsetY": 0,
            "color": "#666",
            "shadowBlur": 0,
            "show": true,
            "inside": false,
            "ellipsis": "...",
            "overflow": "none",
            "borderRadius": 0,
            "borderWidth": 0,
            "width": "",
            "fontSize": 12,
            "lineHeight": 24,
            "shadowColor": "transparent",
            "fontWeight": "normal",
            "height": ""
          },
          "axisTick": {
            "show": true,
            "length": 5,
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#666",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            },
            "inside": false
          },
          "splitLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#666",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            }, "show": false
          },
          "axisLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "cap": "butt",
              "color": "#666",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "rgba(0,0,0,.5)"
            }, "show": true
          },
          "splitArea": {
            "show": false,
            "areaStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "color": "rgba(25,25,25,.3)",
              "opacity": 1,
              "shadowBlur": 10,
              "shadowColor": "rgba(0,0,0,.5)"
            }
          }
        },
        "color": ["#00ff00", "#91cc75", "#fac858", "#ee6666", "#73c0de", "#3ba272", "#fc8452", "#9a60b4", "#ea7ccc"],
        "legend": {
          "padding": 0,
          "itemGap": 10,
          "shadowOffsetX": 0,
          "backgroundColor": "transparent",
          "borderColor": "#666",
          "shadowOffsetY": 0,
          "orient": "horizontal",
          "shadowBlur": 0,
          "bottom": "auto",
          "itemHeight": 14,
          "show": true,
          "icon": "roundRect",
          "itemStyle": {
            "borderType": "solid",
            "shadowOffsetX": 0,
            "borderColor": "inherit",
            "shadowOffsetY": 0,
            "color": "#666",
            "shadowBlur": 0,
            "borderWidth": 0,
            "opacity": 1,
            "shadowColor": "transparent"
          },
          "right": "auto",
          "top": "auto",
          "borderRadius": 0,
          "lineStyle": {
            "shadowOffsetX": 0,
            "shadowOffsetY": 0,
            "color": "inherit",
            "shadowBlur": 0,
            "width": "auto",
            "type": "inherit",
            "opacity": 1,
            "shadowColor": "transparent"
          },
          "left": "right",
          "borderWidth": 0,
          "width": "80%",
          "itemWidth": 20,
          "textStyle": {
            "textBorderWidth": 0,
            "color": "inherit",
            "textShadowColor": "transparent",
            "ellipsis": "...",
            "overflow": "none",
            "fontSize": 12,
            "lineHeight": 24,
            "textShadowOffsetX": 0,
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "fontWeight": 500,
            "textBorderColor": "transparent",
            "textShadowBlur": 0
          },
          "shadowColor": "rgba(0,0,0,.3)",
          "height": "auto"
        },
        "series": {
          "barWidth": "auto",
          "itemStyle": {
            "borderType": "solid",
            "shadowOffsetX": 0,
            "borderColor": "#666",
            "shadowOffsetY": 0,
            "color": "",
            "shadowBlur": 0,
            "borderWidth": 0,
            "opacity": 1,
            "shadowColor": "#000"
          },
          "colorBy": "data",
          "barCategoryGap": "20%"
        },
        "tooltip": {"backgroundColor": "#fff", "textStyle": {"color": "#333"}},
        "title": {
          "borderType": "solid",
          "padding": 0,
          "shadowOffsetX": 0,
          "backgroundColor": "transparent",
          "borderColor": "#666",
          "shadowOffsetY": 0,
          "shadowBlur": 0,
          "bottom": "auto",
          "show": true,
          "right": "auto",
          "top": "auto",
          "borderRadius": 0,
          "left": "left",
          "borderWidth": 0,
          "textStyle": {
            "textBorderWidth": 0,
            "color": "#666",
            "textShadowColor": "transparent",
            "fontSize": 14,
            "lineHeight": 24,
            "textShadowOffsetX": 0,
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "fontWeight": 600,
            "textBorderColor": "#666",
            "textShadowBlur": 0
          },
          "shadowColor": "transparent"
        },
        "base": {"animate": false, "interval": 2000}
      },
      pie: {
        "tooltip": {"backgroundColor": "#fff", "textStyle": {"color": "#333"}},
        "backgroundColor": "transparent",
        "color": ["#5470c6", "#91cc75", "#fac858", "#ee6666", "#73c0de", "#3ba272", "#fc8452", "#9a60b4", "#ea7ccc"],
        "title": {
          "borderType": "solid",
          "padding": 0,
          "shadowOffsetX": 0,
          "backgroundColor": "transparent",
          "borderColor": "#666",
          "shadowOffsetY": 0,
          "shadowBlur": 0,
          "bottom": "auto",
          "show": true,
          "right": "auto",
          "top": "auto",
          "borderRadius": 0,
          "left": "left",
          "borderWidth": 0,
          "textStyle": {
            "textBorderWidth": 0,
            "color": "#666",
            "textShadowColor": "transparent",
            "fontSize": 14,
            "lineHeight": 24,
            "textShadowOffsetX": 0,
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "fontWeight": 600,
            "textBorderColor": "#666",
            "textShadowBlur": 0
          },
          "shadowColor": "transparent"
        },
        "legend": {
          "padding": 0,
          "itemGap": 10,
          "shadowOffsetX": 0,
          "backgroundColor": "transparent",
          "borderColor": "#666",
          "shadowOffsetY": 0,
          "orient": "horizontal",
          "shadowBlur": 0,
          "bottom": "auto",
          "itemHeight": 14,
          "show": true,
          "icon": "roundRect",
          "itemStyle": {
            "borderType": "solid",
            "shadowOffsetX": 0,
            "borderColor": "inherit",
            "shadowOffsetY": 0,
            "color": "inherit",
            "shadowBlur": 0,
            "borderWidth": 0,
            "opacity": 1,
            "shadowColor": "transparent"
          },
          "right": 0,
          "top": "auto",
          "borderRadius": 0,
          "lineStyle": {
            "shadowOffsetX": 0,
            "shadowOffsetY": 0,
            "color": "inherit",
            "shadowBlur": 0,
            "width": "auto",
            "type": "inherit",
            "opacity": 1,
            "shadowColor": "transparent"
          },
          "left": "right",
          "borderWidth": 0,
          "width": "80%",
          "itemWidth": 20,
          "textStyle": {
            "textBorderWidth": 0,
            "color": "inherit",
            "textShadowColor": "transparent",
            "ellipsis": "...",
            "overflow": "none",
            "fontSize": 12,
            "lineHeight": 24,
            "textShadowOffsetX": 0,
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "fontWeight": 500,
            "textBorderColor": "transparent",
            "textShadowBlur": 0
          },
          "shadowColor": "rgba(0,0,0,.3)",
          "height": "auto"
        },
        "series": {
          "itemStyle": {
            "borderType": "solid",
            "shadowOffsetX": 0,
            "borderColor": "#666",
            "shadowOffsetY": 0,
            "color": "",
            "shadowBlur": 0,
            "borderWidth": 0,
            "opacity": 1,
            "shadowColor": "#000"
          },
          "label": {
            "borderType": "solid",
            "rotate": 0,
            "padding": 0,
            "textBorderWidth": 0,
            "backgroundColor": "transparent",
            "borderColor": "#666",
            "color": "inherit",
            "show": true,
            "textShadowColor": "transparent",
            "distanceToLabelLine": 5,
            "ellipsis": "...",
            "overflow": "none",
            "borderRadius": 0,
            "borderWidth": 0,
            "fontSize": 12,
            "lineHeight": 18,
            "textShadowOffsetX": 0,
            "position": "outside",
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "textBorderColor": "#666",
            "textShadowBlur": 0
          },
          "labelLine": {
            "show": true,
            "length": 10,
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "color": "#666",
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "#000"
            },
            "length2": 14,
            "smooth": false
          }
        }
      },
      funnel: {
        "tooltip": {"backgroundColor": "#fff", "textStyle": {"color": "#333"}},
        "backgroundColor": "transparent",
        "color": ["#5470c6", "#91cc75", "#fac858", "#ee6666", "#73c0de", "#3ba272", "#fc8452", "#9a60b4", "#ea7ccc"],
        "title": {
          "borderType": "solid",
          "padding": 2,
          "shadowOffsetX": 0,
          "backgroundColor": "transparent",
          "borderColor": "#ccc",
          "shadowOffsetY": 0,
          "shadowBlur": 0,
          "bottom": "auto",
          "show": true,
          "right": "auto",
          "top": "auto",
          "borderRadius": 0,
          "left": "center",
          "borderWidth": 0,
          "textStyle": {
            "textBorderWidth": 0,
            "color": "#666",
            "textShadowColor": "transparent",
            "fontSize": 14,
            "lineHeight": 24,
            "textShadowOffsetX": 0,
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "fontWeight": 500,
            "textBorderColor": "#ccc",
            "textShadowBlur": 0
          },
          "shadowColor": "transparent"
        },
        "legend": {
          "padding": 5,
          "itemGap": 10,
          "shadowOffsetX": 0,
          "backgroundColor": "transparent",
          "borderColor": "#ccc",
          "shadowOffsetY": 0,
          "orient": "vertical",
          "shadowBlur": 0,
          "bottom": "auto",
          "itemHeight": 14,
          "show": true,
          "icon": "roundRect",
          "itemStyle": {
            "borderType": "solid",
            "shadowOffsetX": 0,
            "borderColor": "inherit",
            "shadowOffsetY": 0,
            "color": "inherit",
            "shadowBlur": 0,
            "borderWidth": 0,
            "opacity": 1,
            "shadowColor": "transparent"
          },
          "top": "auto",
          "borderRadius": 0,
          "lineStyle": {
            "shadowOffsetX": 0,
            "shadowOffsetY": 0,
            "color": "inherit",
            "shadowBlur": 0,
            "width": "auto",
            "type": "inherit",
            "opacity": 1,
            "shadowColor": "transparent"
          },
          "left": "left",
          "borderWidth": 0,
          "width": "auto",
          "itemWidth": 25,
          "textStyle": {
            "textBorderWidth": 0,
            "color": "inherit",
            "textShadowColor": "transparent",
            "ellipsis": "...",
            "overflow": "none",
            "fontSize": 12,
            "lineHeight": 24,
            "textShadowOffsetX": 0,
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "fontWeight": 500,
            "textBorderColor": "transparent",
            "textShadowBlur": 0
          },
          "shadowColor": "rgba(0,0,0,.3)",
          "height": "auto"
        },
        "series": {
          "itemStyle": {
            "borderType": "solid",
            "shadowOffsetX": 0,
            "borderColor": "#000",
            "shadowOffsetY": 0,
            "color": "",
            "shadowBlur": 0,
            "borderWidth": 0,
            "opacity": 1,
            "shadowColor": "#000"
          },
          "label": {
            "borderType": "solid",
            "rotate": 0,
            "padding": 0,
            "textBorderWidth": 0,
            "backgroundColor": "transparent",
            "borderColor": "#fff",
            "color": "",
            "show": true,
            "textShadowColor": "transparent",
            "distanceToLabelLine": 5,
            "ellipsis": "...",
            "overflow": "none",
            "borderRadius": 0,
            "borderWidth": 0,
            "fontSize": 12,
            "lineHeight": 18,
            "textShadowOffsetX": 0,
            "position": "outside",
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "textBorderColor": "#fff",
            "textShadowBlur": 0
          },
          "labelLine": {
            "show": true,
            "length": 10,
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "shadowBlur": 0,
              "width": 1,
              "type": "solid",
              "opacity": 1,
              "shadowColor": "#000"
            },
            "length2": 14,
            "smooth": false
          }
        }
      },
      boardBase: {"funnelNum": 8, "lineNum": 8, "gaugeNum": 8, "barNum": 8, "pieNum": 8},
      gauge: {
        "tooltip": {"backgroundColor": "#fff", "textStyle": {"color": "#333"}},
        "backgroundColor": "transparent",
        "color": ["#5470c6", "#91cc75", "#fac858", "#ee6666", "#73c0de", "#3ba272", "#fc8452", "#9a60b4", "#ea7ccc"],
        "title": {
          "top": "top",
          "left": "left",
          "textStyle": {
            "textBorderWidth": 0,
            "color": "#666",
            "textShadowColor": "transparent",
            "fontSize": 14,
            "lineHeight": 24,
            "textShadowOffsetX": 0,
            "textShadowOffsetY": 0,
            "textBorderType": "solid",
            "fontWeight": 600,
            "textBorderColor": "#666",
            "textShadowBlur": 0
          }
        },
        "series": {
          "pointer": {
            "offsetCenter": [0, "10%"],
            "icon": "path://M2.9,0.7L2.9,0.7c1.4,0,2.6,1.2,2.6,2.6v115c0,1.4-1.2,2.6-2.6,2.6l0,0c-1.4,0-2.6-1.2-2.6-2.6V3.3C0.3,1.9,1.4,0.7,2.9,0.7z",
            "width": 8,
            "length": "80%"
          },
          "axisLine": {
            "lineStyle": {
              "shadowOffsetX": 0,
              "shadowOffsetY": 0,
              "opacity": 0.5,
              "shadowBlur": 1,
              "shadowColor": "#000"
            }, "roundCap": true
          },
          "anchor": {"show": true, "itemStyle": {"color": "inherit"}, "size": 18, "showAbove": true},
          "emphasis": {"disabled": false},
          "progress": {"show": true, "roundCap": true, "overlap": true},
          "splitNumber": 25,
          "detail": {
            "formatter": "{value}",
            "backgroundColor": "inherit",
            "color": "#fff",
            "borderRadius": 3,
            "width": 20,
            "fontSize": 14,
            "height": 16
          },
          "title": {"fontSize": 14},
          "animation": true
        }
      },
    };
  },
  mounted() {
    this.init();
    this.getqiyeCount();
    this.getxueshengCount();
    this.getjianzhixinxiCount();
    this.jianzhixinxiChat1();
    this.getshenqingxinxiCount();
    this.shenqingxinxiChat1();
    this.getjianzhipingjiaCount();
    this.jianzhipingjiaChat1();
  },
  methods: {
    // 统计图动画
    myChartInterval(type, xAxisData, seriesData, myChart) {
      this.$nextTick(() => {
        setInterval(() => {
          let xAxis = xAxisData.shift()
          xAxisData.push(xAxis)
          let series = seriesData.shift()
          seriesData.push(series)

          if (type == 1) {
            myChart.setOption({
              xAxis: [{
                data: xAxisData
              }],
              series: [{
                data: seriesData
              }]
            });
          }
          if (type == 2) {
            myChart.setOption({
              yAxis: [{
                data: xAxisData
              }],
              series: [{
                data: seriesData
              }]
            });
          }
        }, 2000);
      })
    },
    init() {
      if (this.$storage.get('Token')) {
        this.$http({
          url: `${this.$storage.get('sessionTable')}/session`,
          method: "get"
        }).then(({data}) => {
          if (data && data.code != 0) {
            router.push({name: 'login'})
          }
        });
      } else {
        router.push({name: 'login'})
      }
    },
    getqiyeCount() {
      this.$http({
        url: `qiye/count`,
        method: "get"
      }).then(({
                 data
               }) => {
        if (data && data.code == 0) {
          this.qiyeCount = data.data
        }
      })
    },
    getxueshengCount() {
      this.$http({
        url: `xuesheng/count`,
        method: "get"
      }).then(({
                 data
               }) => {
        if (data && data.code == 0) {
          this.xueshengCount = data.data
        }
      })
    },
    getjianzhixinxiCount() {
      this.$http({
        url: `jianzhixinxi/count`,
        method: "get"
      }).then(({
                 data
               }) => {
        if (data && data.code == 0) {
          this.jianzhixinxiCount = data.data
        }
      })
    },
// 1234 饼
    jianzhixinxiChat1() {
      this.$nextTick(() => {

        var jianzhixinxiChart1 = echarts.init(document.getElementById("jianzhixinxiChart1"), 'macarons');
        this.$http({
          url: "jianzhixinxi/group/jianzhileixing",
          method: "get",
        }).then(({data}) => {
          if (data && data.code === 0) {
            let res = data.data;
            let xAxis = [];
            let yAxis = [];
            let pArray = []
            for (let i = 0; i < res.length; i++) {
              if (this.boardBase && i == this.boardBase.pieNum) {
                break;
              }
              xAxis.push(res[i].jianzhileixing);
              yAxis.push(parseFloat((res[i].total)));
              pArray.push({
                value: parseFloat((res[i].total)),
                name: res[i].jianzhileixing
              })
            }
            var option = {};
            let titleObj = this.pie.title
            titleObj.text = '兼职类型统计'

            const legendObj = this.pie.legend
            let tooltipObj = {trigger: 'item', formatter: '{b} : {c} ({d}%)'}
            tooltipObj = Object.assign(tooltipObj, this.pie.tooltip ? this.pie.tooltip : {})

            let seriesObj = {
              type: 'pie',
              radius: '55%',
              center: ['50%', '60%'],
              data: pArray,
              emphasis: {
                itemStyle: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
            seriesObj = Object.assign(seriesObj, this.pie.series)
            const gridObj = this.pie.grid
            option = {
              backgroundColor: this.pie.backgroundColor,
              color: this.pie.color,
              title: titleObj,
              legend: legendObj,
              grid: gridObj,
              tooltip: tooltipObj,
              series: [seriesObj]
            };
            // 使用刚指定的配置项和数据显示图表。
            jianzhixinxiChart1.setOption(option);

            //根据窗口的大小变动图表
            window.onresize = function () {
              jianzhixinxiChart1.resize();
            };
          }
        });
      })
    },


    getshenqingxinxiCount() {
      this.$http({
        url: `shenqingxinxi/count`,
        method: "get"
      }).then(({
                 data
               }) => {
        if (data && data.code == 0) {
          this.shenqingxinxiCount = data.data
        }
      })
    },
// 1234 竖
    shenqingxinxiChat1() {
      this.$nextTick(() => {

        var shenqingxinxiChart1 = echarts.init(document.getElementById("shenqingxinxiChart1"), 'macarons');
        this.$http({
          url: "shenqingxinxi/group/gangweimingcheng",
          method: "get",
        }).then(({data}) => {
          if (data && data.code === 0) {
            let res = data.data;
            let xAxis = [];
            let yAxis = [];
            let pArray = []
            for (let i = 0; i < res.length; i++) {
              if (this.boardBase && i == this.boardBase.barNum) {
                break;
              }
              xAxis.push(res[i].gangweimingcheng);
              yAxis.push(parseFloat((res[i].total)));
              pArray.push({
                value: parseFloat((res[i].total)),
                name: res[i].gangweimingcheng
              })
            }
            var option = {};
            let titleObj = this.bar.title
            titleObj.text = '岗位申请统计'

            const legendObj = this.bar.legend
            let tooltipObj = {trigger: 'item', formatter: '{b} : {c}'}
            tooltipObj = Object.assign(tooltipObj, this.bar.tooltip ? this.bar.tooltip : {})

            let xAxisObj = this.bar.xAxis
            xAxisObj.type = 'category'
            xAxisObj.data = xAxis
            xAxisObj.axisLabel.rotate = 30

            let yAxisObj = this.bar.yAxis
            yAxisObj.type = 'value'
            let seriesObj = {
              data: yAxis,
              type: 'bar'
            }
            seriesObj = Object.assign(seriesObj, this.bar.series)
            const gridObj = this.bar.grid

            option = {
              backgroundColor: this.bar.backgroundColor,
              color: this.bar.color,
              title: titleObj,
              legend: legendObj,
              grid: gridObj,
              tooltip: tooltipObj,
              xAxis: xAxisObj,
              yAxis: yAxisObj,
              series: [seriesObj]
            };
            // 使用刚指定的配置项和数据显示图表。
            shenqingxinxiChart1.setOption(option);

            //根据窗口的大小变动图表
            window.onresize = function () {
              shenqingxinxiChart1.resize();
            };
          }
        });
      })
    },


    getjianzhipingjiaCount() {
      this.$http({
        url: `jianzhipingjia/count`,
        method: "get"
      }).then(({
                 data
               }) => {
        if (data && data.code == 0) {
          this.jianzhipingjiaCount = data.data
        }
      })
    },
// 1234 饼2
    jianzhipingjiaChat1() {
      this.$nextTick(() => {

        var jianzhipingjiaChart1 = echarts.init(document.getElementById("jianzhipingjiaChart1"), 'macarons');
        this.$http({
          url: "jianzhipingjia/group/pingfenxinxi",
          method: "get",
        }).then(({data}) => {
          if (data && data.code === 0) {
            let res = data.data;
            let xAxis = [];
            let yAxis = [];
            let pArray = []
            for (let i = 0; i < res.length; i++) {
              if (this.boardBase && i == this.boardBase.pieNum) {
                break;
              }
              xAxis.push(res[i].pingfenxinxi);
              yAxis.push(parseFloat((res[i].total)));
              pArray.push({
                value: parseFloat((res[i].total)),
                name: res[i].pingfenxinxi
              })
            }
            var option = {};
            let titleObj = this.pie.title
            titleObj.text = '岗位评分统计'

            const legendObj = this.pie.legend
            let tooltipObj = {trigger: 'item', formatter: '{b} : {c} ({d}%)'}
            tooltipObj = Object.assign(tooltipObj, this.pie.tooltip ? this.pie.tooltip : {})

            let seriesObj = {
              type: 'pie',
              radius: ['25%', '55%'],
              center: ['50%', '60%'],
              data: pArray,
              emphasis: {
                itemStyle: {
                  shadowBlur: 10,
                  shadowOffsetX: 0,
                  shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
              }
            }
            seriesObj = Object.assign(seriesObj, this.pie.series)
            const gridObj = this.pie.grid
            option = {
              backgroundColor: this.pie.backgroundColor,
              color: this.pie.color,
              title: titleObj,
              legend: legendObj,
              grid: gridObj,
              tooltip: tooltipObj,
              series: [seriesObj]
            };
            // 使用刚指定的配置项和数据显示图表。
            jianzhipingjiaChart1.setOption(option);

            //根据窗口的大小变动图表
            window.onresize = function () {
              jianzhipingjiaChart1.resize();
            };
          }
        });
      })
    },


  }
};
</script>
<style lang="scss" scoped>
.cardView {
  display: flex;
  flex-wrap: wrap;
  width: 100%;

  .cards {
    display: flex;
    align-items: center;
    width: 100%;
    margin-bottom: 10px;
    justify-content: center;

    .card {
      width: calc(25% - 20px);
      margin: 0 10px;

      /deep/ .el-card__body {
        padding: 0;
      }
    }
  }
}

// 日历
.calendar td .text {
  border: 0px solid rgba(19, 161, 230, .1);
  border-radius: 0px;
  flex-direction: column;
  background: rgba(19, 161, 230, .05);
  display: flex;
  width: 100%;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.calendar td .text:hover {
  background: rgba(19, 161, 230, .2);
}

.calendar td .text .new {
  color: inherit;
  font-size: inherit;
  line-height: 1.4;
}

.calendar td .text .old {
  color: inherit;
  font-size: inherit;
  line-height: 1.4;
}

.calendar td.festival .text {
  border-radius: 0px;
  flex-direction: column;
  background: rgba(19, 161, 230, .2);
  display: flex;
  width: 100%;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.calendar td.festival .text:hover {
  background: rgba(19, 161, 230, .3);
}

.calendar td.festival .text .new {
  color: inherit;
  font-size: inherit;
  line-height: 1.4;
}

.calendar td.festival .text .old {
  color: inherit;
  font-size: inherit;
  line-height: 1.4;
}

.calendar td.other .text {
  border-radius: 0px;
  flex-direction: column;
  background: none;
  display: flex;
  width: 100%;
  font-size: inherit;
  justify-content: center;
  align-items: center;
  opacity: 0.5;
  height: 100%;
}

.calendar td.other .text:hover {
  background: rgba(19, 161, 230, .2);
}

.calendar td.other .text .new {
  color: #000;
  font-size: inherit;
  line-height: 1.4;
}

.calendar td.other .text .old {
  color: #666;
  font-size: inherit;
  line-height: 1.4;
}

.calendar td.today .text {
  border-radius: 0px;
  flex-direction: column;
  color: #fff;
  background: rgba(19, 161, 230, .6);
  display: flex;
  width: 100%;
  justify-content: center;
  align-items: center;
  height: 100%;
}

.calendar td.today .text:hover {
  color: #666;
  background: rgba(19, 161, 230, .3);
}

.calendar td.today .text .new {
  font-size: inherit;
  line-height: 1.4;
}

.calendar td.today .text .old {
  font-size: inherit;
  line-height: 1.4;
}

// echarts1
.type1 .echarts1 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0px 0;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 100%;
}

.type1 .echarts1:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

// echarts2
.type2 .echarts1 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 100%;
}

.type2 .echarts1:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type2 .echarts2 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 100%;
}

.type2 .echarts2:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

// echarts3
.type3 .echarts1 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0;
  color: #333;
  background: rgba(243, 250, 254, .96);
  width: 32%;
  position: relative;
  transition: 0.3s;
  height: 100%;
}

.type3 .echarts1:hover {
  box-shadow: 0px 0px 0px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type3 .echarts2 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0;
  background: rgba(243, 250, 254, .96);
  width: 32%;
  position: relative;
  transition: 0.3s;
  height: 100%;
}

.type3 .echarts2:hover {
  box-shadow: 0px 0px 0px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type3 .echarts3 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0;
  background: rgba(243, 250, 254, .96);
  width: 32%;
  position: relative;
  transition: 0.3s;
  height: 100%;
}

.type3 .echarts3:hover {
  box-shadow: 0px 0px 0px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

// echarts4
.type4 .echarts1 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0px 0 30px;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type4 .echarts1:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type4 .echarts2 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0px 0 30px;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type4 .echarts2:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type4 .echarts3 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0px 0 10px;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type4 .echarts3:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type4 .echarts4 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0px 0 10px;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type4 .echarts4:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

// echarts5
.type5 .echarts1 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0px 0 10px;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type5 .echarts1:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type5 .echarts2 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 0px 0 10px;
  background: rgba(243, 250, 254, .96);
  width: 49%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type5 .echarts2:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type5 .echarts3 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 10px 0 10px;
  background: rgba(243, 250, 254, .96);
  width: 32%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type5 .echarts3:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type5 .echarts4 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 10px 0 10px;
  background: rgba(243, 250, 254, .96);
  width: 32%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type5 .echarts4:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.type5 .echarts5 {
  border: 1px solid #dcf0fb;
  border-radius: 0px;
  padding: 10px;
  margin: 10px 0 10px;
  background: rgba(243, 250, 254, .96);
  width: 32%;
  position: relative;
  transition: 0.3s;
  height: 400px;
}

.type5 .echarts5:hover {
  box-shadow: 1px 1px 20px rgba(255, 255, 255, .12);
  transform: translate3d(0, 0px, 0);
  z-index: 1;
}

.echarts-flag-2 {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  padding: 10px 20px;
  background: rebeccapurple;

  & > div {
    width: 32%;
    height: 300px;
    margin: 10px 0;
    background: rgba(255, 255, 255, .1);
    border-radius: 8px;
    padding: 10px 20px;
  }
}
</style>
