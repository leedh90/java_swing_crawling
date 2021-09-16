package 클래스연습;

public class 전화기 {

	public static void main(String[] args) {
		// 내가만든 Phone 이라는 class를 활용해서 객체를 생성하고 메서드를 사용할 수 있게 한다.
		Phone p1 = new Phone(); // p1이라는 객체를 생성해서 ram에 저장한다.!
		// Phone class에 있는 멤버변수까지 복사해서 가져온다.
		p1.color = "black";
		p1.type = "samsung"; // Phone에 있는 멤버변수를 사용해서 각 객체의 변수값을 입력해준다.
		
		Phone p2 = new Phone();
		p2.color = "white";
		p2.type = "apple"; // .은 해당 주소값에서 사용할 수 있는 기능을 선택하는 기능!
		
		System.out.println("p1의 전화기색:" + p1.color + " 종류는:" + p1.type);
		
		p1.on();
		p1.call();
		p1.text("철수", "굿모닝", 10); // 매개변수값을 넣을때는 순서에 맞는 타입의 변수를 넣어주어야 한다!
		p1.text("길동", "굿애프터눈", 15);
		p1.internet("네이버", 10, "어제");
		

	}

}
