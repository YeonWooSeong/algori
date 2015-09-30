package rps;

// 서비스 구현 객체
public class GameRpsServiceImpl implements gameRpsService {
	GameRps game = new GameRps();

	@Override
	public String getResult(int a) {
		String result = "";
		switch (a) {
		case 1:
			result = "승리";
			break;
		case 2:
			result = "패배";
			break;
		case 3:
			result = "비김";
			break;
		default:
			break;
		}
		return result; //결과를 나타내는 
	}

	// 두 값을 받아서 가위 바위 보 승부
	@Override
	public String playGame(int a, int b) { // 사용자 a 컴 b
		int win = 0, c = 0;
		if (a==b) {
			return getResult(3);
		}
		c = Math.abs(a - b);
		switch (c) {
		case 1:
			win = (a > b) ? a : b;
			break;
		case 2:
			win = (a > b) ? b : a;
			break;
		default:
			break;
		}
		String winner = (win == a) ? "당신" : "컴퓨터";
		game.setRpsValue(a);
		String userRPS = game.getRpsValue();
		game.setRpsValue(b);
		String comRPS = game.getRpsValue();

		return "컴퓨터는"+ comRPS+" 냈고" +" 당신은" + userRPS + "냈습니다" +" 따라서"+ winner+ "가 이겼습니다.";
	}

}

// 승리 패배 비김 의 세개의 결과를 준다.