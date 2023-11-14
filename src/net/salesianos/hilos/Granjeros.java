package net.salesianos.hilos;

import java.util.concurrent.ThreadLocalRandom;

import net.salesianos.utils.Almacen;

public class Granjeros extends Thread{
    private Almacen almacen;
    private String[] verduras = {"Lechuga", "Col","Cebolla", "Espinacas", "Papas", "Apio", "Esparragos", "Rábano", "Broccoli", "Alcachofa", "Tomate", "Pepino", "Berenjena", "Zanahoria", "Judías verdes"};
    private int indiceAleatorio;
    private String verduraAleatoria;
    private String nombreGranjero;
    public static final int CULTIVAR = 3000;
    
    public Granjeros(Almacen almacen, String nombreGranjero){
        this.almacen = almacen;
        this.nombreGranjero = nombreGranjero;
    }
    
    public static int verduraAleatoria(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
    // Math.floor(Math.random() * arreglo.length; Elemento aleatorio de un array
    // int valorDado = (int)Math.floor(Math.random()*10+1); numero aleatorio entre 1 y 10

    @Override
    
    public void run(){
        try {
            for (int i = 0; i < almacen.getLimiteAlmacen(); i++) {
                sleep((long)(1000 + Math.random() * CULTIVAR));
                indiceAleatorio  = verduraAleatoria(0, verduras.length -1);
                verduraAleatoria  = verduras[indiceAleatorio];
                almacen.getVerdurasCultivadArrayList().add(verduraAleatoria);
                almacen.producir();
                System.out.println(verduraAleatoria + " " + this.nombreGranjero);
                System.out.println(almacen.getVerdurasCultivadArrayList());
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
