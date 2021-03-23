package ex09_hash;

import java.util.HashSet;
import java.util.Set;

public class BoardMainClass {

	public static void main(String[] args) {
		
		Board board1 = new Board(1000, "공지", "관리자");
		Board board2 = new Board(1000, "공지", "관리자");
		Board board3 = new Board(1000, "공지", "관리자");
		
		Set<Board> set = new HashSet<Board>();
		set.add(board1);
		set.add(board2);
		set.add(board3);
		
		for (Board board : set) {
			System.out.println(board);
		}
	}
	
}
