package sec01.exam01;

public enum Season {
	SPRING("봄", 15), SUMMER("여름", 30), FALL("가을", 18), WINTER("겨울", -3);
	
	String name; //파이널 특성이 먼데
	int temp;
	
//	Season() {}
	
	Season(String name, int temp) {
		this.name = name;
		this.temp = temp;
		
	}
}
