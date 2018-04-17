/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Arraylist;

import dia2.Persona;
import dia2.Teacher;
import java.util.ArrayList;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Institute {
    private String name;
    private ArrayList<Persona>personsInsti;

    public Institute(String name) {
        this.name = name;
        this.personsInsti=new ArrayList<>();
    }
    public void addpersonInst(Persona newperPersona){
    this.personsInsti.add(newperPersona);
    }
    
    public  void showpersonInst(){
        for (int i = 0; i < personsInsti.size(); i++) {
            System.out.println(personsInsti.get(i));
            
        }
    }
    
    public  void showpersonTeacher(){
        for (Persona x : personsInsti){ 
       if(x instanceof Teacher){
           System.out.println(x.toString());
             
                
            }
            
        }
    }
    
}
