package excepciones;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Unchecked exception
		try {
			int division = 15/1;
			System.out.println(division);
		} catch (Exception e) {
			System.out.println("Ocurrió un error al dividir");
		}
		finally {
			System.out.println("Esto se ejecuto sí o sí");
		}

		
		//Checked exceptions
		try {
			Thread.sleep(1000);
			System.out.println("El hilo se durmió");
		}
		catch(InterruptedException e) {
			e.printStackTrace(System.out);
		}
		catch(Exception e) {
			System.out.println("Fallo mas general");
		}
		
		try {
			volverConLaEx(0);
			Integer.parseInt("asdas");
		}
		catch(EllaNoTeAmaException ex) {
			System.out.println(ex.getMessage());
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());;
		}
		catch(Throwable general) {
			System.out.println("Ha ocurrido un error");
		}
		finally {
			System.out.println("Siempre se ejecuta");
		}
		
	}

	private static void volverConLaEx(int esfuerzo) throws EllaNoTeAmaException{
		if(esfuerzo > 0) {
			throw new EllaNoTeAmaException("Ella no te ama");
		}
		System.out.println("La recuperaste");
	}
}
