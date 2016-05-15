package Insercion;
public class main {
     public static void main(String[] args) {
         int [] arreglo = {22,34,6,0,42,1,7,4,2,8,77,100};
         Ordenador o=new Ordenador();
         o.ordenarInsercion(arreglo);
         for(int i=0;i<arreglo.length;i++)
         {
             System.out.println(arreglo[i]);
         }
    }
}
