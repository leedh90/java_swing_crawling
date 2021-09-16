package 생성자복습;

public class 컴퓨터 {
	// 멤버변수 3가지 지정! 객체 생성시 각 입력갑들이 복사된 해당 변수값에 저장된다.
	int money;
	String company;
	int size;

	public 컴퓨터(int money, String company, int size) {
		super();
		this.money = money; // 컴퓨터 객체 생성시 복사된 멤버변수에 입력된 값이 저장된다.
		this.company = company;
		this.size = size;
	}

	@Override // 기존의 주소값에 다른 값을 덮어 씌워준다.
	public String toString() {
		return "컴퓨터 [money=" + money + ", company=" + company + ", size=" + size + "]";
	}

}
