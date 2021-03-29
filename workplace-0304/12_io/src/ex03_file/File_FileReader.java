package ex03_file;

import java.io.File;
import java.io.FileReader;

public class File_FileReader {

	public static void main(String[] args) {

		File dir = new File("C:\\MyTemp");

		if (dir.exists() == false)
			dir.mkdirs();

		File file = new File(dir, "text.txt");

		// 파일 읽어오기
		FileReader fr = null;

		if (file.exists() == true)
			try {
				fr = new FileReader(file);
				int temp = 0;
				char[] ctemp = new char[5];
				StringBuilder sb = new StringBuilder();
				while ((temp = fr.read(ctemp)) != -1) {
					sb.append(ctemp, 0, temp);
				}
				System.out.println(sb);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
