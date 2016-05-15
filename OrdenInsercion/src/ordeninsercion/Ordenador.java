

package ordeninsercion;

public class Ordenador {
    
    
   public void ordenarInsercion(int []array)
   {
       int aux;
       int contador1;
       int contador2;
       for(contador1=1;contador1<=array.length;contador1++)
       {
           aux=array[contador1];
           for(contador2=contador1-1;contador2>=0 && array[contador2]>aux;contador2--)
           {
               array[contador2+1]=array[contador2];
               array[contador2]=aux;
           }
       }
   }
    
    
}
