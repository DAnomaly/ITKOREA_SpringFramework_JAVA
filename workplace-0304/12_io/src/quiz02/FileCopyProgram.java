package quiz02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram{

	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("cat-5628953_1920.jpg")); // 원본
			bos = new BufferedOutputStream(new FileOutputStream("Copy_Cat.jpg")); // 사본
			byte[] b = new byte[1024]; // 1KB
			while(true) {
				int readByte = bis.read(b); // 영상 저장은 b, 실제 읽은 바이트수는 readByte
				if(readByte == -1)
					break;
				bos.write(b,0,readByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null)
					bis.close();
				if(bos != null)
					bos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
