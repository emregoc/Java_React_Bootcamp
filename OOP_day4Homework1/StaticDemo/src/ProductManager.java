
public class ProductManager {
	
	public void add(Product product) {
		
		
		if(ProductValidator.isValid(product)) {
			
			System.out.println("Veritabanina eklendi : ");
			
		}else {
			
			System.out.println("Urun bilgileri gecersiz ");
			
		}
		
		
		
	}

}
