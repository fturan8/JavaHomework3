package odev3Gun;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getUserName() + ": Giri� Ba�ar�l�");
		
	}
			
	public void add(User user) {
		System.out.println(user.getUserName() + ": Kullan�c� kay�t edildi.");
		
	}
	
	public void remove(User user) {
		System.out.println(user.getUserName() + ": Kullan�c� kayd� silindi");
	
	}
	
	public void logout(User user) {
		System.out.println(user.getUserName() + ": ��k�� Ba�ar�l�");
		
	}
		
	
}