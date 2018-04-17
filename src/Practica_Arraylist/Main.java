/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_Arraylist;

import dia2.Student;
import dia2.Teacher;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacherInst1=new Teacher("carlos", "zambrana", "jan 30, 2012", "123123123", "doctor");
        Teacher teacherInst2= new Teacher("luis", "buendia", "jan 8, 2011", "123123", "abagado");
        
        Student studentInst1=new Student("thiago", "aguilar", "may 12, 1901", "13123123", "12423423423");
        Student studentInst2=new Student("ivan", "costas", "jan 12, 1991", "6786723", "423423");
        Student studentInst3=new Student("juan", "laime", "agos 12, 1951", "75665123", "1999809423423");
        
        
       Institute institute1 = new Institute("instituto aguilas plata");
       
       institute1.addpersonInst(teacherInst1);
       institute1.addpersonInst(teacherInst2);
       institute1.addpersonInst(studentInst1);
       institute1.addpersonInst(studentInst2);
       institute1.addpersonInst(studentInst3);

        System.out.println("lista de personas de teacher: ");
        institute1.showpersonTeacher();
        System.out.println("lista de personas de instituto: ");
        institute1.showpersonInst();

    }
    
}
