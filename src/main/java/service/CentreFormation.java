package service;

import jakarta.jws.WebService;
@WebService
public class CentreFormation implements ICentreFormation  {
    @Override
    public String inscrireStagiaire(String nom, String prenom, String formation) {
        return "Le stagiaire " + nom + " " + prenom + " est inscrit à la formation : " + formation;
    }

    @Override
    public double calculerMoyenne(double note1, double note2, double note3) {
        return (note1 + note2 + note3) / 3;
    }
}
