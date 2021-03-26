package ex01_char;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMainClass {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("text4.txt"))){
			/*
			StringBuilder sb = new StringBuilder();
			while(true) {
				char[] cbuf = new char[5];
				int readCharCount = br.read(cbuf);
				if(readCharCount == -1) {
					break;
				}
				sb.append(cbuf,0,readCharCount); // 읽은 글자수만큼만 sb에 저장합니다.
			}
			System.out.println(sb.toString());
			*/
			StringBuilder sb = new StringBuilder();
			int readCharCount;
			char[] cbuf = new char[5];
			while((readCharCount = br.read(cbuf)) != -1) {
				sb.append(cbuf,0,readCharCount);
			}
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
