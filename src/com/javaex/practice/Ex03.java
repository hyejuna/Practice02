package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//예상-> 15,19,20:2번 그룹 입니다.  21,100:1번 그룹 입니다.
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		
		age = sc.nextInt();
		
		if(age>20) {
			System.out.println("\"1번 그룹\"");
		} else {
			System.out.println("\"2번 그룹\"");
		}
		
		System.out.println("입니다.");
		sc.close();
	}

	
}
