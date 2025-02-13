package sistemaEscolar;
import java.util.*;
import java.io.*;

public class Alumno extends Usuario{

	private double calificacion;
	private double promedio;
	
	private Materia[] materias1erBloque = new Materia[4];
	private Materia[] materias2doBloque = new Materia[4];
	private Materia[] materias3erBloque = new Materia[4];
	
	private Materia[] boleta = new Materia[12];
	
	
	/*************
	 * Constructor
	 *************/
	public Alumno() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		System.out.print("Nombre del Alumno: ");
		this.nombre = input.readLine();
		System.out.print("Apellido Paterno del Alumno: ");
		this.apellidoPaterno = input.readLine();
		System.out.print("Apellido Materno del Alumno: ");
		this.apellidoMaterno = input.readLine();
		System.out.print("Edad: ");
		this.edad = Integer.parseInt(input.readLine());
		
		this.tipoUsuario = "Alumno";
		
		this.claveAcceso = Usuario.crearClaveAcceso(this.nombre, this.apellidoPaterno, this.edad);
		
		System.out.println("\nNueva clave de acceso para el Alumno: " + this.claveAcceso);
		System.out.println("\nAlumno Registrado...");
		
		System.arraycopy(Administrador.materias1erBloque, 0, this.materias1erBloque, 0, 4);
		System.arraycopy(Administrador.materias2doBloque, 0, this.materias2doBloque, 0, 4);
		System.arraycopy(Administrador.materias3erBloque, 0, this.materias3erBloque, 0, 4);
		
	}
	
	
	
	
	public void consultarCalificacion() {
	}
	
	public void calcularPromedio() {
		
	}
	
	public void consultarMaterias() {
		
	}
	
	public void consultarHorario() {
		
	}
}
