
public class CustomerManager {
	
	BaseDatabaseManager databaseManager; // diger classlar BaseDatabaseManager class�ndan extend edildigi icin
										 // bu sayede asagida getCustomers() methodunda BaseDatabaseManager
										// classinda ki getData() methodunu cagirdik cunku digerleri
										// ondan extend edildi
	
	public void getCustomers() {
		
		databaseManager.getData();
		
	}

}
