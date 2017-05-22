package Modelo;
public class Persona {
    String curp, primer_nombre, segundo_nombre, apellidoP,apellidoM, fecha_nac;

    public Persona(String curp, String primer_nombre, String segundo_nombre, String apellidoP, String apellidoM, String fecha_nac) {
        this.curp = curp;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fecha_nac = fecha_nac;
    }   
}