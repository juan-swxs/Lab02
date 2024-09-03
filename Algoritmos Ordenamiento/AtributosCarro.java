public class AtributosCarro {
    private String marca;
    private String modelo;
    private String color;
    private int kilometraje;

    public AtributosCarro(String marca, String modelo, String color, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getmarca(){
        return marca;
    }

    public String getmodelo(){
        return modelo;
    }

    public String getcolor(){
        return color;
    }

    public int getkilometraje(){
        return kilometraje;
    }
    
}
