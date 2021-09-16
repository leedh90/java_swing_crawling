package 생성자복습;

public class 수강신청사용 {

	public static void main(String[] args) {
		// 수장신청.java를 사용해서 객체 생성 후 활용하기
		수강신청 sub1 = new 수강신청("자바", "14:30", "홍길동");
		수강신청 sub2 = new 수강신청("JSP", "09:30", "김길동");
		// 수강신청은 명시적 생성자이기 때문에 객체 생성시 변수값을 입력해야 한다.
		System.out.println(sub1);
		System.out.println(sub2);
		// override된 toString의 형식으로 출력됨

	}

}
