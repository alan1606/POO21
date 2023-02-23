class Persona2{
	String nombre;
	String apellido;
	String curp;
	
	void respirar() {
		System.out.println("La persona respira");
	}
	
	void comer() {
		System.out.println("La persona come");
	}
	
	void dormir() {
		System.out.println("La persona duerme");
	}
}


class Alumno extends Persona2{
	Integer estres;
	String matricula;
	Integer suenio;
	
	void estudiar() {
		System.out.println("El alumno estudia");
	}
	
	void hacerTarea() {
		System.out.println("El alumno hace la tarea");
	}
}

class Profesor extends Persona2{
	Integer amargura;
	Double salario;
	
	void hacerSufrir() {
		System.out.println("El profesor da clases");
	}
}

public class Main {
	public static void main(String[] args) {
		Persona2 persona = new Persona2();
		Alumno alumno = new Alumno();
		Profesor profesor = new Profesor();
		
		alumno.respirar();
	}
}
