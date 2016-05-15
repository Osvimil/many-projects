

package animales;


public class Tipos {
    
    int patas;
    String raza;
    String nombre;
    String habitat;
    int ojos;
    
    public Tipos(){
    patas=4;
    raza="vertebrado";
    nombre="wilson";
    habitat="fauna silvestre";
    ojos=2;
    
    
    
    }
    public Tipos(int patas,String raza,String nombre,int ojos){
        this.patas=patas;
        this.raza=raza;
        this.nombre=nombre;
        this.ojos=ojos;
    
    }
    
    public int Patrullas(){
    
    System.out.println("el numero de patas son: "+patas);
    return patas;
    }
    
    public int Ojosos(){
    
    System.out.println("El numero de ojos son: "+ojos);
    return ojos;
    }
    
    public String Razota(){
    System.out.println("tipo de raza es: "+raza);
    return raza;
    
    }
    public String Nombrote(){
    
    System.out.println("el nombre es: "+nombre);
    return nombre;
    }
    public String Habitacion(){
    
    System.out.println("su habitat es: "+habitat);
            return habitat;
    
    
    }
      
}
