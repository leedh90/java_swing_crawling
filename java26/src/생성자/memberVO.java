package 생성자;

//전달할때 각 값들을 따로 보내는것보다 가방을 하나 만들어서! 전부 넣고 전달하는것이 효율적!
public class memberVO {
	String id;
	String pw;
	String name;
	String tel;

	// 값을 넣고 뺄때는 변수 하나씩 기능을 처리한다.
	// 각 변수마다 넣는 기능, 빼는 기능이 필요하다.
	// 기능은 메서드로 구현
	// setters, getters 사용
	// 상단 소스 -> 제너레이트 게터즈 앤 세터즈 사용!
	public void setID(String id) {// 넣는거는 set를 사용! 넣는거는 반환값이 없기 때문에 void
		this.id = id; // 전역변수와 지역변수의 이름이 같을때는 지역변수가 우선한다!
		// 같은 이름을 사용할때는 전역변수를 앞에 this를 붙여서 전역변수임을 나타낸다!
	}

	public String getID() {// id 에 있는걸 꺼내오기 때문에 매게변수는 필요없다!
		// 꺼내오는건 반환값이기 때문에 void 사용 하면 안되고 리턴되는 값의 타입을 적용!
		return id;// id에 있는 값을 반환받아 꺼내온다!
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
