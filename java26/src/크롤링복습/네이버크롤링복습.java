package 크롤링복습;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링복습 {

	public static void main(String[] args) throws Exception {
		// 한페이지에서 2개 크롤링하기
		Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekdayList.nhn?week=thu").get();
		// doc객체에 주소에 있는 html 소스를 전부 넣어줘
		Elements title = doc.select("dl dt a"); // html중에서 div.thumb 구간을 선택해
		// System.out.println(title); // 잘 가져왔는지 보는 프린트
		// System.out.println(title.size()); // 사이즈 확인
		Elements grade = doc.select("div.rating_type");
		// System.out.println(grade); // 평점 잘 가져오는지 확인
		// System.out.println(grade.size()); // 갯수확인
			for (int i = 0; i < grade.size(); i++) {
				System.out.println(title.get(i+3).text() + " " + grade.get(i).text());
			
		}

	}

}