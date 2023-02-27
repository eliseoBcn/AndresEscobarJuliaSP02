package n1ejercicio1;

public class Mercadona {

	public static void main(String[] args) {
		
		//  ************** Ejercicios de la Tarea 2  ******************

		Venta venta = new Venta();
		
		try {

			venta.calcularTotal();
			
		}
			catch(VentaVaciaExcepcion e) {
			 System.out.println(e.getMessage()) ;
		}
		
		try {

			venta.VentaProducto(new Producto("el Quijote ", 50.33));
			venta.VentaProducto(new Producto("Ribera del Duero ", 150.00));	
			venta.VentaProducto(new Producto("Ribera del Duero ", 50.00));		
			
			System.out.println("Total de ventas " +  venta.calcularTotal());

		}
			catch(VentaVaciaExcepcion e) {
				System.out.println(e.getMessage()) ;

		}

		//  ******* Capturando Excepcion ArrayIndexOutOfBoundsException ************
		try {
			int[] numbers = new int[] {1, 2, 3, 4, 5};
			System.out.print(numbers[31]);
			
		}	catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage()) ;

		}
		
	}

}
