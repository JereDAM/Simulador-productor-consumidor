import net.salesianos.hilos.Granjeros;
import net.salesianos.utils.Almacen;

public class App {
    public static void main(String[] args) throws Exception {
        Almacen almacen = new Almacen();
                
        // int tiempoVerduras;
        // tiempoVerduras = (int)Math.floor(Math.random()*600+1);

        Granjeros fulancio = new Granjeros(almacen);

        System.out.println("******Hilos terminados******");
        
        try {
            fulancio.start();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
