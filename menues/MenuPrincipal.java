package menues;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuPrincipal { //Podría ser una clase heredada de SubMenuItem que tenga el constructor privado para ser Singleton
	private static MenuPrincipal instancia;
	private ItemSubMenu menuPrincipalSubMenu;
	
	private MenuPrincipal() {
		this.menuPrincipalSubMenu = new ItemSubMenu("Menu Principal");
	}
	
	public static MenuPrincipal getInstance() {
		if(instancia == null) {
			instancia = new MenuPrincipal();
		}
		return instancia;
	}
	
	public void agregarOpciones(ItemAbstracto item) {
		this.menuPrincipalSubMenu.add(item);
	}
	
	public void listarOpciones() {
		this.menuPrincipalSubMenu.listarOpciones();
	}
	
	public void ejecutarFuncionMenuPrincipal() {
		this.menuPrincipalSubMenu.ejecutarFuncion();
	}
}
