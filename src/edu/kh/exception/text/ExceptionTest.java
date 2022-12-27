package edu.kh.exception.text;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// int a = 99.9; // 컴파일 에러 --> 개발자가 코드 잘못 씀
		// 코드로 수정 가능한 경우
		// 강제 형변환 or 더블형태로 바꾸기 or 값을 바꾸기
		
		int a = (int) 99.9;
		
		
		// Run 타임 에러 유배럴 런런런런런런런
		
		
		/*
		while(true) {
			// 무겐 츠쿠요미
			// 0 입력 시 멈추게 해야함
			// if 문을 쓰고, break;
			System.out.print("입력하세요(0 입력 시, 종료) : ");
			int input = sc.nextInt();
			
			// 탈출구문
			if(input == 0) break;
		}
		System.out.println("종료 되었습니다.");
		 런타임 에러 : 프로그램 수행중 발생하는 에러
		  주로 if문으로 처리가 가능하다. */
		
		
		
		int[]arr = new int[3]; // 0,1,2 --> index
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		if(arr.length <= 3) {
			System.out.println("배열 범위 초과!");
		}
		else {
			arr[3] = 40;
		}
		//  ArrayIndexOutOfBoundsException: 배열 초과 범위 에외
		// ==> 배열에서 부적절한 인덱스에 접근하려고 할 때 발생될 수 있는 예외
		
		// NegativeArraySizeException : 배열에 음수의 크기일 때 발생 예외
		// 배열의 크기로 음수를 제시했을 때, 발생될 수 있는 예외
		
		// ArithmeticException : 산술적 예외
		// by zero ==> 0으로 나눌 수 없다
		
		// 이거 다 외우기
		
			
	}
}
