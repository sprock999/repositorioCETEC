package Interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;
import Controladores.Conexion;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Controladores.ControladorGrafico;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JFrame;

/**
 *
 * @author jose_
 */
public class AperturaDeHorarios extends javax.swing.JFrame {

    ImageIcon img;
    ImageIcon icon;
    Conexion conexion;
    private final JFrame control;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public AperturaDeHorarios(JFrame ventana) {
        initComponents();
        this.setTitle("Apertura De Horarios");
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
        conexion = new Conexion();
        conexion.conectar();

        crearNoHorario();

        JTextFieldDateEditor editor = (JTextFieldDateEditor) fecha_inicio.getDateEditor();
        editor.setEditable(false);

        new ControladorGrafico().getDocument(txt_no_alumnos, "[1-9]|([1-2]\\d)|30");
        new ControladorGrafico().getDocument(txt_no_profesor, "\\d+");
    }

    public void validar(JTextField jt) {
        if (!jt.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos", "ERROR", JOptionPane.ERROR_MESSAGE);
            jt.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        txt_no_horario = new javax.swing.JTextField();
        txt_no_profesor = new javax.swing.JTextField();
        fecha_inicio = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        combo_hora_entrada = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_hora_salida = new javax.swing.JComboBox<>();
        txt_no_alumnos = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Del Harario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel1.setText("No. De Horario: ");

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel2.setText("Fecha De Inicio: ");

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel3.setText("Hora De Entrada:");

        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_no_horario.setEditable(false);
        txt_no_horario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_no_profesor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        fecha_inicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fecha_inicioPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel5.setText("No. de Profesor:");

        combo_hora_entrada.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel4.setText("Hora De Salida:");

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 14)); // NOI18N
        jLabel6.setText("No. De Alumnos:");

        combo_hora_salida.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        txt_no_alumnos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Matutino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Vespertino");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_no_horario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_hora_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_no_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combo_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_no_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_no_horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_hora_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(combo_hora_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_no_profesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_no_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Impact", 0, 20), new java.awt.Color(177, 91, 6))); // NOI18N

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

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
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String dato = txt_no_profesor.getText();
        if (dato.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese El No. De Profesor", "Campo Vacio",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (!buscarProfesor(dato)) {
            txt_no_profesor.setText("");
            JOptionPane.showMessageDialog(null, "Profesor No Encontrado", "No encontrado!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    public boolean buscarProfesor(String noProfesor) {
        String salida = "";
        String consulta = "SELECT * FROM profesor "
                + "WHERE No_Profesor = '" + noProfesor + "' && Estado = 1;";
        ResultSet res = conexion.consultar(consulta);
        try {
            while (res.next()) {
                salida = res.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
        if (salida.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        conexion.cerrarConexion();
        this.dispose();
        control.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        try {
            if (combo_hora_entrada.getSelectedItem().toString().equals(combo_hora_salida.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, "Error al seleccionar hora de apertura o de salida", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (Integer.parseInt(combo_hora_entrada.getSelectedItem().toString().replace(":00", "")) > Integer.parseInt(combo_hora_salida.getSelectedItem().toString().replace(":00", ""))) {
                JOptionPane.showMessageDialog(null, "Error al seleccionar hora de apertura o de salida", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                if (new ControladorGrafico().getColor(txt_no_alumnos) && new ControladorGrafico().getColor(txt_no_profesor)) {
                    try {
                        if (buscarProfesor(txt_no_profesor.getText())) {
                            String no_horario = txt_no_horario.getText();
                            String hora_entrada = combo_hora_entrada.getSelectedItem().toString();
                            String hora_salida = combo_hora_salida.getSelectedItem().toString();
                            String no_empleado = txt_no_profesor.getText();
                            int total_alumnos = Integer.parseInt(txt_no_alumnos.getText());
                            int cupo_alumnos = 30;
                            //int estado = 1;
                            conexion.ejecutar("INSERT INTO horario values ('" + no_horario + "','" + hora_entrada + "','" + hora_salida + "','" + no_empleado + "'," + total_alumnos + "," + cupo_alumnos + ")");
                            JOptionPane.showMessageDialog(null, "Horario Agregado exitosamente", "OK", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            crearNoHorario();
                        } else {
                            txt_no_profesor.setText("");
                            JOptionPane.showMessageDialog(null, "Profesor No Encontrado", "No encontrado!",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                } else {
                    System.out.println("algo salio mal");
                }
            }
        } catch (Exception es) {
            JOptionPane.showMessageDialog(null, "Verifique Los Datos", "Advertencia...", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        control.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        System.out.println("matutino");
        try {
            llenarMatutino(fecha_inicio.getCalendar().get(Calendar.DAY_OF_WEEK));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        System.out.println("vespertino");
        try {
            llenarVespertino(fecha_inicio.getCalendar().get(Calendar.DAY_OF_WEEK));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void fecha_inicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fecha_inicioPropertyChange
        try {
            System.out.println(fecha_inicio.getCalendar().get(Calendar.DAY_OF_WEEK));
            llenarMatutino(fecha_inicio.getCalendar().get(Calendar.DAY_OF_WEEK));
            jRadioButton1.setSelected(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_fecha_inicioPropertyChange

    public void limpiar() {
        txt_no_alumnos.setText("");
        txt_no_horario.setText("");
        txt_no_profesor.setText("");
    }

    public void crearNoHorario() {
        int numero;
        String salida = "";
        ResultSet res = conexion.consultar("select No_Horario from horario");

        try {
            while (res.next()) {
                salida = res.getString(1);
            }
            numero = Integer.parseInt(salida) + 1;
            txt_no_horario.setText(Integer.toString(numero));
        } catch (Exception e) {
            txt_no_horario.setText("1");
            System.out.println("Error: " + e);
        }
    }

    public void llenarMatutino(int dia) {
        if (dia == 7) {
            System.out.println("Sabado");
            combo_hora_entrada.removeAllItems();
            combo_hora_salida.removeAllItems();
            combo_hora_entrada.addItem("8:00");
            combo_hora_entrada.addItem("12:00");
            combo_hora_entrada.addItem("16:00");
            combo_hora_salida.addItem("12:00");
            combo_hora_salida.addItem("16:00");
            combo_hora_salida.addItem("20:00");
        } else if (dia == 1) {
            System.out.println("domingo");
            combo_hora_entrada.removeAllItems();
            combo_hora_salida.removeAllItems();
            combo_hora_entrada.addItem("8:00");
            combo_hora_entrada.addItem("12:00");
            combo_hora_salida.addItem("12:00");
            combo_hora_salida.addItem("16:00");
        } else {
            combo_hora_entrada.removeAllItems();
            combo_hora_salida.removeAllItems();
            for (int i = 8; i <= 11; i++) {
                combo_hora_entrada.addItem(i + ":00");
            }
            for (int i = 9; i <= 12; i++) {
                combo_hora_salida.addItem(i + ":00");
            }
        }
    }

    public void llenarVespertino(int dia) {
        if (dia == 7) {
            System.out.println("Sabado");
            combo_hora_entrada.removeAllItems();
            combo_hora_salida.removeAllItems();
            combo_hora_entrada.addItem("8:00");
            combo_hora_entrada.addItem("12:00");
            combo_hora_entrada.addItem("16:00");
            combo_hora_salida.addItem("12:00");
            combo_hora_salida.addItem("16:00");
            combo_hora_salida.addItem("20:00");
        } else if (dia == 1) {
            System.out.println("domingo");
            combo_hora_entrada.removeAllItems();
            combo_hora_salida.removeAllItems();
            combo_hora_entrada.addItem("8:00");
            combo_hora_entrada.addItem("12:00");
            combo_hora_salida.addItem("12:00");
            combo_hora_salida.addItem("16:00");
        } else {
            combo_hora_entrada.removeAllItems();
            combo_hora_salida.removeAllItems();
            for (int i = 16; i <= 19; i++) {
                combo_hora_entrada.addItem(i + ":00");
            }
            for (int i = 17; i <= 20; i++) {
                combo_hora_salida.addItem(i + ":00");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combo_hora_entrada;
    private javax.swing.JComboBox<String> combo_hora_salida;
    private com.toedter.calendar.JDateChooser fecha_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txt_no_alumnos;
    private javax.swing.JTextField txt_no_horario;
    private javax.swing.JTextField txt_no_profesor;
    // End of variables declaration//GEN-END:variables
}
