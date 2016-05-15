

package insert;


public class Ordenador {
     public void ordenarInsercion(int []arreglo)
   {
       int aux;
       int contador1;
       int contador2;
       for(contador1=1;contador1<=arreglo.length;contador1++)
       {
           aux=arreglo[contador1];
           for(contador2=contador1-1;contador2>=0 && arreglo[contador2]>aux;contador2--)
           {
               arreglo[contador2+1]=arreglo[contador2];
               arreglo[contador2]=aux;
           }
       }
   }
    
}
