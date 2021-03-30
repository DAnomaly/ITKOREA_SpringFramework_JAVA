package ex01_network;

import java.net.*;

public class URLConnectionMainClass {

	public static void main(String[] args) {

		URL url = null;
		URLConnection conn = null;

		try {
			url = new URL("https://www.naver.com");
			conn = url.openConnection();
			System.out.println(conn.getContent());
			System.out.println(conn.getURL());
			System.out.println(conn.getContentType());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
