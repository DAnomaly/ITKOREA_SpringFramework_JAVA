package quiz05;

public class Bunker {
	
	private Terran[] terrans;
	private int idx;
	
	public Bunker() {
		terrans = new Terran[4];
	}

	public void add(Bunkerable terran) {
		if( idx < terrans.length )
			terrans[idx++] = (Terran)terran;
}
	
	public void info() {
		// TODO
	}
	
}
