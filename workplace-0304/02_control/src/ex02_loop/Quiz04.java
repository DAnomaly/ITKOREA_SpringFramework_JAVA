package ex02_loop;

import java.util.Scanner;

public class Quiz04 {
	
	// 3. 비밀번호를 "asdf"로 가정합니다.
	// 비밀번호를 입력 받아서 일치하면 "로그인되었습니다"
	// 일치하지 않으면 "비밀번호가 일치하지 않습니다."
	// 최대 5번만 입력을 받을 수 있습니다.
	// 5번 실패하면 "비밀번호 입력 휫수를 초과했습니다"
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count_try = 0;
		String password = "asdf";
		
		while (true) {
			System.out.print("비밀번호 >> ");
			String input_password = sc.next();
			if(input_password.equals(password)) {
				System.out.println("로그인되었습니다");
				break;
			}
			System.out.println("비밀번호가 일치하지 않습니다");
			if(++count_try >= 5) {
				System.out.println("비밀번호 입력 휫수를 초과했습니다");
				break;
			}
		}
		
		sc.close();
		
		
	}
}
