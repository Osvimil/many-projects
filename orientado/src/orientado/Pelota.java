

package orientado;


public class Pelota {
    
    float radio;
    float peso;
    public Pelota()
    {
        radio=100;
        peso=250;
    }
    public Pelota (float radio, float peso)
    {
        this.radio=radio;
        this.peso=peso;
    }
    public float ObtenerRadio()
    {
        return radio;
    }
    public float ObtenerPeso()
    {
        return peso;
    }
    public void PatearPelota()
    {
        System.out.println("haz pateado la pelota");
    }
    public void AtraparPelota()
    {
        System.out.println("haz atrapado la pelota");
    }
    
}
