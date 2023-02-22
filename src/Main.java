import java.time.LocalDate;

public class Main {
	public void main(String[] args) {
		// Creación de objeto
		Persona persona1 = new Persona();

		persona1.altura = 50d;
		persona1.nombre = "Medio";
		persona1.apellidos = "Metro";
		persona1.curp = "ASDA000416HMXDAS3";
		persona1.edad = 7;
		persona1.fechaDeNacimiento = LocalDate.now();
		persona1.imc = 15d;
		persona1.peso = 30d;
		persona1.rfc = "ASDA000416HMX122";

		persona1.caminar();
		persona1.comer();
		persona1.tramites();
//---------------------------------------------------------------------
		Persona persona2 = new Persona();

		persona2.altura = 178d;
		persona2.nombre = "Pirata";
		persona2.apellidos = "DJ";
		persona2.curp = "GEXA000104HGDZP2";
		persona2.edad = 50;
		persona2.fechaDeNacimiento = LocalDate.now();
		persona2.imc = 36d;
		persona2.peso = 82d;
		persona2.rfc = "a";

		
		persona1.pelear(persona2);
	}
}
