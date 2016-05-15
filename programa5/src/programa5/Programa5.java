
package programa5;

import java.util.Scanner;


public class Programa5 {

   public void aceptar()
   {
       String nombre;
       Scanner nomb = new Scanner(System.in);
       System.out.println("Ingresa una cadena:");
       nombre=nomb.nextLine();
       invertir(nombre);
       
   }
   public void invertir(String nombs)
   {
     String cadenaI="";
     char[]  aCaracteres = nombs.toCharArray();
     for (int i=nombs.length()-1; i>=0 ;i--)
     {
         cadenaI = cadenaI + nombs.charAt(i);
     }
      System.out.println("Cadena invertida:"+cadenaI);
   }
   
   
    public static void main(String[] args) {
       Programa5 objeto = new Programa5();
       objeto.aceptar();
       
    }
    
}
