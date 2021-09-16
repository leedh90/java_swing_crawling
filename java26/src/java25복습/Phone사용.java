package java25복습;

public class Phone사용 {

	public static void main(String[] args) {
		Phone p1 = new Phone("빨강", 7); // new 뒤에 클래스 이름과 같은 메서드가 생성자 메서드이다!
		// 객체 생성시 변수입력값을 알면 생성사에 넣어서 객체를 생성하면 된다.
//		p1.color = "빨강"; // p1의 color 변수에 빨강을 넣는다.
//		p1.size = 7; // 생성자로 넣어주면 변수를 따로 지정해서 넣어줄 필요가 없다.
		p1.text();
		System.out.println(p1); // toString 하기 전에는 주소값이 찍힌다.

		Phone p2 = new Phone("검정", 11);
//		p2.color = "검정"; // p1의 color 변수에 빨강을 넣는다.
//		p2.size = 11;
		p2.internet();
		System.out.println(p2); // toString 하기 전에는 주소값이 찍힌다.
		// toString 오버라이딩(Phone.java에서) 하면 변수값이 출력된다!
	}
}
