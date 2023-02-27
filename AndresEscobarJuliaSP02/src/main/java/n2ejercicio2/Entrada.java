package n2ejercicio2;
import java.util.InputMismatchException;
import java.util.Scanner;

 






	public class Entrada  {



		public static void main(String[] args) {
		// TODO Auto-generated method stub

			String salir = "";	
			String oks = "S";
			byte  edad = 0;
			int cantidad  = 0;
			float numero1 = 0;
			double numero2 = 0;
	        char letra1 = ' ';
	        String texto = "";
	        boolean sino = false;
	    
	         
	        		
			
			//	MetodosEntrada.Edad();
			
			do {
				try {
					 oks = "S";
					  edad =  MetodosEntrada.llegirByte("introduzca edad : ");
		
				}   catch(InputMismatchException  e) {
					 oks = "N";
					System.out.println( "Introduzca edad valida ") ;
				}
				
			}while( !(oks == "S") );
 			System.out.println(" edad " + edad );

			do {
				try {
					 oks = "S";
					  cantidad  =  MetodosEntrada. llegirInt("introduzca cantidad de productos : ");
		
				}   catch(InputMismatchException  e) {
					 oks = "N";
					System.out.println( "introduzca cantidad de productos valida ") ;
				}
				
			}while( !(oks == "S") );
 			System.out.println(" cantidad " + cantidad  );
 			
			do {
				try {
					 oks = "S";
					  numero1  =  MetodosEntrada.llegirFloat("introduzcan numero (precision float)  : ");
		
				}   catch(InputMismatchException  e) {
					 oks = "N";
					System.out.println( "Introduzca numero en formato correcto ") ;
				}
				
			}while( !(oks == "S") );
 			System.out.println(" numero1  " + numero1);
 			
 			
			do {
				try {
					 oks = "S";
					  numero2  =  MetodosEntrada.llegirDouble("introduzcan numero (precion double): ");
		
				}   catch(InputMismatchException  e) {
					 oks = "N";
					System.out.println( "Introduzca numero en formato correcto ");
 
				}
				
			}while( !(oks == "S") );	
 			System.out.println(" numero2  " + numero2  );
 			
 	
 			
 			
 			
			do {
				try {
					 oks = "S";
					  letra1  =  MetodosEntrada.llegirChar("Introduzca  un caracter : ");
		
				}   catch(Exception   e) {
					 oks = "N";
					System.out.println( "Introduzca caracter valido  ");
 
				}
				
			}while( !(oks == "S") );	
 			System.out.println(" caracter  " + letra1   );
 			
 			do {
				try {
					 oks = "S";
					  texto  =  MetodosEntrada.llegirString("Introduzca cadena  : ");
		
				}   catch(Exception   e) {
					 oks = "N";
					System.out.println( "Introduzca cadena valida  ");
				}
				
				
			}while( !(oks == "S") );	
			
			
 			System.out.println(" texto  " + texto  );


 			try {
				 oks = "S";

				 sino =  MetodosEntrada.llegirSiNo("Introduzca (s/n) : ");
			
			}   catch(Exception   e) {
				 oks = "N";
				System.out.println( "Introduzca s/N   ");
			}
			System.out.println(" sino " + sino );
		}
	
	}