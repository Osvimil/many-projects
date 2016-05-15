

package programa7;

import java.util.Scanner;


public class Programa7 {

    private float num;
    private float den;

   
    
    public void Setnum(float num)
    {
        this.num=num;
    }
      public float getnum()
       {
        return num;
       }
      
    public void Setden(float den)
    {
        this.den=den;
    }
      public float getden()
      {
          return den;
      }
    
      public Programa7(float num, float den)
      {
          this.num=num;
          this.den=den;
         
      }
      
      public String tostring(float num ,float den)
      {
          float res;
          String cadena = "";
          if(den==0)
          {
          
              return "infinito" ;
          }
          else
          {
              res= num/den;

             cadena= Float.toString(res);
             return cadena;

          }
        
          
      }
       
      

    
    public static void main(String[] args) {
        float denominador=0,numerado=0;
        Programa7 objeto = new Programa7(numerado,denominador);
        Scanner nums = new Scanner(System.in);
        System.out.println("Ingresa numero1:");
        numerado=nums.nextFloat();
        System.out.println("Ingresa numero2:");
        denominador=nums.nextFloat();
         System.out.println("Resultado es :"+ objeto.tostring(numerado,denominador));
      
    }
    
}
