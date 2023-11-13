package net.salesianos.utils;

public class Almacen {
    private int cantidadVerduraAlmacen = 0;
    private final int LIMITE_ALMACEN = 10;

    public synchronized void producir(){
        if(cantidadVerduraAlmacen < LIMITE_ALMACEN){
            cantidadVerduraAlmacen++;
        }
    }

    public synchronized void consumir(){
        cantidadVerduraAlmacen--;
    }

    public int getCantidadVerduraAlmacen(){
        return this.cantidadVerduraAlmacen;
    }
}
