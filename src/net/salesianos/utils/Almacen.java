package net.salesianos.utils;

public class Almacen {
    private int cantidadVerduraAlmacen = 0;

    public synchronized void producir(){
        cantidadVerduraAlmacen++;
    }

    public synchronized void consumir(){
        cantidadVerduraAlmacen--;
    }

    public int getCantidadVerduraAlmacen(){
        return this.cantidadVerduraAlmacen;
    }
}
