package 생성자;

public class MemeberDB사용 {

	public static void main(String[] args) throws Exception {
		// CRUD구현
		// create 기능을 사용하고 싶음.
		memberDB db = new memberDB();
		memberDB db2 = new memberDB();
		memberDB db3 = new memberDB(); // 기본생성자에 있는 처리를 진행한다.
		
//		memberVO bag = new memberVO();
//		db.create(bag); // ()에 주소를 넣어줘야 한다. 오류는 아직 안배워서 정해진데로 처리
//		db.delete("test");
//		db.read("test");
	}

}
