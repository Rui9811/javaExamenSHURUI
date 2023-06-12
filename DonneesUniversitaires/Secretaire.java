package DonneesUniversitaires;

public class Secretaire {
    private String nom;
    private String email;
    private String bureau;

    public Secretaire(String nom, String email, String bureau) {
        this.nom = nom;
        this.email = email;
        this.bureau = bureau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }
}
