package menues;

public abstract class AbstractItem {
	protected String nombre;
	public AbstractItem(String nombre) {
		this.nombre = nombre;
	}
	public abstract void ejecutarFuncion();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
