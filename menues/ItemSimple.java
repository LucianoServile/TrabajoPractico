package menues;

public class ItemSimple extends AbstractItem{
	String funcion; //Se seteara desde el hijo especificamente segun cual sea la funcion. 
	
	public ItemSimple(String nombre) {
		super(nombre);
	}
	
	public ItemSimple(String nombre, String funcion) {
		super(nombre);
		this.funcion = funcion;
	}
	
	// @todo Mas adelante realizara verdaderas funciones
	@Override
	public void ejecutarFuncion() {
		System.out.println(this.funcion);
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	
	
}
