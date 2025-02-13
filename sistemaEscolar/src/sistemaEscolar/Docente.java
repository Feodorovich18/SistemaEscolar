package sistemaEscolar;

import java.io.*;
import java.util.*;

public class Docente extends Usuario{

	private double salario;
	
	ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
	
	
	
	/*************
	 * Constructor
	 ************/
	public Docente() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		System.out.print("Nombre del Docente: ");
		this.nombre = input.readLine();
		System.out.print("Apellido Paterno del Docente: ");
		this.apellidoPaterno = input.readLine();
		System.out.print("Apellido Materno del Docente: ");
		this.apellidoMaterno = input.readLine();
		System.out.print("Edad: ");
		this.edad = Integer.parseInt(input.readLine());
		
		this.tipoUsuario = "Docente";
		
		this.claveAcceso = Usuario.crearClaveAcceso(this.nombre, this.apellidoPaterno, this.edad);
		
		System.out.println("\nNueva clave de acceso para el Docente: " + this.claveAcceso);
		System.out.println("\nDocente Registrado...");
		
		
	}
	
	
	
	public void asignarCalificacion() {
		
	}
	
	public void modificarCalificacion() {
		
	}
	
	public void generarReporteAcademico() {
		
	}
}
