import java.util.Vector;

public class Client {
    private String nif;
    private String nom;
    private String telefon;
    public Vector<Lloguer> lloguers;

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
        double total = 0;
        int bonificacions = 0;
        String resultat = "Informe de lloguers del client " +
                getNom() +
                " (" + getNif() + ")\n";
        for (Lloguer lloguer: lloguers) {
            bonificacions += bonificacionsDeLloguer(lloguer);
            // composa els resultats d'aquest lloguer
            resultat += "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.quantitat() * 30) + "€" + "\n";
            total += lloguer.quantitat() * 30;
        }

        // afegeix informació final
        resultat += "Import a pagar: " + total + "€\n" +
                "Punts guanyats: " + bonificacions + "\n";
        return resultat;
    }
    private int bonificacionsDeLloguer(Lloguer lloguer){
        int boni=0;
        if (lloguer.vehicle.getCategoria()==1){
            boni=1;
        }
        else if (lloguer.vehicle.getCategoria()==2){
            boni=2;
        }
        return boni;
    }

}
