package sw_sem7;

public class bookCategory {
	public String bc_id;
	public String bc_title;
	/**
	 * Default constructor
	 */
	public bookCategory() {
		
	}
	
	/**
	 * Create a new book category
	 * @param bc_id
	 * @param bc_title
	 */
	public bookCategory(String bc_id, String bc_title) {
		this.bc_id = bc_id;
		this.bc_title = bc_title;
	}
	
	public String getBc_id() {
		return bc_id;
	}

	public void setBc_id(String bc_id) {
		this.bc_id = bc_id;
	}

	public String getBc_title() {
		return bc_title;
	}

	public void setBc_title(String bc_title) {
		this.bc_title = bc_title;
	}

}
