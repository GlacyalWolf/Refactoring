public class Vehicle {
    private String model;
    private String marca;
    private int categoria;
    static public final int BASIC=0;
    static public final int GENERAL=1;
    static public final int LUXE=2;

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

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCategoria() {
        return categoria;
    }
}
