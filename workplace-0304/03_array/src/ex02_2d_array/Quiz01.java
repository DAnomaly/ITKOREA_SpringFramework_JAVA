package ex02_2d_array;

// 1. 인구조사
// apt에 사는 사람 수를 초기화 해 놓고,
// 전체 사람의 수를 출력하기
// 1층에 3명이 삽니다
// 2층에 7명이 삽니다
// 3층에 6명이 삽니다
// 4층에 5명이 삽니다
// 5층에 7명이 삽니다
// apt에 28명이 삽니다

public class Quiz01 {
	
	public static void main(String[] args) {
	
		// 5층 2호
		int[][] apt = {
				{1, 2} , {5, 2}, {3, 3} , {1, 4}, {5, 2}
		};
		int total = 0;
		
		// 층별 출력
		for (int i = 0; i < apt.length; i++) {
			int floor = 0;
			for (int j = 0; j < apt[i].length; j++) 
				floor += apt[i][j];
			total += floor;	// i층의 인원 total에 합산
			System.out.println(String.format("%d층에 %d명이 삽니다", i+1, floor));
		}
		
		// apt 인원 출력
		System.out.println(String.format("apt에 %d명이 삽니다", total));
	}
	
}
