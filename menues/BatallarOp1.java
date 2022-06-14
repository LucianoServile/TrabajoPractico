package menues;

public class BatallarOp1 extends ItemSimple{
	public BatallarOp1(String nombre) {
		super(nombre);
	}
	
	@Override
	public void ejecutarFuncion() {
		System.out.println("Opcion1 : Batalla 1 vs 1 o 1 vs Liga o Liga vs Liga");
	}
}
