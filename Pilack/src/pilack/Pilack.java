
//push meter datos a la pila
//pop sacar datos de la pila, solo saca de uno en uno
//peek ultimo dato de la pila
//empty saber si la pila tiene datos o no
package pilack;
import java.util.Stack;

public class Pilack {

    
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println("tamaño de la pila es:"+pila.size());
        
        System.out.println("ultimo elemento de pila es: "+pila.peek());
        
        while(pila.empty()==false)
        {
            System.out.println(pila.pop());
        }
        
    }
    
}
