
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
public class SedeTecnologica extends Sede{
    private int numeroEstudiantes;
    private ArrayList<ProgramaTecnologico> programasTec;

    public SedeTecnologica(String nombre, String direccion, int telefono, double area) {
        super(nombre, direccion, telefono, area);
    }

  

    @Override
    public String darInformacion(){
        return this.nombre+" "+this.telefono+ "  "+ this.direccion + "  "+ this.area+ "  "+ this.numeroEstudiantes;
    }
        public void agregarProgramaTec(ProgramaTecnologico programa){
            this.programasTec.add(programa);
        }

    @Override
    public void agregarPrograma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }
    
    public void anadirEst(){
        this.numeroEstudiantes++;
    }
    
    
    }
    
    

