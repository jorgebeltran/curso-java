/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;
import dia2.Persona;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Bicycle {
    
   private int candence =0;
    private int speed =0;
    private int gear =1;
    private double price;
    private Persona owner;
   private String brand;

    public Bicycle(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }
     public Bicycle(double price, String brand, Persona owner) {
        this.price = price;
        this.brand = brand;
        this.owner=owner;
    }
     public Bicycle(double price, String brand,int gear) {
        this.price = price;
        this.brand = brand;
        this.gear=gear;
       
    }
     public Bicycle(double price, String brand,int gear,int speed) {
        this.price = price;
        this.brand = brand;
        this.gear=gear;
        this.speed=speed;
       
    }
    
    public void changeGear(int gear){
        this.gear =gear;
    }
    
    public void changeCandence(int candence){
    this.candence=candence;
    }
    public String getStates(){
    return "Candence :"+ this.candence+ "Speed :"+ this.speed+ "Gear :"+ this.gear+"owner :"+this.owner;
    };

    public double getPrice() {
        return price;
    }

  
    public String getBrand() {
        return brand;
    }

   public void incrementSpeed(){
   this.speed=this.speed+1;
   }
    public void incrementSpeed(int increment){
   this.speed=this.speed+increment;
   }
    public void incremeSpeed(int increment){
   this.speed=this.speed+increment;
   } 
    public void applBrakes(int decrement){
    if (decrement <= this.speed){
    this.speed=this.speed -decrement;
    }else{
    this.speed=0;
    }
    }
}
