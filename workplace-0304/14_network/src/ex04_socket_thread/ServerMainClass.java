package ex04_socket_thread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMainClass {

	public static void main(String[] args) {
		
		// 클라이언트들이 파일을 전송합니다
		// 파일 전송 작업은 스레드로 작성합니다
		
		ServerSocket server = null;
		Socket client = null;
		
		try {
			// 서버 생성
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost",2056));
			System.out.println("Successfully activate Server!!");
			while(true) {
				// 클라이언트들의 접속 처리
				client = server.accept();
				// 클라이언트들의 파일 전송
				FileUploadThread upload = new FileUploadThread(); // 스레드 생성
				upload.setClient(client);
				upload.start();
				System.out.println("Connected:[" + client.getRemoteSocketAddress() + "]");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(!server.isClosed())
					server.close();
				if(!client.isClosed())
					client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // try-catch-finally
	}
	
}
