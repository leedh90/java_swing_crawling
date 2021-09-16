package 예외처리;

public class 예외처리Main {// 예외발생2에서 메서드 호출(미리 예외처리되어있는 메서드)

	public static void main(String[] args) {
		// 주소를 사용해서 메서드 사용하기
		에러발생2 error = new 에러발생2();
		error.call();
		System.out.println("에러 발생 후 실행될까요...");
		// 메서드 상에서 예외를 처리해줬기 때문에 바로 실행 가능
		
		

	}

}
