/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Alejandro
 */
public abstract class Sede {
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected double area;

    public Sede(String nombre, String direccion, int telefono, double area) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.area = area;
    }
    
    
    public abstract String darInformacion();
    public abstract void agregarPrograma(ProgramaFormacion p);
    public abstract ArrayList getProgramas();

}