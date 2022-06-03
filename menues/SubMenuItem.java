package menues;

import java.util.ArrayList;
import java.util.Iterator;

public class SubMenuItem extends AbstractItem{
	ArrayList<AbstractItem> opciones = new ArrayList<AbstractItem>();
	//HashMap<int key, String value> opciones = new HashMap<int key,String value>();

	public SubMenuItem(String nombre) {
		//Cargar un String[] o lista de cadenas que contenga los botones princpl
		super(nombre);
	}
	 
	public void add(AbstractItem item) {
		this.opciones.add(item);
	}
	
	public void ejecutarFuncion(){
		listarOpciones();
	}
	
	
	public void listarOpciones() {
		Iterator<AbstractItem> itr = this.opciones.listIterator();
		int i = 0;
		System.out.println(this.nombre);
		while(itr.hasNext()) {
			System.out.print(i + "- ");
			System.out.println(itr.next().getNombre());
			i++;
		}
	}
}
