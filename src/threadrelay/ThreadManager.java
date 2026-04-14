/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadrelay;

/**
 *
 * @author bernicchi.davide
 */
public class ThreadManager {
    Runner rnr1;
    Runner rnr2;
    Runner rnr3;
    Runner rnr4;
    Staffetta stf; 
    
    
    ThreadManager(Staffetta s, Runner r1, Runner r2, Runner r3, Runner r4){
        stf = s;
    }
    
    void Corri(){
        rnr1.start();
    }
}
