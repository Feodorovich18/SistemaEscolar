package sistemaEscolar;
import java.util.*;
import java.io.*;

public class Administrador extends Usuario{
	
	
	static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	static ArrayList<Docente> docentes = new ArrayList<Docente>();
	
	
	static Materia[] materias1erBloque = new Materia[4];
	static Materia[] materias2doBloque = new Materia[4];
	static Materia[] materias3erBloque = new Materia[4];
	
	/*************
	 * Constructor
	 *************/
	public Administrador()throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		System.out.print("Nombre del Administrador: ");
		this.nombre = input.readLine();
		System.out.print("Apellido Paterno del Administrador: ");
		this.apellidoPaterno = input.readLine();
		System.out.print("Apellido Materno del Administrador: ");
		this.apellidoMaterno = input.readLine();
		System.out.print("Edad: ");
		this.edad = Integer.parseInt(input.readLine());
		
		this.tipoUsuario = "Administrador";
		
		this.claveAcceso = Usuario.crearClaveAcceso(this.nombre, this.apellidoPaterno, this.edad);
		
		System.out.println("\nNueva clave de acceso para el Administrador: " + this.claveAcceso);
		
		System.out.println("\n -----------Registro de materias----------");
		registrarMaterias();
		
		System.out.println("\n ---------- Registro de Docentes----------");
		registrarDocente();
		
		System.out.println("\n -----------Registro de Alumnos-----------");
		registrarAlumno();

		System.out.println("\n------- Asignación de Materias a Docentes--------");
		asignarMateriaDocente();
	}
	
	
	/*************
	 * Registros
	 *************/
	public void registrarMaterias()throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		System.out.println("---------------PRIMER BLOQUE--------------");
		
		for(int i=0; i<materias1erBloque.length; i++) {
			materias1erBloque[i] = new Materia();
		}
		
		System.out.println("---------------SEGUNDO BLOQUE--------------");
		
		for(int i=0; i<materias2doBloque.length; i++) {
			materias2doBloque[i] = new Materia();
		}
		
		System.out.println("---------------TERCER BLOQUE---------------");
		
		for(int i=0; i<materias3erBloque.length; i++) {
			materias3erBloque[i] = new Materia();
		}
	}
	
	
	
	public void registrarDocente() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		do {
			docentes.add(new Docente());
			System.out.print("\nRegistrar otro docente? [S/N]");
			
		}while(input.readLine().equalsIgnoreCase("s"));
	}
	
	
	
	public void registrarAlumno() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		do {
			alumnos.add(new Alumno());
			System.out.print("\nRegistrar otro alumno? [S/N]");
			
		}while(input.readLine().equalsIgnoreCase("s"));
	}
	//********************************************************************
	
	public void controlAdministrador() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
	
		int numOpc;
		System.out.println("Bienvenido, " + this.getNombreCompleto());
		
		do {
			System.out.println("Elija un numero de opcion: \n 1) Registrar Docente\n 2) Registrar Alumno\n 3) Actualizar Informacion Docente \n 4) Actualizar Informacion Alumno \n 5) Salir");
			
			numOpc = Integer.parseInt(input.readLine());
			
			switch(numOpc) {
			
				case 1:
					this.registrarDocente();
				break;
				
				case 2:
					this.registrarAlumno();
				break;
				
				case 3:
					
				break;
			}
			
		}while(numOpc != 5);
	}
	
	

	public void asignarMateriaDocente()throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		String entradaMateria;
		
		for(Docente e: docentes) {
			System.out.println("\nAsignar Materias a " + e.getNombreCompleto());
			
			System.out.println("Lista de Materias: ");
			
			
			System.out.println("\nPRIMER BLOQUE:");
			for(int i=0; i<materias1erBloque.length; i++) {
				
				if(Materia.vacante1erBloque[i]) {
					System.out.println(materias1erBloque[i].getNombreMateria());
				}
						
			}
			
			System.out.println("\nSEGUNDO BLOQUE:");
			for(int i=0; i<materias2doBloque.length; i++) {
				
				if(Materia.vacante2doBloque[i]) {
					System.out.println(materias2doBloque[i].getNombreMateria());
				}
			}
			
			System.out.println("\nTERCER BLOQUE:");
			for(int i=0; i<materias3erBloque.length; i++) {
				
				if(Materia.vacante3erBloque[i]) {
					System.out.println(materias3erBloque[i].getNombreMateria());
				}
			}
		
			
			
			
			
			do {
				System.out.print("\nElija la materia para asignar al Docente: ");	
				entradaMateria = input.readLine();
			
				
				for(int i=0; i<materias1erBloque.length; i++) {
					if(entradaMateria.equalsIgnoreCase(materias1erBloque[i].getNombreMateria())){
						
						e.listaMaterias.add(new Materia(materias1erBloque[i].getNombreMateria()));
						Materia.vacante1erBloque[i] = false;
						
						System.out.println("\n Materia Asignada: " + materias1erBloque[i].getNombreMateria());
					}
				}
				
				
				
				for(int i=0; i<materias2doBloque.length; i++) {
					if(entradaMateria.equalsIgnoreCase(materias2doBloque[i].getNombreMateria())){
						
						e.listaMaterias.add(new Materia(materias2doBloque[i].getNombreMateria()));
						Materia.vacante2doBloque[i] = false;
						
						System.out.println("\n Materia Asignada: " + materias2doBloque[i].getNombreMateria());
					}
				}
				
				
				
				for(int i=0; i<materias3erBloque.length; i++) {
					if(entradaMateria.equalsIgnoreCase(materias3erBloque[i].getNombreMateria())){
						
						e.listaMaterias.add(new Materia(materias3erBloque[i].getNombreMateria()));
						Materia.vacante3erBloque[i] = false;
						
						System.out.println("\n Materia Asignada: " + materias3erBloque[i].getNombreMateria());
					}
				}
				
				
				System.out.println("\nMaterias Asignadas: ");
				for(int i=0; i<e.listaMaterias.size(); i++) {
					System.out.println(e.listaMaterias.get(i).getNombreMateria());
				}
				
				System.out.println("\n Asignar otra Materia? [S/N]: ");
				
			}while(input.readLine().equalsIgnoreCase("s"));
		}
		
		
	}
	
	
	
	
	
	
	public void inscribirAlumnoMateria() {
		
	}
	public void gestionarHorario() {
		
	}
	public void actualizarInformacion() {
		
	}
	public void generarReporteAcademico() {
		
	}
	
}
