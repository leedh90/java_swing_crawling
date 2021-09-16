package 생성자복습;

public class 마스크사용 {

	public static void main(String[] args) {
		// 마스크class의 생성자 메서드 활용하기.
		마스크 m1 = new 마스크("검정색", 1000); // 메서드 호출시 매개변수를 넣어줘야한다.
		// 넣어준 매개변수는 메서드 호출시 멤버변수의 로 들어간다.
		System.out.println(m1);
		// 재정의(오버라이딩)된 toString으로 출력

	}

}
