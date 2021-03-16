package ex02_2d_array;

// 3. ( 1 ~ 100 사이 정수 대상 )369 결과 저장하고 출력하기
// 1 2 짝 4 5 짝 7 8 짝 10
// 11 12 짝 14 15 짝 17 18 짝 20
// 21 22 짝 24 25 짝 27 28 짝 짝
// 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40
// ...
public class Quiz03 {

	public static void main(String[] args) {

		String[][] arr = new String[10][10];

		// arr에 값을 넣는다
		int i = 1;

		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < arr[j].length; j2++) {
				arr[j][j2] = i + "";
				switch (i / 10) {
				case 3:
				case 6:
				case 9:
					arr[j][j2] = "짝"; 				// 369로 시작하는 수를 "짝"으로 변경
				}
				switch (i % 10) {
				case 3:
				case 6:
				case 9:
					if (arr[j][j2].equals("짝")) 	// 369로 시작하는 수 이면
						arr[j][j2] += "짝"; 			// 369로 끝나는 수에 "짝"을 추가
					else
						arr[j][j2] = "짝"; 			// 369로 끝나는 수를 "짝"으로 변경
				}
				i++; // 다음 수
			}
		}

		// 출력
		for (String[] strings : arr) {
			for (String str : strings) {
				System.out.print(str + "\t");
			}
			System.out.println();
		}

	}

}
