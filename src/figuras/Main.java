package figuras;

public class Main {
	
	public static void main(String[]
			args) {
		
		Circulo c = 
				new Circulo("azul", 3);
		
		Cuadrado sq = new Cuadrado("rojo", 5);
		
		imprimirArea(c);
		imprimirArea(sq);
		
		imprimirPerimetro(c);
		imprimirPerimetro(sq);
		
		
		}
	
	
	public static void imprimirArea(Figura cuadradro) {
		System.out.println(cuadradro.obtenerArea());
	}
	
	public static void imprimirPerimetro(Figura figura) {
		System.out.println(figura.obtenerPerimetro());
	}
	
}
