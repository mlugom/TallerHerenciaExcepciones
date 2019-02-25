/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<FileWriter> sedesPro = new ArrayList<>();
        ArrayList<FileWriter> sedesTec = new ArrayList<>();
        ArrayList<FileWriter> sedesCon = new ArrayList<>();
        
        Universidad universidad = new Universidad("La universidad");
        
        universidad.CrearProgramaPro("ProgramaPro1", "Muy bueno");
        universidad.CrearProgramaTec("ProgramaTec1", "Fundamentacion");
        
        universidad.crearSedePro("Sede Profesional 1", "calle 1", 234567, 2123);
        universidad.getSedesProfesionales().get(0).agregarPrograma(universidad.getProgramasPro().get(0));
        universidad.getSedesProfesionales().get(0).agregarProgramaTec(universidad.getProgramasTec().get(0));
        
        sedesPro.add(new FileWriter("src/Universidad/Profesionales/sedePro1"));
        
        sedesPro.get(0).write(universidad.getSedesProfesionales().get(0).darInformacion());
        sedesPro.get(0).write('\n' + "Programas: " + '\n');
        for(int i = 0; i < universidad.getSedesProfesionales().get(0).getProgramas().size(); i++){
            sedesPro.get(0).write(universidad.getSedesProfesionales().get(0).getProgramas().get(i).getNombre());
            sedesPro.get(0).write(universidad.getSedesProfesionales().get(0).getProgramasTec().get(i).getNombre());
            sedesPro.get(0).write(universidad.getSedesProfesionales().get(0).getProgramasCon().get(i).getNombre());
        }
        
        universidad.CrearProgramaTec("ProgramaTec2", "Completo");
        universidad.crearSedeTec("Sede Tecnologica 1", "carrera 7", 3407762, 1178);
        universidad.getSedesTecnologicas().get(0).agregarPrograma(universidad.getProgramasTec().get(1));
        
        sedesTec.add(new FileWriter("src/Universidad/Tecnologicas/sedeTec1"));
        
        sedesTec.get(0).write(universidad.getSedesTecnologicas().get(0).darInformacion());
        sedesTec.get(0).write('\n' + "Programas: " + '\n');
        for(int i = 0; i < universidad.getSedesTecnologicas().get(0).getProgramas().size(); i++){
            sedesTec.get(0).write(universidad.getSedesTecnologicas().get(0).getProgramas().get(i).getNombre());
        }
        
        universidad.CrearProgramaCon("Curso1", "Curso libre");
        universidad.crearSedeCon("Sede de educacion continuada", "calle 45", 472777, 2000);
        universidad.getSedesContinuadas().get(0).agregarPrograma(universidad.getProgramasCon().get(0));
        
        sedesCon.add(new FileWriter("src/Universidad/Continuada/sedeCon1"));
        sedesCon.get(0).write(universidad.getSedesContinuadas().get(0).darInformacion());
        sedesCon.get(0).write('\n' + "Programas: " + '\n');
        for(int i = 0; i < universidad.getSedesContinuadas().get(0).getProgramas().size(); i++){
            sedesCon.get(0).write(universidad.getSedesContinuadas().get(0).getProgramas().get(i).getNombre());
        }
    }
}
