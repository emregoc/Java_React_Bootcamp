package Homework5_Ecommerce.business.abstracts;

import java.util.List;

import Homework5_Ecommerce.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	List<User> getAll();
	
}
