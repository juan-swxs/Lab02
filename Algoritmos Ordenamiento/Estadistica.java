import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Estadistica {

    public Estadistica(){
        pedir_Datos();
        
    }

    private void pedir_Datos(){
        Scanner entrada = new Scanner(System.in);
        Random chance = new Random();

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = entrada.nextInt();

        int[] arreglo = new int[size];

        for(int n = 0; n < size ; n++){
            arreglo[n] = chance.nextInt(100);
        }

        System.out.println("Arreglo generado: " + Arrays.toString(arreglo));
        
        entrada.close();

    }
    
}
