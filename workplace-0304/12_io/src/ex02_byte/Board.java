package ex02_byte;

import java.io.Serializable;

// ObjectOutputStream에 의해서 writeObject() 메소드로 호출되는 클래스입니다.
// 반드시 "직렬화"를 해야 합니다.

// "직렬화" 방법 : Serializable 인터페이스를 구현합니다. serialVersionID를 생성합니다.

public class Board implements Serializable{

	/**
	 *  javadoc
	 */
	private static final long serialVersionUID = 4594139361588765375L;
	
	// field
	private String title;
	private String content;
	private String writer;
	
	// constructor
	public Board(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// getter/setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override // toString
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
