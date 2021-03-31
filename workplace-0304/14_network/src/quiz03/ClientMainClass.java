package quiz03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {

		Socket client = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		Scanner sc = new Scanner(System.in);

		try {
			// 서버 접속
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 2060));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(),"UTF-8"));
			br = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF-8"));
			System.out.println(">>서버접속 성공");
			while (true) {
				// 서버 메시지 전송
				System.out.print("client>>");
				String sendMsg = sc.nextLine();
				bw.write(sendMsg);
				bw.flush();
				
				// 서버 메시지 받기
				System.out.print("server>>");
				char[] cs = new char[255];
				int length = br.read(cs);
				String receiveMsg = new String(cs,0,length);
				System.out.println(receiveMsg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(!client.isClosed())
					client.close();
				if(br != null)
					br.close();
				if(bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
		}

	}

}
