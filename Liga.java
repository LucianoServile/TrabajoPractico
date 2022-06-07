package HeroesVillanos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Liga extends Combatiente{
	
	private HashSet<Personaje> personajes;
	private HashMap<Caracteristica, Integer> caracteristicas;
	private ArrayList<Combatiente> combatientes = new ArrayList<Combatiente>();
	
	public Liga(String nombreLiga,Equipo equipo,HashSet<Personaje> personajes, HashMap<Caracteristica, Integer> caracteristicas) {
		super(nombreLiga, equipo);
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
	
        @Override
	public int compare(Caracteristica o1, Caracteristica o2) {
		// creo que este comparador va en caracteristicas, en ese caso habria que elimnarla 
		// de combatiente y las clases hijas
		return 0;
	}

	@Override
	public int getCaracteristica(Caracteristica c) {
		
		return caracteristicas.get(c);
	}

	@Override
	public boolean esGanador(Combatiente combatiente, Caracteristica c) {
		// este seria el metodo enfrentarCon , aca ponemos o personajes o ligas que son
		// combatientes y el metodo devuelve si el combatiente actual es ganador o gana el retador
		return false;
	}
	
}
