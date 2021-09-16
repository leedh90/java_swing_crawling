package 생성자;

public class 계좌사용 {

	public static void main(String[] args) {
		// 계좌.java 사용하기 생성자를 사용해서 입력값 없으면 객체 생성 불가하게 만들 수 있다.
		계좌 ac1 = new 계좌("홍길동", "튼튼적금", 1000);
		계좌 ac2 = new 계좌("박길동", "튼튼예금", 2000);
		계좌 ac3 = new 계좌("홍기사", "다음적금", 3000);
		// 미리 계좌.java에 프린트를 넣어 놓은 상태로도 출력할 수 있다.
		System.out.println("--------------------------");
		System.out.println(ac1);
		System.out.println(ac2);
		System.out.println(ac3);
		// 그냥 toString으로도 출력 가능하다

	}

}
