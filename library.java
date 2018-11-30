package sw_sem7;

import java.util.ArrayList;
import java.util.Scanner;

public class library {
	librarian lib;
	book bk;
	bookCategory bc;
	student st;
	ArrayList<book> book = new ArrayList<>();
	ArrayList<student> student = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	/**
	 * create objects
	 */
	public library() {
		lib = new librarian("Tsetseg", "lib_001", "212");
		st = new student("15b1seas1232", "Ganbold", "Hulan", "SHD-16khoroo-32-14", 99080706);
		student.add(st);
		st = new student("15b1seas2136", "Batbold", "Otgonbileg", "SHD-16khoroo-32-14", 377663471);
		student.add(st);
		bc = new bookCategory("001", "Gadaad nom");
		bk = new book("bk001", "magadlal statistic", "Nomin", 2012, 1);
		bk.type.add(bc);
		book.add(bk);
		bc = new bookCategory("002", "Bailgaliin uhaanii nom");
		bk = new book("bk002", "algoritmiin undes", "Garmaa", 2012, 23);
		bk.type.add(bc);
		book.add(bk);
		Menu();
	}

	void inputPin() {	

		System.out.print("Enter an account : ");
		String acc = input.next();
		System.out.print("Enter a pin : ");
		String pin = input.next();

		if (!lib.singIn(acc, pin)) {
			inputPin();
		}
	}
	
	/**
	 * chooce an action
	 */
	public void Menu() {
		int choice;
		String studentId;
		boolean boo = true;
	    inputPin();
		Scanner in = new Scanner(System.in);

		while (boo) {
			System.out.println("\t-----------------------------------------------------------------");
			System.out.println("\t\t\t Main menu");
			System.out.println("\t1. Book issue\t2. book remove\t3. Search  4. Add book\t 5. Exit");
			System.out.println("\t-----------------------------------------------------------------");

			System.out.print("Enter an choice : ");
			choice = in.nextInt();
			System.out.println(" ");

			switch (choice) {
			case 1:
				Scanner inputStu = new Scanner(System.in);
				System.out.print("Enter a student id: ");
				studentId = inputStu.nextLine();
				
				checkStudent(studentId,1);
				break;
			case 2: {
				Scanner inputRe = new Scanner(System.in);
				System.out.print("Enter a student id: ");
				studentId = inputRe.nextLine();
				
				checkStudent(studentId,2);
				break;
			}
			case 3: {
				Scanner searchBook = new Scanner(System.in);
				System.out.print("Search a book: ");
				String book = searchBook.nextLine();
				
				searchBook(book);				
				break;
			}
			case 4: {
				addBook();				
				break;
			}
			case 5:
				System.out.println("ta systemees garlaa");
				// inputPin();
				System.exit(0);
				break;
			default:
				System.out.println("Your choice is wrong! Please try again. ");
				break;

			}
		}
	}
	
	/**
	 * add book to library
	 */
	void addBook() {
		Scanner inputbook = new Scanner(System.in);
		System.out.print("Book id: ");
		String bid = inputbook.nextLine();
		bk = new book();
		bk.setB_id(bid);

		System.out.print("Book name: ");
		String bname = inputbook.nextLine();
		bk.setName(bname);

		System.out.print("Book author: ");
		String bauthor = inputbook.nextLine();
		bk.setAuthor(bauthor);

		System.out.print("Book year: ");
		int byear = inputbook.nextInt();
		bk.setYear(byear);

		System.out.print("Book total number: ");
		int bnum = inputbook.nextInt();
		bk.setTotalNum(bnum);

		book.add(bk);
		System.out.println("\t"+bk.toString());
		System.out.println("\t"+book.size());
	}
	
	/**
	 * search a book from library
	 * @param name
	 */
	void searchBook(String name) {
		
		int i=0;
		for (i = 0; i < book.size(); i++) {
			if (book.get(i).bookCheck(name)) {
				System.out.println("\t" + book.get(i).toString());
				break;
			} 
		}

		if (i == book.size()) {
			System.out.println("\tThis book is not!");
		}
	}
	
	/**
	 * check book - issue and remove
	 * @param id
	 * @param num
	 */
	void checkbook(int id, int num) {
		Scanner inputbk = new Scanner(System.in);
		System.out.print("Enter a book id: ");
		String bookid = inputbk.nextLine();
		
		String[] a=bookid.split(" ");
		int k=0;
		for(int i=0; i<a.length; i++) {
			//System.out.println(a[i]);
			for (k = 0; k < book.size(); k++) {
				if(num==1) {
					if (book.get(k).bookIdCheck(a[i])) {
						System.out.println("\t"+book.get(k).toString());
						student.get(id).bookList.add(book.get(k));
						break;
					}
				}
				else if(num ==2) {
					if (book.get(k).checkRemoveBook(a[i])) {
						System.out.println("\t"+book.get(k).toString());
						book.get(i).remove();
						student.get(i).bookList.remove(book.get(k));						
						break;
					}
				}
			}
			if(k== book.size()) {
				System.out.println(a[i] + " ene nom baihgui bna");
			}
		}	
		System.out.println("\n\t"+student.get(id).toString());
	}
	
	/**
	 * check student id
	 * @param id
	 * @param num
	 */
	void checkStudent(String id, int num) {
		int i=0;
		for (i = 0; i < student.size(); i++) {
			if (student.get(i).stuIdCheck(id)) {
				System.out.println("\t"+student.get(i).toString());
				checkbook(i,num);
				break;
			}
		}
		if (i == student.size()) {
			System.out.println("\tStudent id is wrong!");
		}
	}

	public static void main(String[] args) {
		new library();

	}

}
