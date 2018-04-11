
public class Persona {
    //atributos de la clase persona
    //restingir informacion 
    //public,private ,protected a nivel de herencia o clase abtracta 
   private String nombre;
   private String apellido;
   //constructor por defecto
   public Persona(){
   this.nombre="default nombre";
   this.apellido="default apellido";
   }
    public Persona(String nombre, String apellido) {
        this.nombre=nombre;
        this.apellido=apellido;
        
    }
   // como se difine un metodo
   //modificar , tipo de retorno, nombre del metodo, parametros de entradas 
   //metodo
    public String getNombreComplete(){
   return this.nombre +""+this.apellido;
   }
    //metodo get para pedir o acceder
    //set para cambiar o modificar
    public String getNombre(){
    return this.nombre;
    
    }
     public String getApellido(){
    return this.apellido;
     }
    public void setNombre(String nonbreNuevo){
        this.nombre=nonbreNuevo;
    }
        public void setApellido(String apellidoNuevo){
        this.apellido=apellidoNuevo;
    }
        //
    @Override
    public String toString(){
return "Nombre:"+this.nombre+"Apellido:"+this.apellido;
    }
}
