package 크롤링저장;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 크롤링프레임 {
	private static JTextField t1;

	public static void main(String[] args) {
		// 기능을 수행할 프레임 만들기
		JFrame f = new JFrame("금요웹툰 크롤링");
		f.getContentPane().setBackground(SystemColor.activeCaption);
		f.setSize(400, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("검색할 금요일 웹툰을 입력해주세요.");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(36, 63, 314, 51);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBackground(Color.YELLOW);
		t1.setBounds(98, 115, 169, 57);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("크롤링시작");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 버튼 클릭시 아래 과정 처리
				크롤링 c = new 크롤링(); // 메서드를 호출하기 위한 주소값을 가진 객체생성(참조형 변수)
				c.webtoon(); // webtoon 메서드 사용
				JOptionPane.showMessageDialog(f, "크롤링 완료 및 저장 완료");
				// 처리가 잘 되었는지 확인 하는 팝업
			}
		});
		btnNewButton.setBounds(36, 213, 291, 57);
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
		

	}

}
