package sec01.exam01;

public class StringTest {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4};
		int arr2[] = new int[4];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for (int i : arr2) {
			System.out.println(i);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[1]);
		}
		
	}
}
