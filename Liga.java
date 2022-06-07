package HeroesVillanos;

import java.util.ArrayList;

public class Liga extends Combatiente {

	private ArrayList<Combatiente> combatientes = new ArrayList<Combatiente>();

	public Liga(String nombreLiga, int velocidad, int fuerza, int resistencia, int destreza) {
		super(nombreLiga, velocidad, fuerza, resistencia, destreza);
	}

	public void listarCombatientes() {

		for (Combatiente c : combatientes) {
			System.out.println("Combatiente: " + c.getNombre());
		}
	}

	public void agregarCombatiente(Combatiente combatiente) {
		combatientes.add(combatiente);
	}

	public void promediarHabilidades(Caracteristica c) {
		
	}

	public void eliminarCombatiente(Combatiente combatiente) {
		combatientes.remove(combatiente);
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
