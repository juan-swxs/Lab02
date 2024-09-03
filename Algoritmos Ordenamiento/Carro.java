import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Carro extends JFrame{

    private AtributosCarro[] cars;
    private JTextArea textArea;
    private JButton bubbleSortModelButton, bubbleSortKilometerButton, mergeSortModelButton, mergeSortKilometerButton;
    private JScrollPane scroll;
    private JPanel panel; 

    public Carro(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de carros: ");
        int counCars = entrada.nextInt();

        cars = new AtributosCarro[counCars];

        for (int n = 0; n < counCars; n++){
            System.out.print("\tIngrese los datos del carro " + n + 1);
            System.out.print("Marca: ");
            String marca = entrada.nextLine();
            System.out.print("Modelo: ");
            String modelo = entrada.nextLine();
            System.out.print("Color: ");
            String color = entrada.nextLine();
            System.out.print("Kilometraje: ");
            int Kilometraje = entrada.nextInt();

            cars[n] = new AtributosCarro(marca, modelo, color, Kilometraje);
        }

        screenCars(cars);
        entrada.close();
    }

    private void screenCars(AtributosCarro[] cars){
        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Aplicación CarSorting.");
        Paneles();
        TextArea();
    }

    private void Paneles(){
        panel = new JPanel();

        panel.setLayout(null);
        this.getContentPane().add(panel);
 
     }

    private void TextArea(){
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(0, 0, 350, 400); 

        scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(28, 30, 280, 300); 
        panel.add(scroll); 
    }


}