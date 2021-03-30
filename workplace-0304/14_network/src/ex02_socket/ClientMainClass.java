package ex02_socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientMainClass {

	public static void main(String[] args) {

		// Socket : 클라이언트

		Socket socket = null;

		try {
			// 클라이언트 생성
			socket = new Socket();

			// 클라이언트가 서버에 접속을 시도
			socket.connect(new InetSocketAddress("localhost", 4966));
			// socket.connect(new InetSocketAddress(InetAddress.getByName("localhost"),4966));

			// 접속성공
			System.out.println(">>접속성공<<");
			
			// 웰컴 메시지 받기
			InputStream is = socket.getInputStream();
			byte[] bs = new byte[50]; // "Welcome to My Server!"를 저장할 정도의 크기
			int length = is.read(bs); // 읽은 내용은 b에 저장, 실제로 읽은 바이트 수는 length에 저장
			System.out.println(new String(bs,0,length,"UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket.isClosed() == false)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
