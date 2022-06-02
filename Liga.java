package HeroesVillanos;

import java.util.HashMap;
import java.util.HashSet;

public class Liga {
	
	private HashSet<Personaje> personajes;
	private HashMap<Caracteristica, Integer> caracteristicas;
	
	public Liga(HashSet<Personaje> personajes, HashMap<Caracteristica, Integer> caracteristicas) {
		super();
		this.personajes = personajes;
		this.caracteristicas = caracteristicas;
	}

	public void listarPersonaje() {
		
		for(Personaje p : personajes) {
			System.out.println("Personaje: " + p.getNombre());
		}
		
	}
	
	public void agregarPersonaje(Personaje personaje) {
		personajes.add(personaje);
	}

	public void promediarHabilidades(Caracteristica c) {
		for(Personaje p : personajes) {
			System.out.println("Personaje: " + p.getNombre());
		}
	}
	
	public void eliminarPersonaje(Personaje personaje) {
		personajes.remove(personaje);
	}
	
	public void enfrentarCon(Liga liga, Caracteristica caracteristica) {
		
	}
	
}
