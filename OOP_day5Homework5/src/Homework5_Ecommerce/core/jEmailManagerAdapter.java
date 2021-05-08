package Homework5_Ecommerce.core;

import Homework5_Ecommerce.jEmail.jEmailManager;

public class jEmailManagerAdapter implements EmailService {
	
	jEmailManager emailManager = new jEmailManager();

	@Override
	public void verificationMail(String message) {
		
		emailManager.sendMail(message);
		
	}

	@Override
	public void verificationLink(String message) {
		
		
		emailManager.verificationAddress(message);
		
	}

}
