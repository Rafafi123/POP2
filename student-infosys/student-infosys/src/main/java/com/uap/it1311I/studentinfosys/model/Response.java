package com.uap.it1311I.studentinfosys.model;

public class Response {
	private int studentNum;
	private double averageGrade;
	private String comment;
	
	
	public Response(Request request) {
		int sum = 0;
		double average = 0;
		this.studentNum = request.getStudentNum();
		for (Subject subject:request.getSubject()) {
			sum = sum + subject.getSubjectGrade();
			average = sum / request.getSubject().length;
		}
		this.averageGrade = average;
		if (average >= 85) {
			this.comment = "within maintaining average";
		}else {
			this.comment = "for improvement";
		}
	}
	
	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(int averageGrade) {
		this.averageGrade = averageGrade;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}	
