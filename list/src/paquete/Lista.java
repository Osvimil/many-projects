import java.awt.*;
import java.applet.Applet;

public class Lista extends Applet {

    @Override
    public void init() {
        List l = new List( 4,false );

        l.addItem( "Mercurio" ); 
        l.addItem( "Venus" ); 
        l.addItem( "Tierra" ); 
        l.addItem( "Marte" ); 
        l.addItem( "Jupiter" ); 
        l.addItem( "Saturno" ); 
        l.addItem( "Neptuno" ); 
        l.addItem( "Urano" ); 
        l.addItem( "Pluton" ); 
        add( l );
        }

    @Override
    public boolean action( Event evt,Object obj ) {
        if( evt.target instanceof List )
            System.out.println( "Entrada de la Lista: " + obj );

        return true;
        }
    }