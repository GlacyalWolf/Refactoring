public class Vehicle {
    private String model;
    private String marca;
    private int categoria;
    static public int BASIC=0;
    static public int GENERAL=1;
    static public int LUXE=2;

    public Vehicle(){}

    public Vehicle(String model,String marca,int categoria){

        this.model=model;
        this.marca=marca;
        this.categoria=categoria;


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
