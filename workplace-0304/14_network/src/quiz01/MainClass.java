package quiz01;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainClass {

	public static void main(String[] args) {

		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		File file = null;

		// https://m.naver.com/ 의 소스코드를
		// C:\m.naver.html 파일로 저장하시오.

		try {
			// 네이버 모바일 페이지 소스코드 읽기
			url = new URL("https://m.naver.com/");
			con = (HttpURLConnection) url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			// C:\mnaver.html만들기
			file = new File("C:\\mnaver.html");
			bw = new BufferedWriter(new FileWriter(file));
			int length = 0;
			char[] cbuf = new char[1024];
			while ((length = br.read(cbuf)) != -1) {
				bw.write(cbuf, 0, length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				if (con != null)
					con.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(file.getAbsolutePath() + "파일이 생성되었습니다");
		
	}

}
