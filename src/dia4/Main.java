/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

import dia2.Student;
import dia2.Teacher;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Main {
    public static void main(String[] args) {
        //vamos a instnciar university
        University university1;
        university1 = new University("UMSS");

        Teacher teacher1=new Teacher("alex", "mamami", "jan 15, 1991", "123123213", "ing sistema");
        Student student2 = new Student("Juan", "Perez", "May 17, 1970", "4358374", "201004556");
        Student stundet3 = new Student("jorge", "beltran","jan 15, 1991" , "1231313123","12312361236");
        university1.addPeronsa(teacher1);
        university1.addPeronsa(student2);
        university1.addPeronsa(stundet3);
        
        university1.showListPersona();
        ///clases genericas 
    }
}

