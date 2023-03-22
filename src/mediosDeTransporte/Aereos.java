package mediosDeTransporte;

public abstract class Aereos extends MediosDeTransporte {

	String aerodinamica;
	
	abstract void despegar();
	abstract void volar();
	abstract void estrellarse();
	abstract void atterizar();
	
}
