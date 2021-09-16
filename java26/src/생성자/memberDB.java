package 생성자;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class memberDB {
	// 공통된 코드가 보임
	// 객체생성시 반드시 해주어야하는 작업!
	// 1. 클래스 이름과 동일한 메서드가 객체 생성시 자동호출된다.
	// 2. 프로그래머가 클래스 이름과 동일한 메서드가 자동으로 만들어 진다.
    //	  (메서드가 비어있다.)
	// 3. 객체 생성시 클래스 이름과 동일한 메서드로 자동호출되는 메서드를 생성자 메서드! 줄여서 생성자로 부름
    //    객체 생성시 자동호출되는 메서드라고 해서 생성자 메서드!
	//    constructor, 생성자
	Connection con; // 변수 선언된 위치가 중요! 선언된 위치안에서만 사용 가능!{}로 판단
	
	public memberDB() throws Exception {// 리턴에 대해서 언급이 없음 클래스이름과 같은 메서드!(대문자 소문자 확인 필)
		System.out.println("내가 객체생성시 자동호출됩니다.");
		ArrayList<memberVO> list = new ArrayList<>();

		// 1. 커넥터 사용하겠다고 설정해야한다!
	    Class.forName("com.mysql.jdbc.Driver"); // 폴더(패키지)는 대문자로 안만든다! class는 대문자로 만든다!
	    // 커넥터 연결!
	    //PrintWriter out = new PrintWriter(); 원래는 이건데 많이 쓰이기 때문에 간략하게 사용가능! 아래!
	    // out.write("1. 커넥터 사용 설정 성공. <br>"); // 브라우저에 보여지는 class jsp는 out.writer -> java는 syso로 대체 컨트롤f
	    System.out.println("1. 커넥터 사용 설정 성공. <br>"); // 브라우저에 보여지는 class
	    
	    // 2. 커넥터로 db연결하기! -shop db에 id:root, pw:1234(내가연결할 서버의 정보) 라는 정보 꼭 필요!
	    String url = "jdbc:mysql://localhost:3306/shop";
	    // (jdbc:연결프로그램://주소/db이름) 커넥션 구문(정해진 구문! 항상 저걸 사용해서 연결!)
	    // jsp에서의 자동 import: 클릭 후 컨트롤+쉬프트+m(java는 컨트롤+쉬프트+o)
	    con = DriverManager.getConnection(url, "root", "1234"); //url, id, pw 정보를 입력해야 사용가능!
	    // db연결!
	    // 참조형 변수는 주소값을 가지고 해당 주소가 가지고 있는 메서드를 사용할 수 있다.
	    // 같은 class가 많을때는 패키지명으로 구별해서 사용한다. Connection은 java.sql 사용!
	    System.out.println("2. db연결 성공! <br>");
	}
	
	public ArrayList<memberVO> list() throws Exception {//memberVO bag들어 있는 list!
		ArrayList<memberVO> list = new ArrayList<>();
		// delete는 유니크한 값 하나만 있으면 된다(프라이머리 키 pk)
		// 자바에서 자동 import 기능 컨트롤+쉬프트+o 한번에 전부다 바꿔줌!(자기가 원하는 class를 선택해야 한다!)
			    
	    // 3. SQL문을 만든다.
	    // String sql = "insert into member values ('win2','win2','win2','win2')"; 내가 입력해서 직접 db에 넣어주는 입력
	    String sql = "select * from member"; // 입력값이 없기때문에 그냥 셀렉만 한다!
	    // 여기서 SQL문을 받을 수 있다!
	    // 지금은 그냥 sql 이라는 변수는 뒤에 나온 말이구나 라는 문자열의 값으로 인식!
	    // 해당을 써서 SQL 문으로 인식하게 해야한다.!
	    PreparedStatement ps = con.prepareStatement(sql);
	    System.out.println("3. SQL문 만들기 성공! <br>");
	    // SQL문을 만든다!
	    // sql문으로 바꿔주는 class! PreparedStatement!
	    // java에서 사용하기 때문에 sql문은 ''을 사용해야한다.
	    
	    // 4. SQL문을 mySQL서버로 전송한다!
	    ResultSet rs = ps.executeQuery();
	    // SQL문에서 read만 유일하게 다른 메서드 사용(쿼리라는 메서드)
	    // ResultSet class를 통해서 테이블 전체를 rs 변수에 넣어준다.
	    // 순서로 꺼낼 수 있고, 컬럼명으로 꺼내는 것도 가능하다!
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공! <br>");
	    
	    // 1. 검색결과가 있는지 체크해야한다.
	    // System.out.println(rs.next());//true -> 있다, false -> 없다!
	    // 2. 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 됨.
	    while (rs.next()) {
	    	//re.next()를 호출할때 마다 한 row(행)씩 내려가서 있는지를 체크 : boolean
	    	//있으면 true, 없으면 false
	    	//꺼내주는 방법은 2가지! 1) 항목명, 2) 인덱스
			String id2 = rs.getString("id"); // 항목명으로 1개만 써내줄때
			String pw2 = rs.getString(2); // 인덱스로 2번째 항목을 꺼낸다.
			String name2 = rs.getString("name"); // 항목명으로 1개만 써내줄때
			String tel2 = rs.getString("tel"); // 항목명으로 1개만 써내줄때
			
			// 가방을 만들어서 꺼내준 값들을 가방에 넣는다!
			memberVO bag = new memberVO(); // bag의 타입은 memberVO인 참조형!
			bag.setID(id2);
			bag.setPw(pw2);
			bag.setName(name2);
			bag.setTel(tel2);
			
			// 가방을 arraylist인 list에 넣어준다!
			list.add(bag);
			
		}
	    return list; // list값을 반환하여준다!
	}
	
	public boolean check(String id, String pw) throws Exception {
	    
	    // 3. SQL문을 만든다.
	    // String sql = "insert into member values ('win2','win2','win2','win2')"; 내가 입력해서 직접 db에 넣어주는 입력
	    String sql = "select * from member where id = ? and pw = ?";
	    // where절은 조건이랑 같은 의미이다!
	    // 입력값을 알 수 없을때는 ? 연산자를 사용! 2가지 값을 확인한다!
	    // 여기서 SQL문을 받을 수 있다!
	    // 지금은 그냥 sql 이라는 변수는 뒤에 나온 말이구나 라는 문자열의 값으로 인식!
	    // 해당을 써서 SQL 문으로 인식하게 해야한다.!
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id); // 고유값 하나만 만들면 된다!
	    ps.setString(2, pw); // 고유값 하나만 만들면 된다!
	    System.out.println("3. SQL문 만들기 성공! <br>");
	    // SQL문을 만든다!
	    // sql문으로 바꿔주는 class! PreparedStatement!
	    // java에서 사용하기 때문에 sql문은 ''을 사용해야한다.
	    
	    // 4. SQL문을 mySQL서버로 전송한다!
	    ResultSet rs = ps.executeQuery();
	    // SQL문에서 read만 유일하게 다른 메서드 사용(쿼리라는 메서드)
	    // ResultSet class를 통해서 테이블 전체를 rs 변수에 넣어준다.
	    // 순서로 꺼낼 수 있고, 컬럼명으로 꺼내는 것도 가능하다!
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공! <br>");
	    boolean result = false; // boolean 초기화시 값은 false로 초기화!
	    
	    // 1. 검색결과가 있는지 체크해야한다.
	    // System.out.println(rs.next());//true -> 있다, false -> 없다!
	    // 2. 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 됨.
	    if (rs.next()) {//꺼내주는 방법은 2가지! 1) 항목명, 2) 인덱스
	    	result = true;
		}
	    return result;
	}
	//CRUD기능
	public void create(memberVO bag) throws Exception {
	    
	    // 3. SQL문을 만든다.
	    // String sql = "insert into member values ('win2','win2','win2','win2')"; 내가 입력해서 직접 db에 넣어주는 입력
	    String sql = "insert into member values (?, ?, ?, ?)"; // 입력값을 알 수 없을때는 ? 연산자를 사용!
	    // 여기서 SQL문을 받을 수 있다!
	    // 지금은 그냥 sql 이라는 변수는 뒤에 나온 말이구나 라는 문자열의 값으로 인식!
	    // 해당을 써서 SQL 문으로 인식하게 해야한다.!
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getID());
	    ps.setString(2, bag.getPw());
	    ps.setString(3, bag.getName());
	    ps.setString(4, bag.getTel());
	    System.out.println("3. SQL문 만들기 성공! <br>");
	    // SQL문을 만든다!
	    // sql문으로 바꿔주는 class! PreparedStatement!
	    // java에서 사용하기 때문에 sql문은 ''을 사용해야한다.
	    
	    // 4. SQL문을 mySQL서버로 전송한다!
	    ps.executeUpdate(); // SQL문을 서버로 전송하는 executeUpdate 메서드 사용!
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공! <br>");
	}
	public memberVO read(String id) throws Exception {// bag의 타입이 넘어온다! memberVO
	    
	    // 3. SQL문을 만든다.
	    // String sql = "insert into member values ('win2','win2','win2','win2')"; 내가 입력해서 직접 db에 넣어주는 입력
	    String sql = "select * from member where id = ?"; // 입력값을 알 수 없을때는 ? 연산자를 사용! delete sql문을 사용!
	    // 여기서 SQL문을 받을 수 있다!
	    // 지금은 그냥 sql 이라는 변수는 뒤에 나온 말이구나 라는 문자열의 값으로 인식!
	    // 해당을 써서 SQL 문으로 인식하게 해야한다.!
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id); // 고유값 하나만 만들면 된다!
	    System.out.println("3. SQL문 만들기 성공! <br>");
	    // SQL문을 만든다!
	    // sql문으로 바꿔주는 class! PreparedStatement!
	    // java에서 사용하기 때문에 sql문은 ''을 사용해야한다.
	    
	    // 4. SQL문을 mySQL서버로 전송한다!
	    ResultSet rs = ps.executeQuery();
	    // SQL문에서 read만 유일하게 다른 메서드 사용(쿼리라는 메서드)
	    // ResultSet class를 통해서 테이블 전체를 rs 변수에 넣어준다.
	    // 순서로 꺼낼 수 있고, 컬럼명으로 꺼내는 것도 가능하다!
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공! <br>");
	    
	    // 1. 검색결과가 있는지 체크해야한다.
	    // System.out.println(rs.next());//true -> 있다, false -> 없다!
	    // 2. 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 됨.
	    memberVO bag = new memberVO(); // bag의 타입은 memberVO인 참조형!
	    if (rs.next()) {//꺼내주는 방법은 2가지! 1) 항목명, 2) 인덱스
			String id2 = rs.getString("id"); // 항목명으로 1개만 써내줄때
			String pw2 = rs.getString(2); // 인덱스로 2번째 항목을 꺼낸다.
			String name2 = rs.getString("name"); // 항목명으로 1개만 써내줄때
			String tel2 = rs.getString("tel"); // 항목명으로 1개만 써내줄때
			bag.setID(id2);
			bag.setPw(pw2);
			bag.setName(name2);
			bag.setTel(tel2);
			
		}
	    return bag;
	}
		
	public void update(memberVO bag) throws Exception {
	    
	    // 3. SQL문을 만든다.
	    // String sql = "insert into member values ('win2','win2','win2','win2')"; 내가 입력해서 직접 db에 넣어주는 입력
	    String sql = "update member set pw = ?, tel = ? where id = ?"; // 입력값을 알 수 없을때는 ? 연산자를 사용!
	    // 수정할 마지막 변수 뒤에 , 없이 스페이스로만 구별한다!
	    // 여기서 SQL문을 받을 수 있다 update SQP문 set -> 변경 수정할 값을 의미, where -> 어떤걸로 찾을꺼니? 라는 의미!
	    // 지금은 그냥 sql 이라는 변수는 뒤에 나온 말이구나 라는 문자열의 값으로 인식!
	    // 해당을 써서 SQL 문으로 인식하게 해야한다.!
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, bag.getPw());
	    ps.setString(2, bag.getTel());
	    ps.setString(3, bag.getID());
	    // ? 의 순서대로 잡아야한다!
	    System.out.println("3. SQL문 만들기 성공! <br>");
	    // SQL문을 만든다!
	    // sql문으로 바꿔주는 class! PreparedStatement!
	    // java에서 사용하기 때문에 sql문은 ''을 사용해야한다.
	    
	    // 4. SQL문을 mySQL서버로 전송한다!
	    ps.executeUpdate(); // SQL문을 서버로 전송하는 executeUpdate 메서드 사용!
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공! <br>");
	}
	public void delete(String id) throws Exception {
	    
	    // 3. SQL문을 만든다.
	    // String sql = "insert into member values ('win2','win2','win2','win2')"; 내가 입력해서 직접 db에 넣어주는 입력
	    String sql = "delete from member where id = ?"; // 입력값을 알 수 없을때는 ? 연산자를 사용! delete sql문을 사용!
	    // 여기서 SQL문을 받을 수 있다!
	    // 지금은 그냥 sql 이라는 변수는 뒤에 나온 말이구나 라는 문자열의 값으로 인식!
	    // 해당을 써서 SQL 문으로 인식하게 해야한다.!
	    PreparedStatement ps = con.prepareStatement(sql);
	    ps.setString(1, id); // 고유값 하나만 만들면 된다!
	    System.out.println("3. SQL문 만들기 성공! <br>");
	    // SQL문을 만든다!
	    // sql문으로 바꿔주는 class! PreparedStatement!
	    // java에서 사용하기 때문에 sql문은 ''을 사용해야한다.
	    
	    // 4. SQL문을 mySQL서버로 전송한다!
	    ps.executeUpdate(); // SQL문을 서버로 전송하는 executeUpdate 메서드 사용!
	    System.out.println("4. SQL문을 mySQL서버로 전송 성공! <br>");
	}
	
}
