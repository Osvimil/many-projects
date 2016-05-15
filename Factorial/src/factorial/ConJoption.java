

package factorial;
import javax.swing.JOptionPane;

public class ConJoption {
    public static void main (String[] args)
    {
        try{
       String x= JOptionPane.showInputDialog("ingres numero a factorizar");
       int numero= Integer.parseInt(x);
       int factorial=1,y;
       
       for(y=numero;y>0;y--)
      {
        factorial=y*factorial;  
      }
       JOptionPane.showMessageDialog(null,"el resultado es:"+factorial);
    }
    catch(NumberFormatException ime)
    {
       JOptionPane.showMessageDialog(null,"ingresa enteros"); 
    }
}
    }
