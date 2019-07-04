package com.example.demo.domain;

	/*
	 * 医生讲解
	 */
public class Physicians {
	
	private int id;			//编号
	
	private String content; //内容
	
	private String image;	//图片
	
	private String username;//医师名
	
	private String hospital;//医师医院
	
	private Integer start;  //起始行
	
	private Integer rows;   // 所取行数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
