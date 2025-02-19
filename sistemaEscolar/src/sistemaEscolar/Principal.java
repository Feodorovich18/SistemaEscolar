package sistemaEscolar;

import java.util.*;
import java.io.*;



public class Principal {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		
		
		
		
		
		System.out.println("-----------------BIENVENIDO AL SISTEMA ESCOLAR 'MIKHAIL'---------------");
		
		System.out.println("\nSe necesita registrar a un nuevo Administrador...");
		
		Administrador adminGeneral = new Administrador();
		
		Usuario.iniciarSesion(adminGeneral);
		
		
		
		
		 
		
		
		
		
	}
}
