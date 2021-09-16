package 클래스연습;

public class Car {
//성질(변수):색(멤버변수)
	String color; // 각 변수값이 다르기 때문에 변수가 있다라는 의미로만 하기 때문에 색의 값을 넣어 주지 않는다.
//멤버는 선택의 의미 많은 변수가 있지만 나는 이거만 사용할게! 라는 의미	
//동작(메서드):달리다, 속도를 높이다 메서드는 항상 소괄호가 필요하다!(멤버메서드)

	public void run() {
		System.out.println("자동차가 달리다!");
	}

	public void up() {
		System.out.println("속도를 높이다!");
	}
}
