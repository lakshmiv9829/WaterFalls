package com.xworkz.waterfalls.dao;

import com.xworkz.waterfalls.entity.WaterFlassEntity;

public interface WaterFallsDAO {
	public void create(WaterFlassEntity entity);
	public void updateHeightAndDepthById (int id,double height,double depth);
	public void deleteById(int id);
	public WaterFlassEntity getById(int id);

}
