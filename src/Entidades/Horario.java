
package Entidades;

/**
 *
 * @author jose_
 */
public class Horario {
    String no_horario, hora_entrada, hora_salida, no_profesor, no_alumnos;

    public Horario(String no_horario, String hora_entrada, String hora_salida, String no_profesor, String no_alumnos) {
        this.no_horario = no_horario;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.no_profesor = no_profesor;
        this.no_alumnos = no_alumnos;
    }
    
    public String getNo_horario() {
        return no_horario;
    }

    public void setNo_horario(String no_horario) {
        this.no_horario = no_horario;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getNo_profesor() {
        return no_profesor;
    }

    public void setNo_profesor(String no_profesor) {
        this.no_profesor = no_profesor;
    }

    public String getNo_alumnos() {
        return no_alumnos;
    }

    public void setNo_alumnos(String no_alumnos) {
        this.no_alumnos = no_alumnos;
    }
    
    
}
