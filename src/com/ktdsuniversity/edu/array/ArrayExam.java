package com.ktdsuniversity.edu.array;

public class ArrayExam {

	public static void main(String[] args) {
		
		int[] scoreArray = new int[7];
		System.out.println(scoreArray); // [I@16022d9d : 인트 배열이고 메모리 주소는 16022d9d이다
		
		// 배열 인덱스에 값 할 당
		scoreArray[0] = 10;
		scoreArray[1] = 20;
		scoreArray[2] = 30;
		scoreArray[3] = 30;
		scoreArray[4] = 50;
		scoreArray[5] = 60;
		scoreArray[6] = 70;
		
		// 배열을 탐색하면서 출력하고 합계를 구하기
		int sum = 0; // 합계
//		sum += scoreArray[0];
//		sum += scoreArray[1];
//		sum += scoreArray[2];
//		sum += scoreArray[3];
//		sum += scoreArray[4];
//		sum += scoreArray[5];
//		sum += scoreArray[6];
		
		for(int i = 0; i < scoreArray.length; i++) {
			System.out.println("scoreArray[" + i + "] : " + scoreArray[i]);
			sum += scoreArray[i];
		}
		
		System.out.println("합계: " + sum);
		
		double average = sum / (double) scoreArray.length;
		System.out.println("평균: " + average);
		
//		String[] nameArray = new String[7];
//		System.out.println(nameArray); // [Ljava.lang.String;@7e9a5fbe
	}
}
