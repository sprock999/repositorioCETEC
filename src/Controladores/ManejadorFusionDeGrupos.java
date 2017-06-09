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

    int numero_alumnos, numAlumnosHorario1, numAlumnosHorario2, totalAlumnos = 0;

    public ManejadorFusionDeGrupos() {
    }

    public DefaultTableModel getDatos(DefaultTableModel modelo, String no_horario) {
        String consulta = "SELECT No_Horario, Hora_Entrada, Hora_Salida, No_Profesor, Numero_Alumnos "
                + "FROM horario where No_Horario = '" + no_horario + "';";
        ResultSet res = baseDatos.consultar(consulta);
        try {
            if (res.next()) {
                Vector v = new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                numero_alumnos = res.getInt(5);
                v.add(numero_alumnos);
                modelo.addRow(v);
            }else{
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }

        return modelo;
    }

    public DefaultTableModel getDisponibles(DefaultTableModel modelo, String no_horario) {
        String consulta = "SELECT No_Horario, Hora_Entrada, Hora_Salida, No_Profesor, Numero_Alumnos "
                + "FROM horario WHERE No_Horario != " + no_horario + ";";
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

    public boolean horariosAceptados(String horarioUno, String HorarioDos) {
        String consulta = "SELECT Numero_Alumnos "
                + "FROM horario WHERE No_Horario = " + horarioUno + " ;";
        ResultSet res = baseDatos.consultar(consulta);
        
        String consulta2 = "SELECT Numero_Alumnos "
                + "FROM horario WHERE No_Horario = " + HorarioDos + " ;";
        ResultSet res2 = baseDatos.consultar(consulta2);
        try {
            res.next();
            numAlumnosHorario1 = res.getInt(1);
            
            res2.next();
            numAlumnosHorario2 = res2.getInt(1);
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
        if ( (numAlumnosHorario1 + numAlumnosHorario2) <= 30) {
            totalAlumnos = numAlumnosHorario1 + numAlumnosHorario2;
                return true;
        }else
            return false;
    }
    
    public void fusionarHorario(String horarioUno, String HorarioDos){
        String consultaElim = "DELETE FROM horario WHERE No_Horario = " + horarioUno;
        
        String consulta = "UPDATE horario SET "+
                    "Numero_Alumnos = " + totalAlumnos + " " +
                    "WHERE No_Horario = '" + HorarioDos + "' ;";
        
        baseDatos.ejecutar(consultaElim);
        baseDatos.ejecutar(consulta);
    }
}
