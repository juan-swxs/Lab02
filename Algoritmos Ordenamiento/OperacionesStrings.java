import java.util.Scanner;

public class OperacionesStrings {

    public OperacionesStrings() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String texto = entrada.nextLine();
        String empty = "";

        for(int n = texto.length() - 1; n >= 0; n--){
            empty += texto.charAt(n);
        }
        System.out.println(empty);

        entrada.close();

    }

}
