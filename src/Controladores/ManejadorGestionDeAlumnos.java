
package Controladores;

import Entidades.Alumno;
import Entidades.Persona;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public class ManejadorGestionDeAlumnos {
    
    Conexion baseDatos = new Conexion().conectar();
   
    String no_control, no_tutor, primer_nom, segundo_nom, apellido_pat, 
            apellido_mat, curp;
    int dia_nac, mes_nac, año_nac; 

    public void AsignarDatos(String no_tutor, String primer_nom,
            String segundo_nom, String apellido_pat, String apellido_mat, String curp, 
            int dia_nac, int mes_nac, int año_nac) {
        this.no_tutor = no_tutor;
        this.primer_nom = primer_nom;
        this.segundo_nom = segundo_nom;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.curp = curp;
        this.dia_nac = dia_nac;
        this.mes_nac = mes_nac;
        this.año_nac = año_nac;
    }
    
    public DefaultTableModel getAlumno(DefaultTableModel modelo, String no_control) {
        String consulta = "SELECT No_Control, Primer_Nom, Apellido_P, Apellido_M, No_Tutor "
                + " FROM alumno INNER JOIN persona on alumno.CURP = persona.CURP " 
                + " WHERE alumno.No_Control = '" + no_control + "' && Estado = 1;";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getInt(5));
                modelo.addRow(v);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return modelo;
    }
    
    public DefaultTableModel getAlumnos(DefaultTableModel modelo) {
        String consulta = "SELECT No_Control, Primer_Nom, Apellido_P, Apellido_M, No_Tutor "
                + " FROM alumno INNER JOIN persona on alumno.CURP = persona.CURP " 
                + " WHERE Estado = 1;";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getInt(5));
                modelo.addRow(v);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return modelo;
    }
    
    public String[] getDatos(String no_control){
        String[] salida = new String[9];
        String consulta = "SELECT * " 
                + " FROM alumno INNER JOIN persona ON alumno.CURP = persona.CURP " 
                + " WHERE alumno.No_Control = '" + no_control + "' && Estado = 1;";
        
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                salida[0] = res.getString(2);
                salida[1] = res.getString(3);
                salida[2] = res.getString(6);
                salida[3] = res.getString(7);
                salida[4] = res.getString(8);
                salida[5] = res.getString(9);
                salida[6] = Integer.toString(res.getInt(10));
                salida[7] = Integer.toString(res.getInt(11));
                salida[8] = Integer.toString(res.getInt(12));
            }
            for (int i = 0; i < salida.length; i++) {
                System.out.println(salida[i] );
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return salida;
    }
    
    public boolean buscarTutor(String noTutor) {
        String salida = "";
        String consulta = "SELECT * FROM tutor "
                + "WHERE No_tutor = '" + noTutor + "' && Estado = 1;";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                salida = res.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
             return  false;
        }
        if (salida.equals("")) {
            return  false;
        }else{
            return true;
        }
    }
    
     public void actualizar(){
        try{
            String sentenciaPer = "", sentenciaAlum = "";
            
            Persona persona = new Persona(curp, primer_nom, segundo_nom, apellido_pat,
                    apellido_mat, dia_nac, mes_nac, año_nac);
            Alumno alumno = new Alumno(persona, no_control, no_tutor);
            
            sentenciaPer = "UPDATE persona SET "+
                    "CURP = '" + alumno.getPersona().getCURP() + "', " +
                    "Primer_Nom = '" + alumno.getPersona().getPrimer_Nom() + "', " +
                    "Segun_Nom = '" + alumno.getPersona().getSegun_Nom() + "', " +
                    "Apellido_P = '" + alumno.getPersona().getApellido_P() + "', " +
                    "Apellido_M = '" + alumno.getPersona().getApellido_M() + "', " +
                    "Dia_Nac = " + alumno.getPersona().getDia_Nac() + ", " +
                    "Mes_Nac = " + alumno.getPersona().getMes_Nac() + ", " +
                    "Año_Nac = " + alumno.getPersona().getAño_Nac() + " " +
                    "WHERE CURP = '" + alumno.getPersona().getCURP() + "' ;";
            
            sentenciaAlum = "UPDATE alumno SET " +
                    "CURP = '" + alumno.getPersona().getCURP()+ "', " +
                    "No_Tutor = '" + alumno.getNo_tutor()+ "' " +
                    "WHERE No_Control = '" + alumno.getNo_control() + "' ;";
            
            baseDatos.ejecutar(sentenciaPer);
            baseDatos.ejecutar(sentenciaAlum);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
