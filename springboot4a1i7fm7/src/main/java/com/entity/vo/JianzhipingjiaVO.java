package com.entity.vo;

import com.entity.JianzhipingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 兼职评价
 * @author 
 * @email 
 * @date 2030-04-26 15:33:18
 */
public class JianzhipingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
