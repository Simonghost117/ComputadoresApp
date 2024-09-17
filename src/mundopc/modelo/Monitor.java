package mundopc.modelo;

public class Monitor {
    private  final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //constructor privado
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }

    //constructor publico
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return
                "\nidMonitor:" + idMonitor +
                "\n marca:'" + marca +
                "\n tamanio:" + tamanio
                ;
    }
}
