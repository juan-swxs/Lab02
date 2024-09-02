import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ordenamientos {

    int[] temps = {100, 500, 1000, 5000, 10000};
    private Double[] array;

    public Ordenamientos(){
        Scanner entrada = new Scanner(System.in);
        int opcion;

       do {
        System.out.println("\t~Metodos de Ordenamiento~");
        System.out.println("\t1. Metodo de burbuja.");
        System.out.println("\t2. Metodo de inserción.");
        System.out.println("\t3. Metodo de seleccion.");
        System.out.println("\t4. Metodo de mergesort");
        System.out.println("\t5. salir");
        System.out.print("Elija una opcion: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(Arrays.toString(generateRandoms()));
                burbuja();
                break;
            case 5:
                System.out.println("...Saliendo del programa....");
                break;
            default:
            System.out.println("...Opcion no valida...");
                break;
        }
        
       } while (opcion != 5);

        entrada.close();
    }

    private Double[] generateRandoms(){
        Random random = new Random();
        array = new Double[temps.length];
        for (int n = 0; n < temps.length; n++){
            array[n] = random.nextDouble() * 1000;
        }
        return array;
    }

    private void burbuja(){
        System.out.println(Arrays.toString(FunctionSort.bubbleSort(array)));
    }
}