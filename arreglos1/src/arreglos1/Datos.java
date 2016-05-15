

package arreglos1;

import java.util.Scanner;
public class Datos {
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        int lista[] = new int[20];
        int lim;
        System.out.println("ingresa limite del arreglo");
        lim= sc.nextInt();
        for(int i=0;i<lim;i++)
        {
            System.out.println("X["+(i+1)+"] =");
            lista[i]= sc.nextInt();
        }
        for (int i=0;i<lim;i++)
        {
            System.out.print(lista[i]+", ");
        }
        
    }
    
}
