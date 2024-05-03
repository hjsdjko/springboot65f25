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


import com.dao.WentifabuDao;
import com.entity.WentifabuEntity;
import com.service.WentifabuService;
import com.entity.vo.WentifabuVO;
import com.entity.view.WentifabuView;

@Service("wentifabuService")
public class WentifabuServiceImpl extends ServiceImpl<WentifabuDao, WentifabuEntity> implements WentifabuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WentifabuEntity> page = this.selectPage(
                new Query<WentifabuEntity>(params).getPage(),
                new EntityWrapper<WentifabuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WentifabuEntity> wrapper) {
		  Page<WentifabuView> page =new Query<WentifabuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WentifabuVO> selectListVO(Wrapper<WentifabuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WentifabuVO selectVO(Wrapper<WentifabuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WentifabuView> selectListView(Wrapper<WentifabuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WentifabuView selectView(Wrapper<WentifabuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
