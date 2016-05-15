

package hilos;


public class Procesos extends Thread {
    
    public Procesos (String mensaje)
    {
        super(mensaje);
    }
    public void run()
    {
        for(int i=0;i<=20;i++)
        {
            System.out.println(this.getName());
        }
    }
    
}
