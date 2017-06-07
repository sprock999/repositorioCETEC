
package Interfaces;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class AccesoAlSistema extends javax.swing.JFrame {

    ImageIcon img;
    ImageIcon icon;
    private final String DIRECCION = "123", TRABAJO_SOCIAL = "1234", ACADEMICO = "12345";
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public AccesoAlSistema() {
        initComponents();
        this.setTitle("Acceso Al Sistema");
        this.setLocationRelativeTo(null);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/cetec.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(280, 170, Image.SCALE_DEFAULT));
        jLabel4.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/llave.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(label_pass.getWidth(), label_pass.getHeight(), Image.SCALE_DEFAULT));
        label_pass.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/login.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_ingresar.getWidth(), btn_ingresar.getHeight(), Image.SCALE_DEFAULT));
        btn_ingresar.setIcon(icon);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_pass = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        label_recuperacion = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso al Sistema");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        label_pass.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N

        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        label_recuperacion.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        label_recuperacion.setForeground(new java.awt.Color(0, 0, 255));
        label_recuperacion.setText("¿Olvidaste Tu Contraseña?");
        label_recuperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_recuperacionMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel10.setText("Ingresar");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cetec.png"))); // NOI18N

        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(108, 108, 108))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(label_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_pass))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel10)
                                        .addGap(63, 63, 63))
                                    .addComponent(label_recuperacion, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_pass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(label_recuperacion)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if(!txt_pass.getText().equals("")){
            switch(txt_pass.getText()){
                case DIRECCION:
                    new Bienvenida(new Menu_Director(), "Dirección").setVisible(true);
                    //new Menu_Director().setVisible(true);
                    dispose();
                    //Entrar("direccion");
                    break;
                case TRABAJO_SOCIAL:
                    new Bienvenida(new Menu_TrabajoSocial(), "Trabajo Social").setVisible(true);
                    //new Menu_TrabajoSocial().setVisible(true);
                    dispose();
                    //Entrar("trabajo social");
                    break;
                case ACADEMICO:
                    new Bienvenida(new Menu_CoordinacionAcademica(), "Coordinador Academico").setVisible(true);
                    //new Menu_CoordinacionAcademica().setVisible(true);
                    dispose();
                    //Entrar("coordinador academico");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error en la contraseña de acceso","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void label_recuperacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_recuperacionMouseClicked
        new Recuperacion(this).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_label_recuperacionMouseClicked

    private void txt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt_pass.getText().equals("")) {
                switch (txt_pass.getText()) {
                    case DIRECCION:
                        new Bienvenida(new Menu_Director(), "Dirección").setVisible(true);
                        //new Menu_Director().setVisible(true);
                        dispose();
                        //Entrar("direccion");
                        break;
                    case TRABAJO_SOCIAL:
                        new Bienvenida(new Menu_TrabajoSocial(), "Trabajo Social").setVisible(true);
                        //new Menu_TrabajoSocial().setVisible(true);
                        dispose();
                        //Entrar("trabajo social");
                        break;
                    case ACADEMICO:
                        new Bienvenida(new Menu_CoordinacionAcademica(), "Coordinador Academico").setVisible(true);
                        //new Menu_CoordinacionAcademica().setVisible(true);
                        dispose();
                        //Entrar("coordinador academico");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error en la contraseña de acceso", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_txt_passKeyPressed
    
    public void Entrar(String user){
        JOptionPane.showMessageDialog(null, "Bienvenido " + user,user,JOptionPane.INFORMATION_MESSAGE);
    }
    
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
            java.util.logging.Logger.getLogger(AccesoAlSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoAlSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoAlSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoAlSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoAlSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_recuperacion;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
