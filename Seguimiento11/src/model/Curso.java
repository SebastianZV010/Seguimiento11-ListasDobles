package model;

public class Curso {

	private String nombre;
	private int numEstudiante;
	private Estudiante primerEstudiante;
	private Estudiante ultimoEstudiante; 
	private int totalEstudiantes;


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

	/**
	 * @return the totalEstudiantes
	 */
	public int getTotalEstudiantes() {
		return totalEstudiantes;
	}


	/**
	 * @param totalEstudiantes the totalEstudiantes to set
	 */
	public void setTotalEstudiantes(int totalEstudiantes) {
		this.totalEstudiantes = totalEstudiantes;
	}


	
	public String addEstudianteOrdenamiento(Estudiante nuevoEstudiante){

		String mensaje = "Estudiante agregado \n";
		totalEstudiantes++;

		if(primerEstudiante==null){

			primerEstudiante=nuevoEstudiante;
		

		} else if(primerEstudiante.getSiguiente() == null) {

			primerEstudiante.setSiguiente(nuevoEstudiante);
			nuevoEstudiante.setAnterior(primerEstudiante);
			ultimoEstudiante=nuevoEstudiante;
			

		} else {

			nuevoEstudiante.setAnterior(ultimoEstudiante);
			ultimoEstudiante.setSiguiente(nuevoEstudiante);
			ultimoEstudiante = nuevoEstudiante;

		}

		return mensaje; 

	}
	
	public String addEstudiante(Estudiante nuevoEstudiante) {

		totalEstudiantes++;
		String mensaje = "Estudiante agregado \n";

		if(primerEstudiante==null){

			primerEstudiante=nuevoEstudiante;
			
		} else {

			nuevoEstudiante.setSiguiente(primerEstudiante);
			primerEstudiante.setAnterior(nuevoEstudiante);
			primerEstudiante=nuevoEstudiante;
		}
		return mensaje;

	}
	

	public String pintarEstudiante() {


		String mensaje = "";


		if(primerEstudiante != null){

			Estudiante temporal = primerEstudiante; 

			for(int i = 0; i < totalEstudiantes && temporal != null; i++ ) {

				mensaje += temporal.toString();
				temporal = temporal.getSiguiente();
				

			}

		} else {

			mensaje = "\n There are no students registered \n";

		}

		return mensaje; 

	}

	
	public int eliminarEstudiante(String nombre) {

		Estudiante actual = primerEstudiante;
		Estudiante auxiliar = primerEstudiante.getSiguiente();

		int count = 0;
		

		if(primerEstudiante != null) {
			
			while(actual != null) {
				
				if(actual.getNombre().equalsIgnoreCase(nombre)){
					
					if(actual == primerEstudiante) {
						
						if(auxiliar == null) {
							
							primerEstudiante = null; 
							totalEstudiantes--;
							count++;
							
		
							
						} else {
							
							primerEstudiante = actual.getSiguiente();
							auxiliar = primerEstudiante.getSiguiente();				
							primerEstudiante.setAnterior(null);
							totalEstudiantes--;
							count++;
							
			
						}
						
					} else if(actual == ultimoEstudiante){
						
						ultimoEstudiante = actual.getAnterior();
						ultimoEstudiante.setSiguiente(null);
						count++;
						totalEstudiantes--;
						
						
				
						
					} else {
						
						actual = actual.getAnterior();
						auxiliar = auxiliar.getAnterior();
						
						actual.setSiguiente(auxiliar.getSiguiente());
						auxiliar.getSiguiente().setAnterior(actual);
						auxiliar = auxiliar.getSiguiente();
						
						count++;
						totalEstudiantes--;
						
					
						
					}
					
				}
				
				actual = actual.getSiguiente();
				
				if(auxiliar.getSiguiente() != null) {
					
					
				
					
					auxiliar = auxiliar.getSiguiente();
				}
				
			}			
			
		}
		
		return count;
			
	}
	
	
	

	public void pintarAtrasAdelanteEstudiantes(){

	}
	public void pintarGeneral(){

	}

	public void pintarEstudianteRecursivo(Estudiante estudiante){

	}


}
