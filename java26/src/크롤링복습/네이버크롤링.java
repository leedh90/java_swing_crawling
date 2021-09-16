package 크롤링복습;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) throws Exception {
		// 네이버 부동산 크롤링하기
		Document doc = Jsoup.connect("https://new.land.naver.com/complexes?ms=37.6102841,126.7293121,17&a=APT:ABYG:JGC&b=A1&e=RETAIL").get();
		// Document 형태의 객체에 해당 웹사이트 주소를 connect하여 소스파일을get 합니다. 
		// java에서 크롤링 사용할때 커넥트 역할로 jsoup 사용!
		// 체인식 코딩 사용으로 코딩 길이 줄일 수 있다.
		// .get url에 있는 html을 가지고 와라 doc에 네이버 홈페이지의 html 소스를 저장한다.
		Elements span = doc.select("span.lnb_item_line"); // doc에 있는 html 에서 내가 원하는 부분을 선택!
		// 셀렉트는 항상 엘리먼츠입!(복수형)
		// System.out.println(span); // 잘 크롤링 됫는지 확인
		// System.out.println(span.text()); // 텍스트만 출력 
		
		for (int i = 0; i < span.size(); i++) { // 이쁘게 보기 위해서 for문 출력
			System.out.println(i + ": " + span.get(i).text());
		}
		// 부동산 세부사항 크롤링
		Document doc1 = Jsoup.connect("https://new.land.naver.com/complexes/107015?ms=37.6075558,126.7315222,17&a=APT:ABYG:JGC&b=A1&e=RETAIL").get();
		// 내가 가져올 사이트 주소의 모든 html 소스를 doc1에 저장
		Elements span1 = doc1.select("div.item_inner");
		System.out.println(span1);
		System.out.println(span1.size());
		System.out.println("하이");
		
	}

}
