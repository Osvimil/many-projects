

package rapido;


public class Rapido {

    
    public static void main(String[] args) {
        int arreglo[]={3,45,7,90,1,5,89,56,74,22,92,91};
        Ordenar o = new Ordenar();
        o.ordenarRapido(arreglo);
        for(int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        
        }
    }
    
}
