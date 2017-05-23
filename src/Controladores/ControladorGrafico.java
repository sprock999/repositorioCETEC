/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author lobat
 */
public class ControladorGrafico {
    
    public void validar(JTextField jt){
        if(!jt.getText().matches("[a-zA-Z]+||[a-z\\sA-Z\\s]+")){
            //JOptionPane.showMessageDialog(null,"Caracteres invalidos","ERROR",JOptionPane.ERROR_MESSAGE);
            jt.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            jt.requestFocus();
        }else{
            jt.setBorder(BorderFactory.createLineBorder(Color.green, 2));
        }
    }
    
    public void getDocument(JTextField jt){
        jt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validar(jt);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validar(jt);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validar(jt);
            }
        });
    }
    
}
