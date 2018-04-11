package dia1;

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
    public static void main (String arg[]){
        //declaracion
        Persona personajuan;
    //inicializacion o constructor
    //personajuan=new Persona();// construido un objeto
    personajuan = new Persona("juan","perez");
    //acediendo a sus atributos
    //esto no se debe hacer 
   /* personajuan.nombre="juan";
    personajuan.apellido="perez";
        System.out.println(x:"mostrando el apellido");
    System.out.print(personajuan.nombre +personajuan.apellido);
   */
   //metodo dicamico
    System.out.println("Nombre completo: ");
        System.out.println(personajuan.getNombreComplete());
        System.out.println("accediendo al nombre con el metodo get");
        System.out.println(personajuan.getNombre());
        //accediento metodo set
        System.out.println("cambiando el nombre con el metodo set");
        personajuan.setNombre("pedro");
        System.out.println(personajuan.getNombreComplete());
        System.out.println("accediendo al apellido con el metodo get");
        System.out.println(personajuan.getApellido());
//metodo totsring
System.out.println("probando el metodo string");
        System.out.println(personajuan.toString());
        
    }
}
