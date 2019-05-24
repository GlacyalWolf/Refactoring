import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ListIterator;

public class GestorLloguersLite {

    public static void main (String[] args) throws ParseException {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);

        // demostració de formatat d'una data
        System.out.println(dateFormat.format(lloguerBasic.getData()));


    }
    public static void informeLite(Client client){
        System.out.println("Client: "+client.getNom());
        System.out.println("        "+client.getNif());
        System.out.println("        "+client.getTelefon());
        System.out.println("Lloguer: "+client.lloguers.size());
        ListIterator<Lloguer> it = client.lloguers.listIterator();
        int count=1;
        Lloguer l;
        while (it.hasNext()){
            l=it.next();
            System.out.println("    "+count+". "+"vehicle: "+l.vehicle.getMarca()+" "+l.vehicle.getModel());
            System.out.println("        "+l.getData());
            System.out.println("        "+l.getDies());
        }
    }
}
