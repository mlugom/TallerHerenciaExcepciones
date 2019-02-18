
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
      }
        public void crearSedeCon(String nombre, String direccion,int telefono, double area){
          sedesContinuadas.add(new SedeContinuada(nombre,direccion,telefono,area));
      }
        
      public void CrearProgramaTec(String nombre,String descripcion){
          programasTec.add(new ProgramaTecnologico(nombre, descripcion));
      }  
      
      public void CrearProgramaPro(String nombre,String descripcion){
          programasPro.add(new ProgramaProfesional(nombre, descripcion));
      }  
      public void CrearProgramaCon(String nombre,String descripcion){
          programasCon.add(new Curso(nombre, descripcion));
      }  
      
      public void agregarPrograma(String nombre, String nombreSede, String tipoPrograma, String tipoSede){
          if(tipoPrograma.equals("profesional") && tipoSede.equals("profesional")){
              for (int i = 0; i < sedesProfesionales.size(); i++) {
                  if(sedesProfesionales.get(i).nombre.equals(nombreSede)){
                      for (int j = 0; j < programasPro.size(); j++) {
                          if(programasPro.get(j).nombre.equals(nombre)){
                              sedesProfesionales.get(i).agregarProgramaPro(programasPro.get(j));
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
                              sedesTecnologicas.get(i).agregarProgramaTec(programasTec.get(j));
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
                              sedesContinuadas.get(i).agregarProgramaCon(programasCon.get(j));
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
      
      
      
}

