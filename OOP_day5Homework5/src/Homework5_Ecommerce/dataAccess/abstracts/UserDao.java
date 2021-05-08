package Homework5_Ecommerce.dataAccess.abstracts;

import java.util.List; // list kullandigimiz icin bunu ekle

import Homework5_Ecommerce.entities.concretes.User;

public interface UserDao { 
	
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getAll();
	
}
