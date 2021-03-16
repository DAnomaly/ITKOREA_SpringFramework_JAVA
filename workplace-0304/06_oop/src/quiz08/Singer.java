package quiz08;

public class Singer {

	// field
	private String name;
	private Song[] songs;
	private int idx;
	
	// constructor
	public Singer(String name, int songCount) {
		this.name = name;
		songs = new Song[songCount];
	}
	
	// method
	public void addSong(Song song) {
		if(idx < songs.length)
			songs[idx++] = song;
		// addSong() 호출마다 idx가 증가하므로, idx는 추과된 노래의 개수입니다
		else
			System.out.println("더 이상 노래를 추가할 수 없습니다");
	}
	
	public void info() {
		// 가수명, 노래목록
		System.out.println("가수명: " + name);
		System.out.println("===== 노래 목록 =====");
		for (int i = 0; i < idx; i++) {
			songs[i].info();
		}
		
	}
	
}
