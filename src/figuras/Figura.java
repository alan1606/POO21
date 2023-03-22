package figuras;

public abstract class Figura {

	private String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public abstract double obtenerArea();
	
	public abstract double obtenerPerimetro();
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
