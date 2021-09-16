package 클래스연습;

public class 계좌만들기 {
	// 계좌를 사용하기 위해서 필요한 속성값
	String name; // 이름
	String account; // 계좌이름
	int money; // 금액
	// 변수는 변수의 타입과 변수명을 선언할때 생성된다!
	// 선언의 변수가 사용할 수 있는 범위이다.
	// class 아래에서 선언됨. class 전역에서 사용 가능! -> 전역변수, 글로벌변수!
	// 전역변수는 자동초기화 가능!

	public void insert(int x) {//메서드를 사용할때 어떤 값의 변수를 사용할지 넣을 수 있다(참조형/기본형 상관x)
		System.out.print(x + "원");
		System.out.println(" 입금하다.");
	}

	public void Withdrawal(int x) {
		System.out.print(x + "원");
		System.out.println(" 출금하다.");
	}

}
