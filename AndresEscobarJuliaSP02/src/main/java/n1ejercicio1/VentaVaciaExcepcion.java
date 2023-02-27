package n1ejercicio1;

public class VentaVaciaExcepcion extends Exception {

	public VentaVaciaExcepcion(String string) {
		// TODO Auto-generated constructor stub
		
		 super("Problema:" + string );
	}

}
