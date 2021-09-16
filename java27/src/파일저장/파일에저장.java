package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장 { // 파일에 잘 저장되는지 확인하기 위한 코딩! 그래서 main이 있다!

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		try {
			// 해당 폴더와 스트림(연결)을 만든다
			// 스트림의 특징은 한방향! 역행하지 않는다!
			FileWriter f = new FileWriter("c:/data(java)/" + s1 + ".txt"); // c: c드라이브  / 밑에
			// FileWriter f = new FileWriter("c:\\data(java)\\" + s1 + ".txt"); // c: c드라이브  / 밑에
			// 역슬래시 사용으로 동일하게 표현가능
			// 앞에서부터 경로를 쭉 쓰는걸 절대경로 라고 한다.
			// filewriter -> 문자를 저장하는 부품!
			// filewriter는 입력값 없이 사용할 수 없다
			// 문자를 불러올때는 filereader 사용!
			f.write(s1 + "\n"); // \n 엔터의 기능
			f.write(s2 + "\n");
			f.write(s3 + "\n");
			f.close(); // 외부자원과 연결된 스트림 메서드는 항상 클로즈를 사용해서 자원해제 시켜야한다.
			// CRUD 사용할때도 꼭 각 메서드 마다 닫아주는 역할인 스트림을 끊어주는 close 메서드를 꼭 써줬어야 했다.
		} catch (IOException e) {
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러정보는 " + e.getMessage()); // 에러정보를 나타내주는 getmessage 사용
			// 경로 지정하지 않으면 project 폴더 안에 생긴다.
			// e.printStackTrace(); 자동완성은 전체 에러 정보를 가져오는 프린트스택트레이스 사용
		}

	}

}
