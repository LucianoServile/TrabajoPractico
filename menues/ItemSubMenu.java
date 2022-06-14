package menues;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemSubMenu extends ItemAbstracto{
	ArrayList<ItemAbstracto> opciones = new ArrayList<ItemAbstracto>();
	//HashMap<int key, String value> opciones = new HashMap<int key,String value>();

	public ItemSubMenu(String nombre) {
		//Cargar un String[] o lista de cadenas que contenga los botones princpl
		super(nombre);
	}
	 
	public void add(ItemAbstracto item) {
		this.opciones.add(item);
	}
	
	public void ejecutarFuncion(){
		listarOpciones();
	}
	
	
	public void listarOpciones() {
		Iterator<ItemAbstracto> itr = this.opciones.listIterator();
		int i = 0;
		System.out.println(this.nombre);
		while(itr.hasNext()) {
			System.out.print(i + "- ");
			System.out.println(itr.next().getNombre());
			i++;
		}
	}
	
	public ItemAbstracto getOpcion(String nombre) {
		Iterator<ItemAbstracto> itr = this.opciones.listIterator();
		ItemAbstracto itemAux, retorno = null;
		while(itr.hasNext()) {
			itemAux = itr.next();
			if(itemAux.getNombre() == nombre) {
				retorno = itemAux;
			}
		}
		return retorno;
	}
}
