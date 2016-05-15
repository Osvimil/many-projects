

package suma_desde_teclado;

import java.util.Scanner;


public class Suma_desde_teclado {

   
    public static void main(String[] args) {
        Scanner  dato= new Scanner(System.in);
        double numero1, numero2, suma=0;
        System.out.println("INGRESA PRIMER NUMERO:\n");
        numero1=dato.nextDouble();
        System.out.println("INGRESA SEGUNDO DATO:\n");
        numero2=dato.nextDouble();
        suma=numero1+numero2;
        System.out.println("LA SUMA TOTAL ES:\n\n"+suma);
        
        
    }
    
}
