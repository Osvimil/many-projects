

package arraylistt;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListt {

    
    public static void main(String[] args) {
      
        ArrayList array = new ArrayList();
        
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");
        
       Iterator itr = array.iterator();
       while(itr.hasNext())
           System.out.println(itr.next());
       
        
    }
    
}
