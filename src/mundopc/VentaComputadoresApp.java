package mundopc;

import mundopc.modelo.*;
import mundopc.servicio.Orden;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VentaComputadoresApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Computador> computadores = new ArrayList<>();
        List<Orden> ordenes = new ArrayList<>();

        var salir = false;
        do{
            MenuPc();
            try{
                var opcion = entrada.nextInt();
                entrada.nextLine();
                if (opcion >0 && opcion <=3){
                    salir = Opciones(opcion, entrada, computadores, ordenes);
                }else {
                    System.out.println("Ingresa un número entre 1 y 3.");
                }
            } catch (Exception e) { // Captura excepciones en caso de que la entrada no sea válida.
                System.out.println("Ingresa un número válido."); // Muestra un mensaje de error si se ingresa algo que no es un número.
                entrada.nextLine(); // Consumir la línea vacía para evitar un bucle infinito en caso de error.
            }
        }while(!salir);
    }

    private static void MenuPc(){
        System.out.println("""
                ________________________________
                |  *Crear nueva orden de pc*    |
                | 1. Agregar                    |
                | 2. Listar                     |
                | 3. Salir                      |
                |_______________________________|
                """

        );
        System.out.print("Proporciona la opción: ");
    }
    private static  boolean Opciones(int opcion, Scanner entrada, List<Computador> computadores, List<Orden> ordenes ){
        var salir = false;
        switch (opcion){
            case 1:
                System.out.println();
                System.out.println("Ingresa la marca del raton");
                var marcaRaton =entrada.nextLine();
                System.out.println("Ingresa el tipo de entrada");
                var  entradaRaton = entrada.nextLine();
                System.out.println();
                System.out.println("Ingresa la marca del teclado");
                var marcaTeclado =entrada.nextLine();
                System.out.println("Ingresa el tipo de entrada");
                var  entradaTeclado = entrada.nextLine();
                System.out.println();
                System.out.println("Ingresa la marca del monitor");
                var marcaMonitor =entrada.nextLine();
                System.out.println("Ingresa las pulgadas del monitor");
                var  pulgadas = entrada.nextDouble();
                entrada.nextLine();
                System.out.println();
                System.out.println("Ingresa el nombre de la pc");
                var nombre =entrada.nextLine();
                var raton = new Raton(marcaRaton,entradaRaton);
                var teclado= new Teclado(marcaTeclado,entradaTeclado);
                var monitor = new  Monitor(marcaMonitor,pulgadas);


                var computadora = new Computador(nombre, monitor, teclado, raton);

                // Crear una nueva Orden y agregar los computadores
                var orden = new Orden();
                orden.agregarComputador(computadora); // Agregamos el computador a la orden

                // Agregar la orden a la lista de ordenes
                ordenes.add(orden);

                computadores.add(computadora);
                System.out.println("La lista tiene: " + ordenes.size() + " elementos");
           break;


            case 2: // Opción para listar las personas.
                System.out.println("Listado de dispositivos de entrada: ");
                System.out.println();
                ordenes.forEach(System.out::println); // Recorre la lista y muestra cada persona en la consola.
                System.out.println();

                break;

            case 3: // Opción para salir del programa.
                System.out.println("Hasta pronto..."); // Muestra un mensaje de despedida.
                salir = true; // Cambia la variable 'salir' a true para terminar el ciclo.
                break;

            default: // Caso por defecto si ocurre un error inesperado.
                System.out.println("Algo salio mal");
                break;
        }
        return salir;


    }
}