package 스태틱;

public class Day {
	// 멤버변수는 객체생성시 동적으로 메모리를 할당!
	// 객체가 3개 생성되었다면, 각 객체마다 다른 속성값을 가지게 된다.
	// 실세로 그 객체에 해당하는 실제값들이 구체적으로 저장되는 특징
	// instance(실제값)
	// 객체생성시 복사되는 변수 -> instance변수라고 한다.
	String doing;
	int time;
	String location; // 3가지는 각 객체마다 별도로 입력되는 변수이다.

	// 각 객체마다 복사되지 않는 변수는 static 이라고 한다.
	// static 변수는 해당 class당 한개만 가진다!
	// 클래스이름.변수명 으로 사용 -> Day.count
	// 객체생성과는 상관이 없다.
	// static은 객체생성하지 않아도 사용 가능하다
	static int count; // 전역변수, 0으로 초기화 count는 각 객체에 별도가 아니고 통합으로 카운팅이 되야하는 변수이다.
	static int sum;

	public Day(String doing, int time, String location) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}
