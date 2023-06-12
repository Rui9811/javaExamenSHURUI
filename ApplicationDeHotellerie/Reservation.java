package ApplicationDeHotellerie;

public class Reservation {

    private int numero;
    private String adresse;
    private int numeroTelephone;
    private String typeClients;

    public Reservation(int numero, String adresse, int numeroTelephone) {
        this.numero = numero;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
    }

    public static void main(String[] args) {

    }

    public String getTypeClients() {
        return typeClients;
    }

    public void setTypeClients(String typeClients) {
        this.typeClients = typeClients;
    }

    public Reservation(int numero, String adresse, int numeroTelephone, String typeClients) {
        this.numero = numero;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.typeClients = typeClients;
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

}
