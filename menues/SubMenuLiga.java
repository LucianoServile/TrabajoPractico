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

public class SubMenuLiga extends ItemSimple{

	private HashMap<String, Liga> ligas;
	private HashMap<String, Combatiente> personajes;

	public SubMenuLiga(String nombre) {
		super(nombre);
		this.ligas = super.getLigas();
		this.personajes = super.getPersonajes();

	}

	@Override
	public void ejecutarFuncion() {
		System.out.println("Opcion 1 : Carga desde archivo");
		System.out.println("Opcion 2 : Crear liga");
		System.out.println("Opcion 3 : Listado de ligas");
		System.out.println("Opcion 4 : Guardar en archivo ligas");
		Scanner entrada = new Scanner(System.in);
		int eleccion = entrada.nextInt();
		switch (eleccion) {
		case 1: {
			cargaArchivoLiga();

		}
		case 2: {
			crearLiga();
		}
		case 3: {
			listarLigas();
		}
		case 4 : {
			guardarEnArchivoLiga();
		}

		}
	}
	
	
	public void cargaArchivoLiga() {

		try {
			FileReader archivo = new FileReader("ligas.in.txt");
			BufferedReader lector = new BufferedReader(archivo);
			String oneLine = lector.readLine();

			int v = 0, h = 0;
			while (oneLine != null) {
				String[] datos = oneLine.split(", ");
				for (String dato : datos) {

					String nombre = " ";
					System.out.println(personajes.get(dato));

					Liga liga = new Liga(nombre, personajes.get(dato)
							.getEquipo(), personajes.get(dato)
							.getCaracteristica(Caracteristica.VELOCIDAD),
							personajes.get(dato).getCaracteristica(
									Caracteristica.FUERZA), personajes
									.get(dato).getCaracteristica(
											Caracteristica.RESISTENCIA),
							personajes.get(dato).getCaracteristica(
									Caracteristica.DESTREZA), null);
					liga.agregarCombatiente(personajes.get(dato));
					this.ligas.put(nombre, liga);
					System.out.println(liga.getNombre());
					System.out.println(this.ligas);
				}

				oneLine = lector.readLine();
			}

			lector.close();
		} catch (FileNotFoundException e) {
			System.err.println("No se encontro archivo 'Ligas.in'");
		} catch (IOException e) {
			System.err.println("No se encontro archivo 'Ligas.in'");
		}
	}

	public void crearLiga() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese nombre de la liga: ");

		String nombreLiga = entrada.nextLine();

		System.out.println("Ingrese nombre de personaje a agregar: ");
		String nombre_Personaje = entrada.nextLine();

		if (super.getPersonajes().get(nombre_Personaje) != null) {
			Combatiente combatiente = super.getPersonajes().get(
					nombre_Personaje);
			Liga liga = new Liga(nombreLiga, combatiente.getEquipo(),
					combatiente.getCaracteristica(Caracteristica.VELOCIDAD),
					combatiente.getCaracteristica(Caracteristica.FUERZA),
					combatiente.getCaracteristica(Caracteristica.RESISTENCIA),
					combatiente.getCaracteristica(Caracteristica.DESTREZA),
					null);
			liga.agregarCombatiente(combatiente);
			ligas.put(nombreLiga, liga);
			System.out
					.println("Se encontro al personaje indicado y fue agregado a la liga");

		} else {
			agregarCombatienteALiga(nombreLiga, nombre_Personaje);

		}
		System.out.println("Su liga fue creada y guardado exitosamente !");

	}

	public void agregarCombatienteALiga(String nombreLiga,
			String nombre_Personaje) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("No se encontro el personaje " + nombre_Personaje
				+ " pero ahora sera primer miembro de esta liga segun su tipo");

		System.out.println(nombre_Personaje + " " + "sera HEROE o VILLANO?");
		Equipo tipo_De_Liga = Equipo.valueOf(entrada.nextLine().toUpperCase());

		System.out.println("Ingrese nivel de Velocidad: ");
		int velocidad = entrada.nextInt();
		System.out.println("Ingrese nivel de Fuerza: ");
		int fuerza = entrada.nextInt();
		System.out.println("Ingrese nivel de Resistencia: ");
		int resistencia = entrada.nextInt();
		System.out.println("Ingrese nivel de Destreza: ");
		int destreza = entrada.nextInt();
		Combatiente combatiente = null;
		if (tipo_De_Liga == Equipo.HEROE) {
			combatiente = new Heroe(nombre_Personaje, nombre_Personaje,
					velocidad, fuerza, resistencia, destreza);
			super.getPersonajes().put(nombre_Personaje, combatiente);
		} else {
			combatiente = new Villano(nombre_Personaje, nombre_Personaje,
					velocidad, fuerza, resistencia, destreza);
			super.getPersonajes().put(nombre_Personaje, combatiente);

		}
		Liga liga = new Liga(nombreLiga, tipo_De_Liga, velocidad, fuerza,
				resistencia, destreza, null);
		liga.agregarCombatiente(combatiente);
		ligas.put(nombreLiga, liga);
	}

	public void guardarEnArchivoLiga() {
		try {
			FileWriter archivo = new FileWriter("ligas.in.txt");
			BufferedWriter escritor = new BufferedWriter(archivo);
			Iterator<Entry<String, Liga>> itr = this.ligas.entrySet()
					.iterator();
			while (itr.hasNext()) {
				escritor.write(itr.next().getValue().toString());
				escritor.newLine();
			}

			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void listarLigas() {
		Iterator<Entry<String, Liga>> itr = this.ligas.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getKey());
		}
	}

}
