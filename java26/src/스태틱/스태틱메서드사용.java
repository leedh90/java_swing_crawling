package 스태틱;

import javax.swing.JOptionPane;

public class 스태틱메서드사용 {

	public static void main(String[] args) {
		// 자바전체에서 아주 많이 사용되는 기능을 사용하고자 하는 경우
		// new를 사용해서 객체를 생성한 후에 메서드를 사용하면
		// 인스턴스 변수 모두 복사되고, 참조형 변수가 생성되는 등 기능을 쓰기위해서 불필요한 작업들이 이루어 진다.
		// static 메서드를 만들어 놓으면 객체 생성하지 않아도 바로 class 이름으로만 기능을 사용할 수 있다.
		String s = JOptionPane.showInputDialog("숫자입력");
		int n = Integer.parseInt(s); // 자주쓰는 아이들은 스테틱 메서드로 활용
		// System.exit(0); 종료하는 메서드도 static
		System.out.println(n);

	}

}
