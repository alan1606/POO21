package figuras;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(String color, 
			double radio) {
		super(color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double obtenerArea() {
		return Math.PI * radio * radio;
	}

	@Override
	public double obtenerPerimetro() {
		return Math.PI * 2 * radio;
	}
	
	
}
