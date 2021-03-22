package ex17_Object.ex04;

public class MainClass {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		
		p1.setModel("CA-001");
		p1.setManufacturer("BIO");
		p1.setDate("2021-03-01");
		
		p2.setModel("CA-001");
		p2.setManufacturer("BIO");
		p2.setDate("2021-05-21");
		
		// 같은 종류의 제품(model, manufacturer가 모두 같은 경우)
		// 제품은 2개(독립적인 제품)
		
		// Object의 equals() 메소드는 객체의 데이터를 비교하지 않고,
		// 같은 주소에 저장된 객체인지 다른 주소에 저장된 객체인지 비교합니다
		
		if(p1.equals(p2)) 
			System.out.println("같은 종류의 제품입니다");
		else
			System.out.println("다른 종류의 제품입니다");
		
	}
	
}
