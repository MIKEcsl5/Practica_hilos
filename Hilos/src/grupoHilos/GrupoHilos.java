/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoHilos;

/**
 * clase que genera un grupo de hilos
 * @author socce
 */
public class GrupoHilos extends Thread{

    public GrupoHilos(ThreadGroup grupo, String nombre) {
        super(grupo, nombre);
    }
    /**
     * funcion que crea hilos e imprime su nombre
     */
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+" iteracion "+i);
        }
    }
    
    
    
    
}
