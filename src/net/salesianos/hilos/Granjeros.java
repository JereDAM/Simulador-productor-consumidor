package net.salesianos.hilos;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import net.salesianos.utils.Almacen;

public class Granjeros extends Thread{
    private Almacen almacen;
    private String[] verduras = {"Lechuga", "Col","Cebolla", "Espinacas", "Papas", "Apio", "Esparragos", "Rábano", "Broccoli", "Alcachofa", "Tomate", "Pepino", "Berenjena", "Zanahoria", "Judías verdes"};
    private ArrayList<String> verdurasCultivadas = new ArrayList<String>();
    private int indiceAleatorio;
    private String verduraAleatoria;
    
    
    public Granjeros(Almacen almacen){
        super();
        this.almacen = almacen;
    }
    
    public static int verduraAleatoria(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    // Math.floor(Math.random() * arreglo.length
    // int valorDado = (int)Math.floor(Math.random()*10+1); numero aleatorio entre 1 y 10
    @Override
    
    public void run(){
        System.out.println("Lista de verduras: ");
        for (int i = 0; i < 10; i++) {
            indiceAleatorio  = verduraAleatoria(0, verduras.length -1);
            verduraAleatoria  = verduras[indiceAleatorio];
            verdurasCultivadas.add(verduraAleatoria);
            almacen.producir();

            System.out.println(verdurasCultivadas.get(i));
        }
    }
}
