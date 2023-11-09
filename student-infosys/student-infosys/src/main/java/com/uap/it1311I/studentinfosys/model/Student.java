package com.uap.it1311I.studentinfosys.model;

public class Student {
	private String studentName;
	private int studentNum;
	private Subject[] subject;
	
		public String getStudentName() {
			return studentName;
		}
	
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getStudentNum() {
			return studentNum;
		}

		public void setStudentNum(int studentNum) {
			this.studentNum = studentNum;
		}

		public Subject[] getSubject() {
			return subject;
		}

		public void setSubject(Subject[] subject) {
			this.subject = subject;
		} 
}
