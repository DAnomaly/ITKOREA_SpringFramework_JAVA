package ex01_char;

import java.io.*;

/*
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
*/

// BufferedWriter 클래스
// 1. 보조 스트림입니다.
// 2. FileWriter 클래스와 같은 메인 스트림과 함께 사용합니다
// 3. 내부 버퍼를 이용해서 동작 속도를 향상 시킬 수 있습니다

public class BufferedWriterMainClass {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("text3.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 보조 스트림 bw를 사용하는 경우에는 bw만 닫으면 됩니다
			try {
				if(bw != null)
					bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
}
