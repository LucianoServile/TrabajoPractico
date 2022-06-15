package menues;

public class MenuesDemo {
	
	public static void main(String[] args) {
		MenuPrincipal menu = MenuPrincipal.getInstance(); //@todo make menuPrincipal un SubMenuItem
		menu.agregarOpciones(new ItemSubMenu("Submenu1"));
		menu.agregarOpciones(new ItemSubMenu("Submenu2"));
		menu.agregarOpciones(new ItemSubMenu("Submenu3"));
		
		// -- Batallar
		ItemSubMenu subMenuBatallar = new ItemSubMenu("Batallar");
		ItemSubMenu subMenuReportes = new ItemSubMenu("Reportes");
		
		menu.agregarOpciones(subMenuBatallar);
		menu.agregarOpciones(new OpcionSalir());
		menu.ejecutarFuncionMenuPrincipal();
		
		subMenuBatallar.add(new BatallarOp1("Batalla 1 vs 1 , Batalla 1 vs Liga, Batalla Liga vs Liga"));
		subMenuBatallar.add(new OpcionSalir());
		subMenuBatallar.ejecutarFuncion(); //cuando se convierta menu principal a un submenu, se podra hacer menu.getOpcion("Batallar").ejecutarFuncion().
		
		//@todo heredar de itemSimple cada opcion de reportes
		//subMenuReportes.add(new Op1Reportes("Listar combatientes que venzan a otro combatiente segun caracteristica"));
		//subMenuReportes.add(new Op2Reportes("Listado por multiples caracteristicas"));
		
	}
}
