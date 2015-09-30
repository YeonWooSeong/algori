package array;

public class Arrycopy {
public static void main(String[] args) {
	System.out.println("int형 배열복사");
	int[ ] dest3 = {1,2,3,4,5};
	int [ ]target3 = new int[3];
	System.arraycopy(dest3, 0, target3, 0, 2);
	for (int i = 0; i < target3.length; i++) {
		System.out.println((i+1)+"\t");
	}System.out.println();
	System.out.println("char 형 배열 복사");



	char[] dest = {'b','1','a','c','k','c','o','f','f','e','e'};
	char[] target = new char[6];
	System.arraycopy(dest, 5, target, 0, 6);
	System.out.println(new String(target));
	
	
	
	System.out.println("String 형 배열 복사");
	String[]dest2 = {"a","b","c"};
	String[]target2 = new String[2];
	System.arraycopy(dest2,1,target2,0,2);
	for (int i = 0; i < target2.length; i++) {
		System.out.println(target2[i]+"\t");
	}
}	

}