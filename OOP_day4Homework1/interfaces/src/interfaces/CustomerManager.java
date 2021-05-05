package interfaces;

public class CustomerManager { // is kodlari icin olusturduk
	
		// BÝRÝNCÝ YONTEM
	
	CustomerDal customerDal; // interfaceyi burada cagiriyoruz digerleri ondan implement edildigi icin 
							 // asagidaki metot da digerleri de main dne ulasabilir vve bu sayede kolay bir sekilde
							 // oradan degisiklik yapabiliriz
	
	public void add() { 
		
		customerDal.add();
		
	}
	
		// ÝKÝNCÝ YONTEM
	
	//private CustomerDal customerDal;
	
	//public CustomerManager(CustomerDal customerDal) {
		
	//	this.customerDal = customerDal;
		
	//}
	
	//public void add() { 
	
	//		customerDal.add();
			
	//}
		
	

}
