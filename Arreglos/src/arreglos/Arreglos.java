

package arreglos;
import java.io.*;

public class Arreglos {

   
    public static void main(String[] args) throws IOException {
        BufferedReader lee= new BufferedReader (new InputStreamReader(System.in));
        String nombres[]= new String[5];
        for(int i=0;i<nombres.length;i++)
        {
            System.out.println("INGRESA EL NOMBRE");
            String nombre = lee.readLine();
            nombres[i]=nombre;
        
        }
        System.out.println("DESEAS MOSTRAR LOS NOMBRES?\n1.SI\n2.NO");
        int opcion = Integer.parseInt(lee.readLine());
        switch(opcion)
        {
            case 1:
                System.out.println("los nombres son");
                for(int i=0;i<nombres.length;i++)
        {
           System.out.println("\n"+nombres[i]);
        }
                break;
            case 2:
                System.out.println("ADIOS");
                break;
            default:
                System.out.println("opcion inválida");
        }
        }
        
    }
    

