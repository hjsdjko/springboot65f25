package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YinanjiedaDao;
import com.entity.YinanjiedaEntity;
import com.service.YinanjiedaService;
import com.entity.vo.YinanjiedaVO;
import com.entity.view.YinanjiedaView;

@Service("yinanjiedaService")
public class YinanjiedaServiceImpl extends ServiceImpl<YinanjiedaDao, YinanjiedaEntity> implements YinanjiedaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinanjiedaEntity> page = this.selectPage(
                new Query<YinanjiedaEntity>(params).getPage(),
                new EntityWrapper<YinanjiedaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinanjiedaEntity> wrapper) {
		  Page<YinanjiedaView> page =new Query<YinanjiedaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinanjiedaVO> selectListVO(Wrapper<YinanjiedaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinanjiedaVO selectVO(Wrapper<YinanjiedaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinanjiedaView> selectListView(Wrapper<YinanjiedaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinanjiedaView selectView(Wrapper<YinanjiedaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
