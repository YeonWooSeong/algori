package loop;

import java.util.Scanner;

/*
 * Continue를 이용한 간단한 검색엔진 원리 이해
 */
public class ContinueSearch {
	/*
	 * 검색어 [동해] 가 존재하는지 여부 체크
	 */
	public static void main(String[] args) {
		String dest = "동해물백두산";
		int max = 0;
		boolean isExist = false;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("검색어를 입력하세요. 종료하려면 q을 눌러주세요");
			String search = scanner.next(); //백두
			if (search.equals("q")) {
				return;
			} 
			isExist = false;
			max = dest.length() - search.length(); // 검색어를 뺀 회전수는 의미없다.
			System.out.println(max);
			test: for (int i = 0; i <= max; i++) { 
				int serchCount = search.length(); 
				int deststartPoint = i; // 검색을 마친 후 다음 검색대상 낱말의 위치 
				int searchstarPoint = 0;
				// 동해물백두산
			while (serchCount -- != 0) {
				if (dest.charAt(deststartPoint++) != search.charAt(searchstarPoint++)) {
					continue test;
					}
				}
			isExist = true;
			break test;
		}
			System.out.println(isExist?"검색어["+search+"]존재함":"존재하지 않음");
		}
	}
}

// 닳도록 하느님이 보우하사 우리나라 만세
//
/* char[]chars = '동'+'해'+''+'물';* -> String chars #!$@#% */

// 27 :문법 용어로 "라벨" 이라고 부르며 C언어의 GOTO 문에 테그값에 해당한다.
// 39 : 3항 연산자.(조건문) ? true : false ;  ---->  if else

/*
if(){
	
}else{
	
}

()?
		
		*/

//equals String search 에는 char or equals 를  20
// 써야함. 근데 for 안에는 equals   21
//검색어를 뺀 회전수는 의미없다. (perfoemance를 위한 코딩) 25
//검색어 낱말단위. '동'해'물'백'두'산 = 6  30
// 검색을 마친 후 다음 검색대상 낱말의 위치  31 
// PL  파트 리더.