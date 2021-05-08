package Homework5_Ecommerce.business.concretes;

import Homework5_Ecommerce.business.abstracts.LoginService;
import Homework5_Ecommerce.entities.concretes.User;

public class LoginManager implements LoginService{
	
	private User user;
	
	public LoginManager(User user) {
		super();
		this.user = user;
	}

	@Override
	public void login(String email, String password) {
		
		if(user.getEmail() == email && user.getPassword() == password) {
			
			System.out.println("Giris Basarili");
			return;
		}
		else {
			System.out.println("Kullanici adi ya da sifre yanlis");
		}
		
	}

}
