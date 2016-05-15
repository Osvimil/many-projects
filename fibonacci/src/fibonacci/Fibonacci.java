

package fibonacci;


public class Fibonacci {

    
    public static void main(String[] args) {
        int x=1;
        int anterior=0;
        int temporal;
        
        while(true)
        {
            System.out.println(x);
            temporal=x;
            x = x+anterior;
            anterior=temporal;
            if (x>100)
            {
                break;
            }
            }
        }
    }
    

