package quiz01;

import java.io.DataInputStream;
import java.io.FileInputStream;

// 확인

public class MainClass2 {

	public static void main(String[] args) {
		
		String name = "";
		int kor = 0, eng = 0, mat = 0;
		double avg = 0;
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"))){
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			avg = dis.readDouble();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("이름:" + name + ", 국어:" + kor + ", 영어:" + eng + ", 수학:" + mat + ", 평균:" + avg);
		
	}

}
