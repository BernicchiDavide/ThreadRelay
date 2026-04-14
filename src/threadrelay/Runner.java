/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadrelay;

/**
 *
 * @author bernicchi.davide
 */
public class Runner extends Thread{
    int percorso=0;
    Staffetta stf;
    
    Runner(Staffetta s){
        stf = s;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            
        }
    }
}
