
package programa2;

import java.util.Scanner;


public class Programa2 {

    
    public void aceptar()
    { 
        String nombre;
        Scanner nomb = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        nombre= nomb.nextLine();
        mostrar(nombre);
    }
    public void mostrar(String nom)
    {
        System.out.println("Hola como estas "+nom);
    }
    
    public static void main(String[] args) {
       Programa2 objeto= new Programa2();
       objeto.aceptar();
    }
    
}
