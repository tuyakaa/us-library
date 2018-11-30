package sw_sem7;

public class librarian {
	private String userName;
	private String password;
	private String name;
	/**
	 * Default constructor
	 */
	public librarian() {

	}
	/**
	 * Create a new librarian
	 * @param name
	 * @param userName
	 * @param pass
	 */
	public librarian(String name, String userName, String pass) {
		this.name = name;
		this.userName = userName;
		this.password = pass;
	}
	
	/**
	 * Check a librarian userName and password
	 * @param acc
	 * @param pass
	 * @return true or false
	 */
	boolean singIn(String acc, String pass) {
		if(this.userName.equals(acc)) {
			if(this.password.equals(pass)) {
				return true;
			}
			else {
				System.out.println("\tPassword is wrong!");
				return false;
			}
		}
		else if(this.password.equals(pass)) {
			System.out.println("\tUsername is wrong!");		
			return false;
		}
		else {
			System.out.println("\tUsername is wrong!");	
			System.out.println("\tPassword is wrong!");
			return false;
		}
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
