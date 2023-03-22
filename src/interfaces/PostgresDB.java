package interfaces;

public class PostgresDB implements Conector{

	@Override
	public void insert() {
		System.out.println("Insert postgres");		
	}

	@Override
	public void delete() {
		System.out.println("Delete postgres");
	}

	@Override
	public void select() {
		System.out.println("Select postgres");
	}

}
