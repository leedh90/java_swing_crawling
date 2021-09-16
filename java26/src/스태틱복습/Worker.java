package 스태틱복습;

public class Worker {
	// 멤버변수는 instance + static
	String name; // instance 변수 -> 객체생성시 각 객체에 복사되는 변수
	String gender;
	int age;

	// 스테틱 변수는 class 전체에 1개만 존재, 객체생성과 상관없이 사용할 수 있다.
	static int count; // 직원수 카운트 해주는 스테틱 변수
	static int sum; // 직원들의 나이를 더하는 스테틱 변수

	public Worker(String name, String gender, int age) {
		super();
		count++;
		sum = sum + age;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

}
