

package burbuja;


public class Burbuja {

   
    public static void main(String[] args) {
        int[] arreglo = {23,45,65,8,1,4,0,34,22,61,12,14,9,7,6,3};
        otherd ou = new otherd();
        ou.Ordenamiento(arreglo);
        for (int i=1;i<arreglo.length;i++)
        {
            System.out.println(arreglo[i]);
        }
    }
    
}
