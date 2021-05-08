package Homework5_Ecommerce;

import Homework5_Ecommerce.business.abstracts.LoginService;
import Homework5_Ecommerce.business.abstracts.UserService;
import Homework5_Ecommerce.business.concretes.LoginManager;
import Homework5_Ecommerce.business.concretes.UserManager;
import Homework5_Ecommerce.core.jEmailManagerAdapter;
import Homework5_Ecommerce.dataAccess.concretes.GoogleUserDao;
import Homework5_Ecommerce.dataAccess.concretes.HibernateUserDao;
import Homework5_Ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new GoogleUserDao(), new jEmailManagerAdapter());
		
		User user = new User(1, "Emre", "Goc", "emre@mail.com", "123456");
		userService.add(user);
			
		
	//LoginService loginService = new LoginManager(new User(1, "Emre", "Goc", "emre@mail.com", "123456"));
		LoginService loginService = new LoginManager(user);
		loginService.login("emre@mail.com", "123456");
		
	}

}
