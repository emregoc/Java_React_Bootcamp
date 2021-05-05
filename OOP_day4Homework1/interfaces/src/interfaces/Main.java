package interfaces;

public class Main {

	public static void main(String[] args) {
		
		// BÝRÝNCÝ YONTEM
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new OracleCustomerDal(); // bu sekilde CustomerDal interfacesini implement eden
		  												// diger classlarin referansini tutabilir ve boylece implement
														// edilen classlardan new ile instance olusturabiliriz
		customerManager.add();

			// ÝKÝNCÝ YONTEM
		//CustomerManager customerManager = new CustomerManager(new MysqlCustomerDal());
		//customerManager.add();
		
	}

}
