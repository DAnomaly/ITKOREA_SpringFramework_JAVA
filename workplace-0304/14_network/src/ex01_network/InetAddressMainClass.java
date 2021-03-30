package ex01_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {
		
		// 원격 호스트
		String host = "www.naver.com";
		
		// 인터넷 주소를 처리하는 InetAddress
		InetAddress ia = null;
		
		try {
			ia = InetAddress.getByName(host);
			System.out.println(ia); // www.naver.com/125.209.222.142
			System.out.println(ia.getHostName()); // www.naver.com
			System.out.println(ia.getHostAddress()); // 125.209.222.142

			InetAddress[] ias = InetAddress.getAllByName(host);
			for (InetAddress i : ias) {
				System.out.println(i.getHostName() + "의 ip주소:" + i.getHostAddress());
			}
			
			byte[] bs = ia.getAddress();
			System.out.println(Arrays.toString(bs));

			short[] ip = new short[bs.length];
			for (int i = 0; i < bs.length; i++) {
				ip[i] = (short) (bs[i] < 0 ? bs[i] + 256 : bs[i]);
			}
			System.out.println(Arrays.toString(ip));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
	
}
