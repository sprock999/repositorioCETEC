package Interfaces;

import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author jose_
 */
public class Menu_Director extends javax.swing.JFrame {
    
    ImageIcon img, icon;
    Thread tiempo;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Menu_Director() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Dirección");
        
        img = new ImageIcon(getClass().getResource("/Imagenes/despido.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_despido_emp.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/contratacion.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        btn_cont_personal.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/reportes.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_reportes.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/copia_seguridad.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_backup.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/reiniciar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_reset.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/recuperar_clave.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_restaurar.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/gestion_alumnos.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_gestion_alum.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/gestion_empleados.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_gestion_emp.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/cerrar_sesion.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_cerrar_sesion.setIcon(icon);
        
        tiempo = new Thread(new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();
                long end = start + (30 * 60 * 1000);
                System.out.println(start + " " + end);
                while(System.currentTimeMillis() < end){
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
        btn_cont_personal = new javax.swing.JButton();
        btn_despido_emp = new javax.swing.JButton();
        btn_reportes = new javax.swing.JButton();
        btn_gestion_emp = new javax.swing.JButton();
        btn_gestion_alum = new javax.swing.JButton();
        btn_backup = new javax.swing.JButton();
        btn_restaurar = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
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

        btn_cont_personal.setBackground(new java.awt.Color(204, 255, 204));
        btn_cont_personal.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_cont_personal.setText("Contratacion De Personal");
        btn_cont_personal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_cont_personal.setIconTextGap(2);
        btn_cont_personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cont_personalActionPerformed(evt);
            }
        });

        btn_despido_emp.setBackground(new java.awt.Color(204, 255, 204));
        btn_despido_emp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_despido_emp.setText("Despido De Empleados");
        btn_despido_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_despido_empActionPerformed(evt);
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

        btn_gestion_emp.setBackground(new java.awt.Color(204, 255, 204));
        btn_gestion_emp.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_gestion_emp.setText("Gestion De Empleados");
        btn_gestion_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestion_empActionPerformed(evt);
            }
        });

        btn_gestion_alum.setBackground(new java.awt.Color(204, 255, 204));
        btn_gestion_alum.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_gestion_alum.setText("Gestion De Alumnos");
        btn_gestion_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestion_alumActionPerformed(evt);
            }
        });

        btn_backup.setBackground(new java.awt.Color(204, 255, 204));
        btn_backup.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_backup.setText("Copia de Seguridad");
        btn_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backupActionPerformed(evt);
            }
        });

        btn_restaurar.setBackground(new java.awt.Color(204, 255, 204));
        btn_restaurar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_restaurar.setText("Restaurar");
        btn_restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaurarActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(204, 255, 204));
        btn_reset.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_reset.setText("Reiniciar Sistema");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_cont_personal, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_gestion_alum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_restaurar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_despido_emp, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(btn_gestion_emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_backup, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                            .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cont_personal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_despido_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gestion_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gestion_alum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_restaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(label_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cont_personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cont_personalActionPerformed
        new ContratacionDePersonal(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_cont_personalActionPerformed

    private void btn_despido_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_despido_empActionPerformed
        new DespidoDeEmpleados(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_despido_empActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        new Reportes(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btn_gestion_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestion_alumActionPerformed
        new GestionDeAlumnos(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_gestion_alumActionPerformed

    private void btn_gestion_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestion_empActionPerformed
        new GestionDeEmpleados(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_gestion_empActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        tiempo.stop();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoAlSistema().setVisible(true);
            }
        });
    }//GEN-LAST:event_formWindowClosed

    private void btn_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backupActionPerformed
        new CopiaDeSeguridad(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_backupActionPerformed

    private void btn_restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaurarActionPerformed
        new RecuperacionDeDatos(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_restaurarActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        new Reinicio(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_resetActionPerformed

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
//            java.util.logging.Logger.getLogger(Menu_Director.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu_Director.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu_Director.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu_Director.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu_Director().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backup;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_cont_personal;
    private javax.swing.JButton btn_despido_emp;
    private javax.swing.JButton btn_gestion_alum;
    private javax.swing.JButton btn_gestion_emp;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_restaurar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_usuario;
    // End of variables declaration//GEN-END:variables
}
