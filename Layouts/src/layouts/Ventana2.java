

package layouts;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;



public class Ventana2 extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public Ventana2()
    {
        this.setLayout(new BorderLayout());
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3,3,5,4));
         b1= new JButton("1");
         b2= new JButton("2");
         b3= new JButton("3");
         b4= new JButton("4");
         b5= new JButton("5");
         b6= new JButton("6");
         b7= new JButton("7");
         b8= new JButton("8");
         b9= new JButton("9");
        
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.SOUTH);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel1.add(b8);
        panel1.add(b9);
    }
}
