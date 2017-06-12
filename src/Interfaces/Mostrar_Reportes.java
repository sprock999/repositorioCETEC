package Interfaces;

import Controladores.Conexion;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jose_
 */
public class Mostrar_Reportes extends javax.swing.JFrame implements Printable {

    Conexion baseDatos = new Conexion().conectar();
    private final JFrame control;
    DefaultTableModel modelo;
    String noEmpleado = "";
    Boolean seleccionado = false;
    ImageIcon img;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Mostrar_Reportes(JFrame ventana) {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Reporte");

        control = ventana;

        control.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                setVisible(false);
            }
        });
        
        img = new ImageIcon(getClass().getResource("/Imagenes/icono.png"));
        this.setIconImage(img.getImage());

        modelo = (DefaultTableModel) tabla_reportes.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_reporte = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jLabel138 = new javax.swing.JLabel();
        txt_empleado = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        txt_num_empleado = new javax.swing.JTextField();
        txt_actividad = new javax.swing.JTextArea();
        txt_direccion = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btn_imprimir = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reportes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        panel_reporte.setBackground(new java.awt.Color(255, 255, 255));
        panel_reporte.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N

        jLabel141.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel141.setText("Fecha:");

        txt_fecha.setEditable(false);
        txt_fecha.setToolTipText("");
        txt_fecha.setBorder(null);

        jLabel138.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel138.setText("Empleado:");

        txt_empleado.setEditable(false);
        txt_empleado.setForeground(new java.awt.Color(0, 0, 153));
        txt_empleado.setBorder(null);

        jLabel140.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel140.setText("No. de empleado:");

        txt_num_empleado.setEditable(false);
        txt_num_empleado.setForeground(new java.awt.Color(0, 0, 153));
        txt_num_empleado.setToolTipText("");
        txt_num_empleado.setBorder(null);

        txt_actividad.setEditable(false);
        txt_actividad.setColumns(20);
        txt_actividad.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        txt_actividad.setRows(5);
        txt_actividad.setText("Descripción");
        txt_actividad.setAutoscrolls(false);
        txt_actividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        txt_actividad.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_actividad.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txt_direccion.setEditable(false);
        txt_direccion.setColumns(20);
        txt_direccion.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(102, 0, 0));
        txt_direccion.setRows(5);
        txt_direccion.setText("Centro De Estudios Técnicos\nEn Computación E Inglés\nAv. Juárez No. 6 Col Centro\nChilpancingo, Guerrero");
        txt_direccion.setAutoscrolls(false);
        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        txt_direccion.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_direccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel_reporteLayout = new javax.swing.GroupLayout(panel_reporte);
        panel_reporte.setLayout(panel_reporteLayout);
        panel_reporteLayout.setHorizontalGroup(
            panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_reporteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_reporteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_reporteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_reporteLayout.createSequentialGroup()
                                .addGap(0, 370, Short.MAX_VALUE)
                                .addComponent(jLabel141)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel140)
                            .addComponent(txt_actividad, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_reporteLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_num_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel138))
                        .addContainerGap(8, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_reporteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        panel_reporteLayout.setVerticalGroup(
            panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_reporteLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel141)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel140)
                    .addComponent(txt_num_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_reporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel138)
                    .addComponent(txt_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(177, 91, 6))); // NOI18N

        btn_imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imprimir.png"))); // NOI18N
        btn_imprimir.setText("Registrar");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
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
                .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(177, 91, 6))); // NOI18N

        tabla_reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. De Reporte", "Fecha", "Actividad"
            }
        ));
        tabla_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_reportesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reportes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    public void asignarEmpleado(String empleado) {
        noEmpleado = empleado;
        tabla_reportes.setModel(getReportes(modelo, empleado));
    }

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        try {
            if (!seleccionado) {
                JOptionPane.showMessageDialog(null, "Selecciona un reporte", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
            } else {
                PrinterJob gap = PrinterJob.getPrinterJob();
                gap.setPrintable(this);
                boolean top = gap.printDialog();
                if (top) {
                    gap.print();
                }
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error Al Imprimir\n" + e, "Mensaje De Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
        control.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        control.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void tabla_reportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reportesMouseClicked

        Point point = evt.getPoint();
        int row = tabla_reportes.rowAtPoint(point);
        int column = tabla_reportes.columnAtPoint(point);
        int dia_reporte, mes_reporte, año_reporte;
        TableModel model = tabla_reportes.getModel();

        //modificarAlumno.getDatos();
        String[] datos = getDatos(model.getValueAt(row, 0).toString());

        if (datos[0] == null) {
            seleccionado = false;
        } else {
            Calendar fecha = new GregorianCalendar();
            año_reporte = fecha.get(Calendar.YEAR);
            mes_reporte = fecha.get(Calendar.MONTH) + 1;
            dia_reporte = fecha.get(Calendar.DAY_OF_MONTH);

            txt_fecha.setText(dia_reporte + " / " + mes_reporte + " / " + año_reporte);
            txt_num_empleado.setText(noEmpleado);
            txt_empleado.setText(datos[0] + " " + datos[1] + " " + datos[2] + " " + datos[3]);
            txt_actividad.setText(datos[4]);
            seleccionado = true;
        }
    }//GEN-LAST:event_tabla_reportesMouseClicked

    public DefaultTableModel getReportes(DefaultTableModel modelo, String no_empleado) {
        String consulta = "SELECT Numero_Reporte, Dia_Reporte, Mes_Reporte, Año_Reporte, Actividad "
                + " FROM reporte INNER JOIN profesor on reporte.No_Profesor = profesor.No_Profesor "
                + " WHERE reporte.No_Profesor = '" + no_empleado + "' && Estado = 1;";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getInt(2) + "/" + res.getInt(3) + "/" + res.getInt(4));
                v.add(res.getString(5));
                modelo.addRow(v);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return modelo;
    }

    public String[] getDatos(String no_reporte) {
        String[] salida = new String[5];
        String consulta = "SELECT Primer_Nom, Segun_Nom, Apellido_P, Apellido_M, Actividad "
                + " FROM reporte "
                + " INNER JOIN profesor ON reporte.No_Profesor = profesor.No_Profesor "
                + " INNER JOIN persona ON profesor.CURP = persona.CURP WHERE reporte.Numero_Reporte = " + no_reporte + ";";

        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                salida[0] = res.getString(1);
                salida[1] = res.getString(2);
                salida[2] = res.getString(3);
                salida[3] = res.getString(4);
                salida[4] = res.getString(5);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return salida;
    }

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
//            java.util.logging.Logger.getLogger(Mostrar_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Mostrar_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Mostrar_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Mostrar_Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Mostrar_Reportes().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_reporte;
    private javax.swing.JTable tabla_reportes;
    private javax.swing.JTextArea txt_actividad;
    private javax.swing.JTextArea txt_direccion;
    private javax.swing.JTextField txt_empleado;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_num_empleado;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int index) throws PrinterException {
        if (index > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX() + 40, pageFormat.getImageableY() + 40);
        g2d.scale(1.0, 1.0);
        panel_reporte.printAll(g2d);
        return PAGE_EXISTS;
    }

}
