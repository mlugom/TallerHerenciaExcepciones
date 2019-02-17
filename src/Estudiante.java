/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String colegio;
    private String añoGrado;
    private String programa;

    public Estudiante(String nombre, String apellido, String colegio, String añoGrado, String programa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colegio = colegio;
        this.añoGrado = añoGrado;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getColegio() {
        return colegio;
    }

    public String getAñoGrado() {
        return añoGrado;
    }

    public String getPrograma() {
        return programa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public void setAñoGrado(String añoGrado) {
        this.añoGrado = añoGrado;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
    
    
}
