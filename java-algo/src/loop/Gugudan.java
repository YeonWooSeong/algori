package loop;

import java.util.Scanner;

/*
 * 2 x 1 = 2 
 */
public class Gugudan {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
	
			System.out.print("");
			for (int dan = 2; dan < 6; dan++) {
				System.out.print(dan + "x" + (i) + "=" + dan * i + "\t");
			}
			System.out.print("");
			for (int dan = 2; dan < 10; dan++) {   //안쪽이 먼저 돌아가고 바깥쪽이 돌아감.  바깥쪽이 픽스된 상태에서 안쪽이 돔 즉. 안쪽이 다돌고 바깥쪽이 돔.1x23456789 2x23456789
			System.out.print(dan + "x" + (i) + "=" + dan * i + "\t");
			
			}
		System.out.print('\n');
			
	}

	}
}