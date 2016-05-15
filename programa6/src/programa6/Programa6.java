

package programa6;

import java.util.Scanner;


public class Programa6 {
    
    private String cadena;
      public void Setcadena(String cadena)
      {
        this.cadena=cadena;
      }
        public String Getcadena()
         {
           return cadena;
         }
    
   private String rotacion13 (String cadena){
		String CadenaA= "";
		
		
		for(int i = 0;i<cadena.length();i++)
		{
			

			char result = cadena.charAt(i);
			CadenaA = CadenaA + rotar(result);
			
			
		}
		return CadenaA;
	}
    public char rotar(char c) 
	
	{
		int temp = (int )c;
		if(c>= 'a' && c<= 'm' ||c>= 'A' && c<= 'M' )
		  {
			temp+= 13;
		  }
	        else 
	         {
	        	
	    	   if (c>= 'n' && c<= 'z' || c>= 'N' && c<= 'Z' )
		        {
			       temp = temp-13;
			     }
	
	    	
	         
	         }
	    	 
		   return (char) temp;
		
	
}
    public static void main(String[] args) {
        String palabra;
        Programa6 objeto = new Programa6();
        Scanner caden = new Scanner(System.in);
        System.out.println("Ingresa cadena:");
        palabra=caden.nextLine();
         System.out.println("Cadena encriptada:"+ objeto.rotacion13(palabra));
        
    }
    
}
