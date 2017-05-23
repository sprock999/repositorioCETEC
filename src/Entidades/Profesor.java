
package Entidades;

/**
 *
 * @author jose_
 */
public class Profesor {
    Persona persona;
    String no_profesor, grado_estudios; 
    int salario;

    public Profesor(Persona persona, String no_profesor, String grado_estudios, int salario) {
        this.persona = persona;
        this.no_profesor = no_profesor;
        this.grado_estudios = grado_estudios;
        this.salario = salario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNo_profesor() {
        return no_profesor;
    }

    public void setNo_profesor(String no_profesor) {
        this.no_profesor = no_profesor;
    }

    public String getGrado_estudios() {
        return grado_estudios;
    }

    public void setGrado_estudios(String grado_estudios) {
        this.grado_estudios = grado_estudios;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
