package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import 클래스연습.계산기;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기프로그램 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setBounds(69, 79, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(Color.RED);
		t1.setBounds(142, 76, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setBounds(69, 129, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setColumns(10);
		t2.setBounds(142, 126, 116, 21);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기 +");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 버튼 클릭됨");
				// t1, t2에 입력한 값을 가지고 와야함!
				String s1 = t1.getText(); // 스트링으로 t1(입력된 값)값을 가져다 준다.!
				String s2 = t2.getText(); // 스트링으로 t2값을 가져다 준다.!
				System.out.println(s1);
				System.out.println(s2);
				
				//String을 int로 변환해야 계산기 실행 가능!
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음
				//변수에 결과값을 넣을 수 있다!
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.add(i1, i2);
				t3.setText("더한 값은 " + result);
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(12, 197, 97, 46);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기 -");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("빼기 버튼 클릭됨");
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.minus(i1, i2);
				t3.setText("뺀 값은 " + result);
			}
		});
		btnNewButton_1.setBounds(134, 197, 97, 46);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("곱하기 *");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기버튼 클릭됨");
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1); // 값이 잘 출력되는지 확인하는 프린트!
				System.out.println(s2);
				
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.mul(i1, i2);
				// 계산기 class에서 곱하기는 값을 리턴시켜주기 때문에 변수에 저장할 수 있다.!
				f.setTitle("곱한 값은 " + result);
				// 결과값을 result라는 변수에 저장시킨 뒤에 f프레임의 제목부분에 저장된 결과값을 표시한다!
				t3.setText("곱한 값은 " + result);
			}
		});
		btnNewButton_2.setBackground(Color.MAGENTA);
		btnNewButton_2.setBounds(243, 197, 97, 46);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("나누기 /");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기버튼 클릭됨");
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				Double d1 = Double.parseDouble(s1);
				// 나누기는 실수타입이기 때문에 입력된 스트링 타입의 값을 실수타입으로 캐스팅 해준다.
				Double d2 = Double.parseDouble(s2);
				계산기 cal = new 계산기();
				double result = cal.div(d1, d2);
				t3.setText("나눈 값은 " + result);
				System.out.printf("%.3f", result);
			}
		});
		btnNewButton_3.setBackground(Color.MAGENTA);
		btnNewButton_3.setBounds(352, 197, 97, 46);
		f.getContentPane().add(btnNewButton_3);
		
		t3 = new JTextField();
		t3.setForeground(Color.RED);
		t3.setColumns(10);
		t3.setBounds(142, 166, 116, 21);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1 = new JLabel("결과값");
		lblNewLabel_1_1.setBounds(69, 169, 57, 15);
		f.getContentPane().add(lblNewLabel_1_1);
		f.setVisible(true);
	}
}
