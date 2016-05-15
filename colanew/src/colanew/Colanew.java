

package colanew;
import java.util.LinkedList;


public class Colanew {

    
    public static void main(String[] args) {
        LinkedList cola = new LinkedList();
        
        int i;
        int arreglo[]={10,20,30};
        for( i=0;i<arreglo.length;i++){
            System.out.println(i);
    
    }
        
        System.out.println();
        
        cola.offer(2);
        cola.offer("texto");
        cola.offer("mas texto");
        cola.offer(100);
        System.out.println("Elementos de arreglo son: " +i);
        
        
        
        while(cola.peek()!=null){
            System.out.println(cola.poll());
            
        
        }
    }
    
}
