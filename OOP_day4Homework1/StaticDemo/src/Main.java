
public class Main {

	public static void main(String[] args) {
		
		ProductManager productManager = new ProductManager();
		
		Product product = new Product();
		product.price = 10;
		product.name = "Mouse";
		
		productManager.add(product); 
		
		DatabaseHelper.Crud.delete(); // inner class kullanimi = DatabaseHelper classi altindaki Crud classi icindeki	
										//  delete() methotu
		DatabaseHelper.Connection.createDatabase(); // DatabaseHelper classi altindaki Connection classi icindeki	
										//  createDatabase() methotu

	}

}
