package ApplicationDeHotellerie;

public class Chambre {

    private String chambreSimple;
    private String suiteRoyale;
    private String logeDuReceptionniste;

    int NombreDeChambre = 80;
    private int etage;


    public Chambre(String chambreSimple, String suiteRoyale, String logeDuReceptionniste) {
        this.chambreSimple = chambreSimple;
        this.suiteRoyale = suiteRoyale;
        this.logeDuReceptionniste = logeDuReceptionniste;
    }

    public static void main(String[] args) {

    }

    public String getChambreSimple() {
        return chambreSimple;
    }

    public void setChambreSimple(String chambreSimple) {
        this.chambreSimple = chambreSimple;
    }

    public String getSuiteRoyale() {
        return suiteRoyale;
    }

    public void setSuiteRoyale(String suiteRoyale) {
        this.suiteRoyale = suiteRoyale;
    }

    public String getLogeDuReceptionniste() {
        return logeDuReceptionniste;
    }

    public void setLogeDuReceptionniste(String logeDuReceptionniste) {
        this.logeDuReceptionniste = logeDuReceptionniste;
    }

    public void ajouterChambre(String chambreSimple, String suiteRoyale, String logeDuReceptionniste) {
        this.chambreSimple = chambreSimple;
        this.suiteRoyale = suiteRoyale;
        this.logeDuReceptionniste = logeDuReceptionniste;
    }

    public void modifierChambre(String chambreSimple, String suiteRoyale, String logeDuReceptionniste) {
        this.chambreSimple = chambreSimple;
        this.suiteRoyale = suiteRoyale;
        this.logeDuReceptionniste = logeDuReceptionniste;
    }

    public void reservation(String chambreSimple, String suiteRoyale, String logeDuReceptionniste){
        this.chambreSimple = chambreSimple;
        this.suiteRoyale = suiteRoyale;
        this.logeDuReceptionniste =logeDuReceptionniste;
    }
}