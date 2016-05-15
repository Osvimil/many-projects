
package buuble;

public class Buuble {

    
    public static void main(String[] args) {
        int arreglo[]={4,8,9,2,5,10,56,43,24,78,31};
        
        orden ordenar = new orden();
        
        ordenar.ordenarburbuja(arreglo);
        
        for(int i=0;i<arreglo.length;i++){
        System.out.println(arreglo[i]);
        } 
    }
}


