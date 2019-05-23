import java.util.Date;

public class Lloguer {
    private Date data;
    private int dies;
    public Vehicle vehicle;

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


}
