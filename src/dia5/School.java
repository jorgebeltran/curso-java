/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

import dia2.Persona;
import dia2.Student;
import java.util.ArrayList;

/**
 *
 * @author jorgebeltranaguilar
 */
public class School {
    //una arrya list siempre tiene que instanciar 
   private ArrayList<Persona> personas;
    private String name;

    public School(String name) {
        this.name = name;
        this.personas=new ArrayList<>();
    }
    
    public void addPersona(Persona newPersona){
      this.personas.add(newPersona);
    }
    public void showPersona(){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
            
        }
    }
    //arraylist no acepta tipos de datos primitivos 
    //int , double, boolean 
    //trabajan con datos compuesto
    //Integer ,Double
    public void showStudents(){
    // tipo :   nombre : nombredel list
        for (Persona personaToInterate : personas) {
            if(personaToInterate instanceof Student){
                System.out.println(personaToInterate.toString());
            }
            
        }
    }
    
}
