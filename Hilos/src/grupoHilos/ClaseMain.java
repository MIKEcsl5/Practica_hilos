/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoHilos;

/**
 * Clase principal
 * @author socce
 */
public class ClaseMain {
    public static void main(String[] args) {
        ThreadGroup grupoHilos = new ThreadGroup("Grupo con prioridad normal");
        Thread hilo1 = new GrupoHilos(grupoHilos,"hilo 1 con prioridad normal");
        Thread hilo2 = new GrupoHilos(grupoHilos,"hilo 2 con prioridad normal");
        Thread hilo3 = new GrupoHilos(grupoHilos,"hilo 3 con prioridad normal");
        Thread hilo4 = new GrupoHilos(grupoHilos,"hilo 4 con prioridad normal");
        
        hilo1.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
        System.out.println("Maxima prioridad del grupo"+ grupoHilos.getMaxPriority());
        System.out.println("Prioridad hilo 1: "+hilo1.getPriority());
        System.out.println("Prioridad hilo 2: "+hilo2.getPriority());
        System.out.println("Prioridad hilo 3: "+hilo3.getPriority());
        System.out.println("Prioridad hilo 4: "+hilo4.getPriority());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        listarHilos(grupoHilos);
        
    }
    /**
     * funcion que lista enlista un grupo de hilos recibidos
     * @param grupoActual recibre un grupo de hilos
     */
    public static void listarHilos(ThreadGroup grupoActual){
        int numHilos;
        Thread[] listaHilos;
                
        numHilos = grupoActual.activeCount();
        listaHilos = new Thread[numHilos];
        grupoActual.enumerate(listaHilos);
        System.out.println("Numero de hilos activos "+numHilos);
        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo activo "+i+" se llama "+listaHilos[i].getName());
        }
    }
}
    
    

