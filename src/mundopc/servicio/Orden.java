package mundopc.servicio;

import mundopc.modelo.Computador;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computador> computadores;
    private static  int contadorOrden;

    public  Orden(){
        computadores = new ArrayList<>();
        this.idOrden = ++contadorOrden;
    }
    public void agregarComputador(Computador computador){
        computadores.add(computador);
    }
    public void mostrarOrden(){
        System.out.println("Orden #:  "+ idOrden);
        System.out.println("Total computadores: " + computadores.size());
        System.out.println();
        computadores.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Orden:" +
                "\nidOrden=" + idOrden +
                "\n computadores : " + computadores ;
    }
}
