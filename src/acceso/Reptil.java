package acceso;

public class Reptil extends Animal{

	private String tipoPiel;
	
	public Reptil() {
		super("Reptil",0,"noname");
	}
	
	public Reptil(String especie, Integer edad, 
			String nombre,
			String tipoPiel) {
		super(especie, edad, nombre);
		this.tipoPiel = tipoPiel;
	}

	//Encapsulamiento, getters y setters
	public void mostrar() {
		System.out.println(especie);
	}

	public String getTipoPiel() {
		return "Tipo de piel: " + tipoPiel;
	}

	public void setTipoPiel(String tipoPiel) {
		this.tipoPiel = tipoPiel;
	}
	
}
