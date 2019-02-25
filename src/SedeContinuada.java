
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class SedeContinuada extends Sede{
    private Curso popular;
    private ArrayList<Curso> programasCon;

    public SedeContinuada(String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
        this.programasCon = new ArrayList<>();
    }

    @Override
    public String darInformacion() {
          return this.nombre+" "+this.telefono+ "  "+ this.direccion + "  "+ this.area+ "  "+ this.popular;
    }
    
    
    @Override
    public void agregarPrograma(ProgramaFormacion programa) {
        this.programasCon.add((Curso) programa);
    }

    @Override
    public ArrayList<Curso> getProgramas() {
        return this.programasCon;
    }

    
    
}
