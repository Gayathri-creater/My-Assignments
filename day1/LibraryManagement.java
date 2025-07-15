package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		String a = lib.addBook("The game of Thrones");
				System.out.println("Book name is:"+ a);
				lib.issueBook();
	}
}
