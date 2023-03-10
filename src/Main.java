import acceso.Animal;
import acceso.Reptil;

class Persona2 extends Object{
	String nombre;
	String apellido;
	String curp;
	
	Persona2(){}
	
	Persona2(String nombrePersona, String apellido, String curp) {
		this.nombre = nombrePersona;
		this.apellido = apellido;
		this.curp = curp;
	}

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
	
	Alumno(){}

	Alumno(String nombre,
			String apellido,
			String curp,
			Integer estres, 
			String matricula, 
			Integer suenio){
		
		super(nombre, apellido, curp);
		
		this.estres = estres;
		this.matricula = matricula;
		this.suenio=suenio;
		
	}


	void estudiar() {
		System.out.println("El alumno estudia");
	}
	
	void hacerTarea() {
		System.out.println("El alumno hace la tarea");
	}
	
	//Estoy en la clase Alumno
	

	
	@Override
	public String toString() {
		return String.format("Nombre: %s"
				+ "\nApellido: %s"
				+ "\nCurp: %s"
				+ "\nEstrés: %s"
				+ "\nMatrícula: %s"
				+ "\nSueño: %s",
				nombre,
				apellido,
				curp,
				estres,
				matricula,
				suenio
				);		
	}

	@Override
	void dormir() {
		System.out.println("El alumno no duerme");
	}

	
	
}

class Profesor extends Persona2{
	Integer amargura;
	Double salario;
	
	Profesor(){}
	
	Profesor(String nombre,
			String apellido,
			String curp,
			Integer amargura, 
			Double salario){	
		
		super(nombre, apellido, curp);
		this.amargura = amargura;
		this.salario = salario;
		
	}
	
	void hacerSufrir() {
		System.out.println("El profesor da clases");
	}
}

public class Main {
	public static void main(String[] args) {
		Persona2 persona = new Persona2();
		Alumno alumno = new Alumno
				("alan", "aguirre","CURP", 10,"12312", 10);
		Profesor profesor = new Profesor();
		
		alumno.respirar();
		
		boolean instanciaDePersona = persona instanceof Persona2;
		System.out.println("Instancia de persona?: " + instanciaDePersona);
		
		boolean alumnoEsPersona = alumno instanceof Persona2;
		System.out.println("Alumno es persona?: " + alumnoEsPersona);
		
		boolean profesorEsPersona = profesor instanceof Persona2;
		System.out.println("Profesor es persona?: " + profesorEsPersona);
		
		System.out.println(alumno);
		
		alumno.dormir();
		alumno.comer();//El alumno come chatarra
		profesor.comer(); //Come cosas fit
		
		
		//Polimorfismo
		Reptil reptil = new Reptil();
		
		String tipo = reptil.getTipoPiel();
		System.out.println(tipo);
		
		Animal jenny = new Animal("Mamifero", 0, "Jenny");
		Animal braian = new Animal("Insecto", 0, "el Braian");
		jenny.reproducirse(braian);
		

		
	}
}
