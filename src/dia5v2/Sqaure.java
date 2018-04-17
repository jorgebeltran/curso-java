/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5v2;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Sqaure implements ComputableShape ,DoSomething{
 
    private double side;

    public Sqaure(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
       return side*side;
    }
    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
    @Override
    public String getSomething() {
        return "Overrading defulta method of DoSomething interface";
    }

}
