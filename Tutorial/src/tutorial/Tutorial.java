

package tutorial;


public class Tutorial {
    
    private int numero;
    private String nombre;
    private String institucion;
    private double fraccion;

    public Tutorial() {
    }

    public Tutorial(int numero, String nombre, String institucion, double fraccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.institucion = institucion;
        this.fraccion = fraccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getFraccion() {
        return fraccion;
    }

    public void setFraccion(double fraccion) {
        this.fraccion = fraccion;
    }
    

    
    public static void main(String[] args) {
      
    }
    
}
