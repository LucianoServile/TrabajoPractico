package menues;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuPrincipal { //Podría ser una clase heredada de SubMenuItem que tenga el constructor privado para ser Singleton
	private static MenuPrincipal instancia;
	private String nombre;
	private ArrayList<AbstractItem> opciones = new ArrayList<AbstractItem>();
	
	private MenuPrincipal(String nombre) {
		this.nombre = nombre;
	}
	
	public static MenuPrincipal getInstance(String nombre) {
		if(instancia == null) {
			instancia = new MenuPrincipal(nombre);
		}
		return instancia;
	}
	
	public void agregarOpciones(AbstractItem item) {
		this.opciones.add(item);
	}
	
	public void listarOpciones() {
		Iterator<AbstractItem> itr = this.opciones.listIterator();
		int i = 0;
		while(itr.hasNext()) {
			System.out.print(i + "- ");
			System.out.println(itr.next().getNombre());  ;
			i++;
		}
	}
	
}
