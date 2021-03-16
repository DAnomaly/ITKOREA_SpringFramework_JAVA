package ex03_input;

import javax.swing.JOptionPane;

public class Quiz07 {

	public static void main(String[] args) {
		
		// 체질량지수 구해서 건강상태 출력하기
		// double 타입의 몸무게와 키를 입력하고,
		// 체질량지수 = 몸무게 / 키 (단위 : m)의 제곱
		// 건강상태 = 25 이상 "과체중", 24~20 " 정상", 19이하 "저체중"
		
		String sWeight = JOptionPane.showInputDialog("몸무게");
		String sHeight = JOptionPane.showInputDialog("키");
		double weight = Double.parseDouble(sWeight);
		double height = Double.parseDouble(sHeight);
		
		double bmi = weight / ( (height * 0.01) * (height * 0.01) );
		
		
		String result = bmi >= 25 ? "과체중" : ( bmi <= 20 ? "저체중" : "정상" );
		JOptionPane.showMessageDialog(null, "BMI : " + Math.round(bmi*1000) / 1000.0 + " | " + result );
		
	}
}
