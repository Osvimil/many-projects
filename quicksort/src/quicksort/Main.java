

package quicksort;


public class Main {

    
    public static void main(String[] args) {
        int []arreglo = {45,12,8,0,100,12,32,4,8,1,11,3,7};
        Ordenador o = new Ordenador();
        o.ordenarQuicksort(arreglo);
        
        for (int j=0;j<arreglo.length;j++)
        {
            System.out.println(arreglo[j]);
        }
        
    }
    
}
