package fr.sdv.entities;

import javax.persistence.*;

@Entity
@Table (name = "fournisseur")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    public Fournisseur() {}

    public Fournisseur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
