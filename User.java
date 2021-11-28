package odev3Gun;

public class User {
	
	
	String password;
	String userName;
	String firstName;
	String lastName;
	String id;
	
	public User() {
		
	}
	
	
	public User(String password, String userName, String firstName,
			String lastName) {
		super();
		this.password=password;
		this.userName=userName;	
		this.firstName=firstName;
		this.lastName=lastName;
			
	}
	
	

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return userName + "1";
	}
	
	
}
