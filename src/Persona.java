import java.time.LocalDate;

class Persona {
	//Atributos 
	String nombre;
	String apellidos;
	Integer edad;
	String rfc;
	String curp;
	LocalDate fechaDeNacimiento;
	Double peso;
	Double altura;
	Double imc;
	
	//Métodos
	void caminar() {
		System.out.println(
		"Soy " + nombre + " " + apellidos + 
		" y estoy caminando");
	}
	

	void tramites() {
		System.out.println(
		"RFC:" + rfc+
		"\nApellido:" + apellidos +
		"\nNombre:" + nombre
				);
	}
	
	void comer() {
		System.out.println(
				nombre + 
				" está comiendo");
	}
	
	void pelear(Persona persona) {
		System.out.println(
			nombre + " pelea con "+
			persona.nombre
		);
	}
	
}

