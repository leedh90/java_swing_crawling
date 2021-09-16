package 클래스연습;

import java.util.Date; // 다른 패키지에 있는 거는 항상 import 해줘야 한다!

public class 계산기 {// 계산기는 멤버변수가 없이 생성해줬다!
	
	public int getHour() {// getHour 라는 메서드는 다시 한번 data라는 class를 사용한다!
		Date data = new Date();
		data.getHours(); //분은 생략하고 시간만 나타낸다.!
		int result = data.getHours();
		return result;
	}
	public int add(int x, int y) {//2개의 값을 넣어 더해준다!
		//메서드에서 선언된 변수는 메서드 안에서만 사용가능하다!
		//메버스 범위 지역안에서만 사용가능!
		//지역변수, 로컬변수라고 부른다! <--> 전역변수, 글로벌변수
		//class 아래에서 선언된 변수는 전역변수, 글로벌 변수 전역에서 사용가능!
		int result = x + y;
		System.out.println("더한 값은 " + result);
		return result; // 결과값을 반환하기 위헤서는 return 을 사용한다!
		// 반환값이 있을경우 void는 사용할 수 없고! 반환되는 값의 타입을 알려줘야 한다!
	}
	public int minus(int x, int y) {
		int result = x - y;
		System.out.println("뺀 값은 " + result);
		return result;
		
	}
	public int mul(int x, int y) {//반환값이 없으면 void 사용하지만 반환값이 있을때는 return을 사용!
		int result = x * y;
		System.out.println("곱한 값은 " + result);
		return result; // return 리턴을 할때는 void가 아니고 내가 리턴할 타입을 퍼블릭 뒤에 붙인다!
		// 리턴값은 모든 변수로 쓸 수 있는게 다됨! void만 안된다! 기본형과 참조형 변수 둘다! 가능하다!
		// return은 항상 가장 마지막줄에 위치해야 한다! 모든 처리를 다 하고 결과값을 리턴해줘! 라는 의미이다!
		
	}
	public double div(double x, double y) {//나누기는 실수값으로 나오기 때문에 double 타입으로 변경해준다.!
		double result = x / y;
		System.out.println("나눈 값은 " + result);
		return result;
		
	}
}
