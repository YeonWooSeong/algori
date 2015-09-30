package array;
/*
 * 이중 배열 예제
 */
public class ArryMrSmith {
/*
 * 
 */
	public static void main(String[] args) {
	
		String[][] names = {
				
				{"Mr.","Mrs.","Ms."},  //0  ||  0123
				{"Smith","jones","Alex"}, //1   ||   0123
				{"hello","hi","good-bye"}//  2   ||  0123
				
		
	};
	System.out.println(names[0][2] +  names[1][2] +  names[2][1]);
	}
		// Mr. Smith 출력한다
	
}

