
package Controladores;

import Entidades.Persona;
import Entidades.Profesor;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public class ManejadorGestionDeEmpleados {
    Conexion baseDatos = new Conexion().conectar();
   
    String no_empleado, primer_nom, segundo_nom, apellido_pat, 
            apellido_mat, curp, grado_estudios;
    int salario, dia_nac, mes_nac, año_nac; 

    public void asignarDatos(String no_empleado, String primer_nom, String segundo_nom, 
            String apellido_pat, String apellido_mat, String curp, String grado_estudios, 
            int salario, int dia_nac, int mes_nac, int año_nac) {
        this.no_empleado = no_empleado;
        this.primer_nom = primer_nom;
        this.segundo_nom = segundo_nom;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.curp = curp;
        this.grado_estudios = grado_estudios;
        this.salario = salario;
        this.dia_nac = dia_nac;
        this.mes_nac = mes_nac;
        this.año_nac = año_nac;
    }
    
    public DefaultTableModel getEmpleado(DefaultTableModel modelo, String no_empleado) {
        String consulta = "SELECT No_Profesor, Primer_Nom, Apellido_P, Apellido_M, Grado_Estudios, Salario "
                + " FROM profesor INNER JOIN persona on profesor.CURP = persona.CURP " 
                + " WHERE profesor.No_Profesor = '" + no_empleado + "' && Estado = 1;";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getInt(6));
                modelo.addRow(v);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return modelo;
    }

    public String[] getDatos(String no_empleado){
        String[] salida = new String[10];
        String consulta = "SELECT *" 
                + " FROM profesor INNER JOIN persona ON profesor.CURP = persona.CURP " 
                + " WHERE profesor.No_Profesor = '" + no_empleado + "' && Estado = 1;";
        
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                salida[0] = res.getString(2);
                salida[1] = res.getString(3);
                salida[2] = Integer.toString(res.getInt(4));
                salida[3] = res.getString(7);
                salida[4] = res.getString(8);
                salida[5] = res.getString(9);
                salida[6] = res.getString(10);
                salida[7] = Integer.toString(res.getInt(11));
                salida[8] = Integer.toString(res.getInt(12));
                salida[9] = Integer.toString(res.getInt(13));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
        return salida;
    }
    
    public void actualizar(){
        try{
            String sentenciaPer = "", sentenciaProfe = "";
            
            Persona persona = new Persona(curp, primer_nom, segundo_nom, apellido_pat,
                    apellido_mat, dia_nac, mes_nac, año_nac);
            Profesor profesor = new Profesor(persona, no_empleado, grado_estudios, salario);
            
            sentenciaPer = "UPDATE persona SET "+
                    "CURP = '" + profesor.getPersona().getCURP() + "', " +
                    "Primer_Nom = '" + profesor.getPersona().getPrimer_Nom() + "', " +
                    "Segun_Nom = '" + profesor.getPersona().getSegun_Nom() + "', " +
                    "Apellido_P = '" + profesor.getPersona().getApellido_P() + "', " +
                    "Apellido_M = '" + profesor.getPersona().getApellido_M() + "', " +
                    "Dia_Nac = " + profesor.getPersona().getDia_Nac() + ", " +
                    "Mes_Nac = " + profesor.getPersona().getMes_Nac() + ", " +
                    "Año_Nac = " + profesor.getPersona().getAño_Nac() + " " +
                    "WHERE CURP = '" + profesor.getPersona().getCURP() + "' ;";
            
            sentenciaProfe = "UPDATE profesor SET " +
                    "CURP = '" + profesor.getPersona().getCURP() + "', " +
                    "Grado_Estudios = '" + profesor.getGrado_estudios()+ "', " +
                    "salario = " + profesor.getSalario()+ " " +
                    "WHERE No_Profesor = '" + profesor.getNo_profesor()+ "' ;";
            
            baseDatos.ejecutar(sentenciaPer);
            baseDatos.ejecutar(sentenciaProfe);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
