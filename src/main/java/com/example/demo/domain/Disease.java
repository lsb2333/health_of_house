package com.example.demo.domain;
	
	/*
	 * 疾病表
	 */
public class Disease {
	
	private int id;				//编号
	
	private String image;		//图片
	
	private String username;	//名称
	
	private String describes;	//描述
	
	private Integer start;      // 起始行
	
	private Integer rows;       // 所取行数

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
