package example.conditional;

import java.util.Scanner;

public class Conditioanl {
	public void testIf() {
	//*제어문
	// 1.조건문
	// 프로그램 수행 흐름을 바꾸는 역할을 하는 제어문 중 하나로 조건에 따라 다른 문장이 수행되도록 함
	// 조건문의 종류 : if문, switch문
	
	// 1월 ~ 12월 계절 분류 (1,2,12 = 겨울 / 3,4,5 = 봄 / 6,7,8 = 여름 / 9,10,11 = 가을)
	
//	Scanner sc = new Scanner(System.in);
//	System.out.print("알고싶은 계절의 월을 입력하세요 : ");
//	int month = sc.nextInt();
//	
//	if(month == 1 || month == 2 || month == 12) {
//		System.out.println("겨울 입니다.");
//	} else if(month == 3 || month == 4 || month == 5) {
//		System.out.println("봄 입니다.");
//	} else if(month == 6 || month == 7 || month == 8) {
//		System.out.println("여름 입니다.");
//	} else if(month == 9 || month == 10 || month == 11) {
//		System.out.println("가을 입니다.");
//	} else {
//		System.out.println("해당하는 계절이 없습니다.");
//	}
	
	int kor = 98;
	int math = 55;
	int eng = 68;

	int sum = kor + math + eng;
	double avg = sum / 3; // 정수형 int에서 실수형 double로의 형변환이 자동으로 이루어 진다 (double형이 더 표현범위가 넓기 때문)
	
	System.out.println("합계 : " + sum);
	System.out.println("평균 : " + avg);
	
	//if
	if(avg >= 60) {
		System.out.println("합격");
	} else {
		System.out.println("불합격");
	}
	
	//if - else if - else
	if(avg >= 60) {
		System.out.println("합격");
	} else if(avg >= 40) {
		System.out.println("보충수업");
	} else {
		System.out.println("불합격");
	}
	//중첩 if문
	String grade = "";
	if(kor >= 80) {
		grade = "A";
		if(kor >= 95) {
			grade += "+";
		} else if(kor >= 85) {
			grade += "0";
		} else {
			grade += "-";
		}
	} else if(kor >= 60) {
		grade = "B";
		if(kor >= 75) {
			grade += "+";
		} else if(kor >= 65) {
			grade += "0";
		} else {
			grade += "-";
		}
	} else {
		grade = "C";
		if(kor >= 55) {
			grade += "+";
		} else if(kor >= 45) {
			grade += "0";
		} else {
			grade += "-";
		}
	}
	System.out.println("국어 성적은 " + grade + " 입니다.");
	}
	
	public void testSwitch() {
		/* *switch문
		 *  조건식 하나로 많은 경우의 수를 처리할때 사용하며,
		 *  이때 조건식의 결과는 정수 또는 문자, 문자열로
		 *  조건식의 결과 값과 일치하는 case문으로 이동하며,
		 *  default문은 일치하는 case문이 없을 때 수행 (= else)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름 입력 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		switch(fruit) {
		case "귤" :
			price = 500;
			break;
		case "사과" :
			price = 1000;
			break;
		case "배" :
			price = 2000;
			break;
		default :
			System.out.println("해당하는 과일이 없습니다.");
		}
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}
}
