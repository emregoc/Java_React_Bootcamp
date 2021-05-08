package Homework5_Ecommerce.dataAccess.concretes;

import java.util.List;

import Homework5_Ecommerce.dataAccess.abstracts.UserDao;
import Homework5_Ecommerce.entities.concretes.User;

public class GoogleUserDao implements UserDao{

	@Override
	public void add(User user) {
		
		System.out.println("Google Hesabiyla Eklendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
