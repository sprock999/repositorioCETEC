
package Controladores;

import Entidades.Reporte;

public class ManejadorReportes{
    
    Conexion baseDatos = new Conexion().conectar();
    
    String no_reporte, no_profesor, actividad;
    int dia_reporte, mes_reporte, año_reporte;

    public ManejadorReportes(String no_reporte, String no_profesor, String actividad, int dia_reporte, int mes_reporte, int año_reporte) {
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
            
            sentenciaReporte = "insert into reportes values("
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
}