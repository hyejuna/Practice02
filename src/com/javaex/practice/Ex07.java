package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		
		int num2 = sc.nextInt();
		int quotient, remainder;
		if(num1>num2) {
			quotient = num1 / num2;
			remainder = num1 % num2;
		} else {
			quotient = num2 / num1;
			remainder = num2 % num1;
		}
		
		System.out.println("몫: "+ quotient);
		System.out.println("나머지: "+remainder);
		
		sc.close();

	}

}
