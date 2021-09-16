package 클래스연습;

public class Phone {
	String type;
	String color;
	//Phone 라는 class에 멤버변수 2개를 만든다.
	
	public void on() {//멤버변수 2개를 만든다.
		System.out.println("핸드폰을 켠다");
	}
	public void call() {
		System.out.println("전화를 건다!");
	}
	public void text(String x, String y, int z) {
		// 매개변수, 파라메터, parameter 은 항상 변수의 타입과 종류가 입력하는 순서와 일치해야한다!
		System.out.println(z + "시에 " + x + "한테 " + y + " 문자 보내줘");
	}
	public void internet(String x, int y, String z) {
		System.out.println(x + "를 " + z + " " + y + "시간 서핑했다.");
	}
	
}
