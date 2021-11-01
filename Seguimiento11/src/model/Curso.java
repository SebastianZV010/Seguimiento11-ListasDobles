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

	public String pintarEstudiante() {


		String codigo = "";
		String mensaje = "";


		if(primerEstudiante != null && ultimoEstudiante != null){

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

	// primero 1
	// ultimo 4

	//actual 1
	// ultimo 4

	// 4 <- 1 -> <- 5 -> <- 7 -> <- 6 -> <- 4 -> 1


	public int eliminarEstudiante(String nombre) {

		Estudiante actual = new Estudiante("","");
		Estudiante anterior = new Estudiante("","");

		int count = 0; 
	
		actual = primerEstudiante;
		anterior = ultimoEstudiante;
		
	
		if(primerEstudiante != null) {
			do {
				if(actual.getNombre().equalsIgnoreCase(nombre)) { // compara el valor del dato actual con el buscado

					if(actual == primerEstudiante){
						
						if(primerEstudiante == ultimoEstudiante) {
							
							primerEstudiante = null; 
							ultimoEstudiante = null; 
							
							count++;
							totalEstudiantes--;
						
						}
						 else {
							
							 
						primerEstudiante = primerEstudiante.getSiguiente();
						ultimoEstudiante.setSiguiente(primerEstudiante); 
						primerEstudiante.setAnterior(ultimoEstudiante);
						
						count++;
						totalEstudiantes--;
						
							
						}
						
					} else if (actual == ultimoEstudiante){

						ultimoEstudiante = anterior;
						primerEstudiante.setAnterior(ultimoEstudiante);
						ultimoEstudiante.setSiguiente(primerEstudiante);

//						ultimoEstudiante.setSiguiente(primerEstudiante);
//						primerEstudiante.setAnterior(ultimoEstudiante);
						
						
						count++;
						totalEstudiantes--;
						

					} else{
						
						
				
						anterior.setSiguiente(actual.getSiguiente());
						actual.getSiguiente().setAnterior(anterior);;
						System.out.println(actual);
						
						
						if(count != 0) {
							
							anterior.setSiguiente(actual.getSiguiente());
							actual.getSiguiente().setAnterior(anterior);;
							
							System.out.println("n");
						}
						
						
						
						count++;
						totalEstudiantes--;
						
					}

				}

				anterior = actual; //referencia del anterior al que vas a eliminar 
				actual = actual.getSiguiente();
				

			}  while(actual != primerEstudiante && primerEstudiante != null);
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
