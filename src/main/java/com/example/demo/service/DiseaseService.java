package com.example.demo.service;

import java.util.List;
import com.example.demo.domain.Disease;
import com.example.demo.utils.Page;

public interface DiseaseService {
	
	//医师讲解列表
	public List<Disease> selectDiseaseList(Disease disease);
			
	//医师讲解数
	public Integer selectDiseaseListCount(Disease disease);
	
	// 查询医师讲解列表
	public Page<Disease> findDiseaseList(Integer page, Integer rows);
	
}
