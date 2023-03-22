package interfaces;

public class Main {
	public static void main(String[] args) {
		
		Conector miConectorMaria = new MariaDB();
		Conector miConectorPostgres = new PostgresDB();
		
		select(miConectorMaria);
		select(miConectorPostgres);
	}
	
	public static void select(Conector conector) {
		conector.select();
	}
}
