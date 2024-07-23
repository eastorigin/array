package com.ktdsuniversity.edu.array;

public class ClassRoom {
	private Student[] students;
	
	public ClassRoom(int studentNumber) {
		students = new Student[studentNumber];
	}
	
	public void addStudent(int studentIndex, Student student) {
		if(studentIndex >= 0 && studentIndex < students.length) {
			students[studentIndex] = student;
		}
	}
	
	public int getSumAllScores() {
		int classSum = 0;
		for(int i = 0; i < students.length; i++) {
			classSum += students[i].getSumAllScores();
		}
		return classSum;
	}
	
	public double getAverage() {
		int totalAverage = 0;
		int classAverage = 0;
		int studentNumber = 0;
		for(int i = 0; i < students.length; i++) {
			totalAverage += students[i].getAverage();
			studentNumber++;
		}
		classAverage = totalAverage / studentNumber;
		return classAverage;
	}
	
	public double getCourseCredit() {
		return (this.getAverage() - 55) /10;
	}
	
	public String getABCDE() {
		if(this.getCourseCredit() >= 4.1) {
			return "A+";
		}else if(this.getCourseCredit() >= 3.6) {
			return "A";
		}else if(this.getCourseCredit() >= 3.1) {
			return "B+";
		}else if(this.getCourseCredit() >= 2.6) {
			return "B";
		}else if(this.getCourseCredit() >= 1.6) {
			return "C";
		}else if(this.getCourseCredit() >= 0.6) {
			return "D";
		}else {
			return "F";
		}
	}
}
