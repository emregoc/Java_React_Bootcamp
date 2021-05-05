package interfaces;

public class MysqlCustomerDal implements CustomerDal{

	@Override
	public void add() {
		
		System.out.println("Mysql'e eklendi : ");
		
	}

}
