

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class SubMenuBatallar extends ItemSimple{
	
	private HashMap<String, Combatiente> personajes;
	private HashMap<String, Liga> ligas;
	
	public SubMenuBatallar(String nombre) {
		super(nombre);
		this.ligas = super.getLigas();
		this.personajes = super.getPersonajes();
	}
		
	@Override
	public void ejecutarFuncion() {
		System.out.println("Opcion 1 : Batalla 1 vs 1");
		System.out.println("Opcion 2 : Batalla 1 vs Liga");
		System.out.println("Opcion 3 : Batalla Liga vs Liga");
		Scanner entrada = new Scanner(System.in);
		int eleccion = entrada.nextInt();
		switch (eleccion) {
		case 1: {
			System.out.println("Ingrese nombre de personaje: ");
			String nombrePersonaje = entrada.nextLine();
			System.out.println("Ingrese nombre de combatiente a enfrentar: ");
			String nombreContrincante = entrada.nextLine();
			System.out.println("Ingrese caracteristica a determinar ganador: ");
			Caracteristica c = Caracteristica.valueOf(entrada.nextLine()
					.toUpperCase());
			batallar1Contra1(nombrePersonaje, nombreContrincante, c);

		}
		case 2: {
			System.out.println("Ingrese nombre de personaje: ");
			String nombrePersonaje = entrada.nextLine();
			System.out.println("Ingrese nombre de liga a enfrentar: ");
			String nombreLiga = entrada.nextLine();
			System.out.println("Ingrese bajo que caracteristica combatiran: ");
			Caracteristica c = Caracteristica.valueOf(entrada.nextLine()
					.toUpperCase());
			batallar1ContraLiga(nombrePersonaje, nombreLiga, c);
		}
		case 3: {
			System.out.println("Ingrese nombre de liga: ");
			String nombreLiga1 = entrada.nextLine();
			System.out.println("Ingrese nombre de liga a quien enfrentará: "
					+ nombreLiga1);
			String nombreLiga2 = entrada.nextLine();
			System.out.println("Ingrese bajo que caracteristica combatiran: ");
			Caracteristica c = Caracteristica.valueOf(entrada.nextLine()
					.toUpperCase());
			batallarLigaContraLiga(nombreLiga1, nombreLiga2, c);
		}

		}

	}

	private void batallar1Contra1(String personaje1, String personaje2,
			Caracteristica c) {
		HashMap<String, Combatiente> personajes = super.getPersonajes();
		try {
			personajes.get(personaje1).esGanador(personajes.get(personaje2), c);
		} catch (NoSuchElementException e) {
			System.err.println("No se encontro al personaje");
		}
	}

	private void batallar1ContraLiga(String personaje1, String nombreLiga,
			Caracteristica c) {
		HashMap<String, Combatiente> personajes = super.getPersonajes();
		HashMap<String, Liga> ligas = super.getLigas();
		try {
			personajes.get(personaje1).esGanador(ligas.get(nombreLiga), c);

		} catch (NoSuchElementException e) {
			System.err.println("No se encontro al personaje o liga");
		}
	}

	private void batallarLigaContraLiga(String liga1, String liga2,
			Caracteristica c) {
		HashMap<String, Liga> ligas = super.getLigas();
		try {
			ligas.get(liga1).esGanador(ligas.get(liga2), c);

		} catch (NoSuchElementException e) {
			System.err.println("No se encontro al personaje o liga");
		}
	}

}
