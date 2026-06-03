package academyPractice;

import java.util.Objects;

public class Book implements Comparable<Book> {
	
	private static final String libraryName = "DSA 서점";
	private static int num = 20260000;
	private int serialNum;
	private String title;
	private String author;
	private int price;
	private int publicationDate;
	
	public Book(String title, String author, int price, int date) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.serialNum = ++num;
		this.publicationDate = date;
	}
	
	public void editPrice(int price){
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public static int getNum() {
		return num;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public int getPublicationDate() {
		return publicationDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return serialNum == book.serialNum;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(serialNum);
	}
	
	@Override
	public String toString() {
		return String.format("[%d] | 책번호:%s | 책제목:%s | 작가명:%s | 가격:%s | 출판일 %s", libraryName, serialNum, title, author, price, publicationDate);
	}
	
	@Override
	public int compareTo(Book b) {
		int result = b.title.compareTo(this.title);
		return result;
	}
}
