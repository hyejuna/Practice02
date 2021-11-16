package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력새주세요");
		System.out.print("사번: ");
		int num = sc.nextInt();
		int re = num%3;
		if(num>0) {
			switch(re) {
				case 0:
					System.out.println("A팀 입니다.");
					break;
				case 1:
					System.out.println("B팀 입니다.");
					break;
				default:
					System.out.println("C팀 입니다.");
					break;		
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		sc.close();

	}

}
