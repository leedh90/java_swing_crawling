package 클래스연습;

public class 계산기2 {
	//메서드(기능) 중심!!
	public void add(int x, int y) {
		//메서드의 입력값이 있는 경우, 입력되는 값의 타입과 종류에 따라 변수를 만들어주어야
		//전달값을 받아서 저장해 두었다가 꺼내서 계산할 수 있다.
		System.out.println("두 수의 합은: " + (x + y));
		// 스트링 + 인트는 전부 스트링으로 인식된다. () 묶어서 먼저 처리하게 지정해줘야 한다.
		System.out.println("계산기로 더하다.");
	}
	public void minus(int x, int y) {
		//x, y를 중간에 값을 전달받는 변수라고 해서 매개체 역할을 해주는 변수!
		//매개변수, parameter, 파라메터
		//전달받은 값이 2개이면, 매개변수 2개를 만들어주어야 한다.!
		//전달받은 값이 순서대로 매개변수에 저장됨!
		//저장된 값을 가지고 매서드내에서 처리하게됨!
		System.out.println("두 수의 차는: " + (x - y));
		System.out.println("계산기로 빼다.");
	}
	public void mul() {
		System.out.println("계산기로 곱하다.");
	}
	public void div() {
		System.out.println("계산기로 나누다.");
	}
}
