package ex02_byte;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamMainClass {

	public static void main(String[] args) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("byte2.txt"))){
			byte[] bytes = new byte[5];
			while(bis.read(bytes) != -1)
				System.out.print(new String(bytes)); 
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
}
