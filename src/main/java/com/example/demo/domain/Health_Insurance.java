package com.example.demo.domain;


	/*
	 * 医保表
	 */
public class Health_Insurance {
	
	private int id;				//编号
	
	private String student_no;	//学号
	
	private String username;		//姓名
	
	private String dept;		//系别
	
	private String grade;		//年级
	
	private String major;		//专业
	
	private String glass;		//班级
	
	private String card_no;		//医保卡号
	
	private String id_no;		//身份证卡号
	
	private String mobile;		//电话
	
	private String start_date;	//开始日期
	
	private String end_date;	//结束日期
	
	private String hi_status;	//状态
	
	private Integer start;      // 起始行
	
	private Integer rows;       // 所取行数

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent_no() {
		return student_no;
	}

	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGlass() {
		return glass;
	}

	public void setGlass(String glass) {
		this.glass = glass;
	}

	public String getCard_no() {
		return card_no;
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getHi_status() {
		return hi_status;
	}

	public void setHi_status(String hi_status) {
		this.hi_status = hi_status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
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
