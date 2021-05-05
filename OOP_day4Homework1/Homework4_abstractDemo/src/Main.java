
public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager(); // buradaki databaseManager CustomerManager
																		// class'indan geliyor
																		// bu sayede buradan diyelim ki oracle yerine
																		//  sql yaptik ve sql e ulasmis oluruz
																		// dogru kullanim bu sekilde
		customerManager.getCustomers();

	}

}
