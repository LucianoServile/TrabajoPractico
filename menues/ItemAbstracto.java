package menues;

public abstract class ItemAbstracto {
	protected String nombre;
	public ItemAbstracto(String nombre) {
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
