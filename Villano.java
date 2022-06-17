package HeroesVillanos

public class Villano extends Combatiente {
	
	private String nombreCivil;

	public Villano(String nombreCivil, Equipo tipo_De_Personaje, String nombre, int velocidad, int fuerza, int resistencia, int destreza) {
		super(nombre, tipo_De_Personaje, velocidad, fuerza, resistencia, destreza);
		this.nombreCivil = nombreCivil;
	}
	
	public String getNombreCivil() {
		return nombreCivil;
	}

}
