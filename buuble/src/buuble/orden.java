
package buuble;


public class orden {
    public void ordenarburbuja(int []array){
    int aux;
    boolean cambios=false;
    
    while(true){
    
    cambios=false;
    for(int i=1;i<array.length;i++){
        if(array[i]<array[i-1]){
            aux=array[i];
            array[i]=array[i-1];
            array[i-1]=aux;
            cambios=true;
        }
    
    }
    
    if(cambios==false){
    break;
    }
    
    }
    
    }
    
    
    
}
