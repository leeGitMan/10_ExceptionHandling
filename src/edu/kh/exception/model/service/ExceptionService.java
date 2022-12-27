package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	Scanner sc = new Scanner(System.in);
	

	
	// 예외(Exception) : 소스코드로 처리가 가능한 오류
	
	// 예외는 2종류로 구분
	
	// Unchecked Exception --> 선택적으로 예외 처리하는 것
	
	// Checked Exception --> 필수적으로 예외 처리하는 것
	
	
	
	

	
	public void ex1() {
		
		System.out.println("두 정수를 입력 받아 나누기 한 몫을 출력");
		System.out.println();
		
		
		
		System.out.print("1. 수를 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("2. 수를 입력 : ");
		int b = sc.nextInt();
		
		
		
		
		
		
		
		// try - catch 예외 처리
		// try { } : 괄호 내부에 예외가 발생할 가능성이 있는 코드를 작성한 후 시도.
		// catch(예외) { } : try 구문에서 발생한 예외를 잡아내서 처리하여,
		//					프로그램이 비정상 종료되지 않도록 한다.
		
		try {
			int c = a / b;
			System.out.println("결과 " + c);
			// 산술적 예외
			
		}catch(Exception e) {
			System.out.println("ㅋㅋ 예외 발생 예외 발생 ㅋㅋ");
		}
		
		
		
		/*
		 * try{
		 * int c = a / b;
		 * System.out.println("결과 : " + c)
		 * 
		 * }catch(ArithmeticException e){
		 * 		System.out.println("예외발생!");
		 * }
		 */

		// 발생하는 예외 중 일부 예외는 try - catch 구문을 사용하지 않아도
		// 예외 상황 방지가 가능하다!
		// 여기서 말하는 일부 예외는 Unchecked Exception이다.
	}	
	
	public int inputNumber() {
		int num = 0;
		
		
		
		while(true) {
			
			try {
				System.out.print("정수 입력하세요 : ");
				num = sc.nextInt();
				
				break;
				
			}catch(InputMismatchException e) { // 잘못 입력
				System.out.println("잘못 입력하셨습니다. 정수만 입력하세요.");
				sc.nextLine(); // 버퍼에 남아있는 잘못 입력된 문자열 제거
			}
				
			
		}		
		return num; // break-->while에 탈출 조건이 없으면 return까지 닿을 수 없으므로
					// 에러가 난다
		
	}
	public void ex2() {
		
		// 정수를 입력 받아 반환하는 메서드
		// 정수 3개를 입력받아 3개의 합계 구하기
		
		int sum = 0;
		
		for(int i = 0; i<3; i++) {
			sum += inputNumber();
			
		}
		System.out.println("합계 : " + sum);
		
	}
	
	
	public void ex3() {
		
		// 여러가지 예외에 대한 처리 방법
		// 산술적 오류가 나게 할 것이다.
		
		
		
		// 여기서 발생 가능한 예외로는 InputMismatchException, ArithmeticException
		
		try {
			
			System.out.print("정수 입력 1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수 입력 2 : ");
			int num2 = sc.nextInt();
			
			System.out.println("나누기 결과 : " + num1 / num2);
			
			// 관계 없는 에외는 순서 관계 없이 catch문에 작성하면 된다
			
			// ***************************************
			
			//  강제로 NullPointerException 발생
			//  * NullPointerException : 참조하지 않은  참조변수를 
			//  이용해서 코드를 수행할 때 발생
			
			String str = null;
			
			System.out.println(str.charAt(0));
			
			// ***************************************
			
			
			
			
			
			
			
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력하셈.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다.");
		}catch(Exception e) {
			
			// 예외 처리 + 다형성이 묶여있다
			// Exception 클래스는 모든 예외의 최상위 부모
			// 부모 타입 참조 변수로 자식객체를 참조하고 있는 상황(다형성 - 업캐스팅)
			
			// ** 상위 타입의 예외 클래스를 catch문에 작성하면
			// 	  다형성 업캐스팅에 의해 모두 잡아서 처리! **
			// catch문 연속 작성 시, Exception 상속 구조 주의!
			// ==> Exception을 맨 위에 쓰면 밑에 있는 자식 까지 닿지 않는 예외가 발생
			// 맨 밑에 두자
			System.out.println("뭔지 모르겠는데 예외 발생!! 얼른 고치세여.");
		}

	}
	
	
	
	public void ex4() {
		
		// try - catch - finally
		// finally : try 구문에서 예외가 발생하든 말든 무조건 마지막에 수행
		
		try {
			System.out.println( 4 / 0); // ArithmeticException 발생
		}catch(ArithmeticException e) {
			System.out.println("예외 처리 됨");
			
			// catch 매개변수 활용 (e)
			
			// 매개변수 e : ㅇ뎨외 관련 정보 + 예외 관련 기능
			
			System.out.println(e.getClass()); // 어떤 예외 클래스인가? 알려줌
			System.out.println(e.getMessage()); // 예외 발생 시 출력된 내용 보여줌
			System.out.println(e); // --> e.toString()과 똑같다.
			
			e.printStackTrace(); // 예외가 발생하기까지의 모든 메서드 흐름 출력
								 // 어디서부터 예외가 발생했는지 알려줌
		}finally { // 무조건 수행됨
			System.out.println("배가 고프다");
		}
	}
	
	
	public void ex5() {
		
		try {
			methodA();
		}catch(Exception e) {
			// Exception: 모든 예외의 최상위 부모
			// Exception이 catch 매개변수로 작성되었다 --> 예외 종류 상관없이 모두 처리
			System.out.println("예외 처리 됨.");
			
			e.printStackTrace();
			// 발생한 예외가 메서드와 위치에 대한 모든 내용 출력
			// - 예외 발생지점 추적 가능
			
		}
	}
	
	public void methodA() throws IOException {
		
		methodB();
		
		
	}
	
	public void methodB() throws IOException {
		
		methodC();
		
		
	}
	
	public void methodC() throws IOException{
		
		// IOException 예외 강제 발생 시키는 방법 (throw)
		throw new IOException(); 
		
		// 발생한 예외처리 방법
		// 1) try ~ catch()문 처리 방법
		// 2) throws를 통해 호출한 메서드로 위임해서 처리하는 방법
	}
	
	
}
