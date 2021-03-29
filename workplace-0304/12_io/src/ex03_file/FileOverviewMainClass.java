package ex03_file;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
 * File 클래스
 * 1. 파일을 조작하는 클래스입니다
 * 2. 파일 생성, 삭제, 파일명, 파일크기, 수정날짜 등의 확인이 가능합니다. 
 */

public class FileOverviewMainClass {
	
	public static void main(String[] args) {
		
		// 디렉토리 조작
		File dir = new File("C:\\MyTemp"); // 경로 구분 (\\ == File.separator)
	//	File dir = new File("C:" + File.separator + "MyTemp"); // Linux와 Windows 호환용
		
		System.out.println(dir.exists()); // 존재하는 경로이면 true, 아니면 false 반환
		
		if(dir.exists() == false) { //  if ( !dir.exists() ) { 존재하지 않는 dir이면
			dir.mkdirs(); // dir 디렉토리를 생성합니다.
			System.out.println("dir 디렉토리를 생성합니다");
		}

	/*	
		if(dir.exists() == true) { // if( dir.exist() ) { * 주석 코드가 더 좋습니다
			dir.delete(); // dir 디렉토리를 삭제합니다
			System.out.println("MyTemp 디렉토리가 삭제되었습니다");
		}
	*/

		// 파일 조작
	//	File file = new File("C:\\MyTemp\\MyFile.txt");
	//	File file = new File("C:\\MyTemp", "MyFile.txt");
		File file = new File(dir,"MyFile.txt"); // File dir = new File("C:\\MyTemp");
		
		System.out.println(file.exists());
		
		if( file.exists() == false ) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(file.getAbsolutePath()); // C:\Mytemp\MyFLie.txt
		System.out.println(file.getPath()); // C:\Mytemp\MyFLie.txt
		System.out.println(file.getParent()); // C:\Mytemp
		System.out.println(file.getName()); // MyFile.txt
		System.out.println(new SimpleDateFormat("yyyy-MM-dd a h:m").format(new Date(file.lastModified()))); // 1616978469763 -> 2021-03-29 -> 2021-03-29 오전 9:41
		System.out.println(file.length()); // 0
 	
		
		// 디렉토리 내의 모든 디렉토리와 파일 목록 출력하기
		String path = "C:\\Program Files\\Git";
		File gitDir = new File(path);
		File[] files = gitDir.listFiles();
		for (File f : files) {
			System.out.print(new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(new Date(f.lastModified())));
			System.out.print("\t");
			if(f.isDirectory())
				System.out.print("<DIR>   " + "\t");
			else
				System.out.print(new DecimalFormat("#,##0").format(f.length()) + "    " + "\t");
			System.out.println(f.getName());
		}
		
		
		
		
	}
	
}
