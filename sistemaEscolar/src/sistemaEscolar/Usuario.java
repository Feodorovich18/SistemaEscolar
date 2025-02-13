package sistemaEscolar;

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
	
	
	
	public boolean iniciarSesion() {
		return true;
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
