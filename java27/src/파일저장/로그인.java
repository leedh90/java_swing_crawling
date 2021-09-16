package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1; // t1, t2는 전역변수로 선언되어 있다 main이 static 이라서
	private static JTextField t2; // 전역변수 또한 static으로 만들어야 한다!

	public static void main(String[] args) { // 메인이 스테틱이기 때문에 전역변수 또한 스테틱
		JFrame f = new JFrame("로그인 화면"); // f는 주소값을 가진다 주소값이 있어야 메서드를 호출해서 쓸 수 있다.
		//static 변수: 객체생성하지 않아도 언제든 클래스이름으로 접근해서
		//            바로 그 변수의 값을 가져다 쓸 수 있는 변수
		//            그래픽 프로그램에서는 Font의 속성, Color의 값 등을
		//            자주 쓰므로 static변수로 만들어두어서 편하게
		//            언제든 쓸 수 있음.

		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel top = new JLabel("");
		top.setBounds(171, 25, 140, 113);
		f.getContentPane().add(top);
		
		ImageIcon icon = new ImageIcon("KakaoTalk_20210305_120431420.png");
		// 같은 project 위치에 잇으면 경로지정 없이 파일명으로 입력가능, 다른 위치에 있으면 경로 전부 지정해야한다.
		// 사진을 넣는 메서드 ImageIcon
		// src에 넣으면 안되고 project에 넣어야 한다!
		// icon은 사이즈 조정이 불가
		// setIcon -> 이미지 넣기
		top.setIcon(icon); // setIcon 아이콘을 넣는 메서드
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(98, 176, 90, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("패스워드");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(98, 243, 90, 43);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(228, 178, 176, 41);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(228, 243, 176, 41);
		f.getContentPane().add(t2);
		
		JButton login = new JButton("");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 로그인 처리
				String s1 = t1.getText(); // 입력된 아이디를 s1 변수에 넣어준다.
				String s2 = t2.getText(); // 입력된 pw를 s2 변수에 넣어준다.
				// root, 1234 와 동일하면 "로그인 성공", 동일하지 않으면 "로그인 실패"
				if (s1.equals("root") && s2.equals("1234")) {
					// 참조형 변수는 연산자 사용 불가, 메서드 사용 and = &&
					JOptionPane.showMessageDialog(f, "로그인 성공"); // f는 제이프레임의 주소값
					Diary diary = new Diary(); // diary.java에 있는 open 메서드를 사용하기 위해 객체 생성
					diary.open(); // 메서드 사용
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패"); // f는 띄워질 위치를 나타냄 f위에
				}
			}
		});
		login.setBounds(46, 352, 176, 88);
		f.getContentPane().add(login);
		
		ImageIcon icon2 = new ImageIcon("KakaoTalk_20210305_120437914.png"); // 넣을 이미지 경로지정
		// icon2에 주소를 넣어줌
		login.setIcon(icon2); // 넣어준 주소값을 login 버튼에 넣어준다.
		
		JButton reset = new JButton("");
		reset.addActionListener(new ActionListener() {// 디자인에서 더블클릭하면 자동으로 실행된다!
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을때 실행되는 메서드!
				// t1, t2의 입력한 내용을 지워라!
				t1.setText(""); // 클릭을 했을때 해당부분을 공백으로 처리
				// t1, t2는 전역변수이면서 스태틱변수라서 객체 생성없이 바로 사용가능
				t2.setText(""); // 전부 지워지는것처럼 보인다! 사실은 공백으로 변경되는것!
			}
		});
		reset.setBounds(270, 352, 176, 88);
		f.getContentPane().add(reset);
		
		// ImageIcon icon3 = new ImageIcon("KakaoTalk_20210305_120443037.png");
		reset.setIcon(new ImageIcon("KakaoTalk_20210305_120443037.png"));
		// 객체 생성없이 스태틱 메서드를 사용 해서 넣을 수 있다!
		
		f.setVisible(true); // setVisible은 항상 마지막에

	}
}
