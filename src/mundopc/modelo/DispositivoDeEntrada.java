package mundopc.modelo;

public class DispositivoDeEntrada {
    private String tipoDeEntrada;
    private String marca;

    //constructor
    public  DispositivoDeEntrada( String marca, String tipoDeEntrada){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    @Override
    public String toString() {
        return
                "Marca: " + marca +
                "\ntipo de entrada : " +  tipoDeEntrada+ '\n'
                ;
    }
}
