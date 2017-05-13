package pw2;


public class MatriculaAlumno {
	String nombres;
	String apellidos;
	String coldeprocedencia;
	String grado;
	
	public MatriculaAlumno(){
		
	}

	public MatriculaAlumno(String nombres, String apellidos, String coldeprocedencia, String grado) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.coldeprocedencia = coldeprocedencia;
		this.grado = grado;
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

	public String getColdeprocedencia() {
		return coldeprocedencia;
	}

	public void setColdeprocedencia(String coldeprocedencia) {
		this.coldeprocedencia = coldeprocedencia;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	
	


}
