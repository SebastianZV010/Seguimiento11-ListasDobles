package model;

public class Curso {

	String nombre;
	int numEstudiante;
	Estudiante primerEstudiante;
	Estudiante ultimoEstudiante; 
	
	
	/**
	 * @param nombre
	 * @param numEstudiante
	 */
	public Curso(String nombre, int numEstudiante) {
		this.nombre = nombre;
		this.numEstudiante = numEstudiante;
		
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the numEstudiante
	 */
	public int getNumEstudiante() {
		return numEstudiante;
	}


	/**
	 * @param numEstudiante the numEstudiante to set
	 */
	public void setNumEstudiante(int numEstudiante) {
		this.numEstudiante = numEstudiante;
	}


	/**
	 * @return the primerEstudiante
	 */
	public Estudiante getPrimerEstudiante() {
		return primerEstudiante;
	}


	/**
	 * @param primerEstudiante the primerEstudiante to set
	 */
	public void setPrimerEstudiante(Estudiante primerEstudiante) {
		this.primerEstudiante = primerEstudiante;
	}


	/**
	 * @return the ultimoEstudiante
	 */
	public Estudiante getUltimoEstudiante() {
		return ultimoEstudiante;
	}


	/**
	 * @param ultimoEstudiante the ultimoEstudiante to set
	 */
	public void setUltimoEstudiante(Estudiante ultimoEstudiante) {
		this.ultimoEstudiante = ultimoEstudiante;
	}

	public void addEstudiante(Estudiante nuevoEstudiante) {
		
		if(primerEstudiante==null){
			
			primerEstudiante=nuevoEstudiante;
			ultimoEstudiante=primerEstudiante;
			primerEstudiante.setSiguiente(ultimoEstudiante);
			ultimoEstudiante.setAnterior(primerEstudiante);
			
		} else {
			
			nuevoEstudiante.setSiguiente(primerEstudiante);
			primerEstudiante.setAnterior(nuevoEstudiante);
			nuevoEstudiante.setAnterior(ultimoEstudiante);
			ultimoEstudiante.setSiguiente(nuevoEstudiante);
			primerEstudiante=nuevoEstudiante;
		}
		
	}	
	
	public void addEstudianteOrdenamiento(Estudiante nuevoEstudiante){
		
		
	}

	public void eliminarEstudiantes(String nombre) {
		
		
	}
	
	public void pintarEstudiante() {
		
	}
	
	public void pintarAtrasAdelanteEstudiantes(){
		
	}
	public void pintarGeneral(){
		
	}
	
	public void pintarEstudianteRecursivo(Estudiante estudiante){
		
	}


}
