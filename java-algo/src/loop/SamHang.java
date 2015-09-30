package loop;

import java.util.Scanner;

/**
 * @file_name : IfTest.java
 * @author : pheonix0717@naver.com
 * @date : 2015. 9. 17.
 * @story : 성적표 프로그램
 */
public class SamHang {
	/*
	 * To. 개발자님 프로그램 하나 개발해야 합니다. 오더는 다음과 같이 화면에 출력하라고 합니다. 학생 국어 영어 수학 총점 평균
	 * 합격여부 ========================================================== 홍길동 90 90
	 * 90 270 90 (장학생) 합격여부는 다음과 같다고 합니다. 평균이 90점 이상이면 장학생 70점 이상 90점 미만이면 합격
	 * 70점 미만이면 불합격이라고 하네요. 단) 평균에서 소수점 이하는 절삭입니다.
	 */
	public static void main(String[] args) 
	{
		System.out.println("이름을 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력 : ");
		int korea = scan.nextInt();
		
		System.out.println("영어 점수를 입력 : ");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수를 입력 : ");
		int math = scan.nextInt();
		
		int sum = korea + eng + math;
		int avg = (int) (sum / 3);
		
		String asd = null;
		 String result = (avg >= 70)? "합격":"불합격";
		
		
		System.out.println("학생    국어  영어  수학  총점  평균  합격여부");
		System.out.println("================================================================");
		System.out.println(name+"    "+korea+"    "+eng+"    "+math+"    "+sum+"    "+avg+"      "+asd);
		
	}
}
/*
 * 삼항 연산자 예문
boolean flag = (true)?true:false;
String str = (true) ? "참" : "거짓";
int a = (true) ? 1:0;
*/