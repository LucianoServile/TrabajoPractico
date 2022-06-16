package menues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		String entrada = "";
		int entradaInt;
		ItemAbstracto aux;
		
		if(this.opciones.size() ==0) {
			System.err.println("No hay opciones para displayar");
			return;
		}
		
		listarOpciones();
		try {
			entrada = in.readLine();
		}catch(IOException E) {
			System.err.println(E);
		}
		System.out.println("la entrada es : " + entrada);
		entradaInt = Integer.parseInt(entrada);
		try {
			aux = getOpcion(entradaInt);
		}catch(IOException E) {
			System.err.println(E);
			return;
		}
		try {
			aux.ejecutarFuncion();
		}catch(NullPointerException E){
			System.err.println();
			return;
		}
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
	
	public ItemAbstracto getOpcion(int entradaInt) throws IOException {
		int i = 0;
		Iterator<ItemAbstracto> itr = this.opciones.listIterator();
		ItemAbstracto retorno = null;
		System.out.println("size: "+ opciones.size());
		if(entradaInt < 0 || entradaInt > opciones.size() - 1) {
			throw new IOException("Error de entrada de datos"); //@todo create new exception
		}
		retorno = itr.next();
		
		while(itr.hasNext() && i != entradaInt) {
			retorno = itr.next();
			i++;
		}
		return retorno;
	}
}
