/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2remastered;

import java.util.ArrayList;

/**
 *
 * @author serdar
 */
public class Firma implements IObservable{
    
    private String FirmaAd;
    private int HisseDegeri;
    private Thread T;
    private ArrayList<MyObserver> gozlemciListesi= new ArrayList<MyObserver>();

    public Firma(String FirmaAd, int HisseDegeri) {
        this.FirmaAd = FirmaAd;
        this.HisseDegeri = HisseDegeri;
        this.T = new Thread(new MyThread(this));
    }
 

    @Override
    public void addObserver(MyObserver observer) {
        gozlemciListesi.add(observer);   
        }

    @Override
    public void removeObserver(MyObserver observer) {
        gozlemciListesi.remove(observer);    }

    @Override
    public void notifyObserver() {
        for (MyObserver observer : gozlemciListesi){
        observer.notify("Gözlemci: " + observer.getIsim()+" Firma adı: " + FirmaAd + " Hisse Değeri: " + HisseDegeri);    
        }
    }

    public int getHisseDegeri() {
        return HisseDegeri;
    }

    public void setHisseDegeri(int HisseDegeri) {
        this.HisseDegeri = HisseDegeri;
        notifyObserver();
    }
    
    public void startThread(){
        T.start();
    }
    
    
    
}
