package quiz12;

public class Seat {
	
	// field
	private String name;
	
	// constructor
	
	// method
	// setter
	// 1. 예매 (예매자 이름 저장)
	public void setName(String name) {
		this.name = name;
	}
	// getter
	// 2. 예매자 이름 확인
	public String getName() {
		return name;
	}
	
	// 3. 예매 취소
	public void cancel() {
		name = null;
	}
	
	// 4. 예매 여부 확인
	// 1) 예매 가능 좌석   	: true
	// 2) 예매 불가능 좌석 	: false
	public boolean check() {
		return name == null || name.isEmpty();
	}
	
	// 5. 좌석 정보 출력
	public void info() {
		if(name == null || name.isEmpty()) {
			System.out.println("[Empty ]");
		}else {
			System.out.println("[Filled]"+name);
		}
	}
	
}
