package 생성자복습;

public class BBS {
	// 멤버변수 생성
	int no; // 멤버변수는 자동 초기화로 초기화할 필요 없음
	String title;
	String content;
	String writer;
	
	public BBS(int n, String t, String c, String w) { // 오버로딩을 사용해서 BBS 메서드를 2개 생성
		this.no = n;
		this.title = t;
		this.content = c;
		this.writer = w;
		// 입력값을 넣어서 각 값들이 출력되게 하는 메서드
		
	}
	public BBS () {
		// 기본적으로 입력값 없이 출력하게 하는 메서드
		System.out.println("no" + "   title" + "   content" + "   writer");
	}

	@Override
	public String toString() {
		return no + "   " + title + "   " + content + "   " + writer;
	}
	
}
