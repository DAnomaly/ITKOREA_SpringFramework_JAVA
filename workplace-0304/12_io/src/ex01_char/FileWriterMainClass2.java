package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

/*
 * try - catch - resource 문 
 * 1. close() 메소드를 자동으로 호출하는 try문 
 * 2. 형식
 * try (스트림 생성){
 * 
 * } catch ( ){
 * 
 * }
 */


public class FileWriterMainClass2 {

	public static void main(String[] args) {
		
		try (FileWriter fw = new FileWriter("text2.txt")){
			char[] cbuf = {'H','e','l','l','o'};
			fw.write(cbuf,0,1); // 인덱스 0부터 1개 보내기
			fw.write(cbuf,0,cbuf.length); // 인덱스 0부터 cbuf 길이만큼 보내기 (전체 보내기)
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
