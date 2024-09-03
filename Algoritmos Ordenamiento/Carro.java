import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Carro extends JFrame{

    private AtributosCarro[] cars;
    private JTextArea textArea;
    private JButton bubbleSortModelButton, bubbleSortKilometerButton;
    private JScrollPane scroll;
    private JPanel panel; 

    public Carro(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de carros: ");
        int counCars = entrada.nextInt();
        entrada.nextLine();

        cars = new AtributosCarro[counCars];

        for (int n = 0; n < counCars; n++){
            System.out.println("\tIngrese los datos del carro " + (n + 1));
            System.out.print("Marca: ");
            String marca = entrada.nextLine();
            System.out.print("Modelo: ");
            String modelo = entrada.nextLine();
            System.out.print("Color: ");
            String color = entrada.nextLine();
            System.out.print("Kilometraje: ");
            int Kilometraje = entrada.nextInt();
            entrada.nextLine();
            cars[n] = new AtributosCarro(marca, modelo, color, Kilometraje);
            System.out.println();
        }

        screenCars(cars);
        entrada.close();
    }

    private void screenCars(AtributosCarro[] cars){
        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Aplicación CarSorting.");
        PanelesandButtons();
        TextArea();
        displayCars();
    }

    private void PanelesandButtons(){
        panel = new JPanel();

        panel.setLayout(null);
        this.getContentPane().add(panel);

        bubbleSortModelButton = new JButton("Mod");
        bubbleSortModelButton.setBounds(317, 40, 60, 50);
        bubbleSortModelButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                bubbleSort2(cars, "modelo");
                displayCars();
            }
            
        });

        panel.add(bubbleSortModelButton);
 
     }

     private void bubbleSort2(AtributosCarro[] array, String attribute) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (attribute.equals("modelo")) {
                    if (array[j].getModelo().compareTo(array[j + 1].getModelo()) > 0) {
                        
                        AtributosCarro temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                } else if (attribute.equals("kilometraje")) {
                    if (array[j].getKilometraje()> array[j + 1].getKilometraje()) {
    
                        AtributosCarro temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    private void TextArea(){
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(0, 0, 350, 400); 

        scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(26, 30, 280, 300); 
        panel.add(scroll); 
    }

    private void displayCars() {
        textArea.setText("");
        for (AtributosCarro car : cars) {
            textArea.append(car.toString() + "\n\n");
        }
    }

}