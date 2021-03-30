package ex01_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebCrawling {

	public static void main(String[] args) {

		URL url = null;
		HttpURLConnection con = null;
		BufferedReader br = null;
		
		try {
			url = new URL("https://www.daum.net/");
			con = (HttpURLConnection) url.openConnection();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.contains("class=\"link_favorsch")) {
					System.out.println(line.substring(line.indexOf(">")+1, line.lastIndexOf("</a>")));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (con != null)
				con.disconnect();
		}

	} // main()

}
