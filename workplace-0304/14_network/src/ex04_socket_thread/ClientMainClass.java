package ex04_socket_thread;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Socket client = null;
		File file = null;
		DataOutputStream dos = null;
		BufferedInputStream bis = null;
		
		try {
			// 서버에 접속
			client = new Socket();
			client.connect(new InetSocketAddress("localhost",2056));
			dos = new DataOutputStream(client.getOutputStream());
			// 파일명 전송
			System.out.print("전송할 파일명 입력 >>> ");
			String filename = sc.nextLine();
			file = new File("c:\\MyClient",filename);
			dos.writeUTF(filename);
			dos.flush(); 
			// 파일 전송
			bis = new BufferedInputStream(new FileInputStream(file));
			byte[] bs = new byte[1024];
			int length = 0;
			while((length = bis.read(bs)) != -1)
				dos.write(bs,0,length);
			System.out.println("전송에 성공하였습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(!client.isClosed())
					client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			sc.close();
		}
		
		
	}
	
}
