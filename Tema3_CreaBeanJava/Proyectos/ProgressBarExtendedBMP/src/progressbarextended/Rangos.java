/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressbarextended;

import java.io.Serializable;

/**
 *
 * @author benmu
 */
public class Rangos implements Serializable {

    static double rango1, rango2;
    
 
    //Constructor
    public Rangos(double rango1, double rango2) {
        this.rango1 = rango1;
        this.rango2 = rango2;
    }   

    //Getter rango1
    public double getRango1() {
        return this.rango1;
    }

    //Setter rango1
    public void setRango1(double rango1) {
        this.rango1 = rango1;
      
        
    }

    //Getter rango2
    public double getRango2() {
        return this.rango2;
    }

    //Setter rango2
    public void setRango2(double rango2) {
        this.rango2 = rango2;
    }

    
}
