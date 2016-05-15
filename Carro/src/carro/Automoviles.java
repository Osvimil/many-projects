

package carro;


public class Automoviles {
    double peso;
    double altura;
    double ancho;
    double largo;
    int NumeroDePuertas;
    boolean encendido=false;
    String modelo;
    public Automoviles()
    {
        this.peso=1000;
        this.altura=120;
        this.ancho=6;
        this.largo=90;
    }
    public double ObtenerPeso()
    {
        return this.peso;
        
    }
    public double ObtenerAltura()
    {
        return this.altura;
    }
    public double ObtenerAncho()
    {
        return this.ancho;
    }
    public double ObtenerLargo()
    {
        return this.largo;
    }
    public void Encender()
    {
        this.encendido=true;
        System.out.println("EL CARRO ANDA ENCENDIDO");
        
    }
    public void Apagar()
    {
        this.encendido=false;
        System.out.println("EL CARRO ESTÁ APAGADO");
    }
    public void estado()
    {
        if(this.encendido==true)
            System.out.println("EL CARRO ANDA ENCENDIDO");
        else
            System.out.println("EL CARRO ESTÁ APAGADO");
            
            
    }
    public void informacion()
    {
        System.out.println("CARRO COMÚN");
    }
    
    
}

class carroVW extends Automoviles
{
    public carroVW ()
    {
        this.modelo= "VW";
    }
    public void turbo()
    {
        System.out.println("estás viajando a 100 km/hra");
    }
     public void informacion()
    {
        System.out.println("CARRO VW DEL AÑO 2090");
    }
}

class carroToyota extends Automoviles
{
    public carroToyota()
    {
        modelo = "TOYOTA";
    }
    public String modelo ()
    {
        return this.modelo;
    }
    public void informacion()
    {
        System.out.println("CARRO TOYOTA DEL AÑO 2050");
    }
}