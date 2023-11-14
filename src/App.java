import net.salesianos.hilos.Consumidores;
import net.salesianos.hilos.Granjeros;
import net.salesianos.utils.Almacen;

public class App {
    public static void main(String[] args) throws Exception {
        Almacen almacen = new Almacen(0, 10);

        Granjeros granjero1 = new Granjeros(almacen, "Thanos");
        Granjeros granjero2 = new Granjeros(almacen,"Faker"); //Faker poque en el minuto 5 tiene un huevo de minions

        Consumidores consumidor1 = new Consumidores(almacen, "nicocadoAbokado");
        Consumidores consumidor2 = new Consumidores(almacen, "gordaco");
        System.out.println("Lista de verduras: ");

        try {
            granjero1.start();
            granjero2.start();
            consumidor1.start();
            consumidor2.start();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
