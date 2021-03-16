package ex01_random;

import java.util.Arrays;
import java.util.Scanner;

// 6. 로또 구매하기
// 1000원에 번호 6개 1세트
// 얼마? >>> 5000

public class Quiz06 {

	public static void main(String[] args) {
		final int MIN_NUM = 1;
		final int MAX_NUM = 45;

		Scanner sc = new Scanner(System.in);
		System.out.print("얼마? >>> ");
		int money = sc.nextInt();
		if (money < 1000) {
			System.out.println("구매가 불가합니다");
			sc.close();
			return;
		}

		int[][] nums = new int[money / 1000][6];

		// 무작위 번호뽑기
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				w1: while (true) {
					int random_num = (int) (Math.random() * MAX_NUM + MIN_NUM);
					for (int ar_num : nums[i]) {
						if (random_num == ar_num)
							continue w1;
					}
					nums[i][j] = random_num;
					break;
				}
			}
		}

		// 작은 수부터 숫자 정렬
		for (int i = 0; i < nums.length; i++) {
			Arrays.sort(nums[i]);
		}

		// 출력
		for (int[] line : nums) {
			for (int num : line) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
