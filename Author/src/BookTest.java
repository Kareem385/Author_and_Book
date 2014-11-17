
public class BookTest {
	
	public static void main(String [] args) {
		//Created an instance of Author in book
		//anAuthor object
		Author anAuthor = new Author("Kim", "Student@ymail.com", 'm');

		Book aBook = new Book("Java For Dummies", anAuthor, 19.95, 1000);

		// Use an anonymous instance of Author

	//	Book anotherBook = new Book("more Java for dummy", new Author(), 29.95, 888);
		
		System.out.println(aBook.getName());
		System.out.println(aBook.getPrice());
		System.out.println(aBook.getQtyInStock());
	}
	

	

}
