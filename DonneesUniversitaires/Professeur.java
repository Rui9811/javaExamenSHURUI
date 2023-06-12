package DonneesUniversitaires;

import java.util.ArrayList;

public class Professeur {
    private String nom;
    private int age;
    private String specialite;

    public Professeur(String nom, int age,String specialite) {
        this.nom = nom;
        this.age = age;
        this.specialite = specialite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void addProfesseur(String nom, int age,String specialite) {
        this.nom = nom;
        this.age = age;
        this.specialite = specialite;
    }

    public void supprimerProfesseur(int id) {
        this.nom = "";
        this.age = 0;
        this.specialite = "";
    }

    public void modifierEtudiant(String nom, int age,String specialite) {
        this.nom = nom;
        this.age = age;
        this.specialite = specialite;
    }

    public void afficherProfesseur() {
        System.out.println("Name: " + nom + ", Age: " + age +"specialite: "+ specialite);
    }


}
