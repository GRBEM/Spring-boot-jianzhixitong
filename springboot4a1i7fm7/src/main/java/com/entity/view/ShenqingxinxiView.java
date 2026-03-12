package com.entity.view;

import com.entity.ShenqingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 申请信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-04-26 15:33:18
 */
@TableName("shenqingxinxi")
public class ShenqingxinxiView  extends ShenqingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingxinxiView(){
	}
 
 	public ShenqingxinxiView(ShenqingxinxiEntity shenqingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
