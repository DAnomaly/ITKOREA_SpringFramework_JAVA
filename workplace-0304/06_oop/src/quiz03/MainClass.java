package quiz03;

public class MainClass {

	public static void main(String[] args) {
	
		Singer singer = new Singer("김동률");
		singer.setSong(new Song("취중진담",4.5));
		singer.info(); // 김동률(취중진담, 4.5)
		
	}
	
}
