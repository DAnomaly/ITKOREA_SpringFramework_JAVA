package quiz04;

import java.util.ArrayList;
import java.util.List;

public class Library {
	// field
	private String name;
	private List<Book> books;
	
	// constructor
	public Library(String name) {
		this.name = name;
		books = new ArrayList<Book>();
	}
	
	// method
	// addBook
	public void addBook(Book book) {
		books.add(book);
	}
	// booksInfo
	public void booksInfo() {
		System.out.println("도서관:" + name);
		for (Book book : books) {
			System.out.println(book);
		}
	}
	// remove
	public void remove(int bNo) {
		
		/* 1) for문을 이용하여
		int removeIdx = -1;
		for (int i = 0, length = books.size(); i < length; i++) {
			if(books.get(i).getBNo() == bNo) {
				removeIdx = i;
				break;
			}
		}
		if(removeIdx == -1)
			System.out.println(bNo + "번 Book이 없습니다.");
		else {
			books.remove(removeIdx);
			System.out.println(bNo + "번 Book이 삭제되었습니다.");
		}
		*/
		
		/* 2) foreach문을 이용하여 */
		for (Book book : books) {
			if(book.getBNo() == bNo) {
				books.remove(book);
				System.out.println(bNo + "번 Book이 삭제되었습니다");
				return;
			}
		}
		System.out.println(bNo + "번 Book이 없습니다.");
		
	} // remove(bNo)
	
} // class end
