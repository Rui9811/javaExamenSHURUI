package DonneesUniversitaires;


public class Etudiant {
    private String name;
    private int age;
    private int id;



    public Etudiant(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addEtudiant(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void supprimerEtudiant(int id) {
        this.id = 0;
        this.name = "";
        this.age = 0;
    }

    public void modifierEtudiant(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void afficherEtudiant() {
        System.out.println("Name: " + name + ", Age: " + age +"Id: " + id);
    }


}

