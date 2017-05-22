
package Entidades;

/**
 *
 * @author jose_
 */
public class Reporte {
    String no_reporte, dia_rep, mes_rep, año_rep, no_profesor, actividad;

    public Reporte(String no_reporte, String dia_rep, String mes_rep, String año_rep, String no_profesor, String actividad) {
        this.no_reporte = no_reporte;
        this.dia_rep = dia_rep;
        this.mes_rep = mes_rep;
        this.año_rep = año_rep;
        this.no_profesor = no_profesor;
        this.actividad = actividad;
    }

    public String getNo_reporte() {
        return no_reporte;
    }

    public void setNo_reporte(String no_reporte) {
        this.no_reporte = no_reporte;
    }

    public String getDia_rep() {
        return dia_rep;
    }

    public void setDia_rep(String dia_rep) {
        this.dia_rep = dia_rep;
    }

    public String getMes_rep() {
        return mes_rep;
    }

    public void setMes_rep(String mes_rep) {
        this.mes_rep = mes_rep;
    }

    public String getAño_rep() {
        return año_rep;
    }

    public void setAño_rep(String año_rep) {
        this.año_rep = año_rep;
    }

    public String getNo_profesor() {
        return no_profesor;
    }

    public void setNo_profesor(String no_profesor) {
        this.no_profesor = no_profesor;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
}
