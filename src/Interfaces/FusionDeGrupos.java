package Interfaces;

import Controladores.ManejadorFocus;
import Controladores.ManejadorFusionDeGrupos;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jose_
 */
public class FusionDeGrupos extends javax.swing.JFrame {

    ManejadorFusionDeGrupos fusion;

    DefaultTableModel modelo, modeloD;

    String seleccionadoUno = "", seleccionadoDos = "";

    ImageIcon img;
    ImageIcon icon;

    public FusionDeGrupos() {
        initComponents();
        this.setTitle("Fusión De Grupos");
        this.setLocationRelativeTo(null);

        img = new ImageIcon(getClass().getResource("/Imagenes/buscar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_buscar.getWidth(), btn_buscar.getHeight(), Image.SCALE_DEFAULT));
        btn_buscar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/fusionar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_fusionar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_salir.setIcon(icon);

        fusion = new ManejadorFusionDeGrupos();

        modelo = (DefaultTableModel) tabla_horarios.getModel();
        modeloD = (DefaultTableModel) tabla_disponibles.getModel();
        
        new ManejadorFocus(txt_no_horario, "\\d+");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_disponibles = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_no_horario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_horarios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_fusionar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horarios Disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(255, 102, 0))); // NOI18N

        tabla_disponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "No. Horario", "Hora De Entrada", "Hora De Salida", "No. Profesor", "No. Alumnos"
            }
        ));
        tabla_disponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_disponiblesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_disponibles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Harario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel1.setText("No. De Harario:");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_no_horario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        tabla_horarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "No. Horario", "Hora De Entrada", "Hora De Salida", "No. Profesor", "No. Alumnos"
            }
        ));
        tabla_horarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_horariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_horarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_no_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 300, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(txt_no_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(177, 91, 6))); // NOI18N

        btn_fusionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fusionar.png"))); // NOI18N
        btn_fusionar.setText("Fusionar");
        btn_fusionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fusionarActionPerformed(evt);
            }
        });

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_fusionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fusionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        modelo.setRowCount(0);
        modeloD.setRowCount(0);

        fusion.setNo_horario(txt_no_horario.getText());

        DefaultTableModel model = fusion.getDatos(modelo);

        if (model == null) {
            JOptionPane.showMessageDialog(this, "Horario No Encontrado", "No encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            tabla_horarios.setModel(model);
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_fusionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fusionarActionPerformed

        if (txt_no_horario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Busque Un horario...",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (seleccionadoUno.equals("") || seleccionadoDos.equals("")) {
                JOptionPane.showMessageDialog(this, "Seleccione Los Horarios A Fusionar...",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if (fusion.horariosAceptados(seleccionadoUno, seleccionadoDos)) {
                    fusion.fusionarHorario(seleccionadoUno, seleccionadoDos);
                    JOptionPane.showMessageDialog(this, "Horarios Funcionados...", "Fusionados",
                            JOptionPane.INFORMATION_MESSAGE);
                    modelo.setRowCount(0);
                    modeloD.setRowCount(0);
                    seleccionadoUno = "";
                    seleccionadoDos = "";
                } else {
                    modelo.setRowCount(0);
                    modeloD.setRowCount(0);
                    seleccionadoUno = "";
                    seleccionadoDos = "";
                    JOptionPane.showMessageDialog(this, "La Cantidad De Alumnos Excede\n La Capacidad De Grupo",
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btn_fusionarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void tabla_horariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_horariosMouseClicked

        modeloD.setRowCount(0);
        Point point = evt.getPoint();
        int row = tabla_horarios.rowAtPoint(point);
        int column = tabla_horarios.columnAtPoint(point);
        TableModel model = tabla_horarios.getModel();
        //JOptionPane.showMessageDialog(this, model.getValueAt(row, column));
        seleccionadoUno = txt_no_horario.getText();
        tabla_disponibles.setModel(fusion.getDisponibles(modeloD));
    }//GEN-LAST:event_tabla_horariosMouseClicked

    private void tabla_disponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_disponiblesMouseClicked
        Point point = evt.getPoint();
        int row = tabla_disponibles.rowAtPoint(point);
        int column = tabla_disponibles.columnAtPoint(point);
        TableModel model = tabla_disponibles.getModel();

        seleccionadoDos = model.getValueAt(row, 0).toString();
        //JOptionPane.showMessageDialog(this, seleccionadoDos);
    }//GEN-LAST:event_tabla_disponiblesMouseClicked

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
            java.util.logging.Logger.getLogger(FusionDeGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FusionDeGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FusionDeGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FusionDeGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FusionDeGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_fusionar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla_disponibles;
    private javax.swing.JTable tabla_horarios;
    private javax.swing.JTextField txt_no_horario;
    // End of variables declaration//GEN-END:variables
}
