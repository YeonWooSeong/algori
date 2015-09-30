package loop;
/*
 * 3의 배수르 제외한 1부터 10까지의 정수 출력
 */
public class Continue3multiple {
/*
 * syso = 1 2  4 5  7 8  10 
 */
	public static void main(String[] args) {
	for (int i = 1; i < 11; i++) {
	int a 	= i%3;
		if (a == 0) {
			continue;	
		}
		System.out.println(i);

	}
	}
	
}
//결과값을 제외시키고 실행하라 .  이 결과값을 제외하고 니가 알아서 해.      -> break = 메소드 밖으로 나가기         ->return 처음으로 되돌아가.
// 조건에 맞으면 아래로 진행하지말고 다시 처음에서