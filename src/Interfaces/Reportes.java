package Interfaces;

import Controladores.ManejadorReportes;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jose_
 */
public class Reportes extends javax.swing.JFrame {

    ImageIcon img;
    ImageIcon icon;
    JFrame control;

    String no_reporte, no_profesor, actividad;
    int dia_reporte, mes_reporte, año_reporte;
    
    JTextFieldDateEditor editorFecha;

    ManejadorReportes reporte;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Reportes(JFrame ventana) {
        initComponents();
        this.setTitle("Reportes");
        this.setLocationRelativeTo(null);
        control = ventana;

        control.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                setVisible(false);
            }
        });

        img = new ImageIcon(getClass().getResource("/Imagenes/buscar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_buscar.getWidth(), btn_buscar.getHeight(), Image.SCALE_DEFAULT));
        btn_buscar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/registrar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        btn_registrar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        btn_salir.setIcon(icon);

        editorFecha = (JTextFieldDateEditor) fecha_registro.getDateEditor();
        editorFecha.setEditable(false);

        reporte = new ManejadorReportes();
        
        asignarNoReporte();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_no_reporte = new javax.swing.JTextField();
        txt_no_empleado = new javax.swing.JTextField();
        fecha_registro = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_actividad = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btn_registrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Del Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel1.setText("No. De Reporte: ");

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel2.setText("Fecha: ");

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel3.setText("No. De Empleado:");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_no_reporte.setEditable(false);
        txt_no_reporte.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_no_empleado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        fecha_registro.setDateFormatString("dd/M/yyyy");

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel5.setText("Actividad:");

        txt_actividad.setColumns(20);
        txt_actividad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_actividad.setRows(5);
        jScrollPane1.setViewportView(txt_actividad);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_no_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_no_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fecha_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_no_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fecha_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_no_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(177, 91, 6))); // NOI18N

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar.png"))); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
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
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        try {
            no_reporte = txt_no_reporte.getText();
            String fecha[] = new SimpleDateFormat("dd/M/yyyy").format(fecha_registro.getCalendar().getTime()).split("/");
            dia_reporte = Integer.parseInt(fecha[0]);
            mes_reporte = Integer.parseInt(fecha[1]);
            año_reporte = Integer.parseInt(fecha[2]);
            no_profesor = txt_no_empleado.getText();
            actividad = txt_actividad.getText();
            if (no_profesor.equals("") || actividad.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese Los Datos Solicitados", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!reporte.buscarTutor(no_profesor)) {
                txt_no_empleado.setText("");
                JOptionPane.showMessageDialog(null, "Empleado No Encontrado", "No encontrado!",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            reporte.asignarDatos(no_reporte, no_profesor, actividad, dia_reporte, mes_reporte, año_reporte);
            reporte.Registrar();
            JOptionPane.showMessageDialog(null, "Reporte Registrado", "Informacion.",
                    JOptionPane.INFORMATION_MESSAGE);
            asignarNoReporte();
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese Los Datos Solicitados", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    public void asignarNoReporte() {
        int numRep = reporte.getID();

        if (numRep != -1) {
            txt_no_reporte.setText(Integer.toString(numRep));
        } else {
            txt_no_reporte.setText("1");
        }
    }

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
        control.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        control.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String dato = txt_no_empleado.getText();
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese El No. Del Empleado", "Campo Vacio",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!reporte.buscarTutor(dato)) {
            txt_no_empleado.setText("");
            JOptionPane.showMessageDialog(null, "Empleado No Encontrado", "No encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    public void limpiarCampos(){
        
        txt_no_empleado.setText("");
        txt_actividad.setText("");
        fecha_registro.setDate(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private com.toedter.calendar.JDateChooser fecha_registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_actividad;
    private javax.swing.JTextField txt_no_empleado;
    private javax.swing.JTextField txt_no_reporte;
    // End of variables declaration//GEN-END:variables
}
