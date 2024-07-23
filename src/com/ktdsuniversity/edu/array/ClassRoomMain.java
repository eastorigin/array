package com.ktdsuniversity.edu.array;

public class ClassRoomMain {

	public static void main(String[] args) {
		ClassRoom classRoom = new ClassRoom(3);
		classRoom.addStudent(0, new Student(100, 100, 100, 100));
		classRoom.addStudent(1, new Student(100, 100, 100, 100));
		classRoom.addStudent(2, new Student(100, 100, 100, 100));
		
		int sumScore = classRoom.getSumAllScores();
		double average = classRoom.getAverage();
		double courseCredit = classRoom.getCourseCredit();
		String grade = classRoom.getABCDE();
		
		System.out.println("합계: " + sumScore);
		System.out.println("평균: " + average);
		System.out.println("학점: " + courseCredit);
		System.out.println("등급: " + grade);
	}
}
