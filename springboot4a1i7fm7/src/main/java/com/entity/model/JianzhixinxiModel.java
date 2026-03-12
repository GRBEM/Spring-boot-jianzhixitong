package com.entity.model;

import com.entity.JianzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 兼职信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2030-04-26 15:33:18
 */
public class JianzhixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 兼职类型
	 */
	
	private String jianzhileixing;
		
	/**
	 * 岗位要求
	 */
	
	private String gangweiyaoqiu;
		
	/**
	 * 办公环境
	 */
	
	private String bangonghuanjing;
		
	/**
	 * 岗位性质
	 */
	
	private String gangweixingzhi;
		
	/**
	 * 薪资待遇
	 */
	
	private String xinzidaiyu;
		
	/**
	 * 工作时间
	 */
	
	private String gongzuoshijian;
		
	/**
	 * 上班地点
	 */
	
	private String shangbandidian;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 岗位介绍
	 */
	
	private String gangweijieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 收藏数
	 */
	
	private Integer storeupnum;
				
	
	/**
	 * 设置：兼职类型
	 */
	 
	public void setJianzhileixing(String jianzhileixing) {
		this.jianzhileixing = jianzhileixing;
	}
	
	/**
	 * 获取：兼职类型
	 */
	public String getJianzhileixing() {
		return jianzhileixing;
	}
				
	
	/**
	 * 设置：岗位要求
	 */
	 
	public void setGangweiyaoqiu(String gangweiyaoqiu) {
		this.gangweiyaoqiu = gangweiyaoqiu;
	}
	
	/**
	 * 获取：岗位要求
	 */
	public String getGangweiyaoqiu() {
		return gangweiyaoqiu;
	}
				
	
	/**
	 * 设置：办公环境
	 */
	 
	public void setBangonghuanjing(String bangonghuanjing) {
		this.bangonghuanjing = bangonghuanjing;
	}
	
	/**
	 * 获取：办公环境
	 */
	public String getBangonghuanjing() {
		return bangonghuanjing;
	}
				
	
	/**
	 * 设置：岗位性质
	 */
	 
	public void setGangweixingzhi(String gangweixingzhi) {
		this.gangweixingzhi = gangweixingzhi;
	}
	
	/**
	 * 获取：岗位性质
	 */
	public String getGangweixingzhi() {
		return gangweixingzhi;
	}
				
	
	/**
	 * 设置：薪资待遇
	 */
	 
	public void setXinzidaiyu(String xinzidaiyu) {
		this.xinzidaiyu = xinzidaiyu;
	}
	
	/**
	 * 获取：薪资待遇
	 */
	public String getXinzidaiyu() {
		return xinzidaiyu;
	}
				
	
	/**
	 * 设置：工作时间
	 */
	 
	public void setGongzuoshijian(String gongzuoshijian) {
		this.gongzuoshijian = gongzuoshijian;
	}
	
	/**
	 * 获取：工作时间
	 */
	public String getGongzuoshijian() {
		return gongzuoshijian;
	}
				
	
	/**
	 * 设置：上班地点
	 */
	 
	public void setShangbandidian(String shangbandidian) {
		this.shangbandidian = shangbandidian;
	}
	
	/**
	 * 获取：上班地点
	 */
	public String getShangbandidian() {
		return shangbandidian;
	}
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：岗位介绍
	 */
	 
	public void setGangweijieshao(String gangweijieshao) {
		this.gangweijieshao = gangweijieshao;
	}
	
	/**
	 * 获取：岗位介绍
	 */
	public String getGangweijieshao() {
		return gangweijieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：收藏数
	 */
	 
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
			
}
