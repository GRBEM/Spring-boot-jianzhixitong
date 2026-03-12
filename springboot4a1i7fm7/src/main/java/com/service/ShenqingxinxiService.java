package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingxinxiView;


/**
 * 申请信息
 *
 * @author 
 * @email 
 * @date 2030-04-26 15:33:18
 */
public interface ShenqingxinxiService extends IService<ShenqingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingxinxiVO> selectListVO(Wrapper<ShenqingxinxiEntity> wrapper);
   	
   	ShenqingxinxiVO selectVO(@Param("ew") Wrapper<ShenqingxinxiEntity> wrapper);
   	
   	List<ShenqingxinxiView> selectListView(Wrapper<ShenqingxinxiEntity> wrapper);
   	
   	ShenqingxinxiView selectView(@Param("ew") Wrapper<ShenqingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingxinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShenqingxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShenqingxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShenqingxinxiEntity> wrapper);



}

