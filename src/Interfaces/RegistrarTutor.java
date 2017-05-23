package Interfaces;

import Controladores.ManejadorRegistrarTutor;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author jose_
 */
public class RegistrarTutor extends javax.swing.JFrame {

    ImageIcon img;
    ImageIcon icon;
    String no_tutor, primer_nom, segundo_nom, apellido_pat, 
            apellido_mat, curp, telefono, email, parentesco, ocupacion;
    int dia_nac, mes_nac, año_nac;
    ManejadorRegistrarTutor registrartutor;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public RegistrarTutor() {
        initComponents();
        this.setTitle("Registrar Tutor");
        this.setLocationRelativeTo(null);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/registrar.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_registrar.getWidth(), btn_registrar.getHeight(), Image.SCALE_DEFAULT));
        btn_registrar.setIcon(icon);
        
        img = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
        icon = new ImageIcon(img.getImage().getScaledInstance(btn_salir.getWidth(), btn_salir.getHeight(), Image.SCALE_DEFAULT));
        btn_salir.setIcon(icon);
        
        txt_primer_nombre.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_primer_nombre.setBackground(Color.green);
                }else{
                    txt_primer_nombre.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_primer_nombre.setBackground(Color.green);
                }else{
                    txt_primer_nombre.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_primer_nombre.setBackground(Color.green);
                }else{
                    txt_primer_nombre.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_primer_nombre.getText();
                return texto.matches("[a-zñA-ZÑ]{3,30}");
            }
        });
        txt_segundo_nombre.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_segundo_nombre.setBackground(Color.green);
                }else{
                    txt_segundo_nombre.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_segundo_nombre.setBackground(Color.green);
                }else{
                    txt_segundo_nombre.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_segundo_nombre.setBackground(Color.green);
                }else{
                    txt_segundo_nombre.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_segundo_nombre.getText();
                return texto.matches("[a-zñA-ZÑ ]{3,30}|");
            }
        });
        txt_apell_paterno.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_apell_paterno.setBackground(Color.green);
                }else{
                    txt_apell_paterno.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_apell_paterno.setBackground(Color.green);
                }else{
                    txt_apell_paterno.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_apell_paterno.setBackground(Color.green);
                }else{
                    txt_apell_paterno.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_apell_paterno.getText();
                return texto.matches("[a-zñA-ZÑ ]{4,50}");
            }
        });
        txt_apell_materno.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_apell_materno.setBackground(Color.green);
                }else{
                    txt_apell_materno.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_apell_materno.setBackground(Color.green);
                }else{
                    txt_apell_materno.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_apell_materno.setBackground(Color.green);
                }else{
                    txt_apell_materno.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_apell_materno.getText();
                return texto.matches("[a-zñA-ZÑ ]{4,50}");
            }
        });
        txt_curp.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_curp.setBackground(Color.green);
                }else{
                    txt_curp.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_curp.setBackground(Color.green);
                }else{
                    txt_curp.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_curp.setBackground(Color.green);
                }else{
                    txt_curp.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_curp.getText();
                return texto.matches("[A-Z]{4}[0-9]{6}[HM][A-Z]{2}[A-Z0-9]{5}");
            }
        });
        txt_telefono.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_telefono.setBackground(Color.green);
                }else{
                    txt_telefono.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_telefono.setBackground(Color.green);
                }else{
                    txt_telefono.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_telefono.setBackground(Color.green);
                }else{
                    txt_telefono.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_telefono.getText();
                return texto.matches("[0-9]{10}");
            }
        });
        txt_Email.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_Email.setBackground(Color.green);
                }else{
                    txt_Email.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_Email.setBackground(Color.green);
                }else{
                    txt_Email.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_Email.setBackground(Color.green);
                }else{
                    txt_Email.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_Email.getText();
                return texto.matches("[a-zA-Z._]+@[a-zA-Z]+.([Cc][Oo][Mm]|[Oo][Rr][Gg]|[Nn][Ee][Tt]|([Cc][Oo][Mm].[a-zA-Z]))");
            }
        });
        txt_parentezco.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_parentezco.setBackground(Color.green);
                }else{
                    txt_parentezco.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_parentezco.setBackground(Color.green);
                }else{
                    txt_parentezco.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_parentezco.setBackground(Color.green);
                }else{
                    txt_parentezco.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_parentezco.getText();
                return texto.matches("[a-zñA-ZÑ ]+");
            }
        });
        txt_ocupacion.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_ocupacion.setBackground(Color.green);
                }else{
                    txt_ocupacion.setBackground(Color.red);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_ocupacion.setBackground(Color.green);
                }else{
                    txt_ocupacion.setBackground(Color.red);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(verificar()){
                    txt_ocupacion.setBackground(Color.green);
                }else{
                    txt_ocupacion.setBackground(Color.red);
                }
            }
            
            public boolean verificar(){
                String texto = txt_ocupacion.getText();
                return texto.matches("[a-zñA-ZÑ ]+");
            }
        });
        JTextFieldDateEditor editor = (JTextFieldDateEditor) fecha_nacimiento.getDateEditor();
        editor.setEnabled(false);
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
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        txt_ocupacion = new javax.swing.JTextField();
        txt_parentezco = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_no_tutor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        txt_apell_paterno.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_primer_nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_segundo_nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_apell_materno.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_curp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel9.setText("CURP:");

        fecha_nacimiento.setDateFormatString("dd/M/yyyy");

        jLabel13.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel13.setText("Telefono:");

        jLabel14.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel14.setText("Parentezco:");

        jLabel15.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel15.setText("E-mail:");

        jLabel16.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel16.setText("Ocupación:");

        txt_Email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_ocupacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_parentezco.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

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

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel1.setText("No. De Tutor:");

        txt_no_tutor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(txt_no_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_no_tutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(177, 91, 6))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel10.setText("Registrar");

        jLabel12.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel12.setText("Salir");

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar.png"))); // NOI18N
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(30, 30, 30))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)))
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

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
//        txt_no_tutor.getBackground().equals(Color.green) && 
        if(txt_primer_nombre.getBackground().equals(Color.green) && txt_segundo_nombre.getBackground().equals(Color.green)
                && txt_apell_paterno.getBackground().equals(Color.green) && txt_apell_materno.getBackground().equals(Color.green) && txt_curp.getBackground().equals(Color.green)
                && txt_telefono.getBackground().equals(Color.green) && txt_Email.getBackground().equals(Color.green) && txt_parentezco.getBackground().equals(Color.green)
                && txt_ocupacion.getBackground().equals(Color.green) && fecha_nacimiento.getDate() != null){
            no_tutor = txt_no_tutor.getText();
            primer_nom = txt_primer_nombre.getText();
            segundo_nom = txt_segundo_nombre.getText();
            apellido_pat = txt_apell_paterno.getText();
            apellido_mat = txt_apell_materno.getText();
            curp = txt_curp.getText();
            telefono = txt_telefono.getText();
            email = txt_Email.getText();
            parentesco = txt_parentezco.getText();
            ocupacion = txt_ocupacion.getText();
            String fecha[] = new SimpleDateFormat("dd/M/yyyy").format(fecha_nacimiento.getCalendar().getTime()).split("/");
            dia_nac = Integer.parseInt(fecha[0]);
            mes_nac = Integer.parseInt(fecha[1]);
            año_nac = Integer.parseInt(fecha[2]);

            registrartutor = new ManejadorRegistrarTutor(no_tutor, primer_nom, segundo_nom, apellido_pat, apellido_mat, curp, telefono, email, parentesco, ocupacion, dia_nac, mes_nac, año_nac);
            registrartutor.Registrar();
        }else{
            String error = "El o los siguientes campos con incorrecto o estan vacios";
            if(!txt_no_tutor.getBackground().equals(Color.green)){
                error += "\nNumero de tutor";
            } 
            if(!txt_primer_nombre.getBackground().equals(Color.green)){
                error += "\nPrimer Nombre";
            }
            if(!txt_segundo_nombre.getBackground().equals(Color.green)){
                error += "\nSegundo Nombre";
            }
            if(!txt_apell_paterno.getBackground().equals(Color.green)){
                error += "\nApellido Paterno";
            }
            if(!txt_apell_materno.getBackground().equals(Color.green)){
                error += "\nApellido Materno";
            }
            if(!txt_curp.getBackground().equals(Color.green)){
                error += "\nCURP";
            }
            if(!txt_telefono.getBackground().equals(Color.green)){
                error += "\nNumero Telefonico";
            }
            if(!txt_Email.getBackground().equals(Color.green)){
                error += "\nCorreo Electronico";
            }
            if(!txt_parentezco.getBackground().equals(Color.green)){
                error += "\nParentesco";
            }
            if(!txt_ocupacion.getBackground().equals(Color.green)){
                error += "\nOcupacion";
            }
            if(fecha_nacimiento.getDate() == null){                
                error += "\nFecha de Nacimineto";
            }
            JOptionPane.showMessageDialog(null, error);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarTutor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private com.toedter.calendar.JDateChooser fecha_nacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
