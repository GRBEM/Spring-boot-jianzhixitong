package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 兼职信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2030-04-26 15:33:18
 */
@TableName("jianzhixinxi")
public class JianzhixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianzhixinxiEntity() {
		
	}
	
	public JianzhixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String sfsh;
	private String shhf;
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 岗位名称
	 */
					
	private String gangweimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：岗位名称
	 */
	public void setGangweimingcheng(String gangweimingcheng) {
		this.gangweimingcheng = gangweimingcheng;
	}
	/**
	 * 获取：岗位名称
	 */
	public String getGangweimingcheng() {
		return gangweimingcheng;
	}
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

	public String getSfsh() {
		return sfsh;
	}

	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}

	public String getShhf() {
		return shhf;
	}

	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
}
