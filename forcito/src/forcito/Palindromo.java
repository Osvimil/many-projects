

package forcito;
import java.util.Scanner;

public class Palindromo {
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("ingresa palabra");
        String str = sc.nextLine();
        int cont=1;
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
            {
                cont=0;
                break;
                
            }
           
        }
         System.out.println(cont==1 ?"es palindromo":"no es palindromo");
    }
    
}

        