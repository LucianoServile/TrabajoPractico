package TP_Heroes_Villanos;

import javax.swing.JOptionPane;

public class Item extends ItemAbstracto  {

	public static void main(String[] args) {
		Item i = new Item();
		i.ejecutarFuncion();

	}
	
	@Override
	public void ejecutarFuncion() {
		int opcion;	
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal: \n" + "1. Batallar\n" + "2. Personajes\n" + "3. Ligas\n" + "4. Reportes\n" + "5. Salir\n"));
	
		switch (opcion) {
		case 1: {
			///Batallar ...
			ejecutarFuncion();
			break;
		}
		case 2: {
			///Personajes ...
			ejecutarFuncion();
			break;
		}
		case 3: {
			///Ligas ...
			ejecutarFuncion();
			break;
		}
		case 4: {
			///Reportes ...
			ejecutarFuncion();
			break;
		}
		case 5: {
			System.out.println("Gracias por jugar !");
			System.exit(0);
			break;
		}
		default:
			System.err.println("Seleccione una opcion");
			ejecutarFuncion();
		}
	
	
	}

}
