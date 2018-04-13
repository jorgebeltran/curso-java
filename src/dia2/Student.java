/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Student extends Persona{
          private String codsis;

    public Student( String name, String lastname, String dateOfBirthday, String dni,String codsis) {
        super(name, lastname, dateOfBirthday, dni);
        this.codsis = codsis;
    }
          
@Override
public String gretting(){
return "hello my is name is "+this.name;
}

}
