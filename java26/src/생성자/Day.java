package 생성자;

public class Day {
	String doing;
	int time;
	String place;

	public Day(String doing, int time, String place) {// 입력값이 필요한 생성자 만들기
		super();
		this.doing = doing;
		this.time = time;
		this.place = place;
	}

	@Override // toString을 오버라이딩 하여 주소값이 아닌 입력값 출력하기
	public String toString() {
		return "day [doing=" + doing + ", time=" + time + ", place=" + place + "]";
	}

}
