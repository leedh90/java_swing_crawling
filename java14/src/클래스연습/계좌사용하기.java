package 클래스연습;

public class 계좌사용하기 {
	public static void main(String[] args) {
		System.out.println("우리 가족 계좌정보");
		System.out.println("--------------");
		System.out.println("이름       계좌이름      금액");
		System.out.println("-------------------");
		계좌만들기 ac1 = new 계좌만들기();
		// 아빠의 계좌 변수 생성 ram에 저장되고 계좌만들기 class가 가지고 있는 멤버 변수를 복사해옴
		계좌만들기 ac2 = new 계좌만들기();

		ac1.name = "홍길동";
		ac1.account = "튼튼적금";
		ac1.money = 1000;

		ac2.name = "홍기사";
		ac2.account = "다음적금";
		ac2.money = 3000;

		System.out.println(ac1.name + "   " + ac1.account + "     " + ac1.money);
		System.out.println(ac2.name + "   " + ac2.account + "     " + ac2.money);
		System.out.println();

		System.out.print("아버지 " + ac1.name + "은 ");
		ac1.insert(6000);

		System.out.print("딸 " + ac2.name + "는 ");
		ac2.Withdrawal(1000);

	}
}
