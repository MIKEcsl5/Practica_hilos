/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 * con Runnable Varios hilos comparten el mismo objeto
 * @author socce
 */
public class HiloRunable implements Runnable{
    
    /**
     * funcion que genera hilos e imprime su nombre
     * 
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" de "+Thread.currentThread().getName());
        }
        System.out.println("termina el hilo "+Thread.currentThread().getName());
        
    }
    
}
