
package coleccionesjava;

import java.util.ArrayList;
public class Coleccionesjava {

   
    public static void main(String[] args) {
       /* String[] vector = new String[5];
        vector[0] = "1";
        vector[1]= "2";
        vector[2] = "3";
        vector[3] = "4";
        vector[4] = "5";
        for(int i=0;i<vector.length;i++)
        {
            System.out.println("Posicion " + i + ". Elemento " + vector[i]);
            
        }
               */
        
        /* String[] vector = new String[5];
        vector[0] = "1";
        vector[1] = "2";
        vector[2] = "3";
        vector[3] = "4";
        vector[4]= "5";
        
        for(String elemento : vector)
        {
            System.out.println(elemento);
        } 
         */
        
        /* String[] vector = new String[5];
        vector[0] = "uno";
        vector[1] = "dos";
        vector[2] = "tres";
        vector[3] = "cuatro";
        vector[4] = "cinco";
        
        int i=0;
        
        while(i<vector.length)
                {
                    System.out.println(vector[i]);
                    i++;
                }
        */
        
         /* String[] vector = new String[5];
        vector[0] = "uno";
        vector[1] = "dos";
        vector[2] = "tres";
        vector[3] = "cuatro";
        vector[4] = "cinco";
        
        int i=0;
        
        do
        {
           System.out.println(vector[i]);
           i++;
        }while(i<vector.length);
        */
        
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        
        for(int i=0; i<lista.size();i++)
        {
            System.out.println("Posicion" + i + " Elemento " + lista.get(i));
        }
    }
    
}
