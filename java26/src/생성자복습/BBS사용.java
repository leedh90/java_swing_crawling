package 생성자복습;

public class BBS사용 {

	public static void main(String[] args) {
		// BBS 사용해서 출력하기
		BBS b = new BBS(); // 기본출력을 활용하기 위한 BBS 기본생성자 사용! 오버로딩으로 생성가능
		BBS b1 = new BBS(1, "java", "fun java", "park"); // 매개변수가 필요한 생성자 메서드를 만듬.
		BBS b2 = new BBS(2, "jsp", "fun jsp", "hong");
		BBS b3 = new BBS(3, "spring", "fun spring", "kim");
		System.out.println(b1); // 각각에 입력된 값을 toString을 재정의(오버라이딩)해서 출력한다.
		System.out.println(b2);
		System.out.println(b3);

	}

}
