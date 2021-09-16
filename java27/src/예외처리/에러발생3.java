package 예외처리; // 메서드 상에서 처리하지 않고 호출할때 에어를 같이 넘겨줌

public class 에러발생3 {
	
		// 예외가 발생하면 메서드가 정의된 곳에서 처리하는것이 아니라
		// 메서드를 호출한 곳으로 예외처리를 떠넘길수 있다.
	public void call() throws Exception{// 떠 넘기는거 드로우!
		System.out.println(3 / 0);
		// 메서드 상에서 예외를 처리해주지 않고 넘길 수 있다. throws Exception 사용!
		
	}
}

