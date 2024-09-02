import java.util.Scanner;
import java.util.Random;

public class Ordenamientos {

    int[] temps = {100, 500, 1000, 5000, 10000};

    public Ordenamientos() {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\t~Metodos de Ordenamiento~");
            System.out.println("\t 1.Metodo de burbuja.");
            System.out.println("\t2. Metodo de inserción.");
            System.out.println("\t3. Metodo de seleccion.");
            System.out.println("\t4. Metodo de mergesort");
            System.out.println("\t5. Generar tabla comparativa.");
            System.out.println("\t6. salir");
            System.out.print("Elija una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    for (int size : temps) {
                        Double[] array = generateRandoms(size);
                        long startTime = System.nanoTime();
                        FunctionSort.bubbleSort(array);
                        long endTime = System.nanoTime();
                        long duration = (endTime - startTime); 
                        System.out.println("Burbuja (Tamaño " + size + "): " + duration + " ms");
                    }
                    break;
                case 2:
                    for (int size : temps) {
                        Double[] array = generateRandoms(size);
                        long startTime = System.nanoTime();
                        FunctionSort.insertioSort(array);
                        long endTime = System.nanoTime();
                        long duration = (endTime - startTime);
                        System.out.println("Inserción (Tamaño " + size + "): " + duration + " ms");
                    }
                    break;
                case 3:
                    for (int size : temps) {
                        Double[] array = generateRandoms(size);
                        long startTime = System.nanoTime();
                        FunctionSort.selectionSort(array);
                        long endTime = System.nanoTime();
                        long duration = (endTime - startTime);
                        System.out.println("Selección (Tamaño " + size + "): " + duration + " ms");
                    }
                    break;
                case 4:
                    for (int size : temps) {
                        Double[] array = generateRandoms(size);
                        long startTime = System.nanoTime();
                        FunctionSort.mergeSort(array);
                        long endTime = System.nanoTime();
                        long duration = (endTime - startTime);
                        System.out.println("MergeSort (Tamaño " + size + "): " + duration + " ms");
                    }
                    break;
                case 5:
                    generateComparativeTable();
                    break;
                case 6:
                    System.out.println("...Saliendo del programa....");
                    break;
                default:
                    System.out.println("...Opcion no valida...");
                    break;
            }

        } while (opcion != 6);

        entrada.close();
    }

    private Double[] generateRandoms(int size) {
        Random random = new Random();
        Double[] array = new Double[size];
        for (int n = 0; n < size; n++) {
            array[n] = random.nextDouble() * 1000;
        }
        return array;
    }

    private void generateComparativeTable() {
        
    }
}
