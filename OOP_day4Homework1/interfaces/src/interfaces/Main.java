package interfaces;

public class Main {

	public static void main(String[] args) {
		
		// B�R�NC� YONTEM
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new OracleCustomerDal(); // bu sekilde CustomerDal interfacesini implement eden
		  												// diger classlarin referansini tutabilir ve boylece implement
														// edilen classlardan new ile instance olusturabiliriz
		customerManager.add();

			// �K�NC� YONTEM
		//CustomerManager customerManager = new CustomerManager(new MysqlCustomerDal());
		//customerManager.add();
		
	}

}
