package ex03_socket;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainClass {

	public static void main(String[] args) {

		ServerSocket server = null;
		Socket client = null;
		BufferedInputStream bis = null;
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;

		try {
			// server 생성
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 5452));

			while (true) {
				System.out.println("=======서버가 동작하고 있습니다=======");

				// client 접속
				client = server.accept();

				// client 주소 확인
				InetSocketAddress isa = (InetSocketAddress) client.getRemoteSocketAddress();
				System.out.println("접속 클라이언트:[" + isa.getAddress() + "]");

				// client 메시지 받아오기
				bis = new BufferedInputStream(client.getInputStream());
				byte[] bs = new byte[1024];
				int length = bis.read(bs); // 메시지: bs, 메시지의 글자수: length
				String message = new String(bs, 0, length, "UTF-8");
				System.out.println(message);

				// client에게 메시지 보내기
				System.out.print("답변:");
				String answer = sc.nextLine();
				os = client.getOutputStream();
				os.write(answer.getBytes("UTF-8"));
				os.flush();

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!server.isClosed())
					server.close();
				if (!client.isClosed())
					client.close();
				if (bis != null)
					bis.close();
				if (os != null)
					os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
		} // try-catch-finally

	}

}
