package HeroesVillanos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {

	private HashMap<String, Personaje> personajes;
	private HashSet<Personaje> liga_heroes;
	private HashSet<Personaje> liga_villanos;

	public static void main(String[] args) {
		Sistema s = new Sistema();
		s.leerArchivoPersonajes();
		s.leerArchivoLiga();
		Item i = new Item();
		i.ejecutarFuncion();
	}

	private void leerArchivoPersonajes() {

		this.personajes = new HashMap<String, Personaje>();
		
		try {
			FileReader archivo = new FileReader("personajes.in.txt");
			BufferedReader lector = new BufferedReader(archivo);
			String oneLine = lector.readLine();

			while (oneLine != null) {
				String[] datos = oneLine.split(", ");

				String tipo_De_Personaje = datos[0];
				String nombre_Real = datos[1];
				String nombre_Personaje = datos[2];
				int velocidad = Integer.parseInt(datos[3]);
				int fuerza = Integer.parseInt(datos[4]);
				int resistencia = Integer.parseInt(datos[5]);
				int destreza = Integer.parseInt(datos[6]);

				Personaje personaje = new Personaje(tipo_De_Personaje,
						nombre_Real, nombre_Personaje, velocidad, fuerza,
						resistencia, destreza);

				personajes.put(nombre_Personaje, personaje);

				oneLine = lector.readLine();
			}

			lector.close();
		} catch (FileNotFoundException e) {
			System.err.println("No se encontro archivo 'personajes.in'");
		} catch (IOException e) {
			System.err.println("No se encontro archivo 'personajes.in'");
		}
	}

	private void leerArchivoLiga() {
		
		this.liga_heroes = new HashSet<Personaje>();
		this.liga_villanos = new HashSet<Personaje>();
		
		try {
			FileReader archivo = new FileReader("ligas.in.txt");
			BufferedReader lector = new BufferedReader(archivo);
			String oneLine = lector.readLine();

			while (oneLine != null) {
				String[] datos = oneLine.split(", ");
				for (String dato : datos) {
					if (personajes.get(dato).getTipoDePersonaje() == "Héroe") {
						liga_heroes.add(personajes.get(dato));
						
					} else {
						liga_villanos.add(personajes.get(dato));
						
					}

				}

				oneLine = lector.readLine();
			}
			
			lector.close();
		} catch (FileNotFoundException e) {
			System.err.println("No se encontro archivo 'personajes.in'");
		} catch (IOException e) {
			System.err.println("No se encontro archivo 'personajes.in'");
		}
	}
}
