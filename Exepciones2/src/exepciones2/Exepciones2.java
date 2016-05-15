

package exepciones2;


import java.util.*;

public class Exepciones2 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("programa que divide");
        System.out.println();
        
        try{
       int numerador,denominador,resultado;
       System.out.println("digita numero 1 ");
       numerador = sc.nextInt();
       System.out.println("ingresa numero 2");
       denominador= sc.nextInt();
       resultado = numerador/denominador;
       System.out.println("el resultado es: "+resultado);
        }catch (ArithmeticException ae)
        {
            System.out.println("no puede dividir entre cero 0");
        }catch(InputMismatchException ime)
        {
            System.out.println("ingresa un entero por favor ");
        }finally
        {
            System.out.println("gracias por usar el programa");
        }
        
    }
    
   
    
}
