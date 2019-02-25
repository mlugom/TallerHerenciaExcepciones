
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
        this.numeroEstudiantes = 0;
        this.programasTec = new ArrayList<>();
    }

  

    @Override
    public String darInformacion(){
        return this.nombre+" "+this.telefono+ "  "+ this.direccion + "  "+ this.area+ "  "+ this.numeroEstudiantes;
    }

    @Override
    public void agregarPrograma(ProgramaFormacion programa) {
        this.programasTec.add((ProgramaTecnologico) programa);
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }
    
    public void anadirEst(){
        this.numeroEstudiantes++;
    }

    @Override
    public ArrayList getProgramas() {
        return this.programasTec;
    }
    
    
    }
    
    

