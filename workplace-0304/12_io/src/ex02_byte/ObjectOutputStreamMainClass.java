package ex02_byte;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamMainClass {

	public static void main(String[] args) {
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("board.dat"));
			// 1. 개별 저장
			Board board1 = new Board("공지", "잘읽어라", "관리자");
			oos.writeObject(board1); // board 객체는 반드시 "직렬화"가 되어 있어야 합니다.
			
			// 2. ArrayList 저장
			List<Board> boardList = new ArrayList<Board>();
			boardList.add(new Board("필독", "꼭읽어라", "관리자"));
			boardList.add(new Board("협조", "부탁한다", "관리자"));
			oos.writeObject(boardList);
			
			System.out.println("board.dat파일이 생성되었습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null)
					oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
	
}
