package com.dao;

import com.entity.YinanjiedaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinanjiedaVO;
import com.entity.view.YinanjiedaView;


/**
 * 疑难解答
 * 
 * @author 
 * @email 
 * @date 2020-11-25 17:15:52
 */
public interface YinanjiedaDao extends BaseMapper<YinanjiedaEntity> {
	
	List<YinanjiedaVO> selectListVO(@Param("ew") Wrapper<YinanjiedaEntity> wrapper);
	
	YinanjiedaVO selectVO(@Param("ew") Wrapper<YinanjiedaEntity> wrapper);
	
	List<YinanjiedaView> selectListView(@Param("ew") Wrapper<YinanjiedaEntity> wrapper);

	List<YinanjiedaView> selectListView(Pagination page,@Param("ew") Wrapper<YinanjiedaEntity> wrapper);
	
	YinanjiedaView selectView(@Param("ew") Wrapper<YinanjiedaEntity> wrapper);
	
}
