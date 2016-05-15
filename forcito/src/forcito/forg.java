

package forcito;
import java.util.Scanner;

public class forg {
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        System.out.println("ingresa numero: \n");
        numero=sc.nextInt();
        
        for(int i=0;i<=numero;i++)
        {
            if(i%2!=0)
            {
                System.out.println("numeros impar es :"+i);
            }
            
        }
        
    }
    
}
