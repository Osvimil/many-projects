

package automata;


public class Automata {
        int contador;
        boolean aceptado;
        char[] caracter;

    
    public static void main(String[] args) {
        Automata aut = new Automata();
        String cadena = "bbbb";
        aut.caracter= cadena.toCharArray();
        aut.inicio();
        if(aut.aceptado){System.out.println("CADENA ACEPTADA");}
        else{System.out.println("CADENA NO ACEPTADA");}
        
    }

    public void inicio() {
        contador =0;
        aceptado=false;
        Estado0();  
    }
    
    public void Estado0(){
    System.out.println("EN ESTADO 0");
    if(contador<caracter.length){
    if(caracter[contador]=='a'){
    contador++;
    Estado0();
    }else if(caracter[contador]=='b'){
    contador++;
    Estado1();
    }
    }
    }
    
    public void Estado1(){
    System.out.println("EN ESTADO 1");
    if(contador<caracter.length){
    if(caracter[contador]=='a'){
    contador++;
    Estado1();
    }else if(caracter[contador]=='b'){
    contador++;
    Estado2();
    }
    }
    }

    public void Estado2(){
    System.out.println("EN ESTADO 2");
    if(contador<caracter.length){
    if(caracter[contador]=='a'){
    contador++;
    Estado2();
    }else if(caracter[contador]=='b'){
    contador++;
    Estado3();
    }
    }
    }
    
    public void Estado3(){
    System.out.println("EN ESTADO 3, ACEPTADO");
    aceptado=true;
    if(contador<caracter.length){
    if(caracter[contador]=='a'){
    contador++;
    Estado3();
    }else if(caracter[contador]=='b'){
    contador++;
    EstadoError();
    }
    }
    }
    
    public void EstadoError(){
        System.out.println("EN ESTADO DE ERROR");
    aceptado=false;
    return;
    
    }
    
}
