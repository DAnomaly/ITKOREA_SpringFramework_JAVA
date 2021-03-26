package quiz01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// 사용자로부터 국, 영, 수 점수를 입력 받은 뒤,
// int[] 배열에 저장한다.
// score.dat 파일에 이름, 입력 받은 점수, 평균을 저장하시오

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >> ");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력하세요 >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 >> ");
		int mat = sc.nextInt();
		
		// 평균
		double avg = ( kor + eng + mat ) / 3.0 ; 
		
		// score.dat 파일에 저장
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))){
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeDouble(avg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
