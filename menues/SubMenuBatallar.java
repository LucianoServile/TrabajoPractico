package menues;

public class SubMenuBatallar extends ItemSubMenu{
	public SubMenuBatallar(String nombre) {
		super(nombre);
		super.opciones.add(new ItemSimple("Batalla 1 vs 1"));
		super.opciones.add(new ItemSimple("Batalla 1 vs Liga"));
		super.opciones.add(new ItemSimple("Batalla Liga vs Liga"));
	}
	
	@Override
	public void ejecutarFuncion() {
		//super.displayarBotones(this.listBotones);
		System.out.println("Batallando");
	}
	
	public void agregarBatalla(ItemAbstracto batalla) {
		super.add(batalla);
	}
	
	public void listarBatallas() {
		super.listarOpciones();
	}
}
