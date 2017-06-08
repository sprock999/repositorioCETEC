package Interfaces;

import Controladores.ControladorGrafico;
import Controladores.ManejadorGestionDeTutor;
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

/**
 *
 * @author jose_
 */
public class GestionDeTutor extends javax.swing.JFrame {

    ManejadorGestionDeTutor gestionTutor;
    DefaultTableModel modelo;

    ControladorGrafico ctrlNoTutor, ctrlPrimerNombre, ctrlSegundoNombre, ctrlApellPaterno,
            ctrlApellMaterno, ctrlFechaNac, ctrlCurp, ctrlTelefono, ctrlEmail, ctrlParentezco, ctrlOcupacion;

    JTextFieldDateEditor editorFecha;

    String no_tutor, primer_nom, segundo_nom, apellido_pat,
            apellido_mat, curp, telefono, e_mail, parectezco, ocupacion;
    int dia_nac, mes_nac, año_nac;

    int correcto = 0;

    ImageIcon img;
    ImageIcon icon;
    private final JFrame control;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public GestionDeTutor(JFrame ventana) {
        initComponents();
        this.setTitle("Gestion De Tutor");
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

        img = new ImageIcon(getClass().getResource("/Imagenes/modificar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_modificar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/eliminar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_eliminar.setIcon(icon);

        img = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        btn_salir.setIcon(icon);

        modelo = (DefaultTableModel) tabla_tutor.getModel();
        gestionTutor = new ManejadorGestionDeTutor();

        editorFecha = (JTextFieldDateEditor) fecha_nacimiento.getDateEditor();
        editorFecha.setEditable(false);

        String regexCurp = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}" + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" + "[HM]{1}"
                + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
                + "[B-DF-HJ-NP-TV-Z]{3}" + "[0-9A-Z]{1}[0-9]{1}$";

        ctrlNoTutor = new ControladorGrafico();
        ctrlPrimerNombre = new ControladorGrafico();
        ctrlSegundoNombre = new ControladorGrafico();
        ctrlApellPaterno = new ControladorGrafico();
        ctrlApellMaterno = new ControladorGrafico();
        ctrlFechaNac = new ControladorGrafico();
        ctrlCurp = new ControladorGrafico();
        ctrlTelefono = new ControladorGrafico();
        ctrlEmail = new ControladorGrafico();
        ctrlParentezco = new ControladorGrafico();
        ctrlOcupacion = new ControladorGrafico();

        ctrlNoTutor.getDocument(txt_no_tutor, "\\d+");
        ctrlPrimerNombre.getDocument(txt_primer_nombre, "[a-zA-Z]+");
        ctrlSegundoNombre.getDocument(txt_segundo_nombre, "[a-zA-Z]+");
        ctrlApellPaterno.getDocument(txt_apell_paterno, "[a-zA-Z]+");
        ctrlApellMaterno.getDocument(txt_apell_materno, "[a-zA-Z]+");
        ctrlFechaNac.getDocument(editorFecha, "\\d{1,2}/\\d{1,2}/\\d{4}");
        ctrlCurp.getDocument(txt_curp, regexCurp);
        ctrlTelefono.getDocument(txt_telefono, "\\d{10}");
        ctrlEmail.getDocument(txt_Email, "^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        ctrlParentezco.getDocument(txt_parentezco, "[a-zA-Z]+");
        ctrlOcupacion.getDocument(txt_ocupacion, "[a-zA-Z]+");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_no_tutor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_tutor = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        txt_ocupacion = new javax.swing.JTextField();
        txt_parentezco = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_modificar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Tutor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel1.setText("No. De tutor: ");

        txt_no_tutor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        tabla_tutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Tutor", "Nombre(s)", "Apellido Paterno", "Apellido Materno", "Telefono", "E-mail", "Ocupacion"
            }
        ));
        tabla_tutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_tutorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_tutor);

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
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_no_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_no_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        jLabel13.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel13.setText("Telefono:");

        jLabel14.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel14.setText("Parentezco:");

        jLabel15.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel15.setText("E-mail:");

        jLabel16.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel16.setText("Ocupación:");

        txt_Email.setEditable(false);
        txt_Email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_ocupacion.setEditable(false);
        txt_ocupacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_parentezco.setEditable(false);
        txt_parentezco.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_telefono.setEditable(false);
        txt_telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                            .addComponent(fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_apell_paterno, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_primer_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_parentezco, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_apell_materno)
                            .addComponent(txt_segundo_nombre)
                            .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txt_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_parentezco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        String dato = txt_no_tutor.getText();

        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese El No. De Tutor", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = gestionTutor.getTutor(modelo, dato);
        if (model.getRowCount() < 1) {
            deshabilitarComonentes();
            limpiarCampos();
            correcto = 0;
            JOptionPane.showMessageDialog(null, "Tutor No Encontrado", "No Encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            tabla_tutor.setModel(model);
            correcto = 2;
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tabla_tutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_tutorMouseClicked

        Point point = evt.getPoint();
        int row = tabla_tutor.rowAtPoint(point);
        int column = tabla_tutor.columnAtPoint(point);
        TableModel model = tabla_tutor.getModel();
        //JOptionPane.showMessageDialog(this, model.getValueAt(row, column));

        //modificarAlumno.getDatos();
        String[] datos = gestionTutor.getDatos(model.getValueAt(row, 0).toString());

        if (datos[0] == null) {
            JOptionPane.showMessageDialog(null, "Tutor No Encontrado", "No Encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
            correcto = 2;
        } else {
            habilitarComonentes();

            txt_curp.setText(datos[0]);
            txt_telefono.setText(datos[1]);
            txt_Email.setText(datos[2]);
            txt_parentezco.setText(datos[3]);
            txt_ocupacion.setText(datos[4]);
            txt_primer_nombre.setText(datos[5]);
            txt_segundo_nombre.setText(datos[6]);
            txt_apell_paterno.setText(datos[7]);
            txt_apell_materno.setText(datos[8]);

            try {
                String dato = datos[9] + "-" + datos[10] + "-" + datos[11];
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                Date fechaDate = formato.parse(dato);
                //Date time = new Date(fecha);
                fecha_nacimiento.setDate(fechaDate);

                correcto = 1;
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_tabla_tutorMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (correcto == 0) {
            JOptionPane.showMessageDialog(null, "Busque Un Tutor", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            if (correcto == 2) {
                JOptionPane.showMessageDialog(null, "Seleccione Un Tutor", "Advertencia!",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        no_tutor = txt_no_tutor.getText();
        primer_nom = txt_primer_nombre.getText();
        segundo_nom = txt_segundo_nombre.getText();
        apellido_pat = txt_apell_paterno.getText();
        apellido_mat = txt_apell_materno.getText();
        curp = txt_curp.getText();
        telefono = txt_telefono.getText();
        e_mail = txt_Email.getText();
        parectezco = txt_parentezco.getText();
        ocupacion = txt_ocupacion.getText();

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
                    && ctrlCurp.getColor(txt_curp) && ctrlTelefono.getColor(txt_telefono) 
                    && ctrlEmail.getColor(txt_Email) && ctrlParentezco.getColor(txt_parentezco) 
                    && ctrlOcupacion.getColor(txt_ocupacion)) {

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

                gestionTutor.asignarDatos(no_tutor, primer_nom, segundo_nom, apellido_pat, apellido_mat, curp,
                        telefono, e_mail, parectezco, ocupacion, dia_nac, mes_nac, año_nac);
                gestionTutor.actualizar();
                JOptionPane.showMessageDialog(null, "Datos Del Tutor Actualizados", "Actualizado...",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
                deshabilitarComonentes();
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

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        modelo.setRowCount(0);
        String campoDato = txt_no_tutor.getText();
        if (campoDato.equals("")) {
            JOptionPane.showMessageDialog(null, "Busque Un Tutor", "Advertencia!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DefaultTableModel model = gestionTutor.getTutor(modelo, campoDato);
        if (model.getRowCount() < 1) {
            deshabilitarComonentes();
            limpiarCampos();
            correcto = 0;
            JOptionPane.showMessageDialog(null, "Tuto No Encontrado", "No Encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            tabla_tutor.setModel(model);
            correcto = 2;
        }
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta Seguro De Eliminar Al Empleado?", "Alerta!",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resp == 0) {
            if (gestionTutor.eliminarTutor(campoDato)) {
                limpiarCampos();
                modelo.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Empleado Eliminado", "eliminado...",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
        control.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        control.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public void limpiarCampos() {
        txt_no_tutor.setText("");
        txt_primer_nombre.setText("");
        txt_segundo_nombre.setText("");
        txt_apell_paterno.setText("");
        txt_apell_materno.setText("");
        txt_curp.setText("");
        txt_telefono.setText("");
        txt_Email.setText("");
        txt_parentezco.setText("");
        txt_ocupacion.setText("");
        fecha_nacimiento.setDate(null);
    }

    public void habilitarComonentes() {
        txt_primer_nombre.setEditable(true);
        txt_segundo_nombre.setEditable(true);
        txt_apell_paterno.setEditable(true);
        txt_apell_materno.setEditable(true);
        txt_curp.setEditable(true);
        txt_telefono.setEditable(true);
        txt_Email.setEditable(true);
        txt_parentezco.setEditable(true);
        txt_ocupacion.setEditable(true);

        fecha_nacimiento.setEnabled(true);
    }

    public void deshabilitarComonentes() {
        txt_primer_nombre.setEditable(false);
        txt_segundo_nombre.setEditable(false);
        txt_apell_paterno.setEditable(false);
        txt_apell_materno.setEditable(false);
        txt_curp.setEditable(false);
        txt_telefono.setEditable(false);
        txt_Email.setEditable(false);
        txt_parentezco.setEditable(false);
        txt_ocupacion.setEditable(false);

        fecha_nacimiento.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_tutor;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_apell_materno;
    private javax.swing.JTextField txt_apell_paterno;
    private javax.swing.JTextField txt_curp;
    private javax.swing.JTextField txt_no_tutor;
    private javax.swing.JTextField txt_ocupacion;
    private javax.swing.JTextField txt_parentezco;
    private javax.swing.JTextField txt_primer_nombre;
    private javax.swing.JTextField txt_segundo_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
