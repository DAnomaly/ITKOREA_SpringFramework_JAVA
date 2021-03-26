package ex01_char;

import java.io.IOException;
import java.io.PrintWriter;

// PrintWriter 클래스
// 1. FileWriter 클래스와 같은 목적으로 사용합니다.
// 2. 출력 메소드 : writer(), print(), println()
// 3. println() 메소드를 사용하면 자동으로 줄 바꿈이 처리됩니다.

public class PrintWriterMainClass {

	public static void main(String[] args) {
		
		PrintWriter out = null;
		
		try {
			out = new PrintWriter("index.html");
			out.println("<script>");
			out.println("alert('Hello Java!')");
			out.println("</script>");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( out != null )
					out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
