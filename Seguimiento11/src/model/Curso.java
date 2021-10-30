package model;

public class Curso {

	String nombre;
	int numEstudiante;
	Estudiante primerEstudiante;
	Estudiante ultimoEstudiante; 
	int totalEstudiantes;
	
	
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


	public String addEstudiante(Estudiante nuevoEstudiante) {
		
		totalEstudiantes++;
		String mensaje = "Estudiante agregado \n";
		
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
		return mensaje;
		
	}	
	
	public String addEstudianteOrdenamiento(Estudiante nuevoEstudiante){
		
		String mensaje = "Estudiante agregado \n";
		totalEstudiantes++;
		
		if(primerEstudiante==null){

			primerEstudiante=nuevoEstudiante;
			ultimoEstudiante=primerEstudiante;
			primerEstudiante.setSiguiente(ultimoEstudiante);
			ultimoEstudiante.setAnterior(primerEstudiante);

		} else if(primerEstudiante == ultimoEstudiante) {
			
			primerEstudiante.setSiguiente(nuevoEstudiante);
			nuevoEstudiante.setAnterior(primerEstudiante);
			ultimoEstudiante=nuevoEstudiante;
			ultimoEstudiante.setSiguiente(primerEstudiante);
			primerEstudiante.setAnterior(ultimoEstudiante);
			
			
		} else {
			
			ultimoEstudiante.setSiguiente(nuevoEstudiante);
			nuevoEstudiante.setAnterior(ultimoEstudiante);
			ultimoEstudiante=nuevoEstudiante;
			ultimoEstudiante.setSiguiente(primerEstudiante);
			primerEstudiante.setAnterior(ultimoEstudiante);
			
			
		}
		
		return mensaje; 
	
	}

	

	public boolean eliminarEstudiantes(String nombre) {
		
		Estudiante actual;
		boolean encontrado = false;
		actual = ultimoEstudiante;
		
		if(primerEstudiante != null){
		while(actual.siguiente != ultimoEstudiante && !encontrado) {
			
			encontrado=(actual.siguiente.nombre==nombre);
			if(!encontrado) {
				actual = actual.siguiente;
				
				System.out.println("1");
				
			}
			
		}
		
		System.out.println("2");
		System.out.println(encontrado);
		encontrado=(actual.siguiente.nombre==nombre);
		System.out.println(encontrado);
		
		if(encontrado){
			
			System.out.println("3");
			Estudiante aux = actual.siguiente;
			if(ultimoEstudiante == ultimoEstudiante.siguiente) {
				
				ultimoEstudiante=null; 
				System.out.println("4");
				
			} else {
				
				if(aux == ultimoEstudiante) {
					ultimoEstudiante=actual;
					System.out.println("5");
				}
				actual.siguiente=aux.siguiente;
				System.out.println("6");
			}
			
			System.out.println("7");
			aux=null; 
		}
	} 
		
		return encontrado==true;
	}
	
	public String pintarEstudiante() {
		
		
		String codigo = "";
		String mensaje = "";
		
		
		if(primerEstudiante != null){
			
			Estudiante temporal = primerEstudiante; 
			
			while(!codigo.equalsIgnoreCase(ultimoEstudiante.getCodigo())) {
				
				mensaje += temporal.toString();
				temporal = temporal.getSiguiente();
				codigo = temporal.getCodigo();
				
			}
			
			mensaje += temporal.toString();
			
		} else {
			
			mensaje = "\n There are no students registered \n";
			
		}
		
		return mensaje; 
		
	}
	
	public void pintarAtrasAdelanteEstudiantes(){
		
	}
	public void pintarGeneral(){
		
	}
	
	public void pintarEstudianteRecursivo(Estudiante estudiante){
		
	}


}
