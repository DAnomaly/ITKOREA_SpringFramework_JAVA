package ex03_file;

import java.io.File;

public class FileDeleteMainClass {

	private static void delFile(File file) {
		if (file.exists()) {
			if (file.delete() == false) { // 파일 삭제 시도 -> 실패시
				File[] files = file.listFiles(); // 파일 내부의 모든 파일 불러오기
				for (File f : files) {
					delFile(f); // 내부 파일을 delFile을 돌려 삭제 시도
				}
				file.delete(); // 실패한 파일 삭제를 다시 시도
			}
		}
	}
	
	public static void main(String[] args) {
		
		// C:\\MyTemp 디렉터리를 삭제합니다.
		File myTemp = new File("C:\\MyTemp");
		
		delFile(myTemp);
		
	}

}
