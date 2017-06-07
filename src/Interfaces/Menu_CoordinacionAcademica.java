
package Interfaces;

import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author jose_
 */
public class Menu_CoordinacionAcademica extends javax.swing.JFrame {

    ImageIcon img, icon;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Menu_CoordinacionAcademica() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("coordinación Academica");
        
        img = new ImageIcon(getClass().getResource("/Imagenes/apertura_horarios.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_apertura_horario.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/fusionar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_fusion_grupos.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/inscribir.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_inscribir.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/cerrar_sesion.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_cerrar_sesion.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btn_apertura_horario = new javax.swing.JButton();
        btn_fusion_grupos = new javax.swing.JButton();
        btn_inscribir = new javax.swing.JButton();
        btn_cerrar_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        btn_apertura_horario.setBackground(new java.awt.Color(204, 255, 204));
        btn_apertura_horario.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_apertura_horario.setText("Apertura De Horarios");
        btn_apertura_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_apertura_horarioActionPerformed(evt);
            }
        });

        btn_fusion_grupos.setBackground(new java.awt.Color(204, 255, 204));
        btn_fusion_grupos.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_fusion_grupos.setText("Fusion De Grupos");
        btn_fusion_grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fusion_gruposActionPerformed(evt);
            }
        });

        btn_inscribir.setBackground(new java.awt.Color(204, 255, 204));
        btn_inscribir.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btn_inscribir.setText("Inscribir Alumno");
        btn_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inscribirActionPerformed(evt);
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
                        .addGap(10, 10, 10)
                        .addComponent(btn_apertura_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_fusion_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_inscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_apertura_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fusion_grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_inscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_apertura_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_apertura_horarioActionPerformed
        new AperturaDeHorarios(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_apertura_horarioActionPerformed

    private void btn_fusion_gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fusion_gruposActionPerformed
        new FusionDeGrupos(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_fusion_gruposActionPerformed

    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoAlSistema().setVisible(true);
            }
        });
    }//GEN-LAST:event_formWindowClosed

    private void btn_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inscribirActionPerformed
        new InscribirAlumnos(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_inscribirActionPerformed

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_CoordinacionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_CoordinacionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_CoordinacionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_CoordinacionAcademica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_CoordinacionAcademica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_apertura_horario;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_fusion_grupos;
    private javax.swing.JButton btn_inscribir;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
