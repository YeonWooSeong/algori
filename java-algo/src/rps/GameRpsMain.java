package rps;

import java.util.Scanner;
/*
 * /*System.out.println("컴퓨터는 바위를 냈고  당신은 보자기를 냈습니다  따라서 당신이 이겼고 컴퓨터가 졌습니다.");
 */
public class GameRpsMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("가위 바위 보 게임을 시작합니다.");
	GameRps game = new GameRps();
	gameRpsService service = new GameRpsServiceImpl(); // 깊은 복사 (deep copy)
	GameRpsValidation valid = new GameRpsValidation();
	int start =1 , limit = 3;
	while (true) { //무한루프
		System.out.println("가위 :1  바위 :2  보 :3  을 입력하세요");
		int userval =scanner.nextInt();
		if (userval<start||userval>limit) {
			System.out.println(valid.showRange(start,limit));
			continue;
		}
		game.setComval();
		System.out.println(service.playGame(userval, game.getComval()));
		}
	}	 
}

