package 파일저장;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void open() { // 먼저 실행을 확인하고! 메인을 없애고 메서드로 변경해준다
		// 일기쓰는곳 만들기
		JFrame f = new JFrame("일기작성");
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(57, 53, 140, 51);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 주제");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(57, 142, 140, 51);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(57, 285, 140, 51);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(225, 53, 230, 56);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(225, 137, 230, 56);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setLineWrap(true);
		t3.setFont(new Font("Monospaced", Font.PLAIN, 20));
		t3.setRows(5);
		t3.setColumns(5);
		t3.setBounds(225, 227, 230, 159);
		f.getContentPane().add(t3);

		JButton save = new JButton("일기 저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				try {
					// 해당 폴더와 스트림(연결)을 만든다
					// 스트림의 특징은 한방향! 역행하지 않는다!
					FileWriter file = new FileWriter("c:/data(java)/" + s1 + ".txt"); // c: c드라이브  / 밑에
					// FileWriter f = new FileWriter("c:\\data(java)\\" + s1 + ".txt"); // c: c드라이브  / 밑에
					// 역슬래시 사용으로 동일하게 표현가능
					// 앞에서부터 경로를 쭉 쓰는걸 절대경로 라고 한다.
					// filewriter -> 문자를 저장하는 부품!
					// filewriter는 입력값 없이 사용할 수 없다
					// 문자를 불러올때는 filereader 사용!
					file.write(s1 + "\n"); // \n 엔터의 기능
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					file.close(); // 외부자원과 연결된 스트림 메서드는 항상 클로즈를 사용해서 자원해제 시켜야한다.
					// CRUD 사용할때도 꼭 각 메서드 마다 닫아주는 역할인 스트림을 끊어주는 close 메서드를 꼭 써줬어야 했다.
					JOptionPane.showMessageDialog(f, "저장이 완료되었습니다.");
				} catch (IOException e1) {// 뒤에 e라는 변수가 있기 때문에 오류가 나온다!
					System.out.println("파일로 저장 중 에러발생");
					System.out.println("에러정보는 " + e1.getMessage()); // 에러정보를 나타내주는 getmessage 사용
					// 경로 지정하지 않으면 project 폴더 안에 생긴다.
					// e.printStackTrace(); 자동완성은 전체 에러 정보를 가져오는 프린트스택트레이스 사용
				}
			}
		});
		save.setBackground(Color.MAGENTA);
		save.setFont(new Font("굴림", Font.BOLD, 25));
		save.setBounds(88, 394, 312, 51);
		f.getContentPane().add(save);
		
		f.setVisible(true);

	}
}
