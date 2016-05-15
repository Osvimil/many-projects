/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadro;

import java.awt.Color;
import java.awt.Graphics;


public class Dibujo extends javax.swing.JPanel {

    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int hypo = 0;
    private int ancho = 0;
    private int alto = 0;
    private java.awt.Dimension cuadro;
    private double angulo = 0;
    private java.awt.Image imagen;
    private java.awt.Image imagenA;
    private java.awt.Graphics g;
    private boolean end = false;
    private int lx = 0, ly = 0;
    private int linX = 0;
    private int linY = 0;
    private int linX1 = 0;
    private int linY1 = 0;
    private int hyp = 0;

    public Dibujo() {
        imagen = new javax.swing.ImageIcon("ext/imagen/lapiz.png").getImage();
        imagenA = new javax.swing.ImageIcon("ext/imagen/lapizA.png").getImage();
        //System.out.println(imagen.getHeight(this));

        //cuadro.setSize(WIDTH, WIDTH);


    }

    public void reIniciar() {
        a = 0;
        b = 0;
        c = ancho;
        d = alto;
        calcularCurvaIrregular();
    }

    public void dibujar() {

        if (a != ancho) {
            a++;
            ly = 0;
            lx = a;

        } else if (b != alto) {
            b++;
            lx = ancho;
            ly = b;
        } else if (c != 0) {

            c = c - 1;
            lx = c;
            ly = alto;
        } else if (d != 0) {
            d = d - 1;
            lx = 0;
            ly = d;
        } else if (hypo != hyp) {
            linX1 = (int) (linX + hypo * Math.cos(angulo));
            linY1 = (int) (linY + hypo * Math.sin(angulo));
            //System.out.println("hypo: " + hypo + "[" + linX1 + "," + linY1 + "] " + Math.sin(angulo) + "   " + angulo);
            lx = linX1;
            ly = linY1;
            hypo++;
        }

        if (a == ancho && b == alto && c == 0 && d == 0 && hypo == hyp) {
            end = true;
            //calcularCurvaIrregular();
        }
        //System.out.println(a + "  - " + b);
    }

    public void calcularCurvaIrregular() {

angulo=0;
        int temp = ancho + alto;
        temp = (int) (temp * Math.random());
        if (temp > ancho) {
            linX = ancho;
            linY = temp - ancho;
        } else {
//////////            angulo = angulo + Math.toRadians(180);
            linX = temp;
            linY = 0;
        }

        //temp = ancho + alto;
        //temp = (int) (temp * Math.random());;
        temp = (ancho + alto) - temp;
        if (temp > alto) {
            linX1 = temp - alto;
            linY1 = alto;
        } else {
            linX1 = 0;
            linY1 = temp;
        }
        
        if(linX>=linX1){
            int t=linX;
            linX=linX1;
            linX1=t;
            t=linY;
            linY=linY1;
            linY1=t;
        }
        


        hypo = 0;
        hyp = (int) Math.hypot(linX1 - linX, linY1 - linY);


        angulo =angulo+ Math.atan((double) (linY1 - linY) / (double) (linX1 - linX));
        //System.out.println("Angulo: " + Math.toDegrees(angulo) + " " + (double) (linY1 - linY) / (double) (linX1 - linX));
        //if (Math.toDegrees(angulo) < 0) {
            //angulo = angulo + Math.toRadians(180);
        //}
        System.out.println("Angulo: " + Math.toDegrees(angulo) + " " + (double) (linY1 - linY) / (double) (linX1 - linX));


        //.out.println("Hyp: " + hyp + " angulo: " + Math.toDegrees(angulo));



    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Dibujar Linea A:
        g.drawLine(0, 0, a, 0);
        //Dibujar Linea B;
        g.drawLine(ancho, 0, ancho, b);
        //Dibujar Linea C;
        g.drawLine(ancho, alto, c, alto);
        //Dibujar Linea D
        g.drawLine(0, alto, 0, d);

        //g.drawLine(linX, linY, linX1, linY1);
        //g.drawArc(linX, linY, 30, 50, 0, 180);

        //if(a!=ancho){n
        if (hypo != 0) {
            double n = 0;//n+10;
            for (int i = 0; i < hypo; i++) {
                int r = (int) (10 * Math.sin(Math.toRadians(n)));
                int x=0;
                int y=0;
                
                    x = (int) (linX - i * Math.cos(angulo));
                
                    x = (int) (linX + i * Math.cos(angulo));
                
                
                
                    y = (int) (linY - i * Math.sin(angulo));
                
                    y = (int) (linY + i * Math.sin(angulo));
                
                 
                


                x = x + (int) (r * Math.cos(Math.toRadians(270) + angulo));
                y = y + (int) (r * Math.sin(Math.toRadians(270) + angulo));




//               


                g.drawLine(x, y, x, y);
                lx = x;
                ly = y;
                if(hyp<360){
                n = n + (1.0 * 360.0) / (double) hyp;
                }else{
                    n = n +1;
                }
            }
        }


        if (!end) {
            g.drawImage(imagenA, lx, ly, 30, 30, this);
        }
        //}
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        c = ancho;
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        d = alto;
        this.alto = alto;
    }

    /**
     * @return the end
     */
    public boolean isEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(boolean end) {
        this.end = end;
    }
}
