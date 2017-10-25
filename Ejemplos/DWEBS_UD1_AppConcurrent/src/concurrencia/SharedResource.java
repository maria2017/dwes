/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */

//Clase de recurso compartidos

public class SharedResource {
/**
 * cuando acceda al metodo del objeto, que se espere el hilo
 * @author Administrador
 */
    
    //Método para incrementar
    public synchronized void inc(){
        m("INC");
    }
    
    //Método para decrementar
    public synchronized void dec(){
        m("DEC");
    }
       
    /**
     * Aunque el método no sea síncrono, respeta la sincronía. En caso de que el método fuera publico
     * 
     */
    private void m(String fr){
         try {
            int aleatorio = new Random().nextInt(10)+1;
            System.out.println(fr + aleatorio + "seg.");
            Thread.sleep(aleatorio*1000);
         } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
