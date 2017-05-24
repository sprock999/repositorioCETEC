package Controladores;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author jose_
 */
public class ManejadorFocus{ //implements FocusListener {

    JTextField jText;
    String expresion;

    public ManejadorFocus(JTextField jText, String expresion) {
        this.jText = jText;
        this.expresion = expresion;
        
        jText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                 System.out.println("Focus perdido :v " + jText.getText());
                 comprobar();
            }
        });
    }
    
    public void comprobar(){
        try {
            if (!jText.getText().matches(expresion)) {
                //JOptionPane.showMessageDialog(null,"Caracteres invalidos","ERROR",JOptionPane.ERROR_MESSAGE);
                jText.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                //jText.requestFocus();
            } else {
                jText.setBorder(BorderFactory.createLineBorder(Color.green, 2));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
