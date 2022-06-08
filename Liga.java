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
	public int getCaracteristica(Caracteristica c) {
		
		return caracteristicas.get(c);
	}
	
	// este metodo devuelve true si la liga actual le gana al combatiente ingresado de acuerdo a la 
	// caracteristica solicitada, si empatan definen x la siguiente caracteristica.
	//falta agregar q una liga de heroes/villanos solo se pueda enfrentar a su combatiente opuesto (heroe/villano)

	@Override
	public boolean esGanador(Combatiente combatiente, Caracteristica c) {
		boolean esGanador = false;
		Caracteristica cAux;
		if (this.getCaracteristica(c) == combatiente.getCaracteristica(c)) {
			esGanador(combatiente, c.nextCaracteristica(c));
			cAux = c.nextCaracteristica(c);

			if (c.equals(cAux)) {
				System.out.println("El resultado de la pelea es empate");
			        return esGanador;
			}

		} else if (this.getCaracteristica(c) > combatiente.getCaracteristica(c)) {
			esGanador = true;
			System.out.println("La liga " + this.getNombre() + " es la vencedora del combate");

		} else if (this.getCaracteristica(c) < combatiente.getCaracteristica(c)) {
			System.out.println("El combatiente " + combatiente.getNombre() + " es el vencedor del combate");
		}
		return esGanador;
	}
	
}
