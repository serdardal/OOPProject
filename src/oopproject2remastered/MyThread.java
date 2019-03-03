/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2remastered;

import java.util.Random;

/**
 *
 * @author serdar
 */
public class MyThread implements Runnable{
    
    private Firma f;
    
    public MyThread(Firma firma){
        f=firma;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            f.setHisseDegeri(f.getHisseDegeri()+ (rndDeger()-5));
        }
    }
    
    public int rndDeger(){
        Random rnd = new Random();
        
        return rnd.nextInt(11);
    }
    
    
    
}
