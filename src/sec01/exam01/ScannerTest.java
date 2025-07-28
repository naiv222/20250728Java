package sec01.exam01;

import java.util.Scanner;

public class ScannerTest {
	
	static String str;
	
	static void method(Scanner scan) {
		System.out.print("입력: ");
//		String str = scan.nextLine();
//		System.out.println(str);
		str = scan.nextLine();
	}
	
	public static void name(String[] args) {
		Scanner scan = new Scanner(System.in);
//		ScannerTest.method(scan);
		ScannerTest sct = new ScannerTest();
		sct.method(scan);
		System.out.println(sct.str);
	} //static 메서드 안에서 사용하려면 static으로 선언해야 한다!
}
