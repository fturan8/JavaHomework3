package odev3Gun;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getUserName() + ": Giriþ Baþarýlý");
		
	}
			
	public void add(User user) {
		System.out.println(user.getUserName() + ": Kullanýcý kayýt edildi.");
		
	}
	
	public void remove(User user) {
		System.out.println(user.getUserName() + ": Kullanýcý kaydý silindi");
	
	}
	
	public void logout(User user) {
		System.out.println(user.getUserName() + ": Çýkýþ Baþarýlý");
		
	}
		
	
}