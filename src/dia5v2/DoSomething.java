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
public interface DoSomething {
  
    default String getSomething(){
        return "defeult method getsomething";
  }
    
}
