

package shortinsetion;


public class Shortinsetion {

    
    public static void main(String[] args) {
        int arreglo[]={4,21,0,0,13,6,5};
        
        Insercion nuevo = new Insercion();
         nuevo.ObtenerInsercion(arreglo);
         
         for(int i=1;i<arreglo.length;i++){
         
         System.out.println(arreglo[i]);
         }
    }
    
}
