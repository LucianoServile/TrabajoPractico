import java.awt.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class SubMenuReportes extends ItemSimple {

	private HashMap<String, Combatiente> personajes;
	private HashMap<String, Liga> ligas;

	public SubMenuReportes(String nombre) {
		super(nombre);

	}

	@Override
	public void ejecutarFuncion() {
		Scanner entrada = new Scanner(System.in);
		System.out
				.println("Opcion 1: Obtener combatientes o ligas que derroten a un combatiente determinado");
		System.out
				.println("Opcion 2: Listado ordenado de combatiente por determinada caracxteristica");
		int opcion = entrada.nextInt();

		switch (opcion) {

		case 1: {
			System.out.println("Ingresar nombre del combatiente: ");
			String nombre = entrada.nextLine();
			System.out.println("Ingrese caracteristica: ");
			Caracteristica c = Caracteristica.valueOf(entrada.nextLine()
					.toUpperCase());
			String resultado = getCombatientesOLigasQueGananAOtroCombatiente(
					nombre, c);
			System.out.println("Los combatientes que vencen a : " + nombre
					+ " son: " + resultado);

		}
		case 2: {
			System.out.println("Ingresar caractersitica: ");
			Caracteristica c = Caracteristica.valueOf(entrada.nextLine()
					.toUpperCase());

		}
		}

	}

	private String getCombatientesOLigasQueGananAOtroCombatiente(
			String combatiente, Caracteristica c) {
		String nombres = " ";
		Iterator<Entry<String, Combatiente>> itr1 = this.personajes.entrySet()
				.iterator();
		Iterator<Entry<String, Liga>> itr2 = this.ligas.entrySet().iterator();

		while (itr1.hasNext()) {
			int resultado = itr1.next().getValue()
					.compareTo(this.personajes.get(combatiente), c);
			if (resultado == -1) {
				nombres += itr1.next().getValue().getNombre();
			}
		}

		while (itr2.hasNext()) {
			int resultado = itr2.next().getValue()
					.compareTo(this.personajes.get(combatiente), c);
			if (resultado == -1) {
				nombres += itr1.next().getValue().getNombre();
			}

		}
		return nombres;
	}

	private void listarCombatientesPoCaracteristica(Caracteristica c) {
		...

	}
