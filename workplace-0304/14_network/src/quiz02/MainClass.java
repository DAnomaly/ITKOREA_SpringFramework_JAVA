package quiz02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		URL url = null;
		HttpURLConnection conn = null;
		BufferedReader bis = null;
		Set<String> strs = new LinkedHashSet<String>(); 

		try {
			url = new URL("https://zum.com/#!/home");
			conn = (HttpURLConnection) url.openConnection();
			bis = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = null;
			boolean btemp = false;
			while ((line = bis.readLine()) != null) {
				if (line.contains("span class=\"keyword d_keyword\">")) {
					if (btemp == false) {
						btemp = true;
						continue;
					}
					strs.add(line.substring(line.indexOf("d\">")+3,line.indexOf("</span>")));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null)
					bis.close();
				if(conn != null)
					conn.disconnect();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println(strs.toString());
	}

}
