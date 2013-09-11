import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 28.10.2012
 * @author    marko
 */

public class DEBUGWINDOW extends JFrame implements ActionListener {
    // Anfang Attribute
    public Button but = null;
    public TextArea ta = new TextArea(20,50);
    public static DEBUGWINDOW instance = null;

    // Ende Attribute


    public DEBUGWINDOW(String title) {
        // Frame-Initialisierung
        super(title);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 600;
        int frameHeight = 400;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        // Anfang Komponenten
        add(ta);

        but = new Button("Gesehen");
        add(but);
        // Ende Komponenten
        but.addActionListener(this);

        setVisible(true);
    } // end of public simpleMessage

    // Anfang Methoden

    public void actionPerformed(ActionEvent evt){
        if(evt.getSource()==but){
            schliessen();
        }
    }

    public void schliessen(){
        this.dispose();
        //System.exit(0);
    }

    public TextArea getBox(){
        return(this.ta);
    }

    public String gettext(){
        return (ta.getText());
    }



    public static DEBUGWINDOW getInstance(){
        if(instance == null) {instance = new DEBUGWINDOW("DEBUGWINDOW");}
        return instance;
    }



    // Ende Methoden



} // end of class simpleMessage

