
package excepciones;
import javax.swing.JOptionPane;

public class Excepciones {

    
    public static void main(String[] args) {
        
        try{
            int num =pedirNumerador();
            int den=pedirDenominador();
            JOptionPane.showInputDialog(null,num/den);
            
        }catch(NumberFormatException ex)
        {
            JOptionPane.showInputDialog("ingresa de favor numeros enteros");
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }
    
    public static int pedirNumerador() throws Exception
    {
       String x = JOptionPane.showInputDialog("ingresa numerador");
       int num = Integer.parseInt(x);
       if(num==0)
       {
           throw new Exception ("no se puede dividir entre cero");
       }
       return num;
    }
    
    
    public static int pedirDenominador()
    {
        String c= JOptionPane.showInputDialog("ingresa denominador");
        int den = Integer.parseInt(c);
        return den;
        
        
    }
}
