package net.salesianos.hilos;

import net.salesianos.utils.Almacen;

public class Consumidores extends Thread{
    
    private Almacen almacen;
    private String nombreConsumidor;
    private static final int ESPERA = 5000;

    public Consumidores(Almacen almacen, String nombreConsumidor){
        this.almacen = almacen;
        this.nombreConsumidor = nombreConsumidor;
    }

@Override
    
    public void run(){
        try {
            for (int i = 0; i < almacen.getLimiteAlmacen(); i++) {
                   sleep((long)(1000 + Math.random() * ESPERA));
                   almacen.consumir();
                   System.out.println(this.nombreConsumidor + " consumió " + almacen.getVerdurasCultivadArrayList().get(0));
                   if(almacen.getVerdurasCultivadArrayList().size() > 0){
                       almacen.getVerdurasCultivadArrayList().remove(0);
                   }
            }
        } catch (InterruptedException e) {
            System.out.println("Error, se interrumpió");
        }
    }
}
