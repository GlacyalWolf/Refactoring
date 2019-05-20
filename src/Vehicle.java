public class Vehicle {
    private String model;
    private String marca;
    static private int BASIC;
    static private int GENERAL;
    static private int LUXE;

    public Vehicle(String model,String marca){

        this.model=model;
        this.marca=marca;


    }

    public String getModel() {
        return model;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
