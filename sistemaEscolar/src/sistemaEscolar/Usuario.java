package sistemaEscolar;

import java.util.*;
import java.io.*;

public class Usuario {

	protected String nombre;
	protected String apellidoPaterno;
	protected String apellidoMaterno;
	protected int edad;
	
	protected String plantel;
	protected int claveAcceso;
	protected String tipoUsuario;
	
	
	
	
	/***************
	 * Getters
	 **************/
	public int getClaveAcceso() {
		return this.claveAcceso;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellidoPaterno + " " + this.apellidoMaterno;
	}
	
	
	
	
	/*********************************************************************/
	public static void iniciarSesion(Administrador adminGeneral) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		
		
		int entradaClave;
		
		
		System.out.println("\n\n\n-------------------INICIO DE SESION------------------");
		System.out.print("Introduzca su clave de usuario: ");
		entradaClave = Integer.parseInt(input.readLine());
		
		
		if(adminGeneral.getClaveAcceso() == entradaClave) {
			adminGeneral.controlAdministrador();
		}
		
		
		for(Alumno e: Administrador.alumnos) {
			if(e.getClaveAcceso() == entradaClave) {
				
				e.controlAlumno();
				break;
				
				
			}
		}
		
		for(Docente e: Administrador.docentes) {
			if(e.getClaveAcceso() == entradaClave) {
				break;
			}
		}
		
		
		
	}
	
	
	
	
	/*****************************************************************************/
	public static int crearClaveAcceso(String nombre, String apellido, int edad) {
		int clave1;
		int clave2;
		String claveStr;
		int claveFinal;
		
		
		clave1 = nombre.charAt(1);
		clave2 = apellido.charAt(1);
		
		claveStr = Integer.toString(clave1) + Integer.toString(clave2) + Integer.toString(edad);
		
		claveFinal = Integer.parseInt(claveStr);
		
		return claveFinal;
	}
}
