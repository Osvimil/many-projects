

package eventos;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;


public class Ventana extends JFrame implements ActionListener {
    JPanel panel1;
    JButton boton1;
    JButton boton2;
    JLabel etiqueta1;
    JTextField texto1;
    public Ventana()
            {
                
                panel1= new JPanel();
                boton1 = new JButton("OPRIMIR");
                boton2 = new JButton("oprimir2");
                etiqueta1 = new JLabel();
                texto1 = new JTextField("escribe");
                
                this.add(panel1);
                
                panel1.add(boton1);
                panel1.add(etiqueta1);
                panel1.add(texto1);
                panel1.add(boton2);
                
                this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
             this.boton1.addActionListener(this); 
             this.boton2.addActionListener(this);
                
            }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(boton1))
        {
          this.etiqueta1.setText(this.texto1.getText());   
        }
        if(ae.getSource().equals(boton2))
        {
          this.etiqueta1.setText("haz oprimido boton 2");   
        }
      

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
