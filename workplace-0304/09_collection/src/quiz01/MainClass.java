package quiz01;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

// 문제 :
// 임의의 Member를 3명 저장하고,
// 사용자로부터 회원번호를 입력 받아서 해당 회원의 삭제를 진행하시오.

public class MainClass {

	public static void main(String[] args) {
		
		Date date = new Date(System.currentTimeMillis()); 
		
		List<Member> list = new ArrayList<>();
		
		list.add(new Member(10, "admin", date));
		list.add(new Member(11, "Laffey", date));
		list.add(new Member(12, "Z46", date));
		
		for (Member member : list) {
			System.out.println(member);
		}
		
		System.out.println(); // --------------------
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제 >> ");
		int num = sc.nextInt();
		sc.close();
		
		int removeIdx = -1; // 삭제할 회원의 인덱스
		for (int i = 0, length = list.size(); i < length; i++) {
			if(list.get(i).getMNo() == num) {
				removeIdx = i;
				break;
			}
		}
		
		if(removeIdx == -1) {
			System.out.println("mNo와 일치하는 Member를 찾지 못하였습니다");
		}else {
			Member removeM = list.remove(removeIdx); // list.remove의 반환형 타입 Member
			System.out.println(removeM);
			System.out.println("위 회원을 정상적으로 삭제하였습니다");
		}
		
		
		System.out.println(); // --------------------

		// System.out.println(list); // 이걸로도 되긴 함, 안 예쁠 뿐...
		
		for (Member member : list) {
			System.out.println(member);
		}
		
	}
	
}
