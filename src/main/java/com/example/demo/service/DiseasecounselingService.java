package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Diseasecounseling;
import com.example.demo.utils.Page;

public interface DiseasecounselingService {
	
	//疾病咨询列表
	public List<Diseasecounseling> selectDiseasecounselingList(Diseasecounseling diseasecounseling);
			
	//疾病咨询数
	public Integer selectDiseasecounselingListCount(Diseasecounseling diseasecounseling);
	
	// 查询疾病咨询列表
	public Page<Diseasecounseling> findDiseasecounselingList(Integer page, Integer rows);
}
