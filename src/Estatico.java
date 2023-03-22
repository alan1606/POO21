
public class Estatico {
	
	public static void main(String args[]) {
		new Pato();
		new Pato();
		System.out.println(Pato.contador);
		
		Estatico programa = new Estatico();
		programa.sumar();
		
	}
	
	public int sumar() {
		return 10;
	}
}
