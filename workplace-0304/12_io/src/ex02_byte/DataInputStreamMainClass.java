package ex02_byte;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamMainClass {

	public static void main(String[] args) {
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("byte3.dat"))){
			int age = dis.readInt();
			double weight = dis.readDouble();
			String name = dis.readUTF();
			
			System.out.println("age:" + age + ", weight:" + weight + ", name:" + name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
