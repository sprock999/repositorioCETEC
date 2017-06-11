package Interfaces;

import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author jose_
 */
public class Menu_TrabajoSocial extends javax.swing.JFrame {

    ImageIcon img, icon;
    Thread tiempo;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Menu_TrabajoSocial() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Trabajo social");

        img = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        this.setIconImage(img.getImage());

        img = new ImageIcon(getClass().getResource("/Imagenes/baja_alumno.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_baja_alum.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/gestion_tutor.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_gestion_tutor.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/inscribir.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_inscribir_alum.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/registrar_tutor.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_registrar_tutor.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/reportes.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_reportes.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/cerrar_sesion.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_cerrar_sesion.setIcon(icon);

        tiempo = new Thread(new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                long end = start + (30 * 60 * 1000);
                System.out.println(start + " " + end);
                while (System.currentTimeMillis() < end) {
                }
                dispose();
                tiempo.stop();
            }
        });
        tiempo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        label_usuario = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        btn_inscribir_alum = new javax.swing.JButton();
        btn_baja_alum = new javax.swing.JButton();
        btn_reportes = new javax.swing.JButton();
        btn_gestion_tutor = new javax.swing.JButton();
        btn_registrar_tutor = new javax.swing.JButton();
        btn_cerrar_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        label_usuario.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N

        label_pass.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N

        btn_inscribir_alum.setBackground(new java.awt.Color(204, 255, 204));
        btn_inscribir_alum.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_inscribir_alum.setText("Inscribir Alumno");
        btn_inscribir_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscribir_alumActionPerformed(evt);
            }
        });

        btn_baja_alum.setBackground(new java.awt.Color(204, 255, 204));
        btn_baja_alum.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_baja_alum.setText("Baja De Alumno");
        btn_baja_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baja_alumActionPerformed(evt);
            }
        });

        btn_reportes.setBackground(new java.awt.Color(204, 255, 204));
        btn_reportes.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_reportes.setText("Reportes");
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        btn_gestion_tutor.setBackground(new java.awt.Color(204, 255, 204));
        btn_gestion_tutor.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_gestion_tutor.setText("Gestion De Tutor");
        btn_gestion_tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestion_tutorActionPerformed(evt);
            }
        });

        btn_registrar_tutor.setBackground(new java.awt.Color(204, 255, 204));
        btn_registrar_tutor.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_registrar_tutor.setText("Registrar Tutor");
        btn_registrar_tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_tutorActionPerformed(evt);
            }
        });

        btn_cerrar_sesion.setBackground(new java.awt.Color(204, 255, 204));
        btn_cerrar_sesion.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_cerrar_sesion.setText("Cerrar Sesion");
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(594, 594, 594))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_registrar_tutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_inscribir_alum, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_gestion_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_baja_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_inscribir_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_baja_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_gestion_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_registrar_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inscribir_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscribir_alumActionPerformed
        new InscribirAlumnos(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_inscribir_alumActionPerformed

    private void btn_baja_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baja_alumActionPerformed
        new BajaDeAlumno(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_baja_alumActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        new Reportes(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btn_registrar_tutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_tutorActionPerformed
        new RegistrarTutor(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_registrar_tutorActionPerformed

    private void btn_gestion_tutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestion_tutorActionPerformed
        new GestionDeTutor(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_gestion_tutorActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        tiempo.stop();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoAlSistema().setVisible(true);
            }
        });
    }//GEN-LAST:event_formWindowClosed

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(Menu_TrabajoSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu_TrabajoSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu_TrabajoSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu_TrabajoSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu_TrabajoSocial().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_baja_alum;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_gestion_tutor;
    private javax.swing.JButton btn_inscribir_alum;
    private javax.swing.JButton btn_registrar_tutor;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_usuario;
    // End of variables declaration//GEN-END:variables
}
