
package Controladores;

import Entidades.Alumno;
import Entidades.Persona;

/**
 *
 * @author jose_
 */
public class ManejadorInscribirAlumno { 
    
    Conexion baseDatos = new Conexion().conectar();
   
    String no_control, no_tutor, primer_nom, segundo_nom, apellido_pat, 
            apellido_mat, curp;
    int dia_nac, mes_nac, año_nac;    

    public ManejadorInscribirAlumno(String no_control, String no_tutor, 
            String primer_nom, String segundo_nom, String apellido_pat, 
            String apellido_mat, String curp, int dia_nac, int mes_nac, int año_nac) {
        this.no_control = no_control;
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

   
    
    public void registrar(){
        try{
            String sentenciaPer = "", sentenciaAlum = "";
            
            Persona persona = new Persona(curp, primer_nom, segundo_nom, apellido_pat,
                    apellido_mat, dia_nac, mes_nac, año_nac);
            Alumno alumno = new Alumno(persona, no_control, no_tutor);
            
            sentenciaPer = "insert into persona values("+
                    "'" + alumno.getPersona().getCURP() + "', " +
                    "'" + alumno.getPersona().getPrimer_Nom() + "', " +
                    "'" + alumno.getPersona().getSegun_Nom() + "', " +
                    "'" + alumno.getPersona().getApellido_P() + "', " +
                    "'" + alumno.getPersona().getApellido_M() + "', " +
                    "" + alumno.getPersona().getDia_Nac() + ", " +
                    "" + alumno.getPersona().getMes_Nac() + ", " +
                    "" + alumno.getPersona().getAño_Nac() + ");";
            
            sentenciaAlum = "insert into alumno values("+
                    "'" + alumno.getNo_control() + "', " +
                    "'" + alumno.getPersona().getCURP()+ "', " +
                    "" + alumno.getNo_tutor() + ", " +
                    "" + "1" + ");";
            
            baseDatos.ejecutar(sentenciaPer);
            baseDatos.ejecutar(sentenciaAlum);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
