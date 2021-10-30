package model;

public class Estudiante {

	String codigo;
	String nombre;
	Estudiante siguiente;
	Estudiante anterior;
	
	/**
	 * @param codigo
	 * @param nombre
	 */
	public Estudiante(String nombre, String codigo) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * @return the siguiente
	 */
	public Estudiante getSiguiente() {
		return siguiente;
	}
	/**
	 * @param seguiente the siguiente to set
	 */
	public void setSiguiente(Estudiante siguiente) {
		this.siguiente = siguiente;
	}
	/**
	 * @return the anterior
	 */
	public Estudiante getAnterior() {
		return anterior;
	}
	/**
	 * @param enterior the anterior to set
	 */
	public void setAnterior(Estudiante anterior) {
		this.anterior = anterior;
	}
	@Override
	public String toString() {
	
		
		return  anterior.getNombre() + " <-- " + " Nombre: " + nombre
				+ " --> " + siguiente.getNombre()
				+ " / " + anterior.getCodigo() + " <-- " + " Codigo: " + codigo
				+ " --> " + siguiente.getCodigo() + "\n";
				
	} 	
	

}
