package 클래스연습;

public class 카페에서계산기 {

	public static void main(String[] args) {
		int coffeePrice = 4600;
		int juicePrice = 4000;

		int coffeeCount = 5; // 주문 수
		int juiceCount = 3;

		// 전체 몇잔을 주문했을까요?
		계산기 cal = new 계산기();
		cal.add(coffeeCount, juiceCount); // 변수로 입력해도 안에 있는 int 의 값이 들어간다.

		// 메서드를 호출(call, 콜)할때
		// 메서드를 사용할 때 처리값을 가지고 와서 다시 사용하는 경우!
		// 리턴을 받아온다라고함! -> return!
		// 커피값은 얼마 일까요?
		int coffe = cal.mul(coffeeCount, coffeePrice);
		// 반환, return 값을 넣어줄 변수를 만들어서 넣어준다.!
		// 반환된 결과값을 coffee라는 변수에 넣어준다!
		
		// 주스값은 얼마 일까요?
		int juice = cal.mul(juicePrice, juiceCount);
		// 반환된 결과값을 juice 라는 변수에 넣어준다!

		// 전체 금액은 얼마일까요?
		cal.add(coffe, juice);
		// 반환된 값들이 저장되어 있는 변수를 사용하여 다시 한번 처리해준다!
		
		int hour = cal.getHour();
		// 결과값으러 나온 값을 hour 라는 변수에 반환시켜준다!
		System.out.println("현재 시각은 " + hour);
	}

}
