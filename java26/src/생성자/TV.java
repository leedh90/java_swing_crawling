package 생성자;

public class TV {
	int ch;
	int vol;
	boolean onOff; // 멤버변수!
	
	// 기본생성자, 파라메터 없는 생성자!
	// 다른 생성자가 없음녀 자동으로 만들어 진다.
	// 다른 생성자가 없을경우 묵시적으로 정의!
	// 일단 객체생성 후, 멤버변수 값을 나중에 넣어주는 경우!
	// 다른 생성자가 있을경우 직접 생성을 해주어야 한다!
	// 파라메터가 있는경우와 없는경우를 함께 사용하고자 하는경우
	// 명시적으로 기본 생성자를 정의해주어야 한다!
	public TV() {
		
	}
	
	// 생성자, 파라메터 있는 생성자!
	// 객체생성시 이미 어떤 멤버변수값을 넣으지 알고 있을때 사용!
	public TV(int ch, int vol, boolean onOff) {// 소스 -> 제너레이트 컨스트럭쳐 유징 필드
		// super(); 있으나마나한 super
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	public void on() {
		System.out.println("켜다");
	}
	public void off() {
		System.out.println("끄다");
	}
	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
}
