package 스태틱;

public class Employer {

	public static void main(String[] args) {
		// 직원.java 사용해서 만들기
		//1. 모든 직원의 정보
		Employ em1 = new Employ("홍길동", "남", 25); // 멤버변수 값을 넣어서 객체생성!
		Employ em2 = new Employ("박길동", "여", 26);
		Employ.getAvg(); // 스태틱 메서드를 사용할때는 스태틱 변수만 사용할 수 있다
		Employ em3 = new Employ("남길동", "남", 27);
		System.out.println(em1); // 각 객체에 입력된 값을 출력(toString 오버라이딩)
		System.out.println(em2);
		System.out.println(em3);
		System.out.println("--------------------------------------");

		//2. 직원의 수
		System.out.println("전체 직원의 수는 " + Employ.count + "명");
		// static 변수 사용방법 class명.static변수명
		// 직원수 카운팅 해수는 static 변수인 count 출력
		System.out.println("--------------------------------------");
		
		//3-1 나이 평균 static 변수사용
		System.out.println("전체 직원 나이의 평균은 " + (double)Employ.sum / Employ.count + "살");
		// 전체 나이를 합하는 static 변수인 sum과 인원수를 구할 수 있는 count를 활용해서 평균나이 계산
		
		//3-2 나이 평균 static 메서드사용
		Employ.getAvg();
		

	}

}
