import net.salesianos.hilos.Granjeros;
import net.salesianos.utils.Almacen;

public class App {
    public static void main(String[] args) throws Exception {
        Almacen almacen = new Almacen(0, 10);

        Granjeros thanos = new Granjeros(almacen, "Thanos");
        Granjeros faker = new Granjeros(almacen,"Faker"); //Faker poque en el minuto 5 tiene un huevo de minions

        System.out.println("Lista de verduras: ");
        
        try {
            thanos.start();
            faker.start();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
