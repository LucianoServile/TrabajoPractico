package menues;

public class MenuesDemo {
	
	public static void main(String[] args) {
		MenuPrincipal menu = MenuPrincipal.getInstance("El senior de los anillos"); //@todo make menuPrincipal un SubMenuItem
		menu.agregarOpciones(new ItemSimple("Opcion1"));
		menu.agregarOpciones(new ItemSimple("Opcion2"));
		menu.agregarOpciones(new ItemSimple("Opcion3"));
		menu.agregarOpciones(new ItemSimple("Opcion4"));
		
		// -- Batallar
		SubMenuBatallar batallar = new SubMenuBatallar("Batallas"); 
		ItemAbstracto opcionSalir = new ItemSimple("Salir","saliendo");
		
		
		menu.listarOpciones();
		batallar.listarBatallas();
		batallar.ejecutarFuncion();
		opcionSalir.ejecutarFuncion();
	}
}
