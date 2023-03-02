package acceso;

public class Animal {
	protected String especie;
	protected Integer edad;
	protected String nombre;
	
	public Animal(String especie, Integer edad, String nombre) {
		this.especie = especie;
		this.edad = edad;
		this.nombre = nombre;
	}

	protected void comer() {
		System.out.println("El animal come");
	}
	
	public void reproducirse(Animal novie) {
		System.out.println(this.nombre
				+ " se reproduce con " + 
				novie.nombre);
	}
	
	protected void respirar() {
		System.out.println("El animal respira");
	}
}
