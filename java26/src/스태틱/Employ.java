package 스태틱;

public class Employ {
	String name;
	String gender;
	int age; // 3개는 instance 값이 저장되는 멤버변수

	static int count; // 직원수 카운팅을 위한 static변수
	// 객체생성의 영향없이 사용할 수 있는 static 변수
	// static 변수는 class당 1개만 존재한다.
	static int sum; // 각 직원의 나이를 더해줄 static 변수

	public Employ(String name, String gender, int age) {
		count++; // 생성된 객체수에 상관없이 카운팅을 해주는 static 변수
		sum = sum + age;
		this.name = name; // 각 생성된 객체마다 다른 값을 가지는 멤버변수
		this.gender = gender; // 각 생성된 객체마다 다른 값을 가지는 멤버변수
		this.age = age; // 각 생성된 객체마다 다른 값을 가지는 멤버변수
	}
	public static void getAvg() {//메서드도 static으로 만들 수 있다 반환값 앞에 static 사용!
		// static 메서드에는 instance 변수값이 들어올 수 없고 static 변수값만 들어올 수 있다
		// 객체의 유무에 따라 사용법이 다르기 때문에 같이 사용할 수 없다
		System.out.println(sum / (double)count); // 스태틱메서드에는 스태틱변수만 사용가능
	}

	@Override
	public String toString() {
		return "Employ [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}