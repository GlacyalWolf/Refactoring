import java.util.Vector;

public class Client {
    private String nif;
    private String nom;
    private String telefon;
    public Vector<Lloguer> lloguers;
    private static final double EUROS_PER_UNITAT_DE_COST = 30;

    public Client(String nif, String nom, String telefon) {
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
        this.lloguers = new Vector<Lloguer>();
    }

    public String getNif()     { return nif;     }
    public String getNom()     { return nom;     }
    public String getTelefon() { return telefon; }

    public void setNif(String nif) { this.nif = nif; }
    public void setNom(String nom) { this.nom = nom; }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public void afegeix(Lloguer lloguer) {
        if (! lloguers.contains(lloguer) ) {
            lloguers.add(lloguer);
        }
    }
    public void elimina(Lloguer lloguer) {
        if (lloguers.contains(lloguer) ) {
            lloguers.remove(lloguer);
        }
    }
    public boolean conte(Lloguer lloguer) {
        return lloguers.contains(lloguer);
    }

    public String informe() {

        return composaCapsalera() + composaDetall() + composaPeu();
    }
    private double importTotal(){
        double imp=0;
        for (Lloguer lloguer:lloguers) {
            imp += lloguer.preuVheicles()*EUROS_PER_UNITAT_DE_COST;
        }
        return imp;
    }
    private int bonificacionsTotals(){
        int boni=0;
        for (Lloguer lloguers:lloguers){
            boni += lloguers.bonificacions();
        }
        return boni;
    }
    private String composaCapsalera(){
        String resultat = "Informe de lloguers del client " +
                getNom() +
                " (" + getNif() + ")\n";
        return resultat;
    }

    private String composaDetall(){
        int bonificacions= 0;
        String resultat="";
        for (Lloguer lloguer: lloguers) {
            bonificacions += lloguer.bonificacions();
            // composa els resultats d'aquest lloguer
            resultat = "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.preuVheicles() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";


        }
        return resultat;
    }

    private String composaPeu(){
        String resultat = "Import a pagar: " + importTotal() + "€\n" +
                "Punts guanyats: " + bonificacionsTotals() + "\n";
        return resultat;
    }
    private String informeHTML(){
        System.out.println("<h1>Informe de lloguers</h1>");
        System.out.println("<p>Informe de lloguers del client <em>"+getNom()+"</em> (<strong>"+getNif()+"</strong>)</p>");
        System.out.println("<table>");
        int bonificacions= 0;
        String resultat="";
        for (Lloguer lloguer: lloguers) {
            bonificacions += lloguer.bonificacions();
            // composa els resultats d'aquest lloguer
            resultat = "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.preuVheicles() * EUROS_PER_UNITAT_DE_COST) + "€" + "\n";



        }



}
