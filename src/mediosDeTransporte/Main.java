package mediosDeTransporte;

public class Main {
	public static void main(String[] args) {
		avanzar(new Moto());
		avanzar(new Carro());
		
		
	}
	
	public static void avanzar(MediosDeTransporte medio) {
		medio.avanzar();
	}
}
