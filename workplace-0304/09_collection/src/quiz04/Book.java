package quiz04;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getter, setter, equals, hashCode, toString, noargsconstructor
@AllArgsConstructor
public class Book {
	//field
	private int bNo;
	private String bTitle;
	private String bWriter;
}
