/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 * Clase Cuenta que deposita y extrae dinero usando paralelismo
 * @author socce
 */
public class Cuenta extends Thread{
    private static long saldo = 0;
    /**
     * constructo de la clase Cuenta
     * @param nombre nombre que tendra el hilo
     */
    public Cuenta (String nombre){
        super(nombre);
    }
    /**
     * Funcion que ejecuta hilos
     */
    public void run(){
        if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
            this.depositarDinero(100);
        }else{
            this.extraerDinero(50);
        }
        System.out.println("Termina "+getName());
    }
    /**
     * funcion para depositar dinero
     * @param cantidad dato tipo entero que representa la cantidad de dinero que se va a depositar en la cuenta
     */
    public synchronized void depositarDinero(int cantidad){
        saldo += cantidad;
        System.out.println("Se depositaron "+cantidad+" pesos");
        notifyAll();
    }
    /**
     * funcion para extraer dinero 
     * @param cantidad dato de tipo enteto que representa la cantidad de dinero que se va a extrar de la cuenta
     */
    public synchronized void extraerDinero (int cantidad) {
        try{
            if(saldo <= 0){
                System.out.println(getName()+" espera deposito\n saldo: "+saldo);
                sleep(5000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
        saldo -= cantidad;
        System.out.println(getName()+" extrajo "+cantidad+" pesos\n saldo restante: "+saldo);
        notifyAll();
    }

    /**
     * metodo main de la clase Cuenta
     * @param args 
     */
    public static void main(String[] args) {
        new Cuenta("Acceso 1").start();
        new Cuenta("Acceso 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 1").start();
        System.out.println("Termina el hilo principal");
    }
        
}
