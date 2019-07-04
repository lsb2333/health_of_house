package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Physicians;

@Mapper
public interface PhysiciansMapper {

	//医师讲解列表
	public List<Physicians> selectPhysiciansList(Physicians physicians);
			
	//医师讲解数
	public Integer selectPhysiciansListCount(Physicians physicians);
}
