package mundopc.modelo;

public class Raton extends DispositivoDeEntrada{
        private final  int idRaton;
        private static  int contadorRatones;

        //constructor
    public Raton( String marca, String tipoDeEntrada){
        super ( marca, tipoDeEntrada);
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return
                "\nidRaton" + idRaton
                 + super.toString();
    }

}
