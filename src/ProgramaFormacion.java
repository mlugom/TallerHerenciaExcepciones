/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public abstract class ProgramaFormacion {
    protected String nombre;
    protected String descripcion;

    public ProgramaFormacion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

    }
   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
     
}
