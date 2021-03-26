package ex01_char;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 클래스
 * 1. "문자 기반 + 입력 스트림"입니다 (Reader)
 * 2. 문자를 보낼 때 사용합니다.
 *    1) 통신 : 상대방에게 문자를 받을 때
 *    2) 파일 : 텍스트 파일을 읽을 때
 * 3. 출력 메소드
 *    read()
 * 4. 출력 단위
 *    char[], int
 * 5. 예외 처리가 필요합니다
 */



public class FileReaderMainClass {
	
	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("text1.txt")){
			
			/*
			while(true) {
				int temp = fr.read();
				if(temp == -1)
					break;
				System.out.println((char)temp);
			}
			*/
			
			/*
			int ch = 0;
			while((ch = fr.read()) != -1)
				System.out.println((char)ch);
			*/
			
			String result = "";
			int temp;
			while((temp = fr.read()) != -1) {
				result += (char)temp;
			}

			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
}
