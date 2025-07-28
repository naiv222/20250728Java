package sec01.exam01;

public class NPEtest {
	public static void main(String[] args) {
		String str1 = new String("자바");
		String str2 = new String("자바"); //다르다
		
		String str3 = "자바";
		String str4 = "자바";
		
		if(str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		int arr[] = null;
//		arr[0] = 100;
	}
}
