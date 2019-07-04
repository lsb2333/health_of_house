package com.example.demo.domain;
	
	/*
	 * 健康管理
	 */
public class Management {
	
	private int id;				//编号
	
	private char sex;			//性别
	
	private String height;		//身高
	
	private String weight;		//正常体重
	
	private String pressure;	//正常血压
	
	private String sight;		//正常视力
	
	private Integer start;      // 起始行
	
	private Integer rows;       // 所取行数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getSight() {
		return sight;
	}

	public void setSight(String sight) {
		this.sight = sight;
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
