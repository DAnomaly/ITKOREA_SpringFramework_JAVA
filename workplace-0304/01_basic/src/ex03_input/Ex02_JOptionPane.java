package ex03_input;

import javax.swing.JOptionPane;

public class Ex02_JOptionPane {
	
	public static void main(String[] args) {
		
		// JOptionPane 클래스
		// 1. 패키지 : javax.swing
		// 2. 메소드 : 
		// 	  1) showInputDialog() : 입력 대화상자
		// 	  2) showConfirmDialog() : 학인 대화상자
		// 	  3) showMessageDialog() : 출력 대화상자
		//    주의) showInputDialog()는 언제나 String을 반환합니다.
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		String sAge = JOptionPane.showInputDialog("나이를 입력하세요");
		String sHeight = JOptionPane.showInputDialog("키를 입력하세요");
		String sGender = JOptionPane.showInputDialog("성별을 입력하세요");
		
		// String이 아닌 입력은 본래 타입으로 변환합니다.
		int age = Integer.parseInt(sAge);
		double height = Double.parseDouble(sHeight);
		char gender = sGender.charAt(0);
		
		// 출력합시다.
		String message = "이름 : " + name +
				", 나이 : " + age + 
				", 키 : " + height +
				", 성별 : " + gender ;
		JOptionPane.showMessageDialog(null, message);
		
		
		
		
		
	}
	
}
