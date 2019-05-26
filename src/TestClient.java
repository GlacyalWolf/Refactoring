import org.junit.Test;
import org.junit.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

    public class TestClient {
        @Test
        public void testInformeSimple1()throws ParseException {
            Vehicle a =new Vehicle("Ford","Fiesta",0);


            SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
            Date date = dateFormat.parse("19/03/2001");
            Lloguer lloguer1=new Lloguer(date,1,a);

            Client antonio=new Client("123123L","antonio","123123123");
            antonio.afegeix(lloguer1);
            System.out.println(antonio.informe());

        }

        @Test
        public void testInformeSimple2()throws ParseException {
            Vehicle a =new Vehicle("Ford","Fiesta",0);
            Vehicle b =new Vehicle("Seat","Ateka",1);

            SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
            Date date = dateFormat.parse("19/03/2001");
            Lloguer lloguer1=new Lloguer(date,2,a);
            Lloguer lloguer2=new Lloguer(date,2,b);

            Client antonio=new Client("123123L","antonio","123123123");
            antonio.afegeix(lloguer1);
            antonio.afegeix(lloguer2);
            System.out.println(antonio.informe());

        }

        @Test
        public void testInformeSimpleSenseLloguers()throws ParseException {
            Vehicle a =new Vehicle("Ford","Fiesta",0);
            SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
            Date date = dateFormat.parse("19/03/2001");
            Client antonio=new Client("123123L","antonio","123123123");
            System.out.println(antonio.informe());

        }

        public static void main(String args[]) {
            org.junit.runner.JUnitCore.main("TestClient");
        }
    }
