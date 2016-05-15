

package sockets2;

import java.net.*;
import java.io.*;
public class Conector {
   //  ServerSocket server;
    Socket cliente;
    int puerto = 9000;
    String ip = "192.168.1.114";
    //DataOutputStream salida;
    BufferedReader entrada,teclado;
    PrintStream salida;
    
    
    public void iniciar()
    {
        try{
            //server = new ServerSocket (puerto);
            cliente = new Socket(ip,puerto);
           // socket = server.accept();
            entrada = new BufferedReader(new InputStreamReader (cliente.getInputStream()));
            teclado = new BufferedReader (new InputStreamReader (System.in));
            String tec = teclado.readLine();
            //System.out.println(mensaje);
            salida = new PrintStream(cliente.getOutputStream());
            salida.println(tec);
            String mag = entrada.readLine();
            System.out.println(mag);
            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();
            
        }catch(Exception e){};
    }
    
    
}
