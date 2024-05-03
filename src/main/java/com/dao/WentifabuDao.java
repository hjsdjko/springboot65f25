package com.dao;

import com.entity.WentifabuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WentifabuVO;
import com.entity.view.WentifabuView;


/**
 * 问题发布
 * 
 * @author 
 * @email 
 * @date 2020-11-25 17:15:52
 */
public interface WentifabuDao extends BaseMapper<WentifabuEntity> {
	
	List<WentifabuVO> selectListVO(@Param("ew") Wrapper<WentifabuEntity> wrapper);
	
	WentifabuVO selectVO(@Param("ew") Wrapper<WentifabuEntity> wrapper);
	
	List<WentifabuView> selectListView(@Param("ew") Wrapper<WentifabuEntity> wrapper);

	List<WentifabuView> selectListView(Pagination page,@Param("ew") Wrapper<WentifabuEntity> wrapper);
	
	WentifabuView selectView(@Param("ew") Wrapper<WentifabuEntity> wrapper);
	
}
