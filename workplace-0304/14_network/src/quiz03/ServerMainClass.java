package quiz03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainClass {

	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket client = null;
		
		BufferedReader br= null;
		BufferedWriter bw = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			// 서버 가동
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 2060));
			System.out.println("------서버 가동중------");
			
			// 클라이언트 접속처리
			client = server.accept();
			br = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF-8"));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(),"UTF-8"));
			while (true) {
				// client에게 메시지를 받는다
				char[] cs = new char[1024];
				int length = br.read(cs);
				System.out.print("client>>");
				String receiveMsg = new String(cs,0,length); 
				System.out.println(receiveMsg);
				
				// client에게 메시지를 보낸다
				System.out.print("server>>");
				String sendMsg = sc.nextLine();
				bw.write(sendMsg);
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(!server.isClosed())
					server.close();
				if(!client.isClosed())
					client.close();
				if(bw != null)
					bw.close();
				if(br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
		}
		
		
		
		
		
	}
	
}
