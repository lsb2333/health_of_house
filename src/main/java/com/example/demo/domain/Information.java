package com.example.demo.domain;


/*
	 * 通知信息表
	 */
public class Information {
	
	private int id;				//编号
	
	private String namespace;	//名称
	
	private String info;		//通知信息
	
	private String infotime;	//通知时间
	
	private Integer start;  	// 起始行
	
	private Integer rows;   	// 所取行数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfotime() {
		return infotime;
	}

	public void setInfotime(String infotime) {
		this.infotime = infotime;
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
