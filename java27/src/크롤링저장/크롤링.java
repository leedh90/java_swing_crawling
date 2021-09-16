package 크롤링저장;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링 {

	public void webtoon() { // 메서드로 생성 해서 활용
		try {// 외부자원과 연결하는 스트림은 항상 예외처리를 적용해서 그부분이 에러가 발생할 경우 처리를 해줘야한다.
			// 먼저 크롤링
			// 연결하기(네이버금요웹툰)
			Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekdayList.nhn?w" + "eek=fri").get();
			// 체인식 코딩 해당 url로 연결한뒤 html 소스를 전부 doc변수에 넣는다
			Elements title = doc.select("dl dt a"); // 해당 경로에 있는걸 선택
			Elements grade = doc.select("div.rating_type");
			Elements writer = doc.select("dd.desc");
			// select는 전부 Elements 타입의 변수에 담아야한다.(1개든 여러개든)
			// System.out.println(title.size()); // 제목의 갯수확인
			// System.out.println(grade.size()); // 평점의 갯수 확인
			// System.out.println(writer.size()); // 작가 갯수 확인
			FileWriter file = new FileWriter("c:/data(java)/금요웹툰.txt"); // ()경로지정
			// 저장을 위한 객체 생성
			// String sum = ""; // sum을 활용해 저장하기 위한 변수 선언
			
			for (int i = 0; i < grade.size(); i++) {
				System.out.println(
						title.get(i + 3).text() + "  작가 " + writer.get(i + 3).text()
						+ " " + grade.get(i).text() + "\n");
				// for 반복문을 통해 출력값 확인
				file.write(title.get(i + 3).text() + "  작가 " + writer.get(i + 3).text()
						+ " " + grade.get(i).text() + "\n\n");
				// for 반복문을 통해서 각 값들이 한 파일에 저장되게 처리
				
				// sum = sum + title.get(i + 3).text() + "  작가 " + writer.get(i + 3).text()
				// 		+ " " + grade.get(i).text() + "\n\n";
				// sum을 활용해서 file객체를 for문 밖으로 뺼 수 있다.
			}
			// System.out.println(sum); // 출력확인
			// file.write(sum); // sum 사용시 저장하는 처리
			file.close();
			
		} catch (Exception e) {
			System.out.println("크롤링실패");
		}

	}

}
