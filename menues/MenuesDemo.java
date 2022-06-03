package menues;

public class MenuesDemo {
	
	public static void main(String[] args) {
		MenuPrincipal menu = MenuPrincipal.getInstance("El senior de los anillos"); //@todo make menuPrincipal un SubMenuItem
		menu.agregarOpciones(new SimpleItem("Opcion1"));
		menu.agregarOpciones(new SimpleItem("Opcion2"));
		menu.agregarOpciones(new SimpleItem("Opcion3"));
		menu.agregarOpciones(new SimpleItem("Opcion4"));
		
		// -- Batallar
		SubMenuBatallar batallar = new SubMenuBatallar("Batallas"); 
		AbstractItem opcionSalir = new SimpleItem("Salir","saliendo");
		
		
		menu.listarOpciones();
		batallar.listarBatallas();
		batallar.ejecutarFuncion();
		opcionSalir.ejecutarFuncion();
	}
}
