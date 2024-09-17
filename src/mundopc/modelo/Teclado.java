package mundopc.modelo;

public class Teclado extends DispositivoDeEntrada{
    private final int idTeclado;
    private static int contadorTeclados;

    //constructor
    public Teclado( String marca, String tipoDeEntrada){
        super ( marca, tipoDeEntrada);
        idTeclado = ++contadorTeclados;

    }

    @Override
    public String toString() {
        return "Teclado: \n" +
                "idTeclado: " + idTeclado +
                "\n  "  + super.toString() ;
    }

}
