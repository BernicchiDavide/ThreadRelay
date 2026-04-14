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
Runner rnr1 = new Runner();
    Runner rnr2 = new Runner();
    Runner rnr3 = new Runner();
    Runner rnr4 = new Runner();
    Staffetta stf = new Staffetta(); 
    
    
    void Corri(){
        rnr1.start();
        
    }

}
