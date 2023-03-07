package figuras;

public class Main {
	
	public static void main(String[]
			args) {
		Figura figura = 
				new Figura("verde");
		
		Circulo c = 
				new Circulo("azul", 3);
		
		Cuadrado sq = new Cuadrado("rojo", 5);
		
		imprimirArea(c);
		imprimirArea(sq);
		imprimirArea(figura);
		
		imprimirPerimetro(c);
		imprimirPerimetro(sq);
		imprimirPerimetro(figura);
	}
	
	public static void imprimirArea
	(Figura figura) {
		System.out.println(figura.obtenerArea());
	}
	
	public static void imprimirPerimetro
	(Figura figura) {
		System.out.println(figura.obtenerPerimetro());
	}
	
}
