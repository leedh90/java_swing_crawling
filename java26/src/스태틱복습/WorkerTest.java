package 스태틱복습;

public class WorkerTest {

	public static void main(String[] args) {
		// Worker.java활용 static 변수 활용하기
		Worker wk1 = new Worker("홍길동", "남", 20); // 객체생성
		Worker wk2 = new Worker("박길동", "여", 23);
		Worker wk3 = new Worker("김길동", "남", 30);

		// 1. 전체 직원의수
		System.out.println("총 직원 수는 " + Worker.count + "명"); // 전체 직원수를 나타내는 static변수 count사용
		// static 변수 사용시 변수가 포함된 class명.static변수명 으로 사용
		
		// 2. 직원들의 평균나이
		System.out.println("직원들의 평균 나이는" + (double)Worker.sum / Worker.count + "세");
		// 직원들 나이의 합을 구하는 static 변수 sum을 사용
		
		// 3. 첫번째 직원의 이름은
		System.out.println("첫번째 직원의 이름은 " + wk1.name + "입니다");
		// 객체에 있는 변수값은 객체.변수명 으로 사용할 수 있다.

	}

}
