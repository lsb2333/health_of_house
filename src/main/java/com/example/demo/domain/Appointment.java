package com.example.demo.domain;


/*
	 * 预约挂号
	 */
public class Appointment {
	
	private int id;					//编号
	
	private String username;		//姓名
	
	private String treatmenttime;	//就诊日期
	
	private String diseasetime;		//发病时间
	
	private String symptom;			//病症
	
	private String status;			//状态
	
	private Integer start;      	// 起始行
	
	private Integer rows;       	// 所取行数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTreatmenttime() {
		return treatmenttime;
	}

	public void setTreatmenttime(String treatmenttime) {
		this.treatmenttime = treatmenttime;
	}

	public String getDiseasetime() {
		return diseasetime;
	}

	public void setDiseasetime(String diseasetime) {
		this.diseasetime = diseasetime;
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

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
