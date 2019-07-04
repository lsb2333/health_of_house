package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Diseasecounseling;

@Mapper
public interface DiseasecounselingMapper {

	//疾病咨询列表
	public List<Diseasecounseling> selectDiseasecounselingList(Diseasecounseling diseasecounseling);
			
	//疾病咨询数
	public Integer selectDiseasecounselingListCount(Diseasecounseling diseasecounseling);
}
