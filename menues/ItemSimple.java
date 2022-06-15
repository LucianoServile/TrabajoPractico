package menues;

import java.util.HashMap;

public abstract class ItemSimple extends ItemAbstracto{
	//String funcion; //Se seteara desde el hijo especificamente segun cual sea la funcion. 
	
	HashMap<String, Combatiente> personajes = new HashMap<String, Combatiente>();
	HashMap<String, Liga> ligas = new HashMap<String, Liga>();

	
	public ItemSimple(String nombre) {
		super(nombre);
		
	}
	
	public abstract void ejecutarFuncion();
	
	
	protected void guardarPersonajes(
			HashMap<String, Combatiente> listaPersonajes) {
		this.personajes = listaPersonajes;
	}

	protected HashMap<String, Combatiente> getPersonajes() {
		return this.personajes;
	}

	protected void guardarLigas(HashMap<String, Liga> listaLigas) {
		this.ligas = listaLigas;
	}

	protected HashMap<String, Liga> getLigas() {
		return this.ligas;
	}
}
