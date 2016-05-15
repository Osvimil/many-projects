

package aleatorio;


public class Aleatorio {

    
    public static void main(String[] args) {
        int alea = (int)(Math.random()*100);
        
        System.out.println(alea);
        
        if((alea >0) && (alea<=25))
        {
            System.out.println("PASO A LA IZQUIERDA");
        }
        else if ((alea>=26) &&(alea<=50))
        {
           System.out.println("PASO A LA DERECHA"); 
        }
        else if ((alea>=51) &&(alea<=75))
        {
           System.out.println("PASO HACIA ARRIBA"); 
        }
         else if ((alea>=76) &&(alea<101))
        {
           System.out.println("PASO HACIA ABAJO"); 
        }
        
      
    }
}


