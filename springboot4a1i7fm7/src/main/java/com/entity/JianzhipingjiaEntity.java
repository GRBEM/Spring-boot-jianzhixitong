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
 * 兼职评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2030-04-26 15:33:18
 */
@TableName("jianzhipingjia")
public class JianzhipingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JianzhipingjiaEntity() {
		
	}
	
	public JianzhipingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 评价名称
	 */
					
	private String pingjiamingcheng;
	
	/**
	 * 岗位名称
	 */
					
	private String gangweimingcheng;
	
	/**
	 * 评价图片
	 */
					
	private String pingjiatupian;
	
	/**
	 * 评分信息
	 */
					
	private String pingfenxinxi;
	
	/**
	 * 评价信息
	 */
					
	private String pingjiaxinxi;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 评价日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pingjiariqi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	
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
	 * 设置：评价名称
	 */
	public void setPingjiamingcheng(String pingjiamingcheng) {
		this.pingjiamingcheng = pingjiamingcheng;
	}
	/**
	 * 获取：评价名称
	 */
	public String getPingjiamingcheng() {
		return pingjiamingcheng;
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
	 * 设置：评价图片
	 */
	public void setPingjiatupian(String pingjiatupian) {
		this.pingjiatupian = pingjiatupian;
	}
	/**
	 * 获取：评价图片
	 */
	public String getPingjiatupian() {
		return pingjiatupian;
	}
	/**
	 * 设置：评分信息
	 */
	public void setPingfenxinxi(String pingfenxinxi) {
		this.pingfenxinxi = pingfenxinxi;
	}
	/**
	 * 获取：评分信息
	 */
	public String getPingfenxinxi() {
		return pingfenxinxi;
	}
	/**
	 * 设置：评价信息
	 */
	public void setPingjiaxinxi(String pingjiaxinxi) {
		this.pingjiaxinxi = pingjiaxinxi;
	}
	/**
	 * 获取：评价信息
	 */
	public String getPingjiaxinxi() {
		return pingjiaxinxi;
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
	 * 设置：评价日期
	 */
	public void setPingjiariqi(Date pingjiariqi) {
		this.pingjiariqi = pingjiariqi;
	}
	/**
	 * 获取：评价日期
	 */
	public Date getPingjiariqi() {
		return pingjiariqi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}

}
