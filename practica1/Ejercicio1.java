package practica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
	public static void main(String[] args) {
		 try {
	            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	            String texto="";
	            char opcion='1';
	            while ((opcion=='1') || (opcion=='2') || (opcion=='3') || (opcion=='4')|| (opcion=='5') || (opcion=='6') )
	            {
	                System.out.println("......................");
	                System.out.println("AGENDA");
	                System.out.println("......................");
	                System.out.println("1-Nueva cita");
	                System.out.println("2-Ver cita");
	                System.out.println("3-Vaciar agenda");
	                System.out.println("0-Salir");
	                System.out.println("......................");
	                texto=teclado.readLine();
	                opcion= texto.charAt(0);
	                System.out.println("Opción: ");
	                System.out.println("......................");
	                
	                switch(opcion){
	                    case '1':	                        
                             System.out.println("1");	                        	                      
	                        break;                   
	                    case '2':
	                        System.out.println("2");
	                        break;
	                    case '3':
	                    	System.out.println("3");
	                         break;
	                    case '0':
	                        System.out.println("Ha salido del programa");
	                        break;	                     
	                    default:
	                        System.out.println("Opción incorrecta ...");
	                        opcion='1';	                     
	                }
	                
	            }    
	            
	                    } catch (IOException ex) {
	        }
	}

}
