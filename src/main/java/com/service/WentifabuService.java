package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WentifabuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WentifabuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WentifabuView;


/**
 * 问题发布
 *
 * @author 
 * @email 
 * @date 2020-11-25 17:15:52
 */
public interface WentifabuService extends IService<WentifabuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WentifabuVO> selectListVO(Wrapper<WentifabuEntity> wrapper);
   	
   	WentifabuVO selectVO(@Param("ew") Wrapper<WentifabuEntity> wrapper);
   	
   	List<WentifabuView> selectListView(Wrapper<WentifabuEntity> wrapper);
   	
   	WentifabuView selectView(@Param("ew") Wrapper<WentifabuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WentifabuEntity> wrapper);
   	
}

