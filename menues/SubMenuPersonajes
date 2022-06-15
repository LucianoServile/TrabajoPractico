

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class SubMenuPersonajes extends ItemSimple {
	private HashMap<String, Combatiente> personajes;

	public SubMenuPersonajes(String nombre) {
		super(nombre);
		this.personajes = new HashMap<String, Combatiente>();

	}
	
	@Override
	public void ejecutarFuncion() {
		
	}

	public void cargaArchivoPersonajes() {

		try {
			FileReader archivo = new FileReader("personajes.in.txt");
			BufferedReader lector = new BufferedReader(archivo);
			String oneLine = lector.readLine();

			while (oneLine != null) {
				String[] datos = oneLine.split(", ");
				Equipo tipo_De_Personaje = Equipo.valueOf(datos[0].toUpperCase());
				String nombre_Real = datos[1];
				String nombre_Personaje = datos[2];
				int velocidad = Integer.parseInt(datos[3]);
				int fuerza = Integer.parseInt(datos[4]);
				int resistencia = Integer.parseInt(datos[5]);
				int destreza = Integer.parseInt(datos[6]);

				Combatiente personaje = null;

				switch (tipo_De_Personaje) {

				case HEROE: {
					personaje = new Heroe(nombre_Real, nombre_Personaje,
							velocidad, fuerza, resistencia, destreza);
				}

				case HÉROE: {
					personaje = new Heroe(nombre_Real, nombre_Personaje,
							velocidad, fuerza, resistencia, destreza);
				}
				case VILLANO: {
					personaje = new Villano(nombre_Real, nombre_Personaje,
							velocidad, fuerza, resistencia, destreza);
				}
				}
				personajes.put(nombre_Personaje, personaje);
				super.guardarPersonajes(personajes);
				oneLine = lector.readLine();
			}
			lector.close();

		} catch (FileNotFoundException e) {
			System.err.println("No se encontro archivo 'personajes.in'");
		} catch (IOException e) {
			System.err.println("No se encontro archivo 'personajes.in'");
		}
	}

	public void crearPersonaje() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese nombre de civil del personaje: ");
		String nombreCivil = entrada.nextLine();
		System.out.println(nombreCivil + "sera HEROE o VILLANO?");
		Equipo tipo_De_Personaje = Equipo.valueOf(entrada.nextLine()
				.toUpperCase());
		;
		System.out.println("Ingrese nombre de personaje: ");
		String nombre_Personaje = entrada.nextLine();
		System.out.println("Ingrese nivel de Velocidad: ");
		int velocidad = entrada.nextInt();
		System.out.println("Ingrese nivel de Fuerza: ");
		int fuerza = entrada.nextInt();
		System.out.println("Ingrese nivel de Resistencia: ");
		int resistencia = entrada.nextInt();
		System.out.println("Ingrese nivel de Destreza: ");
		int destreza = entrada.nextInt();

		Combatiente personaje = null;

		if (tipo_De_Personaje == Equipo.HEROE) {
			personaje = new Heroe(nombreCivil, nombre_Personaje, velocidad,
					fuerza, resistencia, destreza);
		} else {
			personaje = new Villano(nombreCivil, nombre_Personaje, velocidad,
					fuerza, resistencia, destreza);
		}
		personajes.put(nombre_Personaje, personaje);
		super.guardarPersonajes(personajes);
		System.out.println("Su personaje fue creado y guardado exitosamente !");

	}

	public void listarPersonajes() {
		Iterator<Entry<String, Combatiente>> itr = this.personajes.entrySet()
				.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getValue().getNombre());
		}
	}

	public void guardarEnArchivoPersonajes() {
		try {
			FileWriter archivo = new FileWriter("personajes.in.txt");
			BufferedWriter escritor = new BufferedWriter(archivo);
			Iterator<Entry<String, Combatiente>> itr = this.personajes
					.entrySet().iterator();
			while (itr.hasNext()) {
				escritor.write(itr.next().getValue().toString());
				escritor.newLine();
			}

			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
