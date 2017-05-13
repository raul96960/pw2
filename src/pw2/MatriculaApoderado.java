package pw2;

public class MatriculaApoderado {
	String dni;
	String nombres;
	String apellidos;
	String email;
	String distrito;
	String celular;
	public MatriculaApoderado(){
		
	}
	public MatriculaApoderado(String dni, String nombres, String apellidos, String email, String distrito, String celular) {
		this.dni = dni;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.distrito = distrito;
		this.celular = celular;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
	
	
	

}
