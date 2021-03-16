package ex02_2d_array;

// 2. 구구단의 결과만 2차원 배열에 저장하고 출력하기
// 2 4 6 8 .. 18
// 3 6 9 .. 27

public class Quiz02 {

	public static void main(String[] args) {
		int[][] gugudan = new int[9 - 1][9];

		// 구구단의 값을 gugudan에 저장
		for (int i = 0; i < gugudan.length; i++) {
			for (int j = 0; j < gugudan[i].length; j++) {
				gugudan[i][j] = (i + 2) * (j + 1);
			}
		}

		// gugudan 출력
		int dan = 2;
		for (int[] is : gugudan) {
			System.out.print(String.format("%d단 >>", dan++));
			for (int is2 : is) {
				if (is2 < 10)
					System.out.print(" " + is2 + " ");
				else
					System.out.print(is2 + " ");
			}
			System.out.println();
		}
	}

}
