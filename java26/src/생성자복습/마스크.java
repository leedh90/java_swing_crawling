package 생성자복습;

public class 마스크 {
	// 생성자에서 사용하기 위한 멤버변수, 전역변수 생성
	String color; // 전역변수는 자동 초기화가 되기 때문에 초기화 하지 않아도 된다.
	int price;
	
	public 마스크(String c, int p) {
		this.color = c; // 마스크 메서드 사용시 입력한 매개변수 값은 마스크 class에서 복사된 멤버변수로 들어간다.
		this.price = p;
		
	}

	@Override // toString을 오버라이딩의로 재정의한다.
	public String toString() {
		return "마스크 [color=" + color + ", price=" + price + "]";
	}
	
}
