
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
public class SedeProfesional extends Sede {
    private int nProgramaRegCalificado;
    private ArrayList<ProgramaProfesional> programasPro;
    private ArrayList<ProgramaTecnologico> programasTec;
    private ArrayList<Curso> programasCon;

    public SedeProfesional(String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
    }

   

    @Override
    public String darInformacion() {
        return this.nombre+" "+this.telefono+ "  "+ this.direccion + "  "+ this.area+ "  "+ this.nProgramaRegCalificado;
    }

    public void agregarProgramaPro(ProgramaProfesional programa) {
           this.programasPro.add(programa);
    }
           
    public void agregarProgramaTec(ProgramaTecnologico programa){
           this.programasTec.add(programa);
       }
    public void agregarProgramaCon(Curso programa){
           this.programasCon.add(programa);
       }

    @Override
    public void agregarPrograma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    }

    
   
