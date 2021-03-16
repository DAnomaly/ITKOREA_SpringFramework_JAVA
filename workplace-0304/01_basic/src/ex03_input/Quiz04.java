package ex03_input;

import javax.swing.JOptionPane;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		// 4. int 타입의 매출액 + 등급 ( "VIP", "일반" ) 입력 받아서 실매출액 출력하기
		// 	 "VIP"는 20% 할인, "일반"은 5% 할인
		
		String sRevenue = JOptionPane.showInputDialog("매출액");
		int revenue = Integer.parseInt(sRevenue);
		
		int vip = JOptionPane.showConfirmDialog(null, "등급이 VIP이신가요?");
		
		String isVip = vip == 0 ? "VIP" : "일반";
		
		revenue -= vip == 0 ? (revenue * 0.2) : (revenue * 0.05);
		
		JOptionPane.showMessageDialog(null, isVip + " | 매출액 : " + revenue);
		
	}
}
