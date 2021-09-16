package 예외처리; // 메서드 상에서 선 조치

public class 에러발생2 {
	
	public void call() {// 메인이 없어서 런 불가
		try { // 메서드 상에서 미리 에러에 대해 예외처리할 수 도 있고!
			System.out.println(3 / 0);
		} catch (Exception e) {
			System.out.println("에러발생함." + e.getMessage());
			e.printStackTrace(); // 메서드 상에서 먼저 예외를 처리할 수 있다
		}
	}
}

