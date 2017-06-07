package Interfaces;

import Controladores.ControladorGrafico;
import Controladores.ManejadorGestionDeEmpleados;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Image;
import java.awt.Point;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GestionDeEmpleados extends javax.swing.JFrame {

    ManejadorGestionDeEmpleados gestionEmpleados;

    ControladorGrafico ctrlNoEmpleado, ctrlPrimerNombre, ctrlSegundoNombre, ctrlApellPaterno,
            ctrlApellMaterno, ctrlFechaNac, ctrlCurp, ctrlSalrio;

    JTextFieldDateEditor editorFecha;
    JFrame control;

    DefaultTableModel modelo;

    String no_empleado, primer_nom, segundo_nom, apellido_pat,
            apellido_mat, curp, grado_estudios;
    int salario, dia_nac, mes_nac, año_nac;

    int correcto = 0;

    ImageIcon img, icon;
    
    public GestionDeEmpleados(JFrame ventana) {
        initComponents();
        this.setTitle("Gestion De Empleados");
        this.setLocationRelativeTo(null);
        control = ventana;
        
        img = new ImageIcon(getClass().getResource("/Imagenes/buscar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_buscar.getWidth(), btn_buscar.getHeight(), Image.SCALE_DEFAULT));
        btn_buscar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/modificar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_modificar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_salir.setIcon(icon);

        modelo = (DefaultTableModel) tabla_empleados.getModel();
        gestionEmpleados = new ManejadorGestionDeEmpleados();

        editorFecha = (JTextFieldDateEditor) fecha_nacimiento.getDateEditor();
        editorFecha.setEditable(false);

        String regexCurp = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}" + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" + "[HM]{1}"
                + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
                + "[B-DF-HJ-NP-TV-Z]{3}" + "[0-9A-Z]{1}[0-9]{1}$";

        ctrlNoEmpleado = new ControladorGrafico();
        ctrlPrimerNombre = new ControladorGrafico();
        ctrlSegundoNombre = new ControladorGrafico();
        ctrlApellPaterno = new ControladorGrafico();
        ctrlApellMaterno = new ControladorGrafico();
        ctrlFechaNac = new ControladorGrafico();
        ctrlCurp = new ControladorGrafico();
        ctrlSalrio = new ControladorGrafico();

        ctrlNoEmpleado.getDocument(txt_no_empleado, "\\d+");
        ctrlPrimerNombre.getDocument(txt_primer_nombre, "[a-zA-Z]+");
        ctrlSegundoNombre.getDocument(txt_segundo_nombre, "[a-zA-Z]+");
        ctrlApellPaterno.getDocument(txt_apell_paterno, "[a-zA-Z]+");
        ctrlApellMaterno.getDocument(txt_apell_materno, "[a-zA-Z]+");
        ctrlFechaNac.getDocument(editorFecha, "\\d{1,2}/\\d{1,2}/\\d{4}");
        ctrlCurp.getDocument(txt_curp, regexCurp);
        ctrlSalrio.getDocument(txt_salario, "\\d+");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_apell_paterno = new javax.swing.JTextField();
        txt_primer_nombre = new javax.swing.JTextField();
        txt_segundo_nombre = new javax.swing.JTextField();
        txt_apell_materno = new javax.swing.JTextField();
        txt_curp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_no_empleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_empleados = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_modificar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        combo_estudios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(255, 102, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel4.setText("Primer Nombre:");

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno:");

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento:");

        jLabel7.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel7.setText("Segundo nombre:");

        jLabel8.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel8.setText("Apellido Materno:");

        txt_apell_paterno.setEditable(false);
        txt_apell_paterno.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_primer_nombre.setEditable(false);
        txt_primer_nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_segundo_nombre.setEditable(false);
        txt_segundo_nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_apell_materno.setEditable(false);
        txt_apell_materno.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_curp.setEditable(false);
        txt_curp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel9.setText("CURP:");

        fecha_nacimiento.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_apell_paterno, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(txt_primer_nombre))
                    .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_apell_materno)
                    .addComponent(txt_segundo_nombre)
                    .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_primer_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_segundo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_apell_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apell_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel1.setText("No. Empleado: ");

        txt_no_empleado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        tabla_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "No. Empleado", "Nombre(s)", "Apellido Paterno", "Apellido Materno", "Grado De Estudios", "Salario"
            }
        ));
        tabla_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_empleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_empleados);

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(txt_no_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(txt_no_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(177, 91, 6))); // NOI18N

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
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
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Académicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel13.setText("Salario:");

        jLabel14.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel14.setText("Grado De Estudios:");

        txt_salario.setEditable(false);
        txt_salario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        combo_estudios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combo_estudios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria ", "Secundaria ", "Bachillerato ", "Licenciatura ", "Maestría ", "Doctorado" }));
        combo_estudios.setEnabled(false);
        combo_estudios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_estudiosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_salario, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(combo_estudios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(337, 337, 337))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_estudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tabla_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_empleadosMouseClicked

        Point point = evt.getPoint();
        int row = tabla_empleados.rowAtPoint(point);
        int column = tabla_empleados.columnAtPoint(point);
        TableModel model = tabla_empleados.getModel();

        //modificarAlumno.getDatos();
        String[] datos = gestionEmpleados.getDatos(model.getValueAt(row, 0).toString());

        if (datos[0] == null) {
            JOptionPane.showMessageDialog(null, "Empleado No Encontrado", "No Encontrado!",
                JOptionPane.INFORMATION_MESSAGE);
            correcto = 2;
        } else {
            habilitarComponentes();

            txt_curp.setText(datos[0]);
            combo_estudios.setSelectedItem(datos[1]);
            txt_salario.setText(datos[2]);
            txt_primer_nombre.setText(datos[3]);
            txt_segundo_nombre.setText(datos[4]);
            txt_apell_paterno.setText(datos[5]);
            txt_apell_materno.setText(datos[6]);

            try {
                String dato = datos[7] + "-" + datos[8] + "-" + datos[9];
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                Date fechaDate = formato.parse(dato);
                //Date time = new Date(fecha);
                fecha_nacimiento.setDate(fechaDate);

                correcto = 1;
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_tabla_empleadosMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        modelo.setRowCount(0);
        String dato = txt_no_empleado.getText();

        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese El No. De Empleado", "Campo Vacio",
                JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        DefaultTableModel model = gestionEmpleados.getEmpleado(modelo, dato);
        if (model.getRowCount() < 1) {
            deshabilitarComponentes();
            limpiarCampos();
            correcto = 0;
            JOptionPane.showMessageDialog(null, "No Se Encontró El Empleado", "No Encontrado!",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            tabla_empleados.setModel(model);
            correcto = 2;
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        //String seleccionado = combo_estudios.getSelectedItem().toString();
        //System.out.println(seleccionado);
        //combo_estudios.setSelectedItem("Doctorado");
        try {
            if (correcto == 0) {
                JOptionPane.showMessageDialog(null, "Busque Un Empleado", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                if (correcto == 2) {
                    JOptionPane.showMessageDialog(null, "Seleccione Un Empleado", "Advertencia!",
                        JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        no_empleado = txt_no_empleado.getText();
        grado_estudios = combo_estudios.getSelectedItem().toString();
        primer_nom = txt_primer_nombre.getText();
        segundo_nom = txt_segundo_nombre.getText();
        apellido_pat = txt_apell_paterno.getText();
        apellido_mat = txt_apell_materno.getText();
        curp = txt_curp.getText();
        Date time = null;
        String fecha_nac = "";
        if (fecha_nacimiento.getCalendar() != null) {
            time = fecha_nacimiento.getCalendar().getTime();
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            fecha_nac = formato.format(time);
        }

        String[] fechaArray = fecha_nac.split("-");
        dia_nac = Integer.parseInt(fechaArray[0]);
        mes_nac = Integer.parseInt(fechaArray[1]);
        año_nac = Integer.parseInt(fechaArray[2]);

        try {
            if (ctrlPrimerNombre.getColor(txt_primer_nombre) && ctrlApellPaterno.getColor(txt_apell_paterno)
                && ctrlApellMaterno.getColor(txt_apell_materno) && ctrlFechaNac.getColor(editorFecha)
                && ctrlCurp.getColor(txt_curp) && ctrlSalrio.getColor(txt_salario)) {

                if (txt_segundo_nombre.getText().equals("")) {
                    System.out.println("Segundo Nombre Vacio");
                } else {
                    if (!ctrlSegundoNombre.estaVacio(txt_segundo_nombre)) {
                        if (!ctrlSegundoNombre.getColor(txt_segundo_nombre)) {
                            JOptionPane.showMessageDialog(null, "Verifique Los Datos", "Datos Incorrectos",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }
                }

                salario = Integer.parseInt(txt_salario.getText());
                gestionEmpleados.asignarDatos(no_empleado, primer_nom, segundo_nom, apellido_pat,
                    apellido_mat, curp, grado_estudios, salario, dia_nac, mes_nac, año_nac);
                gestionEmpleados.actualizar();
                JOptionPane.showMessageDialog(null, "Datos Del Alumno Actualizado", "Actualizado...",
                    JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
                deshabilitarComponentes();
                correcto = 0;
                modelo.setRowCount(0);
            } else {
                JOptionPane.showMessageDialog(null, "Verifique Los Datos", "Datos Incorrectos",
                    JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Ingrese Los Datos Solicitados", "Advertencia!",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
        control.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void combo_estudiosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_estudiosItemStateChanged
      
    }//GEN-LAST:event_combo_estudiosItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        control.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public void limpiarCampos() {
        txt_no_empleado.setText("");
        txt_primer_nombre.setText("");
        txt_segundo_nombre.setText("");
        txt_apell_paterno.setText("");
        txt_apell_materno.setText("");
        txt_curp.setText("");
        txt_salario.setText("");
        fecha_nacimiento.setDate(null);
    }

    public void habilitarComponentes() {
        txt_primer_nombre.setEditable(true);
        txt_segundo_nombre.setEditable(true);
        txt_apell_paterno.setEditable(true);
        txt_apell_materno.setEditable(true);
        txt_curp.setEditable(true);
        txt_salario.setEditable(true);

        fecha_nacimiento.setEnabled(true);
        combo_estudios.setEnabled(true);
    }

    public void deshabilitarComponentes() {
        txt_primer_nombre.setEditable(false);
        txt_segundo_nombre.setEditable(false);
        txt_apell_paterno.setEditable(false);
        txt_apell_materno.setEditable(false);
        txt_curp.setEditable(false);
        txt_salario.setEditable(false);

        fecha_nacimiento.setEnabled(false);
        combo_estudios.setEnabled(false);
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
//            java.util.logging.Logger.getLogger(GestionDeEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GestionDeEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GestionDeEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GestionDeEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GestionDeEmpleados().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> combo_estudios;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_empleados;
    private javax.swing.JTextField txt_apell_materno;
    private javax.swing.JTextField txt_apell_paterno;
    private javax.swing.JTextField txt_curp;
    private javax.swing.JTextField txt_no_empleado;
    private javax.swing.JTextField txt_primer_nombre;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_segundo_nombre;
    // End of variables declaration//GEN-END:variables
}
