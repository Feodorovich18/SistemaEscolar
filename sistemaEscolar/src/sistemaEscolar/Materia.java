package sistemaEscolar;
import java.util.*;
import java.io.*;


public class Materia {

	private final String nombreMateria;
	double calificacionMateria;
	
	String docenteAsignado;
	String horario;
	
	
	
	/**********************
	 * Arrays para vacantes
	 **********************/
	static boolean [] vacante1erBloque = {true, true, true, true};
	static boolean [] vacante2doBloque = {true, true, true, true};
	static boolean [] vacante3erBloque = {true, true, true, true};
	
	
	
	
	public Materia()throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		
		System.out.print("Nombre de la Materia: ");
		this.nombreMateria = input.readLine();
		
		System.out.println("\nMateria Registrada: " + this.nombreMateria);
		
	}
	
	
	/*********
	 * Getters
	 *********/
	public String getNombreMateria() {
		return this.nombreMateria;
	}
	
	
	
}
