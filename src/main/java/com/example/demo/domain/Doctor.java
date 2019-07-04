package com.example.demo.domain;

	/*
	 * 医生信息表
	 */
public class Doctor {
	
	private int id;     					//编号
	
	private String image;                   //头像
	
	private String username;                    //姓名
	
	private String section;                 //科类
	
	private String describes;                //个人描述
	
	private String recommendation;          //推荐指数
	
	private int years;                        //从医时间
	
	private Integer start;      			// 起始行
	
	private Integer rows;       			// 所取行数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	
}
