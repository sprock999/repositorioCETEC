
package Entidades;

/**
 *
 * @author jose_
 */
public class Alumno {
    Persona persona;
    String no_control, no_tutor;

    public Alumno(Persona persona, String no_control, String no_tutor) {
        this.persona = persona;
        this.no_control = no_control;
        this.no_tutor = no_tutor;
    }

    public String getNo_control() {
        return no_control;
    }

    public void setNo_control(String no_control) {
        this.no_control = no_control;
    }

    public String getNo_tutor() {
        return no_tutor;
    }

    public void setNo_tutor(String no_tutor) {
        this.no_tutor = no_tutor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
