/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

import dia2.Persona;
import dia2.Student;
import dia2.Teacher;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Main {
        public static void main(String[] args) {
         Teacher teacher1= new Teacher("carlos", "huanca", "jun 23, 1992", "123123", "sistema");
         Student student1= new Student("pedro", "torrico", "july 24, 1991", "1224234", "23423423");
            Persona persona1= new Persona("thiago", "rejas", "jan 21 ,2012", "1293812938") {
                @Override
                public String gretting() {
               return "clase abstract";
                }
            };
         
         
        School school1 =new School("pedro <poveda>");
        school1.addPersona(student1); 
        school1.addPersona(teacher1);

        //school1.showPersona();
         //school1.showStudents();
            System.out.println(persona1.toString());
            //para instanciar una clase se debe implementar sus metodos abstractos todos 
        }
}
