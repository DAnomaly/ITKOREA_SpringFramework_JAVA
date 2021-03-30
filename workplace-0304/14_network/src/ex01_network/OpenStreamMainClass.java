package ex01_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenStreamMainClass {

	public static void main(String[] args) {

		URL url = null;
		HttpURLConnection conn = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			url = new URL("https://www.naver.com/");
			conn = (HttpURLConnection) url.openConnection();
			isr = new InputStreamReader(conn.getInputStream());
			br = new BufferedReader(isr);
			String temp = "";
			while ((temp = br.readLine()) != null)
				sb.append(temp).append('\n');
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(sb.length());
	}

}
