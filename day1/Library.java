package week2.day1;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Library {

	public String addBook(String bookTitle) {
		
		System.out.println("Added book successfully");
		return bookTitle;
			
	}
	
	public void issueBook() {
		
		System.out.println("Book issued successfully");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib = new Library();
		String a = lib.addBook("Biography");
				System.out.println("Book name is:"+ a);
				lib.issueBook();
	}  

}
