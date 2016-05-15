

package lis;

import java.util.LinkedList;


public class Lis {

    
    public static void main(String[] args) {
        LinkedList lista = new LinkedList(); 
        lista.add("PALABRA");
        lista.add(5);
        lista.add(17);
        lista.add("gato");
        
        lista.removeLast();
        System.out.println("el tamaño de la lista es: "+lista.size());
        System.out.println(lista.getLast());
      
    }
    
}
