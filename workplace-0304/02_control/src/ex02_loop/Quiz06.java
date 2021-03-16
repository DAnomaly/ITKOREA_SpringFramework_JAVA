package ex02_loop;

import java.util.Scanner;

// 10000원 모두 사용하기
// 현재 10000원이 있습니다
// 결제금액 >>> 5000
// 현재 5000원이 있습니다
// 결제금액 >>> -100
// -100원은 결제할 수 없습니다
// 현재 5000원이 있습니다
// 결제금액 >>> 10000
// 5000원이 부족합니다
// 현재 5000원이 있습니다
// 결제금액 >>> 5000
// 현재 0원이 있습니다

public class Quiz06 {
	
	public static void main(String[] args) {
		int money = 10000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재" + money + "원이 있습니다");	
		
		while(money > 0) {
			System.out.print("결제금액 >>> ");
			int price = sc.nextInt();
			if(price <= 0) {
				System.out.println(price + "원은 결제할 수 없습니다");
				continue;
			}
			if(money < price) {
				System.out.println(price - money + "원이 부족합니다");
				continue;
			}
			money -= price;
			System.out.println("현재" + money + "원이 있습니다");
		}
		sc.close();
	}
	
	
}
