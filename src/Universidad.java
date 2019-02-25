
import java.util.ArrayList;
import java.io.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<SedeProfesional> sedesProfesionales;
    private ArrayList<SedeTecnologica> sedesTecnologicas;
    private ArrayList<SedeContinuada> sedesContinuadas;
    private ArrayList<ProgramaProfesional> programasPro;
    private ArrayList<ProgramaTecnologico> programasTec;
    private ArrayList<Curso> programasCon;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
        this.sedesContinuadas = new ArrayList<>();
        this.sedesProfesionales = new ArrayList<>();
        this.sedesTecnologicas = new ArrayList<>();
        this.programasCon = new ArrayList<>();
        this.programasPro = new ArrayList<>();
        this.programasTec = new ArrayList<>();
    }

    public Universidad(String nombre, ArrayList<Estudiante> estudiantes, ArrayList<SedeProfesional> sedesProfesionales, ArrayList<SedeTecnologica> sedesTecnologicas, ArrayList<SedeContinuada> sedesContinuadas, ArrayList<ProgramaProfesional> programasPro, ArrayList<ProgramaTecnologico> programasTec, ArrayList<Curso> programasCon) {
        this.nombre = nombre;
    }

    public ArrayList<SedeProfesional> getSedesProfesionales() {
        return sedesProfesionales;
    }

    public ArrayList<SedeTecnologica> getSedesTecnologicas() {
        return sedesTecnologicas;
    }

    public ArrayList<SedeContinuada> getSedesContinuadas() {
        return sedesContinuadas;
    }
   
    
    
    
    public ArrayList darInformacionPro(){
        ArrayList<String> salida = new ArrayList();
        for (int i = 0; i < sedesProfesionales.size() ; i++) {
            salida.add(sedesProfesionales.get(i).darInformacion());
        }
        return salida;
    }
    
     public ArrayList darInformacionTec(){
        ArrayList<String> salida = new ArrayList();
        for (int i = 0; i < sedesTecnologicas.size() ; i++) {
            salida.add(sedesTecnologicas.get(i).darInformacion());
        }
        return salida;
    }
    
      public ArrayList darInformacionCon(){
        ArrayList<String> salida = new ArrayList();
        for (int i = 0; i < sedesContinuadas.size() ; i++) {
            salida.add(sedesContinuadas.get(i).darInformacion());
        }
        return salida;
    }
      
      public String darInformacionTotal(){
          String salidaCon = null;
          String salidaTec = null;
          String salidaPro = null;
          for (int i = 0; i < darInformacionCon().size(); i++) {
              salidaCon = salidaCon+darInformacionCon().get(i)+"\n";
          }
          for (int i = 0; i < darInformacionTec().size(); i++) {
              salidaTec = salidaTec+darInformacionTec().get(i)+"\n";
          }
          for (int i = 0; i < darInformacionPro().size(); i++) {
              salidaPro = salidaPro+darInformacionPro().get(i)+"\n";
          }
          return salidaCon+"\n\n"+salidaTec+"\n\n"+salidaPro;           
      }
      
      public void crearSedeTec(String nombre, String direccion,int telefono, double area){
          sedesTecnologicas.add(new SedeTecnologica(nombre,direccion,telefono,area));
          
      }
      
       public void crearSedePro(String nombre, String direccion,int telefono, double area){
          sedesProfesionales.add(new SedeProfesional(nombre,direccion,telefono,area));
         // File archivo =new File("src/Universidad/Profesionales/sede1");
      }
        public void crearSedeCon(String nombre, String direccion,int telefono, double area){
          sedesContinuadas.add(new SedeContinuada(nombre,direccion,telefono,area));
      }
        
      public void CrearProgramaTec(String nombre,String descripcion){
          ProgramaTecnologico p = new ProgramaTecnologico(nombre, descripcion);
          programasTec.add(p);
      }  
      
      public void CrearProgramaPro(String nombre,String descripcion){
          ProgramaProfesional p = new ProgramaProfesional(nombre, descripcion);
          programasPro.add(p);
      }  
      public void CrearProgramaCon(String nombre,String descripcion){
          Curso p = new Curso(nombre, descripcion);
          programasCon.add(p);
      }  
      
      public void agregarPrograma(String nombre, String nombreSede, String tipoPrograma, String tipoSede){
          if(tipoPrograma.equals("profesional") && tipoSede.equals("profesional")){
              for (int i = 0; i < sedesProfesionales.size(); i++) {
                  if(sedesProfesionales.get(i).nombre.equals(nombreSede)){
                      for (int j = 0; j < programasPro.size(); j++) {
                          if(programasPro.get(j).nombre.equals(nombre)){
                              sedesProfesionales.get(i).agregarPrograma(programasPro.get(j));
                          }break;
                      }
                  }break;
              }
          }
          else if(tipoPrograma.equals("tecnologica") && tipoSede.equals("profesional")){
               for (int i = 0; i < sedesProfesionales.size(); i++) {
                  if(sedesTecnologicas.get(i).nombre.equals(nombreSede)){
                      for (int j = 0; j < programasTec.size(); j++) {
                          if(programasTec.get(j).nombre.equals(nombre)){
                              sedesProfesionales.get(i).agregarProgramaTec(programasTec.get(j));
                          }break;
                      }
                  }break;
              }
          }
          else if(tipoPrograma.equals("continuada") && tipoSede.equals("profesional")){
               for (int i = 0; i < sedesProfesionales.size(); i++) {
                  if(sedesContinuadas.get(i).nombre.equals(nombreSede)){
                      for (int j = 0; j < programasCon.size(); j++) {
                          if(programasCon.get(j).nombre.equals(nombre)){
                              sedesProfesionales.get(i).agregarProgramaCon(programasCon.get(j));
                          }break;
                      }
                  }break;
              }
          }
          else if(tipoPrograma.equals("tecnologica") && tipoSede.equals("tecnologica")){
               for (int i = 0; i < sedesTecnologicas.size(); i++) {
                  if(sedesTecnologicas.get(i).nombre.equals(nombreSede)){
                      for (int j = 0; j < programasTec.size(); j++) {
                          if(programasTec.get(j).nombre.equals(nombre)){
                              sedesTecnologicas.get(i).agregarPrograma(programasTec.get(j));
                          }break;
                      }
                  }break;
              }
          }
          else if(tipoPrograma.equals("continuada") && tipoSede.equals("continuada")){
               for (int i = 0; i < sedesContinuadas.size(); i++) {
                  if(sedesContinuadas.get(i).nombre.equals(nombreSede)){
                      for (int j = 0; j < programasCon.size(); j++) {
                          if(programasCon.get(j).nombre.equals(nombre)){
                              sedesContinuadas.get(i).agregarPrograma(programasCon.get(j));
                          }break;
                      }
                  }break;
              }
          }
      }
      
      public void agregarEstudiante(String nombre, String apellido, String colegio, String año, String nombrePrograma){
          this.estudiantes.add(new Estudiante(nombre,apellido,colegio,año,nombrePrograma));
          for (int i = 0; i < sedesTecnologicas.size(); i++) {
               for (int j = 0; j < programasTec.size(); j++) {
                  if(programasTec.get(j).equals(nombrePrograma)){
                      sedesTecnologicas.get(i).anadirEst();
              }
                   
               }
          }
      }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<ProgramaProfesional> getProgramasPro() {
        return programasPro;
    }

    public ArrayList<ProgramaTecnologico> getProgramasTec() {
        return programasTec;
    }

    public ArrayList<Curso> getProgramasCon() {
        return programasCon;
    }
      
      
      
}

