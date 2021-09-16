package 생성자;
public class Day사용 {

	public static void main(String[] args) {
		// day.java 사용하기
		Day day1 = new Day("자바공부", 10, "강남");
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");
		// 생성자 메서드의 각 입력값을 넣고 객체를 생성한다.
		
		// 1. 전체 하는 일의 시간
		System.out.println("전체하는 일의 시간은 : " + ( day1.time + day2.time + day3.time ));
		// 2. 평균 하는 일의 시간
		System.out.println("평균하는 일의 시간은 : "+ ( day1.time + day2.time + day3.time ) / 3);
		// 3. 매일 무엇을 얼마나 어디서 했는지
		System.out.println(day1); // 입력된 값을 오버라이딩된 toString으로 출력한다.
		System.out.println(day2);
		System.out.println(day3);
		// 4. 며칠간 했는지..??
		
		

	}

}
