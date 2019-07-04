package com.example.demo.domain;

	/*
	 * 疾病咨询
	 */
public class Diseasecounseling {
	
	private int id;			//编号
	
	private String title;	//标题
	
	private String content;	//内容
	
	private String image;	//图片
	
	private Integer start;  // 起始行
	
	private Integer rows;   // 所取行数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
