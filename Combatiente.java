package HeroeVillano;
import java.util.HashMap;

public abstract class Combatiente {

	private String nombre; // nombre de liga o personaje
	private Equipo equipo;
	private HashMap<Caracteristica, Integer> caracteristicas;

	public Combatiente(String nombre, Equipo equipo, int velocidad, int fuerza, int resistencia, int destreza) {
		this.nombre = nombre;
		this.equipo = equipo;
		caracteristicas.put(Caracteristica.FUERZA, fuerza);
		caracteristicas.put(Caracteristica.VELOCIDAD, velocidad);
		caracteristicas.put(Caracteristica.DESTREZA, destreza);
		caracteristicas.put(Caracteristica.RESISTENCIA, resistencia);
	}
	public boolean esGanador(Combatiente combatiente, Caracteristica c) {
		
		if (this.getEquipo().equals(combatiente.getEquipo())) {
			System.out.println("No se pueden enfrentar 2 combatientes del mismo equipo");
		}
		
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
			System.out.println("El combatiente " + this.getNombre() + " es el vencedor del combate");

		} else if (this.getCaracteristica(c) < combatiente.getCaracteristica(c)) {
			System.out.println("El combatiente " + combatiente.getNombre() + " es el vencedor del combate");
		}
		return esGanador;
	}
	public int getCaracteristica(Caracteristica c) {
		return caracteristicas.get(c);
	}

	public String getNombre() {
		return nombre;
	}
	public Equipo getEquipo() {
		return equipo;
	}
}
