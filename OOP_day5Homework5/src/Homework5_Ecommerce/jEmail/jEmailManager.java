package Homework5_Ecommerce.jEmail;

public class jEmailManager {
	
	public void sendMail(String message) {
		
		System.out.println("Mail adresinize Dogrulama e-postasi gonderildi : " + message);
		
	}

	public void verificationAddress(String message) {
	
	System.out.println("Uyeligin tamamlanmasi icin dogrulama linkine tiklayiniz : " + message);
	
	}	
	
}
