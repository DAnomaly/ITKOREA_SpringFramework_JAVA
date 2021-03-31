package ex04_socket_thread;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class FileUploadThread extends Thread {

	// field
	private Socket client;
	
	// setter
	public void setClient(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		DataInputStream dis = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		File dir = new File("C:\\MyServer");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		try {
			bis = new BufferedInputStream(client.getInputStream());
			dis = new DataInputStream(client.getInputStream());
			// 파일명 확인
			String filename = dis.readUTF();
			// 파일 확인 및 생성
			// client가 보낸 파일내용을 c:\MyServer 디렉터리에 저장합니다
			// 파일을 저장하기 위해서 FileOutputStream이 필요하고,
			// 성능을 높이기 위해서 BufferedOutputStream을 사용합니다
			bos = new BufferedOutputStream(new FileOutputStream(new File(dir,filename)));
			byte[] bs = new byte[1024];
			int length = 0;
			while((length = bis.read(bs)) != -1) 
				bos.write(bs,0,length);
			
			System.out.println(dir.getAbsolutePath() + "경로에 " + filename + "파일이 성공적으로 생성되었습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if(bos != null)
				bos.close();
			if(bis != null)
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
