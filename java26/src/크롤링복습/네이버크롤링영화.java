package 크롤링복습;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링영화 {

	public static void main(String[] args) throws Exception {
		// 네이버영화크롤링
		Document doc = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn").get();
		// Jsoup를 활용해서 크롤링할 사이트 연결
		
		// 연결한 사이트에서 html문서를 받아오세요.
		Elements e = doc.select("dt.tit a"); // dt.tit에서 a를 선택 띄어쓰기는 그 안에 있는 이라는 의미
		System.out.println(e.size()); // 총 갯수 몇개인지
		for (int i = 0; i < e.size(); i++) {
			System.out.println(i + ": " + e.get(i).text()); // 텍스트만 뽑아서 보기
		}
		Elements imgs = doc.getElementsByTag("img");
		if (imgs.size() > 0) {
			String src = imgs.get(0).attr("src");
			System.out.println(src);
		}
	}

}
