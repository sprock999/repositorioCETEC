package Controladores;

import Entidades.Persona;
import Entidades.Tutor;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public class ManejadorGestionDeTutor {

    Conexion baseDatos = new Conexion().conectar();

    String no_tutor, primer_nom, segundo_nom, apellido_pat,
            apellido_mat, curp, telefono, e_mail, parectezco, ocupacion;
    int dia_nac, mes_nac, año_nac;

    public void asignarDatos(String primer_nom, String segundo_nom,
            String apellido_pat, String apellido_mat, String curp, String telefono,
            String e_mail, String parectezco, String ocupacion, int dia_nac, int mes_nac, int año_nac) {
        this.primer_nom = primer_nom;
        this.segundo_nom = segundo_nom;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.curp = curp;
        this.telefono = telefono;
        this.e_mail = e_mail;
        this.parectezco = parectezco;
        this.ocupacion = ocupacion;
        this.dia_nac = dia_nac;
        this.mes_nac = mes_nac;
        this.año_nac = año_nac;
        
    }

    public DefaultTableModel getTutor(DefaultTableModel modelo) {
        String consulta = "SELECT No_Tutor, Primer_Nom, Apellido_P, Apellido_M, Telefono, Email, Ocupacion "
                + " FROM tutor INNER JOIN persona on tutor.CURP = persona.CURP "
                + " WHERE tutor.No_Tutor = '" + getNo_tutor() + "';";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getString(7));
                modelo.addRow(v);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return modelo;
    }

    public String[] getDatos(){
        String[] salida = new String[12];
        String consulta = "SELECT * "
                + " FROM tutor INNER JOIN persona on tutor.CURP = persona.CURP "
                + " WHERE tutor.No_Tutor = '" + getNo_tutor() + "';";
        
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                salida[0] = res.getString(2);
                salida[1] = res.getString(3);
                salida[2] = res.getString(4);
                salida[3] = res.getString(5);
                salida[4] = res.getString(6);
                salida[5] = res.getString(9);
                salida[6] = res.getString(10);
                salida[7] = res.getString(11);
                salida[8] = res.getString(12);
                salida[9] = Integer.toString(res.getInt(13));
                salida[10] = Integer.toString(res.getInt(14));
                salida[11] = Integer.toString(res.getInt(15));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return salida;
    }
    
    public void actualizar(){
        try{
            String sentenciaPer = "", sentenciaTut = "";
            
            Persona persona = new Persona(curp, primer_nom, segundo_nom, apellido_pat,
                    apellido_mat, dia_nac, mes_nac, año_nac);
            Tutor tutor = new Tutor(persona, no_tutor, telefono, e_mail, parectezco, ocupacion);
            
            sentenciaPer = "UPDATE persona SET "+
                    "CURP = '" + tutor.getPersona().getCURP() + "', " +
                    "Primer_Nom = '" + tutor.getPersona().getPrimer_Nom() + "', " +
                    "Segun_Nom = '" + tutor.getPersona().getSegun_Nom() + "', " +
                    "Apellido_P = '" + tutor.getPersona().getApellido_P() + "', " +
                    "Apellido_M = '" + tutor.getPersona().getApellido_M() + "', " +
                    "Dia_Nac = " + tutor.getPersona().getDia_Nac() + ", " +
                    "Mes_Nac = " + tutor.getPersona().getMes_Nac() + ", " +
                    "Año_Nac = " + tutor.getPersona().getAño_Nac() + " " +
                    "WHERE CURP = '" + tutor.getPersona().getCURP() + "' ;";
            
            sentenciaTut = "UPDATE tutor SET " +
                    "CURP = '" + tutor.getPersona().getCURP() + "', " +
                    "Telefono = '" + tutor.getTelefono()+ "', " +
                    "Email = '" + tutor.getE_mail()+ "', " +
                    "Parentesco = '" + tutor.getParentesco()+ "', " +
                    "Ocupacion = '" + tutor.getOcupacion()+ "' " +
                    "WHERE No_Tutor = '" + tutor.getNo_tutor() + "' ;";
            
            baseDatos.ejecutar(sentenciaPer);
            baseDatos.ejecutar(sentenciaTut);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public boolean eliminarTutor(String noEmpleado) {
        String sentenciaEmp = "";

//        sentenciaEmp = "DELETE a1, a2 FROM profesor AS a1 INNER JOIN persona AS a2 "
//                + "WHERE a1.CURP = a2.CURP AND a1.No_Profesor LIKE "
//                + "'" + noEmpleado + "';";

          sentenciaEmp = "UPDATE tutor SET Estado = 0 WHERE "
                + "No_Tutor = '" + noEmpleado + "';";

        baseDatos.ejecutar(sentenciaEmp);
        return true;
    }
    
    public String getNo_tutor() {
        return no_tutor;
    }

    public void setNo_tutor(String no_tutor) {
        this.no_tutor = no_tutor;
    }

}
