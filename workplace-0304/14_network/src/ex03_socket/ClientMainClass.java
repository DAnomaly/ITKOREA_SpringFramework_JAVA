package ex03_socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {

		Socket client = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		BufferedInputStream bis = null;
		
		try {
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 5452));
			System.out.println("서버에 접속되었습니다");
			
			// 서버에 메시지 보내기
			String message = sc.nextLine();
			os = client.getOutputStream();
			os.write(message.getBytes("UTF-8"));
			os.flush();
			
			// server에 메시지 받기
			bis = new BufferedInputStream(client.getInputStream());
			byte[] bs = new byte[1024];
			int length = bis.read(bs);
			String answer = new String(bs,0,length,"UTF-8");
			System.out.println(answer);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!client.isClosed())
					client.close();
				if (os != null)
					os.close();
				if (bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
		} // try-catch-finally

	}

}
