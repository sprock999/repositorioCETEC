
package Entidades;

import Controladores.Conexion;



/**
 *
 * @author jose_
 */
public class Persona {
    
    private final Conexion conector_mysql = new Conexion();
    private String CURP, Primer_Nom, Segun_Nom, Apellido_P, Apellido_M;
    private int Dia_Nac, Mes_Nac, Año_Nac;

    public Persona(String CURP, String Primer_Nom, String Segun_Nom, String Apellido_P, 
            String Apellido_M, int Dia_Nac, int Mes_Nac, int Año_Nac) {
        this.CURP = CURP;
        this.Primer_Nom = Primer_Nom;
        this.Segun_Nom = Segun_Nom;
        this.Apellido_P = Apellido_P;
        this.Apellido_M = Apellido_M;
        this.Dia_Nac = Dia_Nac;
        this.Mes_Nac = Mes_Nac;
        this.Año_Nac = Año_Nac;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getPrimer_Nom() {
        return Primer_Nom;
    }

    public void setPrimer_Nom(String Primer_Nom) {
        this.Primer_Nom = Primer_Nom;
    }

    public String getSegun_Nom() {
        return Segun_Nom;
    }

    public void setSegun_Nom(String Segun_Nom) {
        this.Segun_Nom = Segun_Nom;
    }

    public String getApellido_P() {
        return Apellido_P;
    }

    public void setApellido_P(String Apellido_P) {
        this.Apellido_P = Apellido_P;
    }

    public String getApellido_M() {
        return Apellido_M;
    }

    public void setApellido_M(String Apellido_M) {
        this.Apellido_M = Apellido_M;
    }

    public int getDia_Nac() {
        return Dia_Nac;
    }

    public void setDia_Nac(int Dia_Nac) {
        this.Dia_Nac = Dia_Nac;
    }

    public int getMes_Nac() {
        return Mes_Nac;
    }

    public void setMes_Nac(int Mes_Nac) {
        this.Mes_Nac = Mes_Nac;
    }

    public int getAño_Nac() {
        return Año_Nac;
    }

    public void setAño_Nac(int Año_Nac) {
        this.Año_Nac = Año_Nac;
    }    
    
}
