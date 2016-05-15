// offer es para añadir un dato
// poll es para obtener un dato
package colina;
import java.util.LinkedList;

public class Colina {

    public static void main(String[] args) {
        
        LinkedList cola = new LinkedList();
        
        cola.offer("MEXICO");
        cola.offer("BRASIL");
        cola.offer("CROACIA");
        cola.offer("CAMERUN");
        
        System.out.println("los elementos en numero son: "+cola.size());
        
        System.out.println(cola.pollLast());
        System.out.println(cola.pollFirst());
        
        
        for (int i=0;i<11;i++)
        {
            cola.offer(i);
        }
        
        while (cola.peek()!=null)
        {
            System.out.println(cola.poll());
        }
    }
    
}
