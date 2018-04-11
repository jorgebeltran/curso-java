package dia2;

//import .*;

import dia2.*;
//import .*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgebeltranaguilar
 */
public class Main {
    public static void main(String[] args) {
        /*Persona persona1=new Persona("jorge","perez","may 26,1991","123123");
        System.out.println(persona1.toString());
        Persona persona2=new Persona("carlos","perez","jun 12,1990","234234");
        System.out.println(persona2.toString());
        System.out.println("herencia");
        */
        Teacher techer1 =new Teacher("julio", "cerveza", "may 23,1992", "12312","sistema ing");
        Student student1 =new Student("luis", "aviles", "jun 21,1202", "1232312","345678121");

        //System.out.println(techer1.getName());
        //una clase abstract declara la existencia de metodos pero no la implementacion
        //Teacher1 es una instacia de la clase Teacher
        //objeto es una  instancia de una clase 
        //una clase abstract  no se puede instanciar
        //una clase abstract tiene metodo sin definir 
        //las clases que se extendan de una clase abastrcta tiene que implementar los metodos abstracto de la clase abstracta
        System.out.println(techer1.gretting());
        System.out.println(student1.gretting());
    }
    
}
