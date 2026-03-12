package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianzhileixingEntity;
import com.entity.view.JianzhileixingView;

import com.service.JianzhileixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 兼职类型
 * 后端接口
 * @author 
 * @email 
 * @date 2030-04-26 15:33:18
 */
@RestController
@RequestMapping("/jianzhileixing")
public class JianzhileixingController {
    @Autowired
    private JianzhileixingService jianzhileixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianzhileixingEntity jianzhileixing,
		HttpServletRequest request){
        EntityWrapper<JianzhileixingEntity> ew = new EntityWrapper<JianzhileixingEntity>();

		PageUtils page = jianzhileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianzhileixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianzhileixingEntity jianzhileixing, 
		HttpServletRequest request){
        EntityWrapper<JianzhileixingEntity> ew = new EntityWrapper<JianzhileixingEntity>();

		PageUtils page = jianzhileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianzhileixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianzhileixingEntity jianzhileixing){
       	EntityWrapper<JianzhileixingEntity> ew = new EntityWrapper<JianzhileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianzhileixing, "jianzhileixing")); 
        return R.ok().put("data", jianzhileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianzhileixingEntity jianzhileixing){
        EntityWrapper< JianzhileixingEntity> ew = new EntityWrapper< JianzhileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianzhileixing, "jianzhileixing")); 
		JianzhileixingView jianzhileixingView =  jianzhileixingService.selectView(ew);
		return R.ok("查询兼职类型成功").put("data", jianzhileixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianzhileixingEntity jianzhileixing = jianzhileixingService.selectById(id);
        return R.ok().put("data", jianzhileixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianzhileixingEntity jianzhileixing = jianzhileixingService.selectById(id);
        return R.ok().put("data", jianzhileixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianzhileixingEntity jianzhileixing, HttpServletRequest request){
        if(jianzhileixingService.selectCount(new EntityWrapper<JianzhileixingEntity>().eq("jianzhileixing", jianzhileixing.getJianzhileixing()))>0) {
            return R.error("兼职类型已存在");
        }
    	//ValidatorUtils.validateEntity(jianzhileixing);
        jianzhileixingService.insert(jianzhileixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianzhileixingEntity jianzhileixing, HttpServletRequest request){
        if(jianzhileixingService.selectCount(new EntityWrapper<JianzhileixingEntity>().eq("jianzhileixing", jianzhileixing.getJianzhileixing()))>0) {
            return R.error("兼职类型已存在");
        }
    	//ValidatorUtils.validateEntity(jianzhileixing);
        jianzhileixingService.insert(jianzhileixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianzhileixingEntity jianzhileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianzhileixing);
        if(jianzhileixingService.selectCount(new EntityWrapper<JianzhileixingEntity>().ne("id", jianzhileixing.getId()).eq("jianzhileixing", jianzhileixing.getJianzhileixing()))>0) {
            return R.error("兼职类型已存在");
        }
        jianzhileixingService.updateById(jianzhileixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianzhileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
