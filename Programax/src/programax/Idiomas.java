
package programax;


public class Idiomas {
    
    int nivel;
    String lenguaje;
    
    public Idiomas(){
    nivel=5;
    lenguaje= "frances";
    
    }
    public Idiomas(int nivelon, String lenguajeon){
        this.nivel=nivelon;
        this.lenguaje=lenguajeon;
    }
    public int ObtenerNivel(){
        
        System.out.println("Tu nivel es: "+nivel);
    return nivel;
    
    }
    public String ObtenerLengua(){
        System.out.println("Tu estas estudiando: "+lenguaje);
    
    return lenguaje;
    }
    
    public void TipoInstitucion(){
    System.out.println("Estas estudiando en el IPN");
    }
    
    public void Escuela(){
    System.out.println("Estas en UPIICSA estudiando");
    }
    
    
}
