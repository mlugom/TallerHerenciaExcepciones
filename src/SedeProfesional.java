
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
        this.nProgramaRegCalificado = 0;
        this.programasCon = new ArrayList<>();
        this.programasPro = new ArrayList<>();
        this.programasTec = new ArrayList<>();
    }

   

    @Override
    public String darInformacion() {
        return this.nombre+" , "+this.telefono+ " , "+ this.direccion + " , "+ this.area+ " , "+ this.nProgramaRegCalificado;
    }
           
    public void agregarProgramaTec(ProgramaTecnologico programa){
           this.programasTec.add(programa);
       }
    public void agregarProgramaCon(Curso programa){
           this.programasCon.add(programa);
       }

    @Override
    public void agregarPrograma(ProgramaFormacion programa) {
        this.programasPro.add((ProgramaProfesional) programa);
        this.nProgramaRegCalificado++;
    }

    @Override
    public ArrayList<ProgramaProfesional> getProgramas() {
        return this.programasPro;
    }
    public ArrayList<Curso> getProgramasCon() {
        return this.programasCon;
    }
    public ArrayList<ProgramaTecnologico> getProgramasTec() {
       return this.programasTec;
    }
}

    
   
