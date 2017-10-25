/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author Administrador
 */
public class App {
    public static void main (String a[]){
        int MAX = 10;
        Thread t[] = new Hilo[MAX];
        SharedResource resource = new SharedResource();
        //t.start();
        for (int i = 0; i < MAX; i++) {
            //Le pasamos la variable resource
            t[i] = new Hilo(resource);
            //probar con el método run()
            t[i].start();
        }
    }
}
