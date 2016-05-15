
public class prueba {
    
    
  private Object[] cola;
    private int frente;
    private int fin;
    
    public prueba (int tamanio)
    {
        cola = new Object [tamanio];
        frente = fin = -1;
        
    }
    public boolean isEmpty()
    {
        return frente == fin;
    }
    public boolean isFull()
    {
        return fin == cola.length-1;
    }
    public void insert (Object elemento)
    {
        if (isFull())
            System.out.println("la cola esta llena");
        else
            prueba (++fin) = elemento;
    }
    public Object remove()
    {
        if (isEmpty())
        {
            System.out.println("la cola esta vacia");
            return "cola vacia";
        }
        else
            return cola[++frente];
            
    }
    public void print()
    {
      if (isEmpty())
      System.out.println("la cola esta vacia");
      else if(frente == -1)
      {
          for(int i=0;i<=fin;i++)
          {
              System.out.println(cola[i]);
          }
      }
      else 
      {
          for (int j = frente; j <=fin; j++)
          {
              System.out.println(cola[j]);
          }
      }
    }
          
              
    

    

