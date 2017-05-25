/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author lobat
 */
public class ControladorGrafico {

    public void validar(JTextField jt, String expresion) {
        try {
            if (jt.getText().equals("")) {
                jt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            } else {
                if (!jt.getText().matches(expresion)) {
                    //JOptionPane.showMessageDialog(null,"Caracteres invalidos","ERROR",JOptionPane.ERROR_MESSAGE);
                    jt.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    //jt.requestFocus();
                } else {
                    jt.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void getDocument(JTextField jt, String expresion) {
        try {
            jt.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void insertUpdate(DocumentEvent e) {
                    validar(jt, expresion);
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    validar(jt, expresion);
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    validar(jt, expresion);
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean getColor(JTextField jt){
        return ((LineBorder) jt.getBorder()).getLineColor().equals(new Color(0,255,0));
    }
    
    public boolean estaVacio(JTextField jt){
        return ((LineBorder) jt.getBorder()).getLineColor().equals(new Color(0,0,255));
    }
}
