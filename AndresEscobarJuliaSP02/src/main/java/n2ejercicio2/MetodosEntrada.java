package n2ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MetodosEntrada {

    
	public static void Edad () {

//	    int num;
//	    
//	    System.out.print("Ingrese un valor entero:");
//	    num = teclado.nextInt();
//	    int cuadrado = num * num;
//	    System.out.print("El cuadrado de " + num + " es " + cuadrado);
	}

	
	
	 	public static byte llegirByte(String missatge) throws  InputMismatchException {
	 	     Scanner teclado = new Scanner(System.in);
		    System.out.print(missatge);
	 		
			return  teclado.nextByte();
		
		
		};
	 	public static int llegirInt(String missatge) throws  InputMismatchException {
	 	     Scanner teclado = new Scanner(System.in);
		    System.out.print(missatge);
	 		
			return  teclado.nextInt();
		
		};
		public static float llegirFloat(String missatge) throws  InputMismatchException  {
	 	     Scanner teclado = new Scanner(System.in);
		    System.out.print(missatge);
	 		
			return  teclado.nextFloat();
		
		};
		public static double llegirDouble(String missatge) throws  InputMismatchException {
	 	     Scanner teclado = new Scanner(System.in);
		    System.out.print(missatge);
	 		
			return  teclado.nextDouble();
		
		};

	
		public static char llegirChar(String missatge) throws   Exception{
		     Scanner teclado = new Scanner(System.in);
			 System.out.print(missatge);
		     char caracter;
             caracter = (char)teclado.next().charAt(0);
            
				return  caracter; 
		};

		public static String llegirString(String missatge) throws Exception{
		     Scanner teclado = new Scanner(System.in);
			    System.out.print(missatge);
		     return  teclado.nextLine();
		};

		public static boolean llegirSiNo(String missatge) throws  Exception{
		     Scanner teclado = new Scanner(System.in);

		     char caracter = ' ';
		     
		     
             
             while( caracter != 's'  && caracter != 'n'  ) {
 			    System.out.print(missatge);
                 caracter = (char)teclado.next().charAt(0);
			
             };
	            if( caracter == 's' ) {
	    			return  true;
	            } else  {
					return  true;
				}
			
			
		}
			
             
             
             
 						
	 
	 
	
	
	
}
