

package lista;

import java.util.LinkedList;
public class Lista {

    public static void main(String[] args) {
        
        LinkedList listilla = new LinkedList();
        listilla.add("algo");
        listilla.add(89);
        listilla.add(2,17);
        listilla.add("mas que");
        listilla.add("nada");
        
        listilla.remove(1);
        listilla.removeFirst();
        listilla.removeLast();
        System.out.println("el tamaño de la lista es: "+listilla.size());
       System.out.println(listilla.getFirst());
       System.out.println(listilla.getLast());
    }
    
}
