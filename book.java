package sw_sem7;

import java.util.ArrayList;

public class book {
	private static int num=1;
	public String b_id;
	public String name;
	public String author;
	public int year;
	public int totalNum;

	public ArrayList<bookCategory> type = new ArrayList<>();
	/**
	 * Default constructor
	 */
	public book() {

	}
	
	/**
	 * Create a new book
	 * @param b_id
	 * @param name
	 * @param author
	 * @param year
	 * @param totalNum
	 */
	public book(String b_id, String name, String author, int year, int totalNum) {
		this.b_id = b_id;
		this.name = name;
		this.author = author;
		this.year = year;
		this.totalNum = totalNum;
	}
	
	/**
	 * Search a book name
	 * @param search
	 * @return true or false
	 */
	boolean bookCheck(String search){
		if(this.name.equals(search)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Check a book id
	 * @param bid
	 * @return true or false
	 */
	boolean bookIdCheck(String bid){
		if(this.b_id.equals(bid)) {
			if(this.issue()) {
				return true;
			}
			else {
				return false;
			}			
		}
		else {
			return false;
		}
	}
	/**
	 * checkRemoveBook
	 * @param bid
	 * @return
	 */
	boolean checkRemoveBook(String bid){
		if(this.b_id.equals(bid)) {
			return true;		
		}
		else {
			return false;
		}
	}
	/**
	 * Check a book
	 * @return
	 */
	boolean issue() {
		if (0 == this.totalNum) {
			System.out.println("\tThere are no copies left.");
			return false;
		} else {
			this.totalNum -= num;
			return true;
		}			
	}
	
	/**
	 * Remove a book
	 */
	void remove() {
		this.totalNum += num;
	}
	
	@Override 
	public String toString() {
		return b_id + " - " + name;
	}

	public String getB_id() {
		return b_id;
	}

	public void setB_id(String b_id) {
		this.b_id = b_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public ArrayList<bookCategory> getType() {
		return type;
	}

	public void setType(ArrayList<bookCategory> type) {
		this.type = type;
	}

	

}
