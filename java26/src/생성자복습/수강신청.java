package 생성자복습;

public class 수강신청 {
	String subject; // 각 객체에서 필수적으로 입력되어야 하는 변수갑
	String time;
	String name;

	public 수강신청(String subject, String time, String name) {// 생성자 생성
		// 기본생성자는 파라미터값이 없고 명시적으로 생성자를 만들어 주지 않으면 기본적으로 생성된다.
		// 명시적으로 생성자를 생성해주면 기본생성자는 생성되지 않는다.
		// 둘다 사용할 경우는 명시적으로 기본생성자도 생성을 해준다.
		// 명시적 생성자는 이미 객체 생성시 어떤 변수값을 넣어야하는지 알때 사용하고
		// 기본생성자는 객체생성시 어떤 값을 입력해야 할지 모르고 추후에 넣게 될때 사용한다.
		super();
		this.subject = subject; // this는 전역변수라는 것을 의미한다.
		this.time = time;
		this.name = name; // 명시적 생성자는 소스에서 만든다!

	}
	public 수강신청() { // 이렇게 기본생성자도 생성해줄 수 있다! 생성자는 오버로딩 가능
		
	}

	@Override // toString을 오버라이딩 해서 출력값이 주소가 아닌 값으로 바꿔준다.
	public String toString() {
		return "수강신청 [subject=" + subject + ", time=" + time + ", name=" + name + "]";
	}

}
