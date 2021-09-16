package 생성자;

import javax.swing.JFrame;

public class 생성자그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 그래픽 창"); //미리 넣어서 만들기
		//JFrame f = new JFrame();
		//f.setTitle("나의그래픽창2"); // 나중에 선택해서 만들기
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
