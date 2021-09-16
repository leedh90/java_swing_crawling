package 클래스연습;

public class 자동차를만들어서사용 {

	public static void main(String[] args) {
		Car c1 = new Car(); // 내가 만든 Car라는 클래스를 사용하여 객체를 생성함!
		// Car에 있엇던 멤버변수 color 이 별도로 복사됨
		c1.color = "빨강색";
		
		Car c2 = new Car(); // 내가 만든 Car class를 활용해서 c2라는 객체를 생성함!
		c2.color = "파랑색";
		
		// c1, c2는 참조형 변수로 주소가 들어 있다.! 주소가 들어있는 변수가 있으면 메서드를 사용할 수 있다.
		c1.run(); // 참조형 변수는 메서드를 사용할 수 있다!
		c2.up();

	}

}
