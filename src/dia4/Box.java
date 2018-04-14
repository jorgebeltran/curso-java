/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

/**
 *
 * @author jorgebeltranaguilar
 */
public class Box <T> {
    private T firstSubBox;

    public Box(T firstSubBox) {
        this.firstSubBox = firstSubBox;
    }

    @Override
    public String toString() {
        return "Box{" + "firstSubBox=" + firstSubBox + '}';
    }
    
  
}
