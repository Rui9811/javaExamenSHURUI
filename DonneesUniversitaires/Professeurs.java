package DonneesUniversitaires;

public class Etudiant {
    private String name;
    private int age;
    private int numeroEtudiant;

    public Etudiant(String name, int age, int numeroEtudiant) {
        this.name = name;
        this.age = age;
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }
}

