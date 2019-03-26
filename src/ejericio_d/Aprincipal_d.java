package ejericio_d;


import java.util.Scanner;
import ejericio_d.Ciclista.*;
/**
 *
 * @author munchi
 */
public class Aprincipal_d {
    public static void main (String[] args){
        Scanner Teclado = new Scanner(System.in);
  
           System.out.println("Indica una categoria: ");
           try{
            Ciclista ciclista = analizar(Teclado.nextInt()); 
           }
           catch(IllegalArgumentException ex){
               System.out.println(ex);
           }
                   
        
    }
    
}
