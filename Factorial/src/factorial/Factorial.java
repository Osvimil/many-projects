

package factorial;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      
      int numero,factorial=1,x;
      try{
      System.out.println("ingresa numero a calcular su factorial: \n");
      numero=sc.nextInt();
      for(x=numero;x>0;x--)
      {
        factorial=x*factorial;  
      }
      System.out.println("el resultado es: "+factorial);
    }catch(InputMismatchException ime)
    {
        System.out.println("no puedes ingresar letras");
    }finally
      {
          System.out.println("hasta luego");
      }
    }
    
}
