package com.ktdsuniversity.edu.array;

public class Student {

	public final int SUBJECT_NUMBER = 4;
	private int java;
	private int python;
	private int cpp;
	private int cssharp;
	
	public Student(int java, int python, int cpp, int cssharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.cssharp = cssharp;
	}
	
	public int getSumAllScores() {
		return this.java + this.python + this.cpp + this.cssharp;
	}
	
	public double getAverage() {
		return this.getSumAllScores() / (double) this.SUBJECT_NUMBER;
	}
	
	public double getCourseCredit() {
		return (this.getAverage() - 55) / 10;
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
