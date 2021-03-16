package quiz12;

import java.util.Arrays;
import java.util.Scanner;

public class ConcertHall {

	// field
	private final char[] SEAT_TYPES = { 'S', 'R', 'A', 'B' };
	private final int[] CHARGES = { 200000, 150000, 100000, 50000 };
	private final int[] SEAT_COUNTS = { 2, 5, 10, 20 };
	private String hallName;
	private SeatGroup[] seatGroups;
	private Scanner sc = new Scanner(System.in);

	// constructor
	public ConcertHall(String hallName) {
		this.hallName = hallName;
		this.seatGroups = new SeatGroup[SEAT_TYPES.length];
		for (int i = 0; i < seatGroups.length; i++) {
			seatGroups[i] = new SeatGroup(SEAT_TYPES[i],CHARGES[i],SEAT_COUNTS[i]);
		}
	}
	
	// method
	public void run() {
		System.out.printf("====== %s ======\n",hallName);
		// test
		for (int i = 0; i < seatGroups.length; i++) {
			System.out.print(SEAT_TYPES[i] + ": ");
			System.out.println(Arrays.toString(seatGroups[i].getSeats()));
		}
	}
	
}
