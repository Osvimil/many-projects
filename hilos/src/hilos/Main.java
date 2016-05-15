

package hilos;

public class Main {

   
    public static void main(String[] args) {
        
        Thread hilos = new Procesos("proceso 1");
        Thread hilos2 = new Procesos ("proceso 2");
        hilos.start();
        hilos2.start();
                
        
    }
    
}
