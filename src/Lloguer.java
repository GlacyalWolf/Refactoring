import java.util.Date;

public class Lloguer {
    private Date data;
    private int dies;
    public Vehicle vehicle;
    private static final int costUnitariInicialBASIC=3;
    private static final int costUnitariInicialGENERAL=4;
    private static final int diesInicialsAmbMateixPreuBASIC= 3;
    private static final int diesInicialsAmbMateixPreuGENERAL= 2;

    public Lloguer(Date data,int dies,Vehicle vehicle){
        this.data=data;
        this.dies=dies;
        this.vehicle=vehicle;
    }

    public int getDies() {
        return dies;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDies(int dies) {
        this.dies = dies;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

public double preuVheicles(){
        double preu = 0;
        switch (getVehicle().getCategoria()) {
            case Vehicle.BASIC:
                preu += costUnitariInicialBASIC;
                if (getDies() > diesInicialsAmbMateixPreuBASIC) {
                    preu += (getDies() - diesInicialsAmbMateixPreuBASIC) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                preu += costUnitariInicialGENERAL;
                if (getDies() > diesInicialsAmbMateixPreuGENERAL) {
                    preu += (getDies() - diesInicialsAmbMateixPreuGENERAL) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                preu += getDies() * 6;
                break;
        }
        return preu;
    }

    public int bonificacions(){
        if (getVehicle().getCategoria() == Vehicle.LUXE && getDies()>1 ) {
            return 2;
        } else {
            return 1;
        }
    }
}
