package loop;

import java.util.Scanner;

/**
 * 구구단. syso(2x1= 2)
 */
public class GugudanWhatsDan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단. 입력");
		int dan = scanner.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "x" + (i) + "=" + dan * i);
		}

	}
}
