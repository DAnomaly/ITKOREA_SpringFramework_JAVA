package ex01_random;

/*
 * 1.임시비밀번호 발급하기
 * 영문대문자 + 아라비아숫자 6자리
 *    5    :     5
 */

public class Quiz01 {
	public static void main(String[] args) {
		String password = "";

		for (int i = 0; i < 6; i++) {
			switch ((int) (Math.random() * 2)) {
			case 0:
				password += (char) (Math.random() * 10 + '0');
				break;
			case 1:
				password += (char) (Math.random() * 26 + 'A');
				break;
			}
		}
		System.out.printf("비밀번호 : %s", password);
	}
}
