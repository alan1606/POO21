package mediosDeTransporte;

public abstract class MediosDeTransporte {

	String marca;
	String modelo;
	
	abstract void avanzar();
	abstract void retroceder();
	abstract void prender();
	abstract void darDireccion(String direccion);
	
}
