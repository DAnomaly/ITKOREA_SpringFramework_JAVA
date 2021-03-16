package quiz03;

public class Singer {

	private String name;
	private Song song;	// private Song[] songs;
	
	public Singer(String name) {
		this.name = name;
	}
	
	public void setSong(Song song) {
		this.song = song;
	}
	
	public void info() {
		System.out.printf("%s%s",name,song.getInfo());
	}
	
	
}
