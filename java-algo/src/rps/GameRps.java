package rps;

public class GameRps {
	public static GameRpsMain game;
	int rock; // 바위
	int paper;// 보
	int scissors; // 가위
	int comval; // 컴퓨터가 생성하는 랜덤 가위바위보
	String rpsValue; // 숫자와 대응되는 값
	public int getRock() {
		return rock;
	}
	public int getPaper() {
		return paper;
	}
	public int getScissors() {
		return scissors;
	}
	public String getRpsValue() {
		return rpsValue;
	}
	public void setRock(int rock) {
		this.rock = rock;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	public void setScissors(int scissors) {
		this.scissors = scissors;
	}
	public void setRpsValue(int val) {
		switch (val) {
		case 1:rpsValue = "가위";break;
		case 2:rpsValue = "바위";break;
		case 3:rpsValue = "보";break;
		default:
			break;
		}
	}
	
	
	
	public int getComval() {
		return comval;
	}
	public void setComval() {
		this.comval = (int) (Math.random()*3+1);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
