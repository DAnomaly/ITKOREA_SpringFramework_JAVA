package ex02_string;

public class Quiz03 {

	// 3. 파일명과 확장자명을 분리하기
	
	public static void main(String[] args) {
		
		String fullname = "macdragon_img1.png.exe";
		String fileName = "";
		String extName = "";
		
		fileName = fullname.substring(0,fullname.lastIndexOf('.'));
		extName = fullname.substring(fullname.lastIndexOf('.'));
		
		System.out.println("파일명 : " + fileName);
		System.out.println("확장자명 : " + extName);
		
		
		
	}
	
}
