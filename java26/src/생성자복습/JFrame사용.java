package 생성자복습;

import javax.swing.JFrame;

public class JFrame사용 {

	public static void main(String[] args) {
		// 이미 라이브러리에 있는 JFrame 활용
		// JFrame f = new JFrame("나는 기본 프레임이야!"); // 명시적 생성자일 경우 입력값을 넣어서 표시 가능
		// JFrame은 여러개의 메서드가 있음, 기본형 생성자와 명시적 생성자 모두 가지고 있음.
		JFrame f = new JFrame();
		f.setTitle("나는 기본 프렘임이야!"); // 위의 명시적 생성자로 생성한 f 객체와 같은 의미! 두줄!
		f.setSize(500,500); // 사이즈를 만들어서 노출
		f.setVisible(true); // 시각화 하는 메서드

	}

}
