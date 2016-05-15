

package analizador;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analizador {

    
    public static void main(String[] args) {
        String patron = ("(while)|([a-zA-Z]+)|([>|<|=]+)|([0-9]+)|([(|)]+)|([{|}]+)|(;)");
        String texto = "while (x=0) < {y=3};";
        
        Pattern p =Pattern.compile(patron);
        Matcher matcher = p.matcher(texto);
        while(matcher.find()){
            
        String token1 = matcher.group(1);
        if(token1 !=null){
        System.out.println("Palabra reservada: " +token1);
        }
        
        String token2 = matcher.group(2);
        if(token2!=null){
        System.out.println("Letra: " +token2);
        }
        
        String token3 = matcher.group(3);
        if(token3!=null){
        System.out.println("Caracter lógico: "+token3);
        }
        
        String token4 = matcher.group(4);
        if(token4!=null){
        System.out.println("Número: " +token4);
        }
        
        String token5 = matcher.group(5);
        if(token5!=null){
        System.out.println("Paréntesis: " +token5);
        }
        
        String token6 = matcher.group(6);
        if(token6!=null){
        System.out.println("Llaves: " +token6);
        }
        
        String token7 = matcher.group(7);
        if(token7!=null){
        System.out.println("Punto y coma: " +token7);
        }
        }
        
    }
    
}
