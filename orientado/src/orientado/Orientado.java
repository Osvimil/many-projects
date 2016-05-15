
package orientado;
import orientado.Pelota;


public class Orientado {

    public static void main(String[] args) {
        
        Pelota p;
        Pelota pB;
        p= new Pelota(300,300);
        pB= new Pelota(500,500);
        p.PatearPelota();
        
        
                System.out.println("la pelota pesa: "+pB.ObtenerPeso());
    }
    
}
