package menues;

public class OpcionSalir extends ItemSimple{
	public OpcionSalir() {
		super("Salir");
	}
	
	@Override
	public void ejecutarFuncion() {
		System.out.println("Salir");
	}
}
