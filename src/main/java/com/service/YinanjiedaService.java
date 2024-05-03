package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinanjiedaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinanjiedaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinanjiedaView;


/**
 * 疑难解答
 *
 * @author 
 * @email 
 * @date 2020-11-25 17:15:52
 */
public interface YinanjiedaService extends IService<YinanjiedaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinanjiedaVO> selectListVO(Wrapper<YinanjiedaEntity> wrapper);
   	
   	YinanjiedaVO selectVO(@Param("ew") Wrapper<YinanjiedaEntity> wrapper);
   	
   	List<YinanjiedaView> selectListView(Wrapper<YinanjiedaEntity> wrapper);
   	
   	YinanjiedaView selectView(@Param("ew") Wrapper<YinanjiedaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinanjiedaEntity> wrapper);
   	
}

