package java25복습;

public class Phone {
	// 멤버변수!
	String color; // 각 객체마다 다르게 값이 들어가기 때문에 초기값 설정없이 변수만 만들어준다. 
	int size;
	
		public Phone(String color, int size) {// 생성자 메서드!
			this.color = color; // this는 class를 의미한다! .은 그 아래 있는 멤버변수를 찾는다.
			this.size = size; // 멤버변수를 바로 입력할 수 있게 메서드를 만든다.
			// 전역변수와 지역변수의 이름이 같을때 this(클래스를 의미)사용
			// this.color: 해당 클래스 밑에 선언된 color 라는 의미
			// this로 전역변수를 지정할 수 있다.
			// 변수명이 전역/지역이 동일할 때 전역변수를 지정할 목적으로 사용
		}
		
		public void internet() {
			System.out.println("인터넷하다");
		}
		public void text() {
			System.out.println("문자하다");
		}
		@Override
		public String toString() {// toString 오버라이딩 하기!
			return "Phone [color=" + color + ", size=" + size + "]";
		}
		
}
