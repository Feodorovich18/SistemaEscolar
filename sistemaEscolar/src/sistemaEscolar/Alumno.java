package sistemaEscolar;
import java.util.*;
import java.io.*;

public class Alumno extends Usuario{

	private int bloque = 0;
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
		
		
		
	}
	
	public Alumno(String nombreCompleto) {
		this.nombre = nombreCompleto;
	}
	
	
	public void controlAlumno() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
	
		int numOpc;
		System.out.println("Bienvenido, " + this.getNombreCompleto());
		
		do {
			System.out.println("Elija un numero de opcion: \n 1) Inscribirse en Materia\n 2) Consultar Calificaciones\n 3) Consultar Promedio General \n 4) Salir");
			
			numOpc = Integer.parseInt(input.readLine());
			
			switch(numOpc) {
			
				case 1:
					this.inscribirseEnMateria(Administrador.docentes);
				break;
				
				case 2:
					this.consultarCalificacion();
				break;
				
				case 3:
					this.calcularPromedio();
				break;
			}
			
		}while(numOpc != 4);
		
	}
	
	
	
	
	
	
	
	public void inscribirseEnMateria(ArrayList<Docente> docentes) throws IOException{
		
		if(this.bloque == 0) {
			System.arraycopy(Administrador.materias1erBloque, 0, this.materias1erBloque, 0, 4);
			System.out.println("\nMaterias a Cursar:");
			
			for(int i=0; i<this.materias1erBloque.length; i++) {
				System.out.println("Materia: " + materias1erBloque[i].getNombreMateria());
				
				for(Docente e: docentes) {
					if(e.listaMaterias.get(i).getNombreMateria().equalsIgnoreCase(this.materias1erBloque[i].getNombreMateria())) {
						System.out.println("Docente asignado: " + e.getNombreCompleto());
						
						e.listaMaterias.get(i).alumnosInscritos.add(new Alumno(this.getNombreCompleto()));
						
						break;
					}
				}
			}
		}
		
		
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
