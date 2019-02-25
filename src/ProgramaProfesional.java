/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class ProgramaProfesional extends ProgramaFormacion {
    boolean registroCalificado;

    public ProgramaProfesional(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.registroCalificado = true;
    }

    public boolean isRegistroCalificado() {
        return registroCalificado;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    
    
}
