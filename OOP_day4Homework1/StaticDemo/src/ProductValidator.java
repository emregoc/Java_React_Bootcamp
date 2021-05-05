
public class ProductValidator { // Java da ana class lar static olamaz hata verir ama inner class kullanip yapabiliriz
								// inner class = class icerisinde class olusturma asagida olusturdum bir tane
								// ama innter class kullanilmasi onerilmiyor
	
	public ProductValidator() { // NOT !!! : constoructorlar anca classi bir yerde new ile cagirdigimizda calisir
		System.out.println("Constroctor calisti");
	}
	
	static { // NOT2 !!! : classi new ile cagirmasak bile static constructor calisir ama pek kullanilmaz
		System.out.println(" Static Constructor calisti");
	}
	
	public static boolean isValid(Product product) { // ProductValidator classi icinde ki methotu static yaptigimiz icin 
													// baska classta isValid methotunu kulalnirken 
													// ProductValidator.isValid seklinde kullanabiliriz ama cok yaygin
													// kullanim degil
		
		if(product.price > 0 && !product.name.isEmpty()) {
			
			return true;
			
		} 
		else{
			
			return false;
			
		}
		
	}
	
	public static class BaskaBirClass { // inner class
		
		public static void sil() {
			
			System.out.println("Sillll");
			
		}
		
	}	
	
}


