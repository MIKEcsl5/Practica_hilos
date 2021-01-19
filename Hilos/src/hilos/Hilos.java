/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 * funcion principal
 * @author socce
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*********** Actividad 1 *************");
        HiloThread h1 = new HiloThread("hilo1");
        h1.start();
        new HiloThread("hilo2").start();
        System.out.println("Termina hilo");
        
        
        System.out.println("*********** Actividad 2 *************");
        new Thread(new HiloRunable(), "Primer hilo runnable").start();
        new Thread(new HiloRunable(), "Segun hilo runnable").start();
        System.out.println("Termina hilo principal");
    }
    
}
