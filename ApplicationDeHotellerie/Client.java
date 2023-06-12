package ApplicationDeHotellerie;


public class Client {
    private int numero;
    private String adresse;
    private int numeroTelephone;

    String client;

    public Client(int numero, String adresse, int numeroTelephone) {
        this.numero = numero;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
    }

    public static void main(String[] args) {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(int numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void ajouterClient(int numero, String adresse, int numeroTelephone) {
        this.numero = numero;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
    }

    public void modifierClient(int numero, String adresse, int numeroTelephone) {
        this.numero = numero;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
    }

    public void supprimerClient(int numero, String adresse, int numeroTelephone) {
        this.numero = 0;
        this.adresse = "";
        this.numeroTelephone = 0;
    }

}

