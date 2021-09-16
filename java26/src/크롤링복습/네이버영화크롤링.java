package 크롤링복습;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버영화크롤링 {

	public static void main(String[] args) throws Exception {
		//Connection con = Jsoup.connect("http://www.naver.com");
		//Document doc = con.get();
		
		// 위에 2줄을 한줄로 할 수 있다.
		Document doc = Jsoup.connect("http://www.naver.com").get();
		// 체인식 코드! . 으로 계속 연결해서 메서드를 사용하는 코드
		// System.out.println(doc);
		Elements anav = doc.select("a.nav"); // 셀렉트는 무조건 복수형
		// 여러개는 s가 뒤에 붙는다
		System.out.println(anav); // a태그에 navclass를 사용하는 모든 걸 출력!
		System.out.println(anav.size()); // 갯수 확인
		for (Element e : anav) { // foreach문으로 출력 가능
			System.out.println(e.text()); // a.nav의 텍스트만 출력
		}
		Document doc2 = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=007570").get();
		// 체인식 코드! . 으로 계속 연결해서 메서드를 사용하는 코드
		Elements anav2 = doc2.select("span.code");
		for (Element e2 : anav2) {
			System.out.println(e2.text()); // foreach문으로도 가능하고
		}
		for (int i = 0; i < anav2.size(); i++) { // 일반 for문으로도 가능하다
			System.out.println(anav2.get(i).text());
		}
	}
}
