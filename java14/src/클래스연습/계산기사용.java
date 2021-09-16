package 클래스연습;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		int coffeePrice = 4600;
		int juicePrice = 5000;
		cal.add(coffeePrice, juicePrice);
		cal.minus(juicePrice, coffeePrice);
	}

}
