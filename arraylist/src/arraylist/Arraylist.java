

package arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Arraylist {

    
    public static void main(String[] args) {
        
        
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        String nombre = "";
        int edad=0;
       // persona p[] = null;
        ArrayList <persona> lista = new ArrayList();
        try {
       // p = new persona [3];
        for(int i = 0; i<4;i++)
        {
            System.out.println("ingresa nombre persona "+i+" : ");
            nombre= in.readLine();
            
            System.out.println("ingresa edad persona "+i+" : ");
            edad = Integer.parseInt (in.readLine());
           // p[i]= new persona (nombre,edad);
            lista.add(new persona(nombre,edad));
        }
        }catch (Exception e){
            
        }
        for (persona p1: lista)
        {
            System.out.println("nombre: "+p1.getnombre()+ "\nedad:" +p1.getedad());
            System.out.println("**********************************************");
        }
        
        
    }
    
}
