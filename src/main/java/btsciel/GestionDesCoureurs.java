package btsciel;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;

public class GestionDesCoureurs {
    private ArrayList<Coureur> coureurs = new ArrayList();
    private ConnectionDeBDD connectionDeBDD = new ConnectionDeBDD("lacourse", "root", "");
    private Connection con = connectionDeBDD.getConnection();
    private PreparedStatement preparedStatement;

    public ArrayList<Coureur> getCoureurs() {
        return coureurs;
    }

    public void setCoureurs(ArrayList<Coureur> coureurs) {
        this.coureurs = coureurs;
    }

    public ArrayList<Genre> lireLesGenres() throws SQLException {
        ArrayList<Genre> genres = new ArrayList<>();
        //
        //Add code
        //
        return genres;
    }

    public ArrayList<Categorie> lireLesCategories() throws SQLException {
        ArrayList<Categorie> categories = new ArrayList<>();
        //
        //Add code
        //
        return categories;
    }

    public GestionDesCoureurs() throws IOException, SQLException, ClassNotFoundException {

        //
        //Add code to load runners
        //

    }
    public void trierParNom() {
        coureurs.sort(Comparator.comparing(Coureur::getNom ));
    }

    public void trierParNomDecroissant() {
        coureurs.sort(Comparator.comparing(Coureur::getNom ).reversed());
    }

    public void trierParPrenom() {
        coureurs.sort(Comparator.comparing(Coureur::getPrenom ));
    }

    public void trierParPrenomDecroissant() {
        coureurs.sort(Comparator.comparing(Coureur::getPrenom ).reversed());
    }

    public void trierParClassement() {
        coureurs.sort(Comparator.comparing(Coureur::getDuree));
    }

    public void trierParClassementDecroissant() {
        coureurs.sort(Comparator.comparing(Coureur::getDuree).reversed());
    }

    public boolean ajouterUnCoureur(Coureur coureur) throws SQLException {
        //
        //Add code
        //
        return false;
    }
    public boolean supprimerUnCoureur(Coureur c) {
        return false;
    }

    public ResultSet lireLesCoureurs() throws SQLException {
        ResultSet rs = null;
        //
        //Add code
        //
        return rs;
    }





}
