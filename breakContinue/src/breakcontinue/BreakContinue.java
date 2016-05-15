

package breakcontinue;


public class BreakContinue {

    public static void main(String[] args) {
        for (int i=0;i<=20;i++)
        {
            System.out.println("estas en el ciclo for \n");
            if (i ==13)
            {
                continue;
            }
            
            System.out.println("el valor de la variable es:"+i);
        }
        System.out.println("estás fuera del ciclo for");
    }
    
}
