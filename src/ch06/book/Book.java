package ch06.book;

	public class Book {
		//필드
		String title;
		String author;
		int ISBN;
		
		//생성자1 (초기화)
		public Book(String title, String author, int ISBN) {
			this.title = title;
			this.author = author;
			this.ISBN = ISBN;
			System.out.println("객체 생성!");
		}
			
		//생성자2 (생성자1 호출)
		public Book (String title, int ISBN) {
			this(title, "Anonymous", ISBN); 
			System.out.println("생성자가 호출되었음 1");
		}
		
		//생성자3 (생성자1호출)
		public Book() {
			this(null, null, 0);
			System.out.println("생성자가 호출되었음 2");
		}
		
		public static void main(String[] args) {
			Book javaBook = new Book("Java Book", "Author Name", 3333);
			System.out.println(javaBook.title +" "+ javaBook.author);
			Book theBible = new Book("The Bible", 1);
			System.out.println(theBible.title +" "+ theBible.author);
			Book emptyBook = new Book();
			System.out.println(emptyBook.title +" "+ emptyBook.author);
			
		}
			
}
