
package programa4;

import java.util.Scanner;


public class Programa4 {
        Float a,b,c;
    
   public void aceptar()
   {
     Scanner nums = new Scanner(System.in);
     System.out.println("Ingresa numero 1:");
     a= nums.nextFloat();
     System.out.println("Ingresa numero 2:");
     b=nums.nextFloat();
      System.out.println("El resultado es:"+ operacion(a,b));
   }
   public float operacion(float num1,float num2)
   {
       
       c=a+b;
       return c;
       
   }
    public static void main(String[] args) {
      Programa4 objeto = new Programa4();
      objeto.aceptar();
    }
    
}
