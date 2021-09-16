package 예외처리;

public class 문제발생클래스 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트가 잘될 예정."); // 문제 발생 x
		
		try {// try-catch문 
			// 문제가 발생할꺼 같은 코드를 try 안에 넣어준다!
			System.out.println("2. 문자발생 코드 " + 10/0); // 문제 발생  o
		} catch (Exception e) { // 문제가 발생하면 아래를 처리해라, catch를 여러개 사용할 수 있다.
			// e 안에 에러정보를 넣어준다!
			// 예외상황이 발생하면 잡아서(catch) 어떻게 처리할지 코드를 넣어주는 부분!
			e.printStackTrace(); // 어디에서 어떤 에러가 발생했는지 정확하게 알려줌!
			System.out.println("에러 발생함.");
			System.out.println(e.getMessage()); // getMessage -> 에러 사유를 알려줌
		}
		// try-catch문을 사용하지 않으면 에러발생 부분에서 실행이 멈춘다.
		System.out.println("3. 나는 프린트가 될까요?"); // 문제 발생 x
	}
}
