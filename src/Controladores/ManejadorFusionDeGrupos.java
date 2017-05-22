
package Controladores;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose_
 */
public class ManejadorFusionDeGrupos {
    
    Conexion baseDatos = new Conexion().conectar();
    
    String no_horario;
    int numero_alumnos;

    public ManejadorFusionDeGrupos() {
    }
    
    public DefaultTableModel getDatos(DefaultTableModel modelo) {
        String consulta = "SELECT No_Horario, Hora_Entrada, Hora_Salida, No_Profesor, Numero_Alumnos "
                + "FROM horario where No_Horario = '" + no_horario + "';";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            while (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                numero_alumnos = res.getInt(5);
                v.add(numero_alumnos);
                modelo.addRow(v);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }

        return modelo;
    }

    public DefaultTableModel getDisponibles(DefaultTableModel modelo) {
        String consulta = "SELECT No_Horario, Hora_Entrada, Hora_Salida, No_Profesor, Numero_Alumnos "
                + "FROM horario;";
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
    
    public String getNo_horario() {
        return no_horario;
    }

    public void setNo_horario(String no_horario) {
        this.no_horario = no_horario;
    }
    
    
}
