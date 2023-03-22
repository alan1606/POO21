package interfaces;

public class MariaDB implements Conector{

	@Override
	public void insert() {
		System.out.println("Insert mariadb");
	}

	@Override
	public void delete() {
		System.out.println("Delete mariadb");
	}

	@Override
	public void select() {
		System.out.println("Select mariadb");
	}

}
