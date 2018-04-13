/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;
import dia2.Persona;
/**
 *
 * @author jorgebeltranaguilar
 */
public class University {
    private String name;
    private static int limit =5;//asi se declara un arreglo estatico siempre tiene un tamanio
    private Persona[] persona;//aca declaramos su tamanio
    private int count =0;
    
    
    //{[0],[1],[2],[3],[4]}un arregl nos sirver para contener personas
    //{[juan,perz],[jorge,betran]}
    public University(String name) {
        this.persona = persona;
        this.count=0;
        this.persona=new Persona[limit];
    }

     public void addPeronsa(Persona newPersona) {
    if(count < persona.length){
        this.persona[count] = newPersona;
        count = count + 1;         
    }
     }
    public void showListPersona() {
        System.out.println("Person list");
        //f (int i = 0; i <= 5; i++) {
        for (int i = 0; i < persona.length; i++) {
            System.out.println(persona[i]);
        }
             
     }
    
            
    
}
 