/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author jose_
 */
public class Tutor {
    Persona persona;
    String no_tutor, Telefono, e_mail, parentesco, ocupacion;

    public Tutor(Persona persona, String no_tutor, String Telefono, String e_mail,
            String parentesco, String ocupacion) {
        this.persona = persona;
        this.no_tutor = no_tutor;
        this.Telefono = Telefono;
        this.e_mail = e_mail;
        this.parentesco = parentesco;
        this.ocupacion = ocupacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNo_tutor() {
        return no_tutor;
    }

    public void setNo_tutor(String no_tutor) {
        this.no_tutor = no_tutor;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }  
    
}
