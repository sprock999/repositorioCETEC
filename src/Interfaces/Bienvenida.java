package Interfaces;

import Entidades.tiempo;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author jose_
 */
public class Bienvenida extends javax.swing.JFrame {

    JFrame control;

    tiempo hilo;
    double i = 50, j = 1;

    private ImageIcon imagen;
    private Icon icono;

    public Bienvenida(JFrame ventana, String texto) {
        TransparenciaFrame(this);
        initComponents();
        this.setLocationRelativeTo(null);
        control = ventana;
        fondo();
        labelUsuario.setText(texto);
        iniciar();

        UIManager.put("ProgressBar.selectionBackground",Color.BLUE);
UIManager.put("ProgressBar.selectionForeground",Color.WHITE);
    }

    public void TransparenciaFrame(JFrame frame) {
        frame.setUndecorated(true);
        AWTUtilities.setWindowOpaque(frame, false);
    }

    public void fondo() {
        imagen = new ImageIcon(getClass().getResource("/Imagenes/logo.jpg"));
        icono = new ImageIcon(imagen.getImage().getScaledInstance(labelFondo.getWidth(),
                labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(icono);
    }

    public void iniciar() {
        //barraPro.setVisible(false);
        hilo = new tiempo(getBarraPro());
        hilo.start();
        hilo = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFondo = new javax.swing.JLabel();
        barraPro = new javax.swing.JProgressBar();
        labelUsuario = new javax.swing.JLabel();
        labelUsuario1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N

        barraPro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraProStateChanged(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("Impact", 1, 21)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(0, 51, 204));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("Tipo De Usuario");

        labelUsuario1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUsuario1.setForeground(new java.awt.Color(0, 51, 204));
        labelUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario1.setText("Bienvenido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraPro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraProStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraProStateChanged
        if (getBarraPro().getValue() == i) {
            if (j != 101) {
                AWTUtilities.setWindowOpacity(this, Float.valueOf((100 - j) / 100 + "f"));
                i++;
                j += 2;
            }
        }
        if (barraPro.getValue() == 100) {
            control.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_barraProStateChanged

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Bienvenida().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar barraPro;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel labelUsuario1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JProgressBar getBarraPro() {
        return barraPro;
    }

    public void setBarraPro(javax.swing.JProgressBar barraPro) {
        this.barraPro = barraPro;
    }
}
