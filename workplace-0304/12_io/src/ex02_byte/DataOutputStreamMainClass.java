package ex02_byte;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * DataOutputStream 클래스
 * 1. 자바의 데이터 타입 그대로 출력하는 클래스입니다
 * 2. 출력 메소드
 *    writeByte(), writeInt(), writeLong(), writeDouble() 등
 */

public class DataOutputStreamMainClass {

	public static void main(String[] args) {
		
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream("byte3.dat"));
			
			int age = 44;
			double weight = 70.6;
			String name = "홍길동";
			dos.writeInt(age);
			dos.writeDouble(weight);
			dos.writeUTF(name);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			if(dos != null)
				dos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}
