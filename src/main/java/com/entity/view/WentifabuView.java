package com.entity.view;

import com.entity.WentifabuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问题发布
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-25 17:15:52
 */
@TableName("wentifabu")
public class WentifabuView  extends WentifabuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WentifabuView(){
	}
 
 	public WentifabuView(WentifabuEntity wentifabuEntity){
 	try {
			BeanUtils.copyProperties(this, wentifabuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
