package com.wipro.Rest_Assign_2.model;

public class Student {
	
	private String studentId;
	private String studentName;
	private String studentClass;
	private float studentTotalMarks;
	public Student(String studentId, String studentName, String studentClass, float studentTotalMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentTotalMarks = studentTotalMarks;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public float getStudentTotalMarks() {
		return studentTotalMarks;
	}
	public void setStudentTotalMarks(float studentTotalMarks) {
		this.studentTotalMarks = studentTotalMarks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", studentTotalMarks=" + studentTotalMarks + "]";
	}
	
	
	

}
