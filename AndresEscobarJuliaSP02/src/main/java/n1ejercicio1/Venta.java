package n1ejercicio1;
import java.util.ArrayList; // import the ArrayList class


public class Venta {

	ArrayList<Producto> producto= null; // Create an ArrayList object
	double ventatotal = 0;
	public Venta() {
	 
		producto = new ArrayList<Producto>();
		double ventatotal = 0;
	};
	public void VentaProducto( Producto p ) {
		
		this.producto.add(p);
		
	}
	public double  calcularTotal() throws  VentaVaciaExcepcion {
		
		
	    if ( producto.size()  == 0 ) {
	        throw new VentaVaciaExcepcion ("Para hacer una venta primero debes añadir productos");
	        
	        
	    }
	    for ( Producto p : producto) {
	    	 ventatotal = ventatotal  + p.precio;
	    }
	    return ventatotal; 
 
	} 


 



}

