package 생성자;

public class 계좌 {
	String name; // 클래스를 사용할때 멤버변수까지 복사되어 넘어간다.
	String field;
	int money;
	// new 계좌() => 사용불가, 각각의 매개변수를 넣어야지 계좌를 사용할 수 있다.
	public 계좌(String name, String field, int money) { // 생성자만들기 -> source
		super();
		this.name = name;
		this.field = field;
		this.money = money;
		System.out.println(toString());
	}

	@Override // toString 오버라이딩으로 활용하기
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + "]";
	}

}
