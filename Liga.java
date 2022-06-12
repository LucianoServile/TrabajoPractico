package HeroesVillanos;

import java.util.HashSet;

public class Liga extends Combatiente{


	private static HashSet<Combatiente> combatientes;
	
	public Liga(String nombre, Equipo equipo, int velocidad, int fuerza, int resistencia, int destreza, HashSet<Combatiente> combatientes) {
		super(nombre, equipo, velocidad, fuerza, resistencia, destreza);
		Liga.combatientes = combatientes;
	}

	
	public void agregarCombatiente(Combatiente combatiente) {
		
		if(this.getEquipo() == combatiente.getEquipo()) {
			combatientes.add(combatiente);
		} else {
			System.err.println(combatiente.getNombre() + " No es del mismo equipo");
		}
		
	}

	//este método tiene que ser usado por otro metodo
	
	private double promediarHabilidades(Caracteristica caracteristica) {
		double promedio = 0;
		int cantidad = 0;
		for (Combatiente c: combatientes) {
			promedio += c.getCaracteristica(caracteristica);
			cantidad++;
		}
		return promedio/cantidad;
		
	}
	
	public void eliminarCombatiente(Combatiente combatiente) {
		combatientes.remove(combatiente);
	}

	public static HashSet<Combatiente> getCombatientes() {
		return combatientes;
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
//	public boolean esGanador(Combatiente combatiente, Caracteristica c) {
//		
//		if (this.getEquipo().equals(combatiente.getEquipo())) {
//			System.out.println("No se pueden enfrentar 2 combatientes del mismo equipo");
//		}
//		
//		boolean esGanador = false;
//		Caracteristica cAux;
//		if (this.getCaracteristica(c) == combatiente.getCaracteristica(c)) {
//			esGanador(combatiente, c.nextCaracteristica(c));
//			cAux = c.nextCaracteristica(c);
//
//			if (c.equals(cAux)) {
//				System.out.println("El resultado de la pelea es empate");
//				return esGanador;
//			}
//
//		} else if (this.getCaracteristica(c) > combatiente.getCaracteristica(c)) {
//			esGanador = true;
//			System.out.println("El combatiente " + this.getNombre() + " es el vencedor del combate");
//
//		} else if (this.getCaracteristica(c) < combatiente.getCaracteristica(c)) {
//			System.out.println("El combatiente " + combatiente.getNombre() + " es el vencedor del combate");
//		}
//		return esGanador;
//	}
	
}
