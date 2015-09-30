package loop;
/**
 * do while loop 문법
 */
import java.util.Scanner;

public class DoWhileLoopten {

	public static void main(String[] args) {
		int i = 0;
		do {
			i++;
			System.out.println(i); 
		} while (i<10);
		for (int j = 0; j < 10; j++) {              //for(;;) = for(true)
			System.out.println(j+1);
		}
	}
}

// i <= 10 {11}
// i = 0; // 이 부분을 생략하면 i에 이미 10이 할당된 상태로 아래 for문을 돌기 때문에 1부터 증가하는
// 컨디션을 벗어난다
// di while 과 while 을 알고 있나.
// while 과 for 은 호환이 가능한 문법  // 무한루프 돌릴떄나 while 을 주고  중간값(제한)을 줄 때에는 for 문을 사용한다.