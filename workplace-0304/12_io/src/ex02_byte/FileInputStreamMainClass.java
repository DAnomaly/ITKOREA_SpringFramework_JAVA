package ex02_byte;

import java.io.FileInputStream;

public class FileInputStreamMainClass {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("byte1.txt");
			while(true) {
				int b = fis.read();
				if(b == -1)	break;
				System.out.print((char)b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
