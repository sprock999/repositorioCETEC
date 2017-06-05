package Interfaces;

import Controladores.ControladorGrafico;
import Controladores.ManejadorGestionDeAlumnos;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Image;
import java.awt.Point;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JFrame;

/**
 *
 * @author jose_
 */
public class GestionDeAlumnos extends javax.swing.JFrame {

    ManejadorGestionDeAlumnos modificarAlumno;
    ControladorGrafico ctrlNoControl, ctrlPrimerNombre, ctrlSegundoNombre, ctrlApellPaterno,
            ctrlApellMaterno, ctrlFechaNac, ctrlCurp, ctrlNoTutor;

    JTextFieldDateEditor editorFecha;
    DefaultTableModel modelo;
    JFrame control;

    String no_control, no_tutor, primer_nom, segundo_nom, apellido_pat,
            apellido_mat, curp;
    int dia_nac, mes_nac, año_nac;

    int correcto = 0;

    ImageIcon img;
    ImageIcon icon;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public GestionDeAlumnos(JFrame ventana) {
        initComponents();
        this.setTitle("Gestion De Alumnos");
        this.setLocationRelativeTo(null);
        control = ventana;

        img = new ImageIcon(getClass().getResource("/Imagenes/buscar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_buscar.getWidth(), btn_buscar.getHeight(), Image.SCALE_DEFAULT));
        btn_buscar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/buscar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_buscar_tutor.getWidth(), btn_buscar_tutor.getHeight(), Image.SCALE_DEFAULT));
        btn_buscar_tutor.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/registrar tutor.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_registrar_tutor.getWidth(), btn_registrar_tutor.getHeight(), Image.SCALE_DEFAULT));
        btn_registrar_tutor.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/modificar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_modificar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_salir.setIcon(icon);

        modelo = (DefaultTableModel) tabla_alumnos.getModel();
        modificarAlumno = new ManejadorGestionDeAlumnos();

        editorFecha = (JTextFieldDateEditor) fecha_nacimiento.getDateEditor();
        editorFecha.setEditable(false);

        String regexCurp = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}" + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" + "[HM]{1}"
                + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
                + "[B-DF-HJ-NP-TV-Z]{3}" + "[0-9A-Z]{1}[0-9]{1}$";

        ctrlNoControl = new ControladorGrafico();
        ctrlPrimerNombre = new ControladorGrafico();
        ctrlSegundoNombre = new ControladorGrafico();
        ctrlApellPaterno = new ControladorGrafico();
        ctrlApellMaterno = new ControladorGrafico();
        ctrlFechaNac = new ControladorGrafico();
        ctrlCurp = new ControladorGrafico();
        ctrlNoTutor = new ControladorGrafico();

        ctrlNoControl.getDocument(txt_no_control, "\\d+");
        ctrlPrimerNombre.getDocument(txt_primer_nombre, "[a-zA-Z]+");
        ctrlSegundoNombre.getDocument(txt_segundo_nombre, "[a-zA-Z]+");
        ctrlApellPaterno.getDocument(txt_apell_paterno, "[a-zA-Z]+");
        ctrlApellMaterno.getDocument(txt_apell_materno, "[a-zA-Z]+");
        ctrlFechaNac.getDocument(editorFecha, "\\d{1,2}/\\d{1,2}/\\d{4}");
        ctrlCurp.getDocument(txt_curp, regexCurp);
        ctrlNoTutor.getDocument(txt_no_tutor, "\\d+");
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
        txt_no_control = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_modificar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_no_tutor = new javax.swing.JTextField();
        btn_buscar_tutor = new javax.swing.JButton();
        btn_registrar_tutor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel1.setText("No. De Control: ");

        txt_no_control.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "No. Control", "Nombre(s)", "Apellido Paterno", "Apellido Materno", "Tutor"
            }
        ));
        tabla_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_alumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_alumnos);

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
                        .addComponent(txt_no_control, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txt_no_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Académicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel13.setText("No. De Tutor:");

        jLabel14.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel14.setText("Registrar Tutor:");

        txt_no_tutor.setEditable(false);
        txt_no_tutor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        btn_buscar_tutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscar_tutor.setEnabled(false);
        btn_buscar_tutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_tutorActionPerformed(evt);
            }
        });

        btn_registrar_tutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar tutor.png"))); // NOI18N
        btn_registrar_tutor.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(30, 30, 30)
                .addComponent(txt_no_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(btn_registrar_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_no_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                    .addComponent(btn_registrar_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed

        if (correcto == 0) {
            JOptionPane.showMessageDialog(null, "Busque Un Alumno", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            if (correcto == 2) {
                JOptionPane.showMessageDialog(null, "Seleccione Un Alumno", "Advertencia!",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        no_control = txt_no_control.getText();
        no_tutor = txt_no_tutor.getText();
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
                    && ctrlCurp.getColor(txt_curp) && ctrlNoTutor.getColor(txt_no_tutor)) {
                
                if (txt_segundo_nombre.getText().equals("")) {
                    System.out.println("Segundo Nombre Vacio");
                }else{
                    if (!ctrlSegundoNombre.estaVacio(txt_segundo_nombre)) {
                    if (!ctrlSegundoNombre.getColor(txt_segundo_nombre)) {
                        JOptionPane.showMessageDialog(null, "Verifique Los Datos", "Datos Incorrectos",
                                JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                }

                if (!modificarAlumno.buscarTutor(txt_no_tutor.getText())) {
                    JOptionPane.showMessageDialog(null, "Tutor No Encontrado", "No encontrado!",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                modificarAlumno.AsignarDatos(no_tutor, primer_nom, segundo_nom, apellido_pat,
                        apellido_mat, curp, dia_nac, mes_nac, año_nac);
                modificarAlumno.actualizar();
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

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        modelo.setRowCount(0);
        String dato = txt_no_control.getText();

        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese El No. De Control", "Campo Vacio",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        DefaultTableModel model = modificarAlumno.getAlumno(modelo, dato);
        if (model.getRowCount() < 1) {
            deshabilitarComponentes();
            limpiarCampos();
            correcto = 0;
            JOptionPane.showMessageDialog(null, "No Se Encontró El Alumno", "No Encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            tabla_alumnos.setModel(model);
            correcto = 2;
        }

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tabla_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_alumnosMouseClicked
        Point point = evt.getPoint();
        int row = tabla_alumnos.rowAtPoint(point);
        int column = tabla_alumnos.columnAtPoint(point);
        TableModel model = tabla_alumnos.getModel();
        //JOptionPane.showMessageDialog(this, model.getValueAt(row, column));

        //modificarAlumno.getDatos();
        String[] datos = modificarAlumno.getDatos(model.getValueAt(row, 0).toString());

        if (datos[0] == null) {
            JOptionPane.showMessageDialog(null, "Aumno No Encontrado", "No Encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
            correcto = 2;
        } else {
            habilitarComonentes();

            txt_curp.setText(datos[0]);
            txt_no_tutor.setText(datos[1]);
            txt_primer_nombre.setText(datos[2]);
            txt_segundo_nombre.setText(datos[3]);
            txt_apell_paterno.setText(datos[4]);
            txt_apell_materno.setText(datos[5]);

            try {
                String dato = datos[6] + "-" + datos[7] + "-" + datos[8];
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                Date fechaDate = formato.parse(dato);
                //Date time = new Date(fecha);
                fecha_nacimiento.setDate(fechaDate);

                correcto = 1;
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_tabla_alumnosMouseClicked

    public void limpiarCampos() {
        txt_no_control.setText("");
        txt_no_tutor.setText("");
        txt_primer_nombre.setText("");
        txt_segundo_nombre.setText("");
        txt_apell_paterno.setText("");
        txt_apell_materno.setText("");
        txt_curp.setText("");
        fecha_nacimiento.setDate(null);
    }

    public void habilitarComonentes() {
        txt_primer_nombre.setEditable(true);
        txt_segundo_nombre.setEditable(true);
        txt_apell_paterno.setEditable(true);
        txt_apell_materno.setEditable(true);
        txt_curp.setEditable(true);
        txt_no_tutor.setEditable(true);

        fecha_nacimiento.setEnabled(true);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) fecha_nacimiento.getDateEditor();
        editor.setEditable(false);
        btn_buscar_tutor.setEnabled(true);
    }

    public void deshabilitarComponentes() {
        txt_primer_nombre.setEditable(false);
        txt_segundo_nombre.setEditable(false);
        txt_apell_paterno.setEditable(false);
        txt_apell_materno.setEditable(false);
        txt_curp.setEditable(false);
        txt_no_tutor.setEditable(false);

        fecha_nacimiento.setEnabled(false);
        btn_buscar_tutor.setEnabled(false);
    }

    private void btn_buscar_tutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_tutorActionPerformed
        String dato = txt_no_tutor.getText();
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese El No. De Tutor", "Campo Vacio",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!modificarAlumno.buscarTutor(dato)) {
            txt_no_tutor.setText("");
            JOptionPane.showMessageDialog(null, "Tutor No Encontrado", "No encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscar_tutorActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        try {
            if (ctrlPrimerNombre.getColor(txt_primer_nombre)
                    && ctrlSegundoNombre.getColor(txt_segundo_nombre)
                    && ctrlApellPaterno.getColor(txt_apell_paterno)
                    && ctrlApellMaterno.getColor(txt_apell_materno)
                    && ctrlFechaNac.getColor(editorFecha)
                    && ctrlCurp.getColor(txt_curp)
                    && ctrlNoTutor.getColor(txt_no_tutor)) {
                JOptionPane.showMessageDialog(null, "Corecto");
            } else {
                JOptionPane.showMessageDialog(null, "Verifique Los Datos", "Datos Incorrectos",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese Los Datos Solicitados", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
        }

        //System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar_tutor;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_registrar_tutor;
    private javax.swing.JButton btn_salir;
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
    private javax.swing.JTable tabla_alumnos;
    private javax.swing.JTextField txt_apell_materno;
    private javax.swing.JTextField txt_apell_paterno;
    private javax.swing.JTextField txt_curp;
    private javax.swing.JTextField txt_no_control;
    private javax.swing.JTextField txt_no_tutor;
    private javax.swing.JTextField txt_primer_nombre;
    private javax.swing.JTextField txt_segundo_nombre;
    // End of variables declaration//GEN-END:variables
}
