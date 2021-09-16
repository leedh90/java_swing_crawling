package 정리문제;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 내가만든계산기 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setBounds(98, 71, 57, 15);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setBounds(98, 115, 57, 15);
		f.getContentPane().add(lblNewLabel_1);

		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBounds(186, 68, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setColumns(10);
		t2.setBounds(186, 112, 116, 21);
		f.getContentPane().add(t2);

		JButton btnNewButton = new JButton("더하기 +");
		btnNewButton.addActionListener(new ActionListener() {
			// 더하기 버튼을 눌렀을때 실행되는 액션!
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 실행!");
				String s1 = t1.getText(); // t1에 입력되는 값을 변수 s1로 저장
				String s2 = t2.getText(); // t2에 입력되는 값을 변수 s2로 저장
				// System.out.println(s1); // 출력값이 잘 나오는지 확인 하는 출력
				// System.out.println(s2);

				int i1 = Integer.parseInt(s1); // 스트링으로 입력된 s1 값을 계산해주기 위해 int로 캐스팅!
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기(); // 위의 입력값들을 계산기 class를 활용해서 처리할꺼야
				int i3 = cal.add(i1, i2); // cal class로 처리한 값을 반환받아 i3변수에 저장한다!
				String result = Integer.toString(i3);
				// setText는 스트링 값만 입력이 가능하기 때문에 int 값을 다시 String으로 캐스팅해준다
				t3.setText(result);

			}
		});
		btnNewButton.setBounds(35, 243, 97, 23);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("빼기 -");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 실행!");
				String s1 = t1.getText(); // t1에 입력되는 값을 변수 s1로 저장
				String s2 = t2.getText(); // t2에 입력되는 값을 변수 s2로 저장
				// System.out.println(s1); // 출력값이 잘 나오는지 확인 하는 출력
				// System.out.println(s2);

				int i1 = Integer.parseInt(s1); // 스트링으로 입력된 s1 값을 계산해주기 위해 int로 캐스팅!
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기(); // 위의 입력값들을 계산기 class를 활용해서 처리할꺼야
				int i3 = cal.minus(i1, i2); // cal class로 처리한 값을 반환받아 i3변수에 저장한다!
				String result = Integer.toString(i3);
				// setText는 스트링 값만 입력이 가능하기 때문에 int 값을 다시 String으로 캐스팅해준다
				t3.setText(result);
			}
		});
		btnNewButton_1.setBounds(144, 243, 97, 23);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("곱하기 *");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기 실행!");
				String s1 = t1.getText(); // t1에 입력되는 값을 변수 s1로 저장
				String s2 = t2.getText(); // t2에 입력되는 값을 변수 s2로 저장
				// System.out.println(s1); // 출력값이 잘 나오는지 확인 하는 출력
				// System.out.println(s2);

				int i1 = Integer.parseInt(s1); // 스트링으로 입력된 s1 값을 계산해주기 위해 int로 캐스팅!
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기(); // 위의 입력값들을 계산기 class를 활용해서 처리할꺼야
				int i3 = cal.mul(i1, i2); // cal class로 처리한 값을 반환받아 i3변수에 저장한다!
				String result = Integer.toString(i3);
				// setText는 스트링 값만 입력이 가능하기 때문에 int 값을 다시 String으로 캐스팅해준다
				t3.setText(result);
			}
		});
		btnNewButton_2.setBounds(253, 243, 97, 23);
		f.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("나누기 /");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기 실행!");
				String s1 = t1.getText(); // t1에 입력되는 값을 변수 s1로 저장
				String s2 = t2.getText(); // t2에 입력되는 값을 변수 s2로 저장
				// System.out.println(s1); // 출력값이 잘 나오는지 확인 하는 출력
				// System.out.println(s2);

				double i1 = Double.parseDouble(s1); // 스트링으로 입력된 s1 값을 계산해주기 위해 int로 캐스팅!
				double i2 = Double.parseDouble(s2); // 스트링으로 입력된 s1 값을 계산해주기 위해 int로 캐스팅!
				// 나누기는 실수형으로 계산되기 때문에 double로 진행
				계산기 cal = new 계산기(); // 위의 입력값들을 계산기 class를 활용해서 처리할꺼야
				double i3 = cal.div(i1, i2); 
				String result = String.format("%.3f", i3);
				// setText에 넣기 위해 double -> String 으로 캐스팅
				// 소수점이 길어지면 소수점 아래 4번째에서 반올림 하여 3자리수 까지만 표시
				t3.setText(result);

			}
		});
		btnNewButton_3.setBounds(362, 243, 97, 23);
		f.getContentPane().add(btnNewButton_3);

		JLabel lblNewLabel_2 = new JLabel("결과값");
		lblNewLabel_2.setBounds(98, 163, 57, 15);
		f.getContentPane().add(lblNewLabel_2);

		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setBounds(186, 160, 116, 21);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		f.setVisible(true);

	}

}
