

package textos;
import java.io.*;


class Archivo {
      public void Leer (String NombreArchivo)
    {
        try {
            FileReader r = new FileReader (NombreArchivo);
            BufferedReader buffer = new BufferedReader(r);
            //System.out.println(buffer.readLine());
            String temporal = "";
            while (temporal != null)
            {
                temporal = buffer.readLine();
                if (temporal==null)
                    break;
                System.out.println(temporal);
            };
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        };
                
    }
    
}
