
package pilanew;

import java.util.Stack;

public class Pilanew {

    
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push(1);
        pila.push(2);
        pila.push("tres");
        pila.push("cuatro");
        
        
        System.out.println("ÚLTIMO ELEMENTO DE LA PILA ES: "+pila.peek());
        
        while(pila.empty()==false){
        
        System.out.println(pila.pop());
        }
    }
    
}
