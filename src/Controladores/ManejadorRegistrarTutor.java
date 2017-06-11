
package Controladores;

import Entidades.Persona;
import Entidades.Tutor;
import java.sql.ResultSet;

public class ManejadorRegistrarTutor{
    
    Conexion baseDatos = new Conexion().conectar();
    
    String no_tutor, primer_nom, segundo_nom, apellido_pat, 
            apellido_mat, curp, telefono, email, parentesco, ocupacion;
    int dia_nac, mes_nac, año_nac;

    public ManejadorRegistrarTutor() {
    }

    public void asignarDatos(String no_tutor, String primer_nom, String segundo_nom, String apellido_pat, String apellido_mat, String curp, String telefono, String email, String parentesco, String ocupacion, int dia_nac, int mes_nac, int año_nac) {
        this.no_tutor = no_tutor;
        this.primer_nom = primer_nom;
        this.segundo_nom = segundo_nom;
        this.apellido_pat = apellido_pat;
        this.apellido_mat = apellido_mat;
        this.curp = curp;
        this.telefono = telefono;
        this.email = email;
        this.parentesco = parentesco;
        this.ocupacion = ocupacion;
        this.dia_nac = dia_nac;
        this.mes_nac = mes_nac;
        this.año_nac = año_nac;
    }
    
    public void Registrar(){
        try{
            String sentenciaPer = "", sentenciaTutor = "";
            Persona persona = new Persona(curp, primer_nom, segundo_nom, apellido_pat, apellido_mat, dia_nac, mes_nac, año_nac);
            Tutor tutor = new Tutor(persona, no_tutor, telefono, email, parentesco, ocupacion);
            
            sentenciaPer = "insert into persona values("
                    + "'" + tutor.getPersona().getCURP() + "',"
                    + "'" + tutor.getPersona().getPrimer_Nom() + "',"
                    + "'" + tutor.getPersona().getSegun_Nom() + "',"
                    + "'" + tutor.getPersona().getApellido_P() + "',"
                    + "'" + tutor.getPersona().getApellido_M() + "',"
                    + tutor.getPersona().getDia_Nac() + ","
                    + tutor.getPersona().getMes_Nac() + ","
                    + tutor.getPersona().getAño_Nac() + ");";
            
            sentenciaTutor = "insert into tutor values("
                    + "'" + tutor.getNo_tutor() + "',"
                    + "'" + tutor.getPersona().getCURP() + "',"
                    + "'" + tutor.getTelefono() + "',"
                    + "'" + tutor.getE_mail() + "',"
                    + "'" + tutor.getParentesco() + "',"
                    + "'" + tutor.getOcupacion() + "',1);";
            
            baseDatos.ejecutar(sentenciaPer);
            baseDatos.ejecutar(sentenciaTutor);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public int getId() {
        int numero;
        String salida = "";
        ResultSet res = baseDatos.consultar("select No_Tutor from tutor ORDER BY No_Tutor ASC");
        
        try {
            while (res.next()) {
                salida = res.getString(1).replace("T1701", "");
            }
            numero = Integer.parseInt(salida) + 1;
            return numero;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return -1;
        }
    }
    
    public boolean buscarTutor(String noTutor) {
        String salida = "";
        String consulta = "SELECT * FROM tutor "
                + "WHERE No_tutor = '" + noTutor + "' && Estado = 1;";
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