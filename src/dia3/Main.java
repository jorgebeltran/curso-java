/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1;
        Bicycle bicycle2;
        Bicycle bicycle3;
        bicycle1=new  Bicycle(2500, "trueno");
        bicycle2= new Bicycle(300, "rayo",3);
        bicycle3= new Bicycle(4000,"thosiba" );
        System.out.println("Bcycle1");
        System.out.println(bicycle1.getStates());
        System.out.println(bicycle1.getBrand());
        System.out.println(bicycle1.getPrice());

        System.out.println("Bcycle2");
        System.out.println(bicycle2.getStates());
        
        System.out.println("Bycle3");
        System.out.println(" change Status: ");
        System.out.println(bicycle3.getStates());
        bicycle3.incrementSpeed();
        bicycle3.incrementSpeed();
        bicycle3.incrementSpeed(7);
        bicycle3.incrementSpeed(9);
        System.out.println(bicycle3.getStates());


        
        
        

    }
    
}
