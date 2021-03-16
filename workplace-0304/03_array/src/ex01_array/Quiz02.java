package ex01_array;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 2. String[] friendList = {"타요", "짱구", "스폰지밥"};
		// 새로 사귄 친구의 수를 입력 받아서,
		// 그 만큼 friendList 배열의 길이를 늘이기
		
		String[] friendList = {"타요", "짱구", "스폰지밥"};

		int count = 1;
		for (String list : friendList) {
			System.out.println(count++ + "번째 : " + list);
		}
		
		System.out.print("새로 사귄 친구의 수 >> ");	
		Scanner sc = new Scanner(System.in);
		int raise = sc.nextInt();
		sc.close();								// 스케너 닫음
		
		String[] friendListV2 = new String[friendList.length + raise];
		for (int i = 0; i < friendList.length; i++) {
			friendListV2[i] = friendList[i];
		}
		
		count = 1;
		for (String listV2 : friendListV2) {
			System.out.println(count++ + "번째 : " + listV2);
		}
		
	}
}
