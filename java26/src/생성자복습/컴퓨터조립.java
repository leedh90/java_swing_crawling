package 생성자복습;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		// 컴퓨터.java(생성자) 활용해서 객체 생성 후 객체에 있는 멤버변수 출력
		컴퓨터 com1 = new 컴퓨터(10000, "삼성", 12);
		컴퓨터 com2 = new 컴퓨터(20000, "엘지", 10);
		
		System.out.println(com1); // override 한 toString 값을 출력
		System.out.println(com2);

	}

}
