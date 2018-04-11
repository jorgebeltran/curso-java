package dia2;

//import .*;

import dia2.*;
//import .*;


public abstract class Persona {
   protected String name;
   protected String lastname;
   protected String dateOfBirthday;
   protected String dni;
   //constructor por defecto
   public Persona(){
   }
    public Persona(String name, String lastname, String dateOfBirthday, String dni ) {
        this.name=name;
        this.lastname=lastname;
        this.dateOfBirthday=dateOfBirthday;
        this.dni=dni;
        
    }
   // como se difine un metodo
   //modificar , tipo de retorno, nombre del metodo, parametros de entradas 
   //metodo
    public String getName(){
   return this.name=name;
   }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //metodo get para pedir o acceder
    //set para cambiar o modificar
    
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastname=" + lastname + ", dateOfBirthday=" + dateOfBirthday + ", dni=" + dni + '}';
    }
    public abstract String gretting();
}
