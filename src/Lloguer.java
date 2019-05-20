import java.util.Date;

public class Lloguer {
    private Date data;
    private int dies;

    public Lloguer(Date data,int dies){
        this.data=data;
        this.dies=dies;
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
