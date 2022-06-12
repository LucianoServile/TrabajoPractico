package HeroesVillanos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Liga extends Combatiente{


	private static HashSet<Combatiente> combatientes;
	
	public Liga(String nombre, Equipo equipo, int velocidad, int fuerza, int resistencia, int destreza, HashSet<Combatiente> combatientes) {
		super(nombre, equipo, velocidad, fuerza, resistencia, destreza);
		this.combatientes = combatientes;
	}

	
	public void agregarCombatiente(Combatiente combatiente) {
		
		if(this.getEquipo() == combatiente.getEquipo()) {
			combatientes.add(combatiente);
		} else {
			System.err.println(combatiente.getNombre() + " No es del mismo categoria");
		}
		
	}

	private int promediarHabilidades(Caracteristica caracteristica) {
		
		
		
		
		
		return 0;
		
	}
	
	public void eliminarPersonaje(Combatiente combatiente) {
		combatientes.remove(combatiente);
	}



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


	public static HashSet<Combatiente> getCombatientes() {
		return combatientes;
	}
	
}
