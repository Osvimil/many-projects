

package main;
import java.io.*;

public class Main {

    
    public static void main(String[] args) {
        
        String texto = "";
        double x=90.12345;
        
        texto = String.valueOf(x);
        texto = texto.concat("-double");
        System.out.println(texto);
        /*
        InputStreamReader in = new InputStreamReader (System.in);
        BufferedReader buffer = new BufferedReader (in);
        
        try{
            texto = buffer.readLine();
            x= Double.parseDouble(texto);
        }catch(Exception e) {
            System.out.println("debes escribir un numero");
        };*/
       // System.out.println(x + 10);
       // texto= texto.concat("\npero del otro torneo 201A");
        //texto = texto.toUpperCase();
      //  texto = texto.toLowerCase();
       // int a = texto.length();
        //System.out.println(texto);
        
    }
    
}
