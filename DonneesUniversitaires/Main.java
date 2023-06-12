package DonneesUniversitaires;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();

        listeEtudiants.add(new Etudiant("Dupont", 20,  1004));
        listeEtudiants.add(new Etudiant("Martin", 21,  1002));
        listeEtudiants.add(new Etudiant("Durand", 19,  1009));

        for (Etudiant etudiant : listeEtudiants) {
            etudiant.afficherEtudiant();
        }

    }
}
