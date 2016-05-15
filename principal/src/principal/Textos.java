
package principal;
import java.io. *;


 public class Textos {
     public void Escribir (String NombreArchivo)
     {
         File f;
         f = new File(NombreArchivo);
         try{
             FileWriter w = new FileWriter(f);
             BufferedWriter bw = new BufferedWriter(w);
             PrintWriter wr = new PrintWriter (bw);
             
             
             wr.write("esto es un textinilo");
             wr.append (" \n -esto es una concatenacion al texto");
             wr.close();
             bw.close();
             
         } catch (IOException e){};
     }
    
    
}
