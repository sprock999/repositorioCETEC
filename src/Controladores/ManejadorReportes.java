
package Controladores;

import Entidades.Reporte;
import java.sql.ResultSet;
import java.util.Vector;

public class ManejadorReportes{
    
    Conexion baseDatos = new Conexion().conectar();
    
    String no_reporte, no_profesor, actividad;
    int dia_reporte, mes_reporte, año_reporte;

    public ManejadorReportes(){
    }
    
    public void asignarDatos(String no_reporte, String no_profesor, String actividad, int dia_reporte, int mes_reporte, int año_reporte) {
        this.no_reporte = no_reporte;
        this.no_profesor = no_profesor;
        this.actividad = actividad;
        this.dia_reporte = dia_reporte;
        this.mes_reporte = mes_reporte;
        this.año_reporte = año_reporte;
    }
    
    public void Registrar(){
        try{
            String sentenciaReporte = "";
            Reporte reporte = new Reporte(no_reporte, no_reporte, no_reporte, no_reporte, no_profesor, actividad);
            
            sentenciaReporte = "insert into reporte values("
                    + "'" + reporte.getNo_reporte() + "',"
                    + reporte.getDia_rep() + ","
                    + reporte.getMes_rep() + ","
                    + reporte.getAño_rep() + ","
                    + "'" + reporte.getNo_profesor() + "',"
                    + "'" + reporte.getActividad() + "');";
            
            baseDatos.ejecutar(sentenciaReporte);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public int getID() {
        int numero;
        String salida = "";
        ResultSet res = baseDatos.consultar("select Numero_Reporte from reporte ORDER BY Numero_Reporte ASC");
        
        try {
            while (res.next()) {
                salida = res.getString(1);
            }
            numero = Integer.parseInt(salida) + 1;
            return numero;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return -1;
        }
    }
    
    public boolean buscarTutor(String noProfe) {
        String salida = "";
        String consulta = "SELECT * FROM profesor "
                + "WHERE No_Profesor = '" + noProfe + "' && Estado = 1;";
        ResultSet res = baseDatos.consultar(consulta);
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
}