

package paquete;


public class Main {

    public static void main(String[] args) {
        
        int [] arreglo = {1,24,6,75,30,7,4,1};
        Ordenador o = new Ordenador();
        o.ordenarInsercion(arreglo);
        for (int i=0;i<arreglo.length;i++)
        {
            System.out.println(arreglo[i]);
        }
        
    }
    
}
