package sistemaEscolar;

import java.util.*;
import java.io.*;



public class Principal {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		
		
		int numOpc;
		
		System.out.println("-----------------BIENVENIDO AL SISTEMA ESCOLAR 'MIKHAIL'---------------");
		
		System.out.println("\nSe necesita registrar a un nuevo Administrador...");
		
		Administrador adminGeneral = new Administrador();
		
		
		do {
			System.out.println("\n1) Alumno \n2) Docente \n3) Administrador \n4) Salir del Sistema");
			System.out.print("Elija un numero de opcion: ");
			
			numOpc = Integer.parseInt(input.readLine());
			
			switch(numOpc) {
				case 1:
					if(Administrador.alumnos.isEmpty()) {
						System.out.println("\nNo se ha registrado ningún Alumno...");
					}
					else {
						
					}
				break;
				
				case 2:
					if(Administrador.docentes.isEmpty()) {
						System.out.println("\nNo se ha registrado ningún Docente...");
					}
				break;
				
				case 3:
					
				
			
			}
		
		}while(numOpc != 4);
		
	}
}
