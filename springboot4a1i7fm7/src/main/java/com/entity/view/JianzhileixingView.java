package com.entity.view;

import com.entity.JianzhileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 兼职类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2030-04-26 15:33:18
 */
@TableName("jianzhileixing")
public class JianzhileixingView  extends JianzhileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianzhileixingView(){
	}
 
 	public JianzhileixingView(JianzhileixingEntity jianzhileixingEntity){
 	try {
			BeanUtils.copyProperties(this, jianzhileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
