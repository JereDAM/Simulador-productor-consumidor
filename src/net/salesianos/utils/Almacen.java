package net.salesianos.utils;

import java.util.ArrayList;

public class Almacen {
    private int cantidadVerduraAlmacen;
    private int limiteAlmacen;
    private ArrayList<String> verdurasCultivadas = new ArrayList<String>();

    public Almacen(int cantidadVerduraAlmacen, int limiteAlmacen){
        this.cantidadVerduraAlmacen = cantidadVerduraAlmacen;
        this.limiteAlmacen = limiteAlmacen;
    }
    public synchronized void producir() throws InterruptedException{
        while(verdurasCultivadas.size() > this.limiteAlmacen){
            wait();
        }
        cantidadVerduraAlmacen++;
        notifyAll();
    }

    public synchronized void consumir() throws InterruptedException{
        while (verdurasCultivadas.isEmpty()){
            wait();
        }
        cantidadVerduraAlmacen--;
    }

    public int getCantidadVerduraAlmacen(){
        return this.cantidadVerduraAlmacen;
    }

    public int getLimiteAlmacen(){
        return this.limiteAlmacen;
    }

    public ArrayList<String> getVerdurasCultivadArrayList(){
        return verdurasCultivadas;
    }
}
