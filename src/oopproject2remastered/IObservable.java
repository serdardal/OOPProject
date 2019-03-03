/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2remastered;

/**
 *
 * @author serdar
 */
public interface IObservable {
    
    public void addObserver(MyObserver observer);
    public void removeObserver(MyObserver observer);
    public void notifyObserver();
    
}
