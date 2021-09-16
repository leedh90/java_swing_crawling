package 예외처리;

public class 예외처리Main2 {

	public static void main(String[] args) {
		// 예외발생3에서 호출한 메서드가 예외처리가 되어 있지 않아, 호출 후 에러를 예외처리해주는 방법
		// 주소를 사용해서 메서드에서 넘겨진 예외를 메인에서 처리하기
		에러발생3 error = new 에러발생3();
		try {
			error.call(); // 에러가 나는 메서드를 try-catch 문으로 묶어서 예외를 처리한다.
		} catch (Exception e) {
			e.printStackTrace(); // 자세하게 에러보여주는 메서드 printStackTrace
		} // 에러발생3.java에서 발생된 예외를 메서드를 호출한 곳(main)으로 넘김
		// 마우스 가져오면 2가지 방법이 나옴 내가 처리하면 서라운드 넘길꺼면 throws
		System.out.println("에러 발생 후 실행될까요...");
		
		

	}

}
