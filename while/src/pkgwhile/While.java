

package pkgwhile;


public class While {

    public static void main(String[] args) {
     int variable=0;
     boolean cond = true;
     while(cond)
     {
          
         System.out.println("el valor es: "+variable);
        variable = variable+2;
        if (variable>10)
        {
            cond=false;
        }
     }
    }
    
}
