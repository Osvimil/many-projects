

package programa3;


public class Programa3 {
    float a;
        float b;
      public Programa3()
     {
         a=5;
        b=10;
     }
    public void mostrar()
     {
         
       System.out.println("La suma es:"+(a+b));
     }
   
    public static void main(String[] args) {
        Programa3 objeto= new Programa3();
        objeto.mostrar();
        
    }
    
}
