package ex03_file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {

		// 원본
		// FileInputStream을 통해서 읽습니다.
		BufferedInputStream bis = null;

		// 복사문 C:\\MyTemp\\Windmill.mp4
		// 경로 지정을 위해서 File 클래스를 사용하고,
		// FileOutputStream을 통해서 만듭니다
		File cpy = new File("C:\\MyTemp", "Cat.jpg");
		BufferedOutputStream bos = null;

		try {
			bis = new BufferedInputStream(new FileInputStream("cat-5628953_1920.jpg"));
			bos = new BufferedOutputStream(new FileOutputStream(cpy));
			// 복사 시작 시간
			long start = System.currentTimeMillis();
			byte[] bs = new byte[1024];
			int length = 0;
			while ((length = bis.read(bs)) != -1)
				bos.write(bs, 0, length);
			long end = System.currentTimeMillis();
			System.out.println("<작업완료> 처리시간:" + (end - start)*0.001 + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null)
					bos.close();
				if (bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
