package 스태틱;

public class Day사용 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남"); // 생성자에 맞게 입력값을 미리 넣어서 객체 생성
		// 입력하지 않은 count 까지 해서 총 4개의 변수가 만들어져 있다
		System.out.println(Day.count);
		// 카운트값을 누적 시키려는 목적 but 각 객체가 다르기 때문에 카운트가 안된다.
		// static 변수는 객체명 아니고 class명으로 사용! 헷갈림을 방지
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count);
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);
		
		System.out.println("-----------------------------------------");
		
		System.out.println(day1); // 오버라이딩된 toString 값을 출력
		System.out.println(day2);
		System.out.println(day3);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("총 사용한 시간은 " + Day.sum);
		System.out.println("각 활동시간의 평균은 " + (double)Day.sum/Day.count);

	}

}
