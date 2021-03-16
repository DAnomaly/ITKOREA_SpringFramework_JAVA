package quiz03;

public class Song {

	// field
	private String title;
	private double playTime;
	
	public Song(String title, double playTime) {
		this.title = title;
		this.playTime = playTime;
	}
	
	public double getPlayTime() {
		return playTime;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getInfo() {
		return String.format("(%s, %.1f)", title, playTime);
	}
	
}
