package ex03_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_FileWriter {

	public static void main(String[] args) {
		
		File dir = new File("C:\\MyTemp");
		
		if(dir.exists() == false)
			dir.mkdirs();
		
		File file = new File(dir,"text.txt");
		
		if(file.exists() == false)
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		// text.txt 파일에 데이터 보내기
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write("안녕하세요");
			fw.write('\n');
			fw.write("반갑습니다");
			System.out.println(file.getAbsolutePath() + "파일이 생성되었습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null)
					fw.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
