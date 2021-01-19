/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 * con un hilo que solo extiende de Thread cada hilo crea un objeto único y se asocia con él.
 * @author socce
 */
public class HiloThread extends Thread{
    
    /**
     * constructor de la clase HiloThread
     * @param nombre dato tipo String que sera el nombre del hilo
     */
    public HiloThread(String nombre) {
        super(nombre);
    }
    
    /**
     * funcion que ejecuta hilos e imprime su nombre
     */
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" name "+getName());
        }
        System.out.println("Termina el hilo "+getName());
    }
}
