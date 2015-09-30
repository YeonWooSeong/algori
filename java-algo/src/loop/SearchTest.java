package loop;

import java.util.Scanner;

/**
 * 특정 글자의 갯수 구하기.
 */
public class SearchTest {
/*
 * [결과]
 * 제시된 문장에서 특정 알파벳 존재 갯구.
 * "p는 9개 존재합니다 " 로 출력됨.
 */
	
	public static void main(String[] args) {

		String dest = "peter piper picked a peck of pickled perperes";
		int pCount =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("글을 입력하세요.");
		String word = scanner.next();
		for (int i = 0; i < args.length; i++) {
			if (dest.charAt(i) == word.charAt()) {
				System.out.println("제시된 문자열에서 p 는"+pCount+"개 존재합니다.");
			}
			
			
		
			}
		
		
		
		

	}
	
}
